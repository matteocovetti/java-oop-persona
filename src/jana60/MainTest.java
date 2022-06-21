package jana60;

import java.util.Random;
import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		Random random = new Random();

		// Persone con età: inizializziamo 10 persone random e calcoliamo età media

		String[] nomi = new String[] { "Francesco", "Davide", "Angela", "Alessia", "Marco", "Costanza", "Mario",
				"Tonia" };
		String[] cognomi = new String[] { "Elia", "Catalano", "Esposito", "Biagi", "Procopio", "Fioreto" };

		Persona[] persone = new Persona[10];
		Indirizzo indirizzo = new Indirizzo("Via del Corso", "45a", "Roma");
		for (int i = 0; i < persone.length; i++) {
			int randomIndexNome = random.nextInt(nomi.length);
			String randomNome = nomi[randomIndexNome];

			int randomIndexCognome = random.nextInt(cognomi.length);
			String randomCognome = cognomi[randomIndexCognome];

			Persona persona = new Persona(randomNome, randomCognome, indirizzo, random.nextInt(100));
			System.out.println(persona);
			persone[i] = persona;
		}

		// calcolo della media
		int somma = 0;
		for (int i = 0; i < persone.length; i++) {
//			Persona persona = persone[i];
			somma += persone[i].getEta();
		}
		int media = somma / persone.length;
		System.out.println("Età media: " + media);

		System.exit(0);

		// Svolgimento esercizio traccia

		Scanner scan = new Scanner(System.in);

		System.out.println("Inserisci via: ");
		String via = scan.nextLine();
		System.out.println("Inserisci numero: ");
		String numero = scan.nextLine();
		System.out.println("Inserisci citta: ");
		String citta = scan.nextLine();
		Indirizzo i1 = new Indirizzo(via, numero, citta);

		Persona francesco = new Persona("Francesco", "Elia", i1, 34);

		System.out.println("Inserisci via: ");
		via = scan.nextLine();
		System.out.println("Inserisci numero: ");
		numero = scan.nextLine();
		System.out.println("Inserisci citta: ");
		citta = scan.nextLine();
		i1.setCitta(citta);
		i1.setVia(via);
		i1.setNumeroCivico(numero);

		Persona costanza = new Persona("Costanza", "Zanoletti", i1, 34);

		System.out.println("Indirizzo Francesco: " + francesco.getIndirizzo());
		System.out.println("Indirizzo Costanza: " + costanza.getIndirizzo());

		costanza.getIndirizzo().setCitta("Verona");

		System.out.println("Indirizzo Francesco: " + francesco.getIndirizzo());
		System.out.println("Indirizzo Costanza: " + costanza.getIndirizzo());

		scan.close();
	}

}
