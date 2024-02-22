import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int day, month;  //    describing day and month data

        Scanner input = new Scanner(System.in);     // call a scanner for data

        while (true) {              // month data must be 1,2,3....11,12
            System.out.println("Enter your birth month :");
            month = input.nextInt();
            if (month > 12 || month < 1) {
                System.out.println("Entered wrong info..Try again"); // If the data is incorrect, please try again
                continue;
            }
            break;
        }
        while (true) {              // day data must be between 1 and 31
            System.out.println("Enter your birth day : ");
            day = input.nextInt();
            if (day > 31 || day < 1) {
                System.out.println("Entered wrong info ..Try Again"); // If the data is incorrect, please try again
                continue;
            }
            break;
        }
        String horoscope;
        // horoscop calculation
        if ((month == 12 && day > 21) || (month == 1 && day < 22)) {  // calculate with day and month and write the horoscop
            horoscope = "Capricorn";
            System.out.println("--------------------------------");
            System.out.println("Your Horoscope : " + horoscope);
            System.out.println("--------------------------------");
        }
        if ((month == 1 && day > 21) || (month == 2 && day < 20)) {
            horoscope = "Aqurius";
            System.out.println("--------------------------------");
            System.out.println("Your Horoscope : " + horoscope);
            System.out.println("--------------------------------");
        }
        if (month == 2 && day > 19 || (month == 3 && day < 21)) {
            horoscope = "Pisces";
            System.out.println("--------------------------------");
            System.out.println("Your Horoscope : " + horoscope);
            System.out.println("--------------------------------");
        }
        if (month == 3 && day > 20 || month == 4 && day < 20) {
            horoscope = "Aries";
            System.out.println("--------------------------------");
            System.out.println("Your Horoscope : " + horoscope);
            System.out.println("--------------------------------");
        }
        if (month == 4 && day > 21 || month == 5 && day < 22) {
            horoscope = "Taurus";
            System.out.println("--------------------------------");
            System.out.println("Your Horoscope : " + horoscope);
            System.out.println("--------------------------------");
        }
        if (month == 5 && day > 21 || month == 6 && day < 23) {
            horoscope = "Gemini";
            System.out.println("--------------------------------");
            System.out.println("Your Horoscope : " + horoscope);
            System.out.println("--------------------------------");
        }
        if (month == 6 && day > 22 || month == 7 && day < 23) {
            horoscope = "Leo";
            System.out.println("--------------------------------");
            System.out.println("Your Horoscope : " + horoscope);
            System.out.println("--------------------------------");

        }
        if (month == 7 && day > 22 || month == 8 && day < 22) {

            horoscope = "Virgo";
            System.out.println("--------------------------------");
            System.out.println("Your Horoscope : " + horoscope);
            System.out.println("--------------------------------");
        }
        if (month == 8 && day > 22 || month == 9 && day < 22) {
            horoscope = "Libra";
            System.out.println("--------------------------------");
            System.out.println("Your Horoscope : " + horoscope);
            System.out.println("--------------------------------");
        }
        if (month == 10 && day > 22 || month == 11 && day < 21) {
            horoscope = "Scropio";
            System.out.println("--------------------------------");
            System.out.println("Your Horoscope : " + horoscope);
            System.out.println("--------------------------------");
        }
        if (month == 11 && day > 22 || month == 12 && day < 22) {
            horoscope = "Sagittarus";
            System.out.println("--------------------------------");
            System.out.println("Your Horoscope : " + horoscope);
            System.out.println("--------------------------------");

        }
    }
}       //Ali Eren KÖSE 23/02/2024 02:12