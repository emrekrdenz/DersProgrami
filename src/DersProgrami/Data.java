package DersProgrami;

import DersProgrami.domain.Ders;
import DersProgrami.domain.DersSaati;

import java.util.ArrayList;
import java.util.Arrays;

import DersProgrami.domain.Akademisyen;
import DersProgrami.domain.Seviye;
import DersProgrami.domain.Sinif;


public class Data {
	
	private ArrayList<Sinif> siniflar;
    private ArrayList<Akademisyen> akademisyenler;
    private ArrayList<Ders> dersler;
    private ArrayList<Seviye> seviyeler;
    private ArrayList<DersSaati> dersSaatleri;
    private int SinifNum = 0;
    
    public Data() { initialize(); }        //Ýnitialize baþlatýcý baþlattýk
    
    
    private Data initialize()
    {
        Sinif Sinif1 = new Sinif("D-101", 60);
        Sinif Sinif2 = new Sinif("D-102", 50);
        Sinif Sinif4 = new Sinif("D-103", 50);
        Sinif Sinif5 = new Sinif("D-104", 62);
        Sinif Sinif6 = new Sinif("Lab-1", 65);
        Sinif Sinif7 = new Sinif("Lab-2", 65);
        Sinif Sinif8 = new Sinif("Lab-3", 65);

        siniflar = new ArrayList<Sinif>(Arrays.asList(Sinif1, Sinif2,Sinif4,Sinif5,Sinif6,Sinif7,Sinif8));  //Liste Yapýsýna aktardýk

        DersSaati dersSaati1 = new DersSaati("M1", "Pazartesi 17:00-18:15");
        DersSaati dersSaati2 = new DersSaati("M2", "Pazartesi 18:20-19:35");
        DersSaati dersSaati3 = new DersSaati("M3", "Pazartesi 19:40-20:55");
        DersSaati dersSaati4 = new DersSaati("M4", "Pazartesi 20:55-22:10");
        DersSaati dersSaati5 = new DersSaati("M5", "Pazartesi 22:15-23:30");
        
        DersSaati dersSaati6 = new DersSaati("M6", "Salý 17:00-18:15");
        DersSaati dersSaati7 = new DersSaati("M7", "Salý 18:20-19:35");
        DersSaati dersSaati8 = new DersSaati("M8", "Salý 19:40-20:55");
        DersSaati dersSaati9 = new DersSaati("M9", "Salý 20:55-22:10");
        DersSaati dersSaati10 = new DersSaati("M10", "Salý 22:15-23:30");
        
        DersSaati dersSaati11 = new DersSaati("M11", "Çarþamba 17:00-18:15");
        DersSaati dersSaati12 = new DersSaati("M12", "Çarþamba 18:20-19:35");
        DersSaati dersSaati13 = new DersSaati("M13", "Çarþamba 19:40-20:55");
        DersSaati dersSaati14 = new DersSaati("M14", "Çarþamba 20:55-22:10");
        DersSaati dersSaati15 = new DersSaati("M15", "Çarþamba 22:15-23:30");
        
        DersSaati dersSaati16 = new DersSaati("M16", "Perþembe 17:00-18:15");
        DersSaati dersSaati17 = new DersSaati("M17", "Perþembe 18:20-19:35");
        DersSaati dersSaati18 = new DersSaati("M18", "Perþembe 19:40-20:55");
        DersSaati dersSaati19 = new DersSaati("M19", "Perþembe 20:55-22:10");
        DersSaati dersSaati20 = new DersSaati("M20", "Perþembe 22:15-23:30");
         
        DersSaati dersSaati21 = new DersSaati("M21", "Cuma 17:00-18:15");
        DersSaati dersSaati22 = new DersSaati("M22", "Cuma 18:20-19:35");
        DersSaati dersSaati23=  new DersSaati("M23", "Cuma 19:40-20:55");
        DersSaati dersSaati24 = new DersSaati("M24", "Cuma 20:55-22:10");
        DersSaati dersSaati25 = new DersSaati("M25", "Cuma 22:15-23:30");
   
        
        dersSaatleri = new ArrayList<DersSaati>(Arrays.asList(dersSaati1, dersSaati2, dersSaati3, dersSaati4,dersSaati5,dersSaati6,
        		dersSaati7, dersSaati8, dersSaati9,dersSaati10,dersSaati11,dersSaati12,dersSaati13, dersSaati14,dersSaati15, dersSaati16
        		,dersSaati17,dersSaati18,dersSaati19,dersSaati20, dersSaati21, dersSaati22, dersSaati23,dersSaati24,dersSaati25));

        Akademisyen Akademisyen1  = new Akademisyen( "A1 ",  "Yakup  Kutlu         " );
        Akademisyen Akademisyen2  = new Akademisyen( "A2 ",  "Ýpek A. Keleþ        " );
        Akademisyen Akademisyen3  = new Akademisyen( "A3 ",  "Ahmet Gökçen         " );
        Akademisyen Akademisyen4  = new Akademisyen( "A4 ",  "Gökhan Altan         " );
        Akademisyen Akademisyen5  = new Akademisyen( "A5 ",  "Kübra Yakýncý        " );
        Akademisyen Akademisyen6  = new Akademisyen( "A6 ",  "Bedriye Mursaloglu   " );
        Akademisyen Akademisyen7  = new Akademisyen( "A7 ",  "Samet Ayan           " );
        Akademisyen Akademisyen8  = new Akademisyen( "A8 ",  "Uður Duran           " );
        Akademisyen Akademisyen9  = new Akademisyen( "A9 ",  "Yahya  Yýlmaz        " );
        Akademisyen Akademisyen10 = new Akademisyen( "A10",  "Sertan Alkan         " );
        Akademisyen Akademisyen11 = new Akademisyen( "A11",  "Eyyuphan Yakýncý     " );
        Akademisyen Akademisyen12 = new Akademisyen( "A12",  "Tolga Depçi          " );
        Akademisyen Akademisyen13 = new Akademisyen( "A13",  "Ersin Bahçeci        " );
        Akademisyen Akademisyen14 = new Akademisyen( "A14",  "Çaðlar Oflazoglu     " );
        Akademisyen Akademisyen15 = new Akademisyen( "A15",  "Mehmet Sarýgül       " );
        Akademisyen Akademisyen16 = new Akademisyen( "A16",  "Sevil S. Gökçen      " );
        Akademisyen Akademisyen17 = new Akademisyen( "A17",  "Zafer Bozyer         " );
        
        
        akademisyenler = new ArrayList<Akademisyen>(Arrays.asList(Akademisyen1, Akademisyen2, Akademisyen3, Akademisyen4,
        		Akademisyen5,Akademisyen6,Akademisyen7,Akademisyen8,Akademisyen9,Akademisyen10,Akademisyen11,Akademisyen12,Akademisyen13,Akademisyen14,Akademisyen15,Akademisyen16,Akademisyen17));

        Ders kurs1 = new Ders(  "D1",   "Devre Elemanlarý                 ", 50, new ArrayList<Akademisyen>(Arrays.asList(Akademisyen3)));
        Ders kurs2 = new Ders(  "D2",   "Bilgisayar Programlama           ", 65, new ArrayList<Akademisyen>(Arrays.asList(Akademisyen1, Akademisyen4)));
        Ders kurs3 = new Ders(  "D3",   "Fizik-2                          ", 50, new ArrayList<Akademisyen>(Arrays.asList(Akademisyen5)));     										//DERSKOD,DERSÝSÝM,KAPASÝTE,HOCA
        Ders kurs4 = new Ders(  "D4",   "Matematik-2                      ", 50, new ArrayList<Akademisyen>(Arrays.asList(Akademisyen10, Akademisyen8)));
        Ders kurs5 = new Ders(  "D5",   "Ýngilizce-2                      ", 45, new ArrayList<Akademisyen>(Arrays.asList(Akademisyen6)));
        Ders kurs6 = new Ders(  "D6",   "Türk Dili-2                      ", 45, new ArrayList<Akademisyen>(Arrays.asList(Akademisyen7)));
        Ders kurs7 = new Ders(  "D7",   "Inkilap-2                        ", 45, new ArrayList<Akademisyen>(Arrays.asList(Akademisyen9)));
        Ders kurs8 = new Ders(  "D8",   "Giriþimcilik                     ", 45, new ArrayList<Akademisyen>(Arrays.asList(Akademisyen14)));
        
        Ders kurs9 = new Ders ( "D9",   "VTD.Görsel Program               ", 65, new ArrayList<Akademisyen>(Arrays.asList(Akademisyen15)));
        Ders kurs10 = new Ders( "D10",  "Ýþletim Sistemleri               ", 50, new ArrayList<Akademisyen>(Arrays.asList(Akademisyen14,Akademisyen15)));
        Ders kurs11 = new Ders( "D11",  "Sayýsal Tasarým 2                ", 50, new ArrayList<Akademisyen>(Arrays.asList(Akademisyen3)));
        Ders kurs12 = new Ders( "D12",  "Ýþ Saðlýðý ve Güvenliði          ", 50, new ArrayList<Akademisyen>(Arrays.asList(Akademisyen12)));
        Ders kurs13 = new Ders( "D13",  "Olasýlýk ve Ýstatistik           ", 55, new ArrayList<Akademisyen>(Arrays.asList(Akademisyen10,Akademisyen8)));
        Ders kurs14 = new Ders( "D14",  "Lineer Cebir                     ", 45, new ArrayList<Akademisyen>(Arrays.asList(Akademisyen10,Akademisyen8)));
        Ders kurs15 = new Ders( "D15",  "Sayýsal Tasarým Lab              ", 45, new ArrayList<Akademisyen>(Arrays.asList(Akademisyen3)));
        
        Ders kurs16 = new Ders( "D16",  "Mikroiþlemciler                  ", 62, new ArrayList<Akademisyen>(Arrays.asList(Akademisyen2)));
        Ders kurs17 = new Ders( "D17",  "Bilgisayar Aðlarý                ", 62, new ArrayList<Akademisyen>(Arrays.asList(Akademisyen2)));
        Ders kurs18 = new Ders( "D18",  "Yazýlým Müh. Giriþ               ", 45, new ArrayList<Akademisyen>(Arrays.asList(Akademisyen1)));
        Ders kurs19 = new Ders( "D19",  "Nesne Tabanlý prog.              ", 65, new ArrayList<Akademisyen>(Arrays.asList(Akademisyen4)));
        Ders kurs20 = new Ders( "D20",  "Web Tabanlý Prog.                ", 65, new ArrayList<Akademisyen>(Arrays.asList(Akademisyen1,Akademisyen10)));
        Ders kurs21 = new Ders( "D21",  "Üniversite Etkinlikleri          ", 55, new ArrayList<Akademisyen>(Arrays.asList(Akademisyen1)));
        
        Ders kurs22 = new Ders( "D22",  "Kablosuz Sensör Aðlar            ", 45, new ArrayList<Akademisyen>(Arrays.asList(Akademisyen2)));
        Ders kurs23 = new Ders( "D23",  "Robotik Uygulamalarý             ", 65, new ArrayList<Akademisyen>(Arrays.asList(Akademisyen3)));
        Ders kurs24 = new Ders( "D24",  "Yapay Zeka Uygulamalarý          ", 45, new ArrayList<Akademisyen>(Arrays.asList(Akademisyen4)));
        Ders kurs25 = new Ders( "D25",  "Sayýsal Görüntü Ýþleme           ", 65, new ArrayList<Akademisyen>(Arrays.asList(Akademisyen1)));
        Ders kurs26 = new Ders( "D26",  "Ýnsan Bilgisayar Etkileþimi      ", 45, new ArrayList<Akademisyen>(Arrays.asList(Akademisyen17)));
        Ders kurs27 = new Ders( "D27",  "Biliþim Hukuku                   ", 45, new ArrayList<Akademisyen>(Arrays.asList(Akademisyen16)));
        Ders kurs28 = new Ders( "D28",  "Müh.Bilgisayar Uygulamalarý 2    ", 65, new ArrayList<Akademisyen>(Arrays.asList(Akademisyen13,Akademisyen1)));
        
           
        dersler = new ArrayList<Ders>(Arrays.asList(kurs1, kurs2, kurs3, kurs4, kurs5, kurs6, kurs7,
        		 kurs8, kurs9, kurs10, kurs11, kurs12, kurs13, kurs14, kurs15, kurs16, kurs17, kurs18, kurs19, 
        		kurs20, kurs21, kurs22, kurs23,kurs24,kurs25,kurs26,kurs27,kurs28));

        Seviye seviye =  new Seviye("1.Sinif", new ArrayList<Ders>(Arrays.asList(kurs1, kurs2,kurs3,kurs4,kurs5,kurs6,kurs7,kurs8)));
        Seviye seviye2 = new Seviye("2.Sinif", new ArrayList<Ders>(Arrays.asList(kurs9,kurs10,kurs11,kurs12,kurs13,kurs14,kurs15)));
        Seviye seviye3 = new Seviye("3.Sinif", new ArrayList<Ders>(Arrays.asList(kurs16,kurs17,kurs18,kurs19,kurs20,kurs21)));
        Seviye seviye4 = new Seviye("4.Sinif", new ArrayList<Ders>(Arrays.asList(kurs22, kurs23, kurs24,kurs25,kurs26,kurs27,kurs28)));
        seviyeler = new ArrayList<Seviye>(Arrays.asList(seviye, seviye2, seviye3,seviye4));
        seviyeler.forEach(x->SinifNum += x.getDersler().size());    //TOPLAM SINIF SAYISINI HESAPLAR 
        return this;
        
    }


	

	public ArrayList<Sinif> getSiniflar() {
		return siniflar;
	}


	public ArrayList<Akademisyen> getAkademisyenler() {
		return akademisyenler;
	}


	public ArrayList<Ders> getDersler() {
		return dersler;
	}


	public ArrayList<Seviye> getSeviyeler() {
		return seviyeler;
	}


	public ArrayList<DersSaati> getDersSaatleri() {
		return dersSaatleri;
	}


	public int getSinifNum() {
		return SinifNum;
	}
    
}
