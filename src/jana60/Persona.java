package jana60;

public class Persona {

	// attributi
	private String nome;
	private String cognome;
	private Indirizzo indirizzo;

	private int eta;

	// costruttore
	public Persona(String nome, String cognome, Indirizzo indirizzo, int eta) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.indirizzo = new Indirizzo(indirizzo);
	}

	// costruttore senza eta nel caso voglio rendere il campo opzionale

//	public Persona(String nome, String cognome, Indirizzo indirizzo) {
//		super();
//		this.nome = nome;
//		this.cognome = cognome;
////		this.indirizzo = new Indirizzo(indirizzo.getVia(), indirizzo.getNumeroCivico(), indirizzo.getCitta());
//		this.indirizzo = new Indirizzo(indirizzo);
//	}

	// getter e setter
	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Indirizzo getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String toString() {
		return nome + " " + cognome + " (" + eta + ")";
	}
}
