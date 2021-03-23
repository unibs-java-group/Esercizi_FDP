package cuoriSolitari;

enum SegnoZodiacale
	{
	Ariete,	
	Toro,	
	Gemelli,
	Cancro,
	Leone,	
	Vergine,
	Bilancia,	
	Scorpione,	
	Sagittario,	
	Capricorno,	
	Aquario,
	Pesci;
	}

public class utente {
	private static int max_Differenza=10;
	private String username;
	private char sesso; 
	private int et�;
	private SegnoZodiacale segnoZodiacale;
	private SegnoZodiacale segnoZodiacalePreferito;
	public utente(String _username,char _sesso,int _et�,String _segnoZodiacale,String _segnoZodiacalePreferito) 
	{
		this.username=_username;
		this.sesso=_sesso;
		this.et�=_et�;
		this.segnoZodiacale=SegnoZodiacale.valueOf(_segnoZodiacale);
		this.segnoZodiacalePreferito=SegnoZodiacale.valueOf(_segnoZodiacalePreferito);
		
	}
	public boolean isAffine(utente u2) 
	{
		boolean ris=false;
		int etaM,etam;
		if(this.et�>u2.getEt�()) 
		{
			etaM=this.et�;
			etam=u2.getEt�();
		}
		else 
		{
			etaM=u2.getEt�();
			etam=this.et�;
		}
		if((this.sesso!=u2.getSesso()) && (etaM-etam)<=this.max_Differenza && (this.segnoZodiacale==u2.getSegnoZodiacalePreferito())) 
		{
			ris=true;
		}
		return ris;
	}
	public String toString() 
	{
		String s;
		s="Username = "+this.username;
		s+=" Sesso = "+this.sesso;
		s+=" et� = "+this.et�;
		s+=" segno zodiacale = "+this.segnoZodiacale;
		s+=" segno zodiacale del partner perfetto = "+this.segnoZodiacalePreferito;
		return s;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public char getSesso() {
		return sesso;
	}
	public void setSesso(char sesso) {
		this.sesso = sesso;
	}
	public int getEt�() {
		return et�;
	}
	public void setEt�(int et�) {
		this.et� = et�;
	}
	public SegnoZodiacale getSegnoZodiacale() {
		return segnoZodiacale;
	}
	public void setSegnoZodiacale(SegnoZodiacale segnoZodiacale) {
		this.segnoZodiacale = segnoZodiacale;
	}
	public SegnoZodiacale getSegnoZodiacalePreferito() {
		return segnoZodiacalePreferito;
	}
	public void setSegnoZodiacalePreferito(SegnoZodiacale segnoZodiacalePreferito) {
		this.segnoZodiacalePreferito = segnoZodiacalePreferito;
	}
	
	
	
}
