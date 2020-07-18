package DersProgrami.domain;

public class Class {

	private int id;
	private Seviye seviye;
	private Ders ders;
	private Akademisyen akademisyen;
	private DersSaati dersSaati;
	private Sinif sinif;
	
	
	public Class(int id, Seviye seviye, Ders ders) {
		this.id = id;
		this.seviye = seviye;
		this.ders = ders;
	}


	public void setAkademisyen(Akademisyen akademisyen) {
		this.akademisyen = akademisyen;
	}



	public void setDersSaati(DersSaati dersSaati) {
		this.dersSaati = dersSaati;
	}


	public void setSinif(Sinif sinif) {
		this.sinif = sinif;
	}


	public int getId() {
		return id;
	}


	public Seviye getSeviye() {
		return seviye;
	}


	public Ders getDers() {
		return ders;
	}


	public Akademisyen getAkademisyen() {
		return akademisyen;
	}


	public DersSaati getDersSaati() {
		return dersSaati;
	}


	public Sinif getSinif() {
		return sinif;
	}


	@Override
	public String toString() 
	{
		return "[" +seviye.getAd() + "," + ders.getNum() + "," + sinif.getNum() + "," + akademisyen.getId() + "," + dersSaati.getId() + "]";
	
	}
	
}
