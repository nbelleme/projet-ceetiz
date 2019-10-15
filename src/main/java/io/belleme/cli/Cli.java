package io.belleme.cli;

import io.belleme.business.model.Company;
import io.belleme.business.model.MonoCompany;
import io.belleme.business.model.SasCompany;

import java.util.Scanner;

class Cli {

    private static final String SAS = "SAS";
    private static final String MONO = "Mono";
    private static final Scanner COMMAND = new Scanner(System.in);

    public static void main(String... args) {
        try (COMMAND) {
            create();
        }
    }

    private static void create() {
        boolean running = true;

        while (running) {
            String name = promptForString("Veuillez entrer le nom de l'entreprise: ");
            String siret = promptForString("Veuillez entrer le SIRET de l'entreprise: ");
            double turnover = promptForDouble("Veuillez entrer le chiffre d'affaire de l'entreprise:");

            String type = "";

            while (!type.equals(MONO) && !type.equals(SAS)) {
                type = promptForString("Veuillez entrer le type d'entreprise (Mono, SAS):");
            }

            Company company;
            if (type.equals(MONO)) {
                company = MonoCompany.builder()
                                     .name(name)
                                     .siret(siret)
                                     .turnover(turnover)
                                     .build();
            } else {
                String address = promptForString("Veuillez entrer l'adresse de l'entreprise : ");
                company = SasCompany.builder()
                                    .name(name)
                                    .siret(siret)
                                    .turnover(turnover)
                                    .address(address)
                                    .build();
            }

            System.out.println(company.toString());
            System.out.printf("Taxes : %s€%n", company.computeTaxes());
            running = false;
        }
    }

    private static double promptForDouble(String question) {
        double turnover = 0;
        boolean promptTurnover = true;
        while (promptTurnover) {
            System.out.println(question);
            try {
                turnover = Double.parseDouble(COMMAND.nextLine());
                promptTurnover = false;
            } catch (NumberFormatException e) {
                System.out.println("Le format du chiffre d'affaire n'est pas correct.");
            }

        }
        return turnover;
    }

    private static String promptForString(String question) {
        System.out.println(question);
        return COMMAND.nextLine();
    }
}


