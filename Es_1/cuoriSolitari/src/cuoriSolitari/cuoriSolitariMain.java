package cuoriSolitari;

import it.unibs.fp.mylib.InputDati;
import java.util.Scanner;
public class cuoriSolitariMain {
    private static final String USERNAME = "Inserisci l'username dell'utente numero ";
    private static final String USERGEN = "Inserisci il sesso dell'utente numero ";
    private static final String USERAGE = "Inserisci l'eta dell'utente numero ";
    private static final String USERSIGN = "Inserisci il tuo segno zodiacale ";
    private static final String USERSIGNFAV = "Inserisci il segno zodiacale del tuo partner perfetto ";
	public static void main(String[]args) 
	{
		/*utente u1=new utente("Mirko",'M',20);
		utente u2=new utente("Malena",'F',30);
		Scanner sc = new Scanner(System.in);
		//System.out.println(u1.toString());
		System.out.println(u1.toString());
		System.out.println(u2.toString());*/
		utente u1=creaUtente("1");
		utente u2=creaUtente("2");
		if(u1.isAffine(u2)==true) 
		{
			System.out.println("C'� feeling");
		}
		else 
		{
			System.out.println("Non c'� feeling");
		}
		System.out.println(u1.toString());
		System.out.println(u2.toString());

	}
	
	public static utente creaUtente(String numeroUtente) {
		 	String user = "";
	        char sesso = ' ';
	        int et� = 0;
	        String segnoZodiacale;
	        String segnoZodiacalePreferito;
			do 
			{
		        user = InputDati.leggiStringa(USERNAME + numeroUtente + ":" );
		        sesso = InputDati.leggiChar(USERGEN + numeroUtente + ":");
		        et� = InputDati.leggiIntero(USERAGE + numeroUtente + ":");
		        segnoZodiacale = InputDati.leggiStringa(USERSIGN + numeroUtente + ":" );
		        segnoZodiacalePreferito = InputDati.leggiStringa(USERSIGNFAV + numeroUtente + ":" );
		        user=user.trim();
	        }while(et�<18 || et�>120 && (sesso!='M' || sesso!='F' || sesso!='m' || sesso!='f'));
	        return new utente(user, sesso, et�,segnoZodiacale,segnoZodiacalePreferito);
	}
}
