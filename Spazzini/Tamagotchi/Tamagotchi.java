package it.unibs.fp.lab.tamagotchi;

public class Tamagotchi {
	private static final String MES_MORTO = "Il tuo Tamagotchi e' morto";
	private static final String MES_TRISTE = "Il tuo Tamagochi e' triste";
	private static final String MES_FELICE = "Il tuo Tamagochi e' felice";
	private static final int MAX_CIBO = 100;
	private String nome;
	private int soddisfa;
	private int sazio;
	
	public Tamagotchi(String nome, int soddisfa, int sazio){
		this.nome = nome;
		this.soddisfa = soddisfa;
		this.sazio = sazio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSoddisfa() {
		return soddisfa;
	}

	public void setSoddisfa(int soddisfa) {
		this.soddisfa = soddisfa;
	}

	public int getSazio() {
		return sazio;
	}

	public void setSazio(int sazio) {
		this.sazio = sazio;
	}
	
	public boolean sonoTriste() {
		return this.soddisfa < 30 || (this.sazio < 30 || this.sazio > 90);
	}
	public boolean sonoFelice() {
		return this.soddisfa > 30 || (this.sazio > 30 && this.sazio < 90);
	}
	public boolean sonoMorto() {
		return this.sazio == 0 || this.soddisfa == 0 || this.sazio > MAX_CIBO;
	}

	
	public int riceviBiscotti() {
		int incremento = (int)(Math.random()*20);
		this.sazio += incremento;
		System.out.println("Il tamagochi ha ricevuto " + incremento + " biscotti");
		
		int decremento = (int) (incremento * 0.25);
		this.soddisfa -= decremento;
		
		return this.sazio;
	}
	
	
	public int riceviCarezze() {
		int incremento = (int)(Math.random()*20);
		this.soddisfa += incremento;
		System.out.println("Il tamagochi ha ricevuto " + incremento + " carezze");
		
		int decremento = (int) (incremento * 0.5);
		this.sazio -= decremento;
		
		return this.soddisfa;
		
	}
	
	public String toString()
	{
		StringBuffer descrizione=new StringBuffer();
		descrizione.append("Nome="+ nome);
		descrizione.append("\nSazieta= "+ this.sazio);
		descrizione.append("\nSoddisfazione= "+ this.soddisfa + "\n");
		if(!sonoMorto()) {
			if(sonoTriste())
			{
				descrizione.append(MES_TRISTE);
			}
			else if(sonoFelice())
			{
				descrizione.append(MES_FELICE);
			}
		}
		else {
			descrizione.append(MES_MORTO);
		}
		
	return descrizione.toString();	
	}
}

