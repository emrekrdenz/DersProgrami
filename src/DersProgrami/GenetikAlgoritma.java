package DersProgrami;

import java.util.ArrayList;
import java.util.stream.IntStream;

import DersProgrami.Data;
import DersProgrami.Driver;
import DersProgrami.Populasyon;
import DersProgrami.Cizelge;

public class GenetikAlgoritma {

	
	

		private Data data;
		public GenetikAlgoritma(Data data) { this.data = data; }
		public Populasyon evolve(Populasyon population) {	return mutatePopulation(crossoverPopulation(population));	}  //mutasyona u�ram�� n�fusu d�nd�rmek i�in driver.javaya gideriz
		

		/////***************************************************************************************************************
		Populasyon crossoverPopulation(Populasyon population) {
		
			Populasyon crossoverPopulation=new Populasyon(population.getCizelge().size(),data);   //ders program� boyu bu pop�lasyon ve veriler g�z �n�ne al�nd�g�nda �apraz n�fus ve yeni nufusa d�necegim
			IntStream.range(0, Driver.NUMB_OF_ELITE_SCHEDULES).forEach(x->crossoverPopulation.getCizelge().set(x, 
																													population.getCizelge().get(x)));   // ama �nce elitizm
		
			IntStream.range(Driver.NUMB_OF_ELITE_SCHEDULES,population.getCizelge().size()).forEach(x->{
				if(Driver.CROSSOVER_RATE>Math.random()) {
					Cizelge cizelge1=selectTournamentPopulation(population).sortByFitness().getCizelge().get(0);  //YALNIZCA �APRAZLAMA ORANI RASTGELE B�R SAYIDAN DAHA B�Y�KSE �APRAZLAMA GER�EKLE�T�R
					Cizelge cizelge2=selectTournamentPopulation(population).sortByFitness().getCizelge().get(0);
					crossoverPopulation.getCizelge().set(x,crossoverSchedule(cizelge1,cizelge2));
				} else crossoverPopulation.getCizelge().set(x,population.getCizelge().get(x));  //ORJ�NAL POP�LASYONDAN OLDUGU G�B� PROGRAMLARI ALIP KOY
			});
			
			return crossoverPopulation;
		}

		/////***************************************************************************************************************
		Cizelge crossoverSchedule(Cizelge cizelge1,Cizelge cizelge2) {               //2 ders program� ge�i�ini yapar
			Cizelge crossoverSchedule=new Cizelge(data).initialize();
			
			IntStream.range(0,crossoverSchedule.getClasses().size()).forEach(x->{
				if(Math.random() > 0.5)crossoverSchedule.getClasses().set(x, cizelge1.getClasses().get(x));
				else crossoverSchedule.getClasses().set(x,cizelge2.getClasses().get(x));
			});
			return crossoverSchedule;
		}

		/////***************************************************************************************************************
		Populasyon mutatePopulation(Populasyon population) {
			Populasyon mutatePopulation=new Populasyon(population.getCizelge().size(),data);
			ArrayList<Cizelge>cizelges=mutatePopulation.getCizelge();
			IntStream.range(0,Driver.NUMB_OF_ELITE_SCHEDULES).forEach(x->cizelges.set(x,population.getCizelge().get(x)));
			IntStream.range(Driver.NUMB_OF_ELITE_SCHEDULES,population.getCizelge().size()).forEach(x->{
				cizelges.set(x,mutateSchedule(population.getCizelge().get(x)));
			});
			return mutatePopulation;
		}

		/////***************************************************************************************************************
		Cizelge mutateSchedule(Cizelge mutaSchedule) {
			Cizelge cizelge=new Cizelge(data).initialize();
			IntStream.range(0,mutaSchedule.getClasses().size()).forEach(x->{
				if(Driver.MUTATION_RATE>Math.random())mutaSchedule.getClasses().set(x,cizelge.getClasses().get(x));
			});
			
			return mutaSchedule;
		}
		
		/////***************************************************************************************************************
		Populasyon selectTournamentPopulation(Populasyon population) {
			Populasyon tournamentPopulation=new Populasyon(Driver.TOURNAMENT_SELECTION_SIZE,data);  //Driverda 3 boyutu var 
		
			IntStream.range(0,Driver.TOURNAMENT_SELECTION_SIZE).forEach(x->{
				tournamentPopulation.getCizelge().set(x,population.getCizelge().get((int)(Math.random()*population.getCizelge().size())));
			});	
			return tournamentPopulation;
		}

	
	
	
	
	
	
	
	
	
}
