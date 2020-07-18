package DersProgrami;

import DersProgrami.domain.Class;
import java.util.ArrayList;

import DersProgrami.domain.Seviye;


public class Cizelge {

	private ArrayList<Class>classes;
	
	private boolean isFitnessChanged=true;      //fitness bayragý deðiþip deðiþmedigi
	private double fitness=-1;                 //0.3333 0.500 1 se program dursun 
	
	private int sinifNum=0;  //classNum
	private int numbOfConflicts=0;  //çatýþmalarýn sayýsý ve programýn zindeliði  //hata sayýsý kaç hata fitnessa göre oran çýkarýyor
	public Data data;
	
	public Data getData() {return data;}
	
	public Cizelge(Data data) {
		this.data = data;
		classes=new ArrayList<Class>(data.getSinifNum());
	}
	
	public Cizelge initialize() {
		new ArrayList<Seviye>(data.getSeviyeler()).forEach(dept->{
			dept.getDersler().forEach(course->{
				Class newClass=new Class(sinifNum++,dept,course);	
				newClass.setDersSaati(data.getDersSaatleri().get((int) (data.getDersSaatleri().size()*Math.random())));                   
				newClass.setSinif(data.getSiniflar().get((int) (data.getSiniflar().size()*Math.random())));                        //DersProgrami.domain CLASESSTEN ÇEKTÝK
			newClass.setAkademisyen(course.getAkademisyenler().get((int)(course.getAkademisyenler().size()*Math.random())));
		classes.add(newClass);
			});
		});
		return this;
	}
	public int getNumbOfConflicts() { return numbOfConflicts; }
	
	public ArrayList<Class> getClasses() {             //sýnýflarý deðiþtirecek method uygunluk 1 ise dönecektir
		isFitnessChanged=true;
		return classes;
	}
	
	/////*************************************************************************************
	public double getFitness() {           
		if(isFitnessChanged==true) {			//fitnesste deðiþiklik olup olmadýgýný kontrol eden bir get fitness yöntemi olacak
			fitness=calculateFitness();			//bayrak uygunluðu yeniden hesaplar ve uygunluk bayragýný yanlýþ olarak ayarlar
			isFitnessChanged=false;
		}
		return fitness;
	}
   ///********************************************************************************************
	
	
	private double calculateFitness() {    //fitnessý hesaplamak için deðiþiklik olup olmadýðýný //KURALLARI OLUÞTURMAK
		numbOfConflicts=0;
		classes.forEach(x->{
			if(x.getSinif().getSinifMevcudu()<x.getDers().getMaksOgrenci()) numbOfConflicts++;
			classes.stream().filter(y->classes.indexOf(y)>=classes.indexOf(x)).forEach(y -> {
				if(x.getDersSaati()==y.getDersSaati() && x.getId()!=y.getId()) {                //ders saati koþulu
					if(x.getSeviye()==y.getSeviye()) numbOfConflicts++;                        //koþullarý koyuyoruz hoca ayný anda farklý sýnýf,seviyelerde farklý saatler
					if(x.getSinif()==y.getSinif())  numbOfConflicts++;                 	//AYNI SINIFTA AYNI HOCA BULUNMASIN YOKSA HATAYI 1 ARTTIR
					if(x.getAkademisyen()==y.getAkademisyen()) numbOfConflicts++;
				}
			});
		});
	
	return 1/(double)(numbOfConflicts+1);
}
	public String toString() {
		String returnValue=new String();
		for(int x=0; x<classes.size()-1; x++) returnValue +=classes.get(x) + ",";
		returnValue +=classes.get(classes.size()-1);
		return returnValue;
	}
	
}
