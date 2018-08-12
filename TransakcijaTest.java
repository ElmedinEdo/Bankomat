import java.time.LocalDate;
import java.util.Scanner;

public class TransakcijaTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Unesite password: ");
		String password = input.nextLine();
		System.out.println("1. Ra�un Mark  ");
		System.out.println("2. Ra�un John: ");
		System.out.println("3. Transfer novca sa ra�una: ");
		System.out.println("4. Izlaz ");
		int izbor = input.nextInt();

		if (izbor == 1) {
			TransakcijaTest Mark = new TransakcijaTest();
			Racun RacunMark = new Racun(19, 5000);
			RacunMark.ShowMenu();
			
		}
		if (izbor == 2) {
			TransakcijaTest John = new TransakcijaTest();
			Racun RacunJohn = new Racun(20, 2000);
			RacunJohn.ShowMenu();
			 
		}
		if (izbor == 3) {
			BankRacun John = new BankRacun();
			John.uplata(5000);
			BankRacun Mark = new BankRacun();
			Mark.uplata(2000);

			System.out.println("Stanje na bankovnom ra�unu Johna iznosi: " + John.getBalans() + " $");
			System.out.println("Stanje na bankovnom ra�unu Marka iznosi: " + Mark.getBalans() + "  $");
			System.out.println("Unesite vrijednost transakcije koju �elite da prebacite sa jednog bankovnog "
					+ "ra�una na drugi bankovni ra�un:");
			double iznos = input.nextDouble();

			System.out.println("Broj *1 za transfer novca sa John - bankovnog ra�una.");
			System.out.println("Broj *2 za transfer novca sa Mark - bankovnog ra�una.");
			int opcija = input.nextInt();

			if (opcija == 1) {
				John.transakcija(iznos, Mark);
			}
			if (opcija == 2) {
				Mark.transakcija(iznos, John);
			}
			System.out.println("--------------------------------------------------");
			  LocalDate localDate = LocalDate.of(2018, 8, 12);
			  LocalDate newDate = localDate.plusDays(0);
			  System.out.println("Datum transakcije:   " + newDate);
			System.out.println(".......................................................");
			System.out.println("Vrijednost transakcije koja se prebacuje: " + iznos + " $ ");
			System.out.println("--------------------------------------------------");
			System.out.println("Stanje na ra�unu nakon transakcije John: " + John.getBalans() + " $ ");
			System.out.println("Stanje na ra�unu nakon transakcije Mark: " + Mark.getBalans() + " $ ");
			System.out.println("--------------------------------------------------");
			System.out.println("Stanje na bankovnom ra�unu ne smije biti negativan iznos: ");
		}
			if (izbor == 4) {
			System.out.println("<<<<Izlaz>>>>");
			
			}		
			

		}

	}


