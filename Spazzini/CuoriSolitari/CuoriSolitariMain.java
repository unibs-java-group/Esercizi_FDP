package it.unibs.fp.cuorisolitari;
import it.unibs.fp.mylib.InputDati;

public class CuoriSolitariMain {

	private static final String USERNAME = "Inserisci l'username dell'utente  ";
	private static final String USERGEN = "Inserisci il sesso dell'utente  ";
	private static final String USERAGE = "Inserisci l'eta dell'utente  ";
	private static final String USERSEG = "Inserisci il segno zodiacale  ";
	private static final String USERSEGID = "Inserisci il segno zodiacale del partner ideale ";
	private static final int MIN = 18;
	private static final int MAX = 120;
	
	/* Possibile soluzione con enum per i segni zodiacali
	 * private enum Zodiacali{
		ARIETE, TORO, GEMELLI, CANCRO, 
		LEONE, VERGINE, BILANCIA, SCORPIONE, 
		SAGITTARIO, CAPRICORNO, ACQUARIO, PESCI
	}
	*/
	
	public static String salutoUtenti() {
		return "------- Benvenuti su CuoriSolitari -------";
	}
	
	public static String risultatoAff() {
		return "------- Risultato affinità -------";
	}
	
	public static CuoriSolitari creaUtente(String numeroUtente){
		String user = "";
		String sesso = "";
		String segno = "";
		String segnoID = "";
		int eta;
		
		do{
			user = InputDati.leggiStringa(USERNAME + numeroUtente + ":" );
		}while(user.trim().length() <= 0);
		do{
			sesso = InputDati.leggiStringa(USERGEN + numeroUtente + ":");
		}while(!"Maschio".contentEquals(sesso) && !"Femmina".contentEquals(sesso));
		
		do{
			 eta = InputDati.leggiIntero(USERAGE + numeroUtente + ":");
		}while(eta < MIN || eta > MAX);
		do{
			segno = InputDati.leggiStringa(USERSEG + numeroUtente + ":" );
		}while(segno.trim().length() <= 0);
		do{
			segnoID = InputDati.leggiStringa(USERSEGID + numeroUtente + ":" );
		}while(segno.trim().length() <= 0);
		
		return new CuoriSolitari(user, sesso, eta, segno, segnoID);
	}

	public static void main(String[] args) {
		System.out.println(salutoUtenti());
		CuoriSolitari c1 = creaUtente("1");
		CuoriSolitari c2 = creaUtente("2");
		
		
		System.out.println(risultatoAff());
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c1.searchAffinita(c2));
	}

}
