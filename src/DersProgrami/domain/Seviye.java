package DersProgrami.domain;

import java.util.ArrayList;

public class Seviye {
	
	private String ad;
	private ArrayList<Ders>dersler;
	
	public Seviye(String ad, ArrayList<Ders> dersler)
	{
		this.ad = ad;
		this.dersler = dersler;
	}

	public String getAd() {
		return ad;
	}

	public ArrayList<Ders> getDersler() {
		return dersler;
	}
	
	

}
