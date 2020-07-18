package DersProgrami.domain;

public class Akademisyen {

	private String id;
	private String ad;
	
	public Akademisyen(String id, String ad) {
		this.id = id;
		this.ad = ad;
	}

	public String getId() {
		return id;
	}

	public String getAd() {
		return ad;
	}
	public String toString() {return ad;}
	
}
