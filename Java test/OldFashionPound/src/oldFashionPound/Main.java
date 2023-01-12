package oldFashionPound;

import java.util.Scanner;

public class Main extends Utils{

	public static void main(String[] args){
		try (Scanner tastiera = new Scanner(System.in)) {
			System.out.println("Scegli una delle seguenti opzioni: \n"
					+ "1- Somma \n"
					+ "2- Sottrazione \n"
					+ "3- Moltiplicazione \n"
					+ "4- Divisione ");
			
			int scelta = Integer.parseInt(tastiera.nextLine());
			
			switch (scelta) {
			case 1: {
				
				System.out.println("Inserisci il primo prezzo per la somma in formato \n"
						+ "Xp Ys Zd :");
				Prezzo p = Utils.fromStringToPrezzo(tastiera.nextLine());
				
				System.out.println("Inserisci il secondo prezzo per la somma in formato \n"
						+ "Xp Ys Zd :");
				Prezzo p2 = Utils.fromStringToPrezzo(tastiera.nextLine());
				
				System.out.println("La somma dei prezzi � : " + Calcolatore.somma(p, p2));
				break;
			}
			case 2: {
				
				System.out.println("Inserisci il primo prezzo per la sottrazione in formato \n"
						+ "Xp Ys Zd :");
				Prezzo p = Utils.fromStringToPrezzo(tastiera.nextLine());
				
				System.out.println("Inserisci il secondo prezzo per la sottrazione in formato \n"
						+ "Xp Ys Zd :");
				Prezzo p2 = Utils.fromStringToPrezzo(tastiera.nextLine());
				
				System.out.println("La sottrazione dei prezzi � : " + Calcolatore.sottrazione(p, p2));
				break;
			}
			
			case 3: {
				
				System.out.println("Inserisci il prezzo per la moltiplicazione in formato \n"
						+ "Xp Ys Zd :");
				Prezzo p = Utils.fromStringToPrezzo(tastiera.nextLine());
				
				System.out.println("Inserisci il moltiplicatore in formato intero: \n");
				int molt = Integer.parseInt(tastiera.nextLine());
				
				System.out.println("La moltiplicazione da risultato : " + Calcolatore.moltiplicazione(p, molt));
				break;
			}
			case 4: {
				
				System.out.println("Inserisci il prezzo per la divisione in formato \n"
						+ "Xp Ys Zd :");
				Prezzo p = Utils.fromStringToPrezzo(tastiera.nextLine());
				
				System.out.println("Inserisci il dividendo > 0: \n");
				int div = Integer.parseInt(tastiera.nextLine());
				do {
					System.out.println("il volore " + div +" inserito non � > 0; \n"
							+ "inserisci un nuovo valore > 0");
					div = Integer.parseInt(tastiera.nextLine());
				}while(div <1);
				
				System.out.println("La divisione da risultato : " + Calcolatore.divisione(p, div));
				break;
			}
			default:
				System.out.println("Il valore inserito non � valido, riavviare il programma");
			}
		} catch (Exception e) {
			System.out.println("Il valore inserito non � valido, riavviare il programma");
		}
	
	}

}