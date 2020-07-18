package DersProgrami;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import DersProgrami.Data;
import DersProgrami.Driver;
import DersProgrami.GenetikAlgoritma;
import DersProgrami.Populasyon;
import DersProgrami.Cizelge;
import DersProgrami.domain.Class;
import DersProgrami.domain.Ders;
import DersProgrami.domain.DersSaati;

public class Driver {
	public static final int POPULATION_SIZE = 10;
	public static final double MUTATION_RATE = 0.3;
	public static final double CROSSOVER_RATE = 0.9;
	public static final int TOURNAMENT_SELECTION_SIZE = 2;
	public static final int NUMB_OF_ELITE_SCHEDULES = 1;
	private int scheduleNumb = 0;
	private int classNumb = 1;
	private Data data;

	public static String deger = "";
	public static String aaa = ""; 

	@FXML
	private TextArea text1;

	@FXML
	private Button button1;
	
	@FXML
	private TextArea input;

	
	@FXML
	void button1_click(ActionEvent event) {
		

		Driver driver = new Driver();
		driver.data = new Data();
		int generationNumber = 0;
		driver.cizelgeGoster();
		
		input.setText(aaa);

		System.out.println("> Nesil # " + generationNumber);
		System.out.print("  Çizelge # |                                           ");
		System.out.print("			Sýnýflar [Bölüm*,Class*,Sýnýf,Akademisyen,Ders Saati]       ");
		System.out.println("                                       Uygunluk | Çakýþma");
		System.out.print("---------------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------------");
		GenetikAlgoritma geneticAlgorithm = new GenetikAlgoritma(driver.data);
		Populasyon population = new Populasyon(Driver.POPULATION_SIZE, driver.data).sortByFitness();

		population.getCizelge()
				.forEach(schedule -> System.out.println("      " + driver.scheduleNumb++ + " 	|  " + schedule + " |  "
						+ String.format("%5f", schedule.getFitness()) + " |	" + schedule.getNumbOfConflicts()));
		driver.cizelgeYazdir(population.getCizelge().get(0), generationNumber);
////*******************************************************************************************************************************

		driver.classNumb = 1;
		while (population.getCizelge().get(0).getFitness() != 1.0) {
			
			System.out.println("> Nesil = " + ++generationNumber);
			System.out.println("   Çizelge #                                  ");
			System.out.println(" Sýnýflar [Bölüm,Class,Sýnýf,Akademisyen,Ders Saati]      ");
			System.out.println("                                     | Uygunluk | Çakýþma");
			System.out.print("---------------------------------------------------------------------");
			System.out.println("---------------------------------------------------------------------");
		population = geneticAlgorithm.evolve(population).sortByFitness();
			driver.scheduleNumb = 0;
			population.getCizelge().forEach(cizelge -> System.out.println("      " + driver.scheduleNumb++ + " 	|  " + cizelge
							+ " |  " + String.format("%5f", cizelge.getFitness()) + " |	"
							+ cizelge.getNumbOfConflicts()));
			driver.cizelgeYazdir(population.getCizelge().get(0), generationNumber);
			driver.classNumb = 1;

		}
		
		//System.out.println(deger);
		text1.setText(deger);
	}


	//// *******************************************************************************************************************************
	// EN SON ÇIKTI VE TABLO
	private void cizelgeYazdir(Cizelge schedule, int generation) {
		ArrayList<Class> classes = schedule.getClasses();
		System.out.print("\n                                                                                  ");
		System.out.println(
				"Sýnýf # | Seviye | Ders (number, max # of students) | Derslik (Kapasite) | Eðitmen (Id) | Ders Saati(Id)");
		System.out.print("                          ");
		System.out.print("-----------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------");
		
		deger="";
		
		classes.forEach(x -> {
			int bolumIndex = data.getSeviyeler().indexOf(x.getSeviye());
			int dersIndex = data.getDersler().indexOf(x.getDers());
			int odaIndex = data.getSiniflar().indexOf(x.getSinif());
			int akademisyenIndex = data.getAkademisyenler().indexOf(x.getAkademisyen());
			int dersSaatiIndex = data.getDersSaatleri().indexOf(x.getDersSaati());
			System.out.print("                          ");
			System.out.print(String.format(" %1$02d  ",classNumb)+ "	|	");
			System.out.print(String.format("%1$4s",data.getSeviyeler().get(bolumIndex).getAd())+ "	|	");
			System.out.print(String.format("%1$21s",data.getDersler().get(dersIndex).getAd()+ "("+data.getDersler().get(dersIndex).getNum()+", "+x.getDers().getMaksOgrenci())+ ")	  |	");
			System.out.print(String.format("%1$10s",data.getSiniflar().get(odaIndex).getNum() + "("+x.getSinif().getSinifMevcudu())+ ")        |  ");
			System.out.print(String.format("%1$15s",data.getAkademisyenler().get(akademisyenIndex).getAd()+" ("+data.getAkademisyenler().get(akademisyenIndex).getId()+")")+"	|  ");
			System.out.println(data.getDersSaatleri().get(dersSaatiIndex).getSaat()+" ("+data.getDersSaatleri().get(dersSaatiIndex).getId()+")");
			
	
			deger +=String.format(" %1$02d  ",classNumb)+ "	|	";
			deger +=String.format("%1$4s",data.getSeviyeler().get(bolumIndex).getAd())+ "	|	";
			deger +=String.format("%1$21s",data.getDersler().get(dersIndex).getAd()+ "("+data.getDersler().get(dersIndex).getNum()+", "+x.getDers().getMaksOgrenci())+ ")	  |	";
			deger +=String.format("%1$10s",data.getSiniflar().get(odaIndex).getNum() + "("+x.getSinif().getSinifMevcudu())+ ")        |  ";	
			deger +=String.format("%1$15s",data.getAkademisyenler().get(akademisyenIndex).getAd()+" ("+data.getAkademisyenler().get(akademisyenIndex).getId()+")")+"	|  ";
			deger +=data.getDersSaatleri().get(dersSaatiIndex).getSaat()+" ("+data.getDersSaatleri().get(dersSaatiIndex).getId()+")";
			deger +="\n";
			
			classNumb++;
		});
		if (schedule.getFitness() == 1)
			System.out.println((generation + 1) + " .Nesilde bulundu");
		System.out.print("----------------------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------------------");
		
		
	}
	//// *******************************************************************************************************************************

	//// *******************************************************************************************************************************
	// EN ÜSTTEKÝ BÝLGÝLER

	private void cizelgeGoster() {
		
		
		System.out.println("Tüm Departmanlar ==>");
		data.getSeviyeler().forEach(x -> System.out.println(x.getAd() + ", Dersler: " + x.getDersler()));
		System.out.println("\nTüm Dersler ==>");
		data.getDersler().forEach(x -> System.out.println("Ders #: " + x.getNum() + ", name: " + x.getAd()
				+ ", max # öðrenciler: " + x.getMaksOgrenci() + ", Eðitmen: " + x.getAkademisyenler()));

		System.out.println("\nTüm Derslikler ==>");
		data.getSiniflar().forEach(x -> System.out
				.println("Derslik #: " + x.getNum() + ", max oturak kapasitesi: " + x.getSinifMevcudu()));

		System.out.println("\nTüm Egitmenler ==>");
		data.getAkademisyenler().forEach(x -> System.out.println("id: " + x.getId() + ", name: " + x.getAd()));

		System.out.println("\nDers Programý ==>");
		data.getDersSaatleri().forEach(x -> System.out.println("id: " + x.getId() + ", Ders Saati: " + x.getSaat()));

		System.out
				.print("--------------------------------------------------------------------------------------------");
		System.out.println(
				"--------------------------------------------------------------------------------------------");
		
		
		data.getSeviyeler().forEach(x -> aaa+= x.getAd()+" Dersleri =" + x.getDersler()+"\n");
		aaa+= "\n Ders Bilgileri ==>\n";
		data.getDersler().forEach(x -> aaa+= "Ders Kodu: " + x.getNum() + ", Ders Ýsmi: " + x.getAd().trim()+"\t"
				+ ",Sýnýf Mevcudu:" + x.getMaksOgrenci()+"\t" + ", Akademisyen: " + x.getAkademisyenler()+"\n");

				aaa+= "\nTüm Derslikler ==>";
		data.getSiniflar().forEach(x -> aaa+= "Derslik #: " + x.getNum() + ", max oturak kapasitesi: " + x.getSinifMevcudu()+"\n");

		aaa+= "\nTüm Egitmenler ==>";
		data.getAkademisyenler().forEach(x -> aaa+= "id: " + x.getId() + ", name: " + x.getAd()+"\n");

		aaa+= "\nDers Saatleri ==>\n";
		data.getDersSaatleri().forEach(x -> aaa+= "Süre id:\t" + x.getId()+"\n" + "Ders Saati: " + x.getSaat()+"\n");

	}

	//// *******************************************************************************************************************************


}
