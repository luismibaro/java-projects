package acStringLaboratories;

public class Main {
    public static void main(String args[]) {
        // Declare and initialize an array of superhero names
        String[] superheroes = {"Batman", "Superman", "Wonder Woman", "Spider-Man", "Iron Man"};

        // Declare and initialize an array of years.
        int[] introductionYears = {1939, 1938, 1941, 1962, 1963};

        // Print the superhero names
        System.out.println("Superhero names: ");
        System.out.println(superheroes[0] + "\n" + superheroes[1] + "\n" + superheroes[2] + "\n" + superheroes[3] + "\n" + superheroes[4] + "\n");

        System.out.println(superheroes[0]);
        System.out.println(superheroes[1]);
        System.out.println(superheroes[2]);
        System.out.println(superheroes[3]);
        System.out.println(superheroes[4]);

        // Print the introduction years
        System.out.println("Introduccion years: ");
        System.out.println(introductionYears[0] + "\n" + introductionYears[1] + "\n" + introductionYears[2] + "\n" + introductionYears[3] + "\n" + introductionYears[4] + "\n");

        // Print the original name of the third superhero
        System.out.println("Original superhero name at position 3: " + superheroes[2]);

        // Modify the third superhero name
        superheroes[2] = "Thor";

        // Print the modified name of the third superhero
        System.out.println("Modifies superhero name at position: " + superheroes[2]);

        // Modify the year of introduction of the third superhero
        introductionYears[2] = 2011;

        // Print the modified year of introducction of the third superhero
        System.out.println("Modified introducction year for superhero at position 3: " + introductionYears[2]);

        // Print the length of the array containing superhero names
        System.out.println("Total superheros names in String array: " + superheroes.length);

        // Print the length of the array containing superhero of introduction
        System.out.println("Total superheroes introductioni year in int array  " + introductionYears.length);
    }
}
