package it.unibs.fp.cuorisolitari;

public class CuoriSolitari {
	private String username;
	private String sesso;
	private int eta;
	private String zod;
	private String zodID;
	private static final int AFF = 5;

	/*private enum Zodiacali{
		ARIETE, TORO, GEMELLI, CANCRO, 
		LEONE, VERGINE, BILANCIA, SCORPIONE, 
		SAGITTARIO, CAPRICORNO, ACQUARIO, PESCI
	}
	Zodiacali zod;
	*/
	
	public CuoriSolitari(String username, String sesso, int eta, String zod, String zodID) {
		this.username = username;
		this.sesso = sesso;
		this.eta = eta;
		this.zod = zod;
		this.zodID = zodID;
	}
	public String getUsername(){
		return username;
	}
	public String getSesso(){
		return sesso;
	}
	public int getEta(){
		return eta;
	}
	
	public void setUsername(String username){
		this.username = username;
	}
	public void setSesso(String sesso){
		this.sesso = sesso;
	}
	public void setEta(int eta){
		this.eta = eta;
	}
	public String getZodID() {
		return zodID;
	}
	public void setZodID(String zodID) {
		this.zodID = zodID;
	}
	public String getZod() {
		return zod;
	}
	public void setZod(String zod) {
		this.zod = zod;
	}
	public boolean searchAffinita(CuoriSolitari cs){
		int mag = cs.getEta();
		int min = this.eta;
		int diff = 0;
		int scambio = 0;
		boolean affinita = false;
		
		if(this.zodID.contentEquals(cs.zod)) {
			if(cs.getSesso() != this.sesso) {
				if(mag < min) {
					scambio = mag;
					mag = min;
					min = scambio;
				}
				diff = mag - min;
			
				if(diff <= AFF) {
					affinita = true;
				}
			}
		}
		return affinita;
	}
	public String toString(){
		String str = "L'utente si chiama: " + this.username ;
 		return str;
	}
}
