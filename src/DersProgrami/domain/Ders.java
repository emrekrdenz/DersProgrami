package DersProgrami.domain;

import java.util.ArrayList;

public class Ders {

	private String num=null;
	private String ad=null;
	private int maksOgrenci;
	private ArrayList<Akademisyen>akademisyenler;
	
	public Ders(String num, String ad, int maksOgrenci, ArrayList<Akademisyen> akademisyenler)
	{
		this.num = num;
		this.ad = ad;
		this.maksOgrenci = maksOgrenci;
		this.akademisyenler = akademisyenler;
	}

	public String getNum() {
		return num;
	}

	public String getAd() {
		return ad;
	}

	public int getMaksOgrenci() {
		return maksOgrenci;
	}

	public ArrayList<Akademisyen> getAkademisyenler() {
		return akademisyenler;
	}
	
	public String toString() { 
		return ad;
	}
	
	
	
	
}
