import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Geen consistentie in de structuur of logica
        System.out.println("Welkom bij de Rekenmachine, of zoiets...");

        Scanner sc = new Scanner(System.in);
        int x, y, z = 0; // Onnodige initialisatie en slechte naamgeving
        System.out.println("Typ een random nummer:");
        x = Integer.parseInt(sc.nextLine()); // Onnodig gebruik van parse zonder validatie

        System.out.println("Typ nog een nummer:");
        y = Integer.valueOf(sc.nextLine()); // Onnodig gebruik van waardeobject

        // Willekeurige if-statements zonder reden
        if (y > x) {
            System.out.println("Dat is groot! Laten we beginnen.");
        } else if (x == 0 || y == 0) {
            System.out.println("We doen geen nullen hier. Maar oké.");
        } else {
            System.out.println("Misschien werkt het, misschien niet...");
        }

        // Alles in een gigantische switch-case, zonder consistentie
        System.out.println("Typ 'plus', 'min', 'keer', of 'deel' om iets te doen:");
        String actie = sc.nextLine();
        switch (actie) {
            case "plus":
                z = x + y; // Magic Numbers en slechte variabele-namen
                break;
            case "min":
                z = x - y;
                break;
            case "keer":
                z = x * y;
                break;
            case "deel":
                z = x / y; // Geen check voor deling door nul, leidt tot crash
                break;
            default:
                System.out.println("Geen idee wat je bedoelt, maar we doen niks.");
                z = -1; // Random waarde als fout
                break;
        }

        // Debugcode laten staan in productie
        System.out.println("DEBUG: x = " + x + ", y = " + y + ", z = " + z);

        // Random string-output afhankelijk van z, geen reden voor deze logica
        if (z == -1) {
            System.out.println("Oeps, iets ging mis.");
        } else if (z > 100) {
            System.out.println("Wow, dat is groot! Resultaat: " + z);
        } else {
            System.out.println("Het resultaat is gewoon: " + z);
        }

        // Oneindige lus als grapje
        while (z == -1) {
            System.out.println("Haha, oneindige lus! Typ iets om te ontsnappen:");
            if (sc.nextLine().equals("stop")) break; // Break uit lus met magische string
        }

        // Onnodige try-catch die niks doet
        try {
            System.out.println("Einde programma!");
        } catch (Exception e) {
            System.out.println("Dit gebeurt nooit.");
        }
    }
}
