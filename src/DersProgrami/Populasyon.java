package DersProgrami;

import java.util.ArrayList;
import java.util.stream.IntStream;

import DersProgrami.Data;
import DersProgrami.Cizelge;

public class Populasyon {
	

	private ArrayList<Cizelge>cizelge;      //ders çizelgesi çagýrdýk ve get ile döndürdük..
	
	public Populasyon(int size,Data data) {
		cizelge=new ArrayList<Cizelge>(size);												//PROGRAMLARIN NÜFUSU BÜYÜKLÜGÜNDE BÝR YAPICIYA SAHÝP OLDUK ve verilere somutlaþtýrdýk
		IntStream.range(0, size).forEach(x -> cizelge.add(new Cizelge(data).initialize()));  //burada baþlatýyoruz ve dizi ders programý listesinde dizi ekledigimizde uygunluk durumuna göre sýralayacagýz
	}

	
	
	public ArrayList<Cizelge> getCizelge() {
		return cizelge;
	}



	public Populasyon sortByFitness() {
		cizelge.sort((cizelge1,cizelge2)->{
		int returnValue=0;
		if(cizelge1.getFitness()>cizelge2.getFitness()) returnValue=-1;
		else if(cizelge1.getFitness()<cizelge2.getFitness()) returnValue=1;
		return	returnValue;
	});
		return this;
}		
	
}



