package pjatk.pl.s34333BANK;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class S34333BankApplication {

	public static void main(String[] args) {
		SpringApplication.run(S34333BankApplication.class, args);
	}

    @Bean
    public CommandLineRunner demo(PrzelewStatusService przelewStatusService) {
        return args -> {
            System.out.println("-------");
            System.out.println("Dane: ");
            System.out.println("Rejestracja klienta: ID-001, Jan");
            System.out.println("Saldo");
          ;
            przelewStatusService.createPrzelew("ID-001", "Jan");
            przelewStatusService.createPrzelew("ID-002", "Maria");

            System.out.println("status Przelewu");
            przelewStatusService.printPrzelew("ID-003", "Krystian");

            System.out.println("Po przelewie");
            System.out.println(przelewStatusService.changeStatus("ID-002", "Maria"));
            przelewStatusService.changeStatus("ID-001", "PRZELAŁ: ");
            przelewStatusService.changeStatus("ID-002","DOSTAŁ");

            System.out.println("KONCOWY");
            przelewStatusService.printPrzelew("ID-003", "KONCOWY");


        };
    }

}
