package DersProgrami;

import java.util.ArrayList;
import java.util.stream.IntStream;

import DersProgrami.Data;
import DersProgrami.Cizelge;

public class Populasyon {
	

	private ArrayList<Cizelge>cizelge;      //ders �izelgesi �ag�rd�k ve get ile d�nd�rd�k..
	
	public Populasyon(int size,Data data) {
		cizelge=new ArrayList<Cizelge>(size);												//PROGRAMLARIN N�FUSU B�Y�KL�G�NDE B�R YAPICIYA SAH�P OLDUK ve verilere somutla�t�rd�k
		IntStream.range(0, size).forEach(x -> cizelge.add(new Cizelge(data).initialize()));  //burada ba�lat�yoruz ve dizi ders program� listesinde dizi ekledigimizde uygunluk durumuna g�re s�ralayacag�z
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



