package it.unibs.fp.tamabase;

public class TamaBase {
	private String nome;
	private int soddisfa;
	private int sazio;
	
	public TamaBase(String nome, int soddisfa, int sazio){
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
	
	public String isFelice() {
		if(this.sazio < 30 || this.soddisfa < 30) {
			return "infelice";
		}
		else if(this.sazio > 80 && this.soddisfa > 80) {
			return "felice";
		}
		return "sereno";
	}
	
	public int incSazio(int incremento) {
		if(incremento > 0) {
			this.sazio = this.sazio + incremento;
		}
		return this.sazio;
	}
	
	
	public int incSodd(int incremento) {
		if(incremento > 0) {
			this.soddisfa = this.soddisfa + incremento;
		}
		return this.soddisfa;
		
	}
	
	public int decSodd(int decremento) {
		if(decremento > 0) {
			decremento = decremento / 2;
			this.soddisfa = this.soddisfa - decremento;
		}
		return this.soddisfa;
		
	}
	
	public int decSazio(int decremento) {
		if(decremento > 0) {
			decremento = decremento / 2;
			this.sazio = this.sazio - decremento;
		}
		return this.sazio;
		
	}
	public String toString() {
		return "Il tamagotchi " + this.nome + " e' " + isFelice() + " perché ha " + this.soddisfa + " punti di soddisfazione e " + this.sazio + " punti di sazietà";
	}
}
