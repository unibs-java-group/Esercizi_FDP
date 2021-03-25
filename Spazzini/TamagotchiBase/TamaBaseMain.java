package it.unibs.fp.tamabase;

import it.unibs.fp.mylib.InputDati;

public class TamaBaseMain {

	private static final String MSG_BEN = "********** Benvenuto in TamaBase **********";
	private static final String MSG_FIN = "*******************************************";
	private static final String USERTAMA = "Inserire nome Tamagotchi ";
	private static final String SAZTAMA = "Inserire valori iniziali sazieta Tamagotchi ";
	private static final String SODTAMA = "Inserire valori iniziali soddisfazione Tamagotchi ";
	private static final String CARTAMA = "Inserire carezze da dare al tuo Tamagotchi ";
	private static final String BISTAMA = "Inserire biscotti da dare al tuo Tamagotchi ";
	private static final String OPT = "Inserire opzione ";
	private static final int MAX_INP = 100;
	private static final int MAX_CBI = 20;
	
	public static TamaBase creaTamagotchi(String numeroTama) {
		String tamaname = "";
		int sazio = 0; 
		int soddisfa = 0;

		
		do {
			tamaname = InputDati.leggiStringa(USERTAMA + numeroTama + ": ");
		}while(tamaname.trim().length() < 0);
		
		//leggiIntero(nome, min, max)
		sazio = InputDati.leggiIntero(SAZTAMA + numeroTama + ": ", 0, MAX_INP);
	
		//leggiIntero(nome, min, max)
		soddisfa = InputDati.leggiIntero(SODTAMA + numeroTama + ": ", 0, MAX_INP);
		
		
		return new TamaBase(tamaname, sazio, soddisfa);
	}
	
	
	public static void main(String[] args) {
		int carezze = 0;
		int biscotti = 0; 
		int controllo = 0;
		System.out.println(MSG_BEN);
		
		//creazione tamagotchi
		TamaBase t1 = creaTamagotchi("1");
		System.out.println(" ");
		do {
			int opt;
			
			System.out.println("1. Dai carezze al tuo Tamagotchi (Max 20) ");
			System.out.println("2. Dai biscotti al tuo Tamagotchi (Max 20) ");
			System.out.println("3. Esci dal programma ");
			System.out.println("4. Altri numeri -> Uscita dal programma");
			System.out.println(" ");
			opt = InputDati.leggiIntero(OPT + ": ");
			System.out.println(" ");
			
			switch(opt) {
				case 1:
					carezze = InputDati.leggiIntero(CARTAMA + ": ", 0, MAX_INP);
					t1.incSodd(carezze);
					t1.decSazio(carezze);
					System.out.println(t1.toString());
					System.out.println(" ");
					break;
				case 2:
					biscotti = InputDati.leggiIntero(BISTAMA + ": ", 0, MAX_INP);
					t1.incSazio(biscotti);
					t1.decSodd(biscotti);
					System.out.println(t1.toString());
					System.out.println(" ");
					break;
				case 3:
					System.out.println(t1.toString());
					System.out.println(" ");
					controllo = 1;
				default: 
					controllo = 1;
			}
			
		}while(controllo  != 1);
		
		
		System.out.println(MSG_FIN);

	}

}
