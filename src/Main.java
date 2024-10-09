import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String partyAfil = "";
        String trash = "";
        Scanner input = new Scanner(System.in);

        System.out.println(" Please enter party R/D/I: ");
        partyAfil = input.nextLine();
        input.nextLine();


        if (partyAfil.equalsIgnoreCase("R")) {
            System.out.println(" You get a republican donkey! ");

        } else if (partyAfil.equalsIgnoreCase("D")) {
            System.out.println(" You get a democratic elephant! ");
        } else if (partyAfil.equalsIgnoreCase("I")) {
            System.out.println(" You get an Independent man! ");
        } else {
            System.out.println(" You entered an improper character. Please try again. ");
        }


    }
}
