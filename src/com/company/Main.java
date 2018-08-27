package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Persoon> personen = new ArrayList<>();


        String naam = "";

        do {

            double lengte = 0;
            int gewicht = 0;

            System.out.print("Geef naam (<RETURN> om te stoppen): ");

            naam = scanner.nextLine();


            if (!naam.equalsIgnoreCase("")) {
                System.out.print("Geef lengte: ");

                lengte = Double.parseDouble(scanner.nextLine());


                System.out.print("Geef gewicht: ");

                gewicht = Integer.parseInt(scanner.nextLine());

                personen.add(new Persoon(naam, lengte, gewicht));
            }


        } while (!naam.equalsIgnoreCase(""));


        Collections.sort(personen);


        System.out.println("Gesorteerd volgens BMI:");

        for (Persoon p : personen) {

            System.out.printf("%s (lengte:%.2f, gewicht: %d) heeft een BMI van %.2f\n",p.getNaam(), p.getLengte(), p.getGewicht(), p.getBMI());
        }
    }
}



