import java.util.Scanner;

public class ChemCalc {

    public static double GramsToMoles(Scanner input) {
        System.out.print("\nEnter how much grams you have: ");
        double Grams = input.nextDouble();

        System.out.print("\nEnter the Molar Mass of your chemical: ");
        double MolarMass = input.nextDouble();

        double moles = Grams / MolarMass;

        return moles;
    }

    public static double MolesofGrams(Scanner input) {

        System.out.print("\nEnter how much moles you have: ");
        double Moles = input.nextDouble();

        System.out.print("\nEnter the Molar Mass of your chemical: ");
        double MolarMass = input.nextDouble();

        double grams = Moles * MolarMass;

        return grams;
    }

    public static double Molarity(Scanner input) {
        System.out.print("\nEnter how much moles you have: ");
        double Moles = input.nextDouble();

        System.out.print("\nEnter the Volume of your solution (L): ");
        double Volume = input.nextDouble();

        double molarity = Moles / Volume;

        return molarity;
    }
    public static double Density(Scanner input) {
        System.out.print("\nEnter how much mass (g) you have: ");
        double Mass = input.nextDouble();

        System.out.print("\nEnter the Volume of your solution (L): ");
        double Volume = input.nextDouble();

        double density = Mass / Volume;

        return density;
    }
    public static double[] percentComposition(Scanner input) {
        System.out.print("\nEnter how much mass (g) you have of your element 1: ");
        double Mass_element1 = input.nextDouble();

        System.out.print("\nEnter how much mass (g) you have of your element 2: ");
        double Mass_element2 = input.nextDouble();

        double Mass_total = Mass_element1 + Mass_element2;
        double element1 = (Mass_element1 / Mass_total)*100;
        double element2 = (Mass_element2 / Mass_total)*100;

        return new double[] {
            element1, element2
        };
    }

    public static void main(String[] args) {

        while (true) {
            // import declaration to use in code later
        Scanner input = new Scanner(System.in);

        System.out.println("\nSelect a calculation: 1. g -> mol, 2. mol -> g, 3: Molarity, 4: Density, 5: Percent Composition, 6: Exit");
        System.out.print("Type your response only as the number. Eg. '3': ");

        String calculation = input.nextLine().toLowerCase().strip();

        if (calculation.equals("1")) {
            double moles = 0;
            moles = GramsToMoles(input);
            String RoundedMoles = String.format("%.3f", moles); 
            System.out.println("You have about " + RoundedMoles + " mol of your chemical!");
        }
        else if (calculation.equals("2")) {
            double grams = 0;
            grams = GramsToMoles(input);
            String RoundedGrams = String.format("%.3f", grams); 
            System.out.println("You have about " + RoundedGrams + " grams of your chemical!\n");
        }
        else if (calculation.equals("3")) {
            double molarity = 0;
            molarity = Molarity(input);
            String RoundedMolarity = String.format("%.1f", molarity); 
            System.out.println("You have about " + RoundedMolarity + " molar of your chemical!\n");
        }
        else if (calculation.equals("4")) {
            double density = 0;
            density = Density(input);
            String RoundedDensity = String.format("%.1f", density); 
            System.out.println("The Density of your chemical is about " + RoundedDensity);

        }
        else if (calculation.equals("5")) {
            
            double[] result = percentComposition(input);
            double element1 = result[0];
            double element2 = result[1];

            String RoundedEl1 = String.format("%.2f", element1); 
            String RoundedEl2 = String.format("%.2f", element2); 
            System.out.println("The percent composition of element 1 is " + RoundedEl1 + "% and element 2 is " + RoundedEl2 + "%");

        }
        else if (calculation.equals("6")) {
            System.out.println("oka");
            input.close(); 
                break;
        }
        }

    }
}
