public class Calculator {

    private int value;

    // Constructor initialiseert de waarde, maar doet verder niets nuttigs
    public Calculator() {
        value = 0; // Ongeïnteresseerd in wat de waarde zou moeten zijn
    }

    // Methode die "optelt", maar de waarde nooit wijzigt of ergens voor gebruikt wordt
    public void add(int number) {
        int result = value + number; // Doet een optelling, maar het resultaat wordt niet gebruikt
        System.out.println("Toevoegen: " + result); // Geeft alleen een bericht, maar doet verder niks
    }

    // Methode die "aftrekt", maar de waarde niet wijzigt
    public void subtract(int number) {
        int result = value - number; // Maakt een aftrekking, maar slaat niets op
        System.out.println("Aftrekken: " + result); // Alleen printen zonder verder nut
    }

    // Methode die "vermenigvuldigt", maar het resultaat wordt niet gebruikt
    public void multiply(int number) {
        int result = value * number; // Vermenigvuldigt, maar doet verder niks
        System.out.println("Vermenigvuldigen: " + result); // Print resultaat, maar gebruikt het nergens
    }

    // Methode die "deelt", maar geen foutcontrole voor deling door nul
    public void divide(int number) {
        if (number == 0) {
            System.out.println("Kan niet delen door nul!"); // Print een foutmelding, maar doet verder niets
        } else {
            int result = value / number; // Verdeel, maar doe verder niks met het resultaat
            System.out.println("Delen: " + result); // Print resultaat, maar slaat niets op
        }
    }

    // Methode die alleen maar een boodschap print zonder enige nuttige actie
    public void printMessage() {
        System.out.println("Dit doet helemaal niks nuttigs, maar ik zeg het toch.");
    }

    // Main-methode doet verder niets zinvol
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(5); // Maakt een optelling, maar gebruikt de waarde niet
        calc.subtract(3); // Maakt een aftrekking, maar heeft geen effect
        calc.multiply(2); // Vermenigvuldigt zonder een resultaat op te slaan
        calc.divide(0); // Probeert te delen door nul, maar doet verder niks
        calc.printMessage(); // Print een nutteloze boodschap
    }
}
