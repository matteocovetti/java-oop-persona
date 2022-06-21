package jana60;

public class Indirizzo {

	// attributi
	private String via;
	private String numeroCivico;
	private String citta;

	// costruttore pattern di copia
	public Indirizzo(Indirizzo indirizzo) {
//		this.via = indirizzo.getVia();
//		this.numeroCivico = indirizzo.getNumeroCivico();
//		this.citta = indirizzo.getCitta();
		this(indirizzo.getVia(), indirizzo.getNumeroCivico(), indirizzo.getCitta());
	}

	// costruttore
	public Indirizzo(String via, String numeroCivico, String citta) {
		super();
		this.via = via;
		this.numeroCivico = numeroCivico;
		this.citta = citta;
	}

	// getter e setter
	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public String getNumeroCivico() {
		return numeroCivico;
	}

	public void setNumeroCivico(String numeroCivico) {
		this.numeroCivico = numeroCivico;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String toString() {
		return "via: " + via + ", " + numeroCivico + " (" + citta + ")";
	}

}
