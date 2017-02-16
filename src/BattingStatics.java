import java.util.Scanner;

public class BattingStatics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(" Welcome to Box Prodution Softball Batting Statistics");
        System.out.println(" ");

        String choices = "y";

        do {

            int atBats = getInt(scan, "Please enter the  number of @ bats ");
            System.out.println("You entered " + atBats);
            double[] battingResult = new double[atBats];



            // addHits(battingResult[i]);

            double total = 0;
            double count = 0;

            for (int i = 0; i < atBats; i++) {
                System.out.println("Enter number");
                battingResult[i] = scan.nextDouble();
                System.out.println("What did you do at each @ bat: " + battingResult[i]);
                total += battingResult[i];
                if (battingResult[i] > 0) {
                    count++;
                }

                System.out.println(" Total :" + total);
                System.out.printf("Slugging Pct5 is %.3f\n", total / atBats);
                System.out.printf("Batting Average is %.3f\n" +
                        "", count / atBats);

                System.out.println("");

                System.out.println("Enter y/n to Countine"); // Ask this user to input y/ or n
                choices = scan.next();

            }
            while (choices.equals("y")) // Asking
                System.out.println("Done.");
            //  System.out.println( " your array"+ battingResult [0] + battingResult [1]);
        }
    }


    public static int getInt (Scanner sc, String prompt) {
//        String prompt = "Please enter an integer: ";
        System.out.print(prompt);
        int n = 0;

        //as long as there's NOT an int
        //prompt the user to enter again
        while (!sc.hasNextInt()) {
            sc.nextLine();

            System.out.print("I'm sorry, that's not an int. " +
                    prompt);
        }

        //once there is an int,
        // take it as input
        n = sc.nextInt();
        sc.nextLine(); //clear out the enter here

        return n;
    }
    //calculates batting average

//    public static double sluggingPre(double hits, double atBats) {
//      //  int hits = 0;
//      //  int atBats = 0;
//       double average = (double) hits / atBats;
//        return average;
//    }

//    public static int addAtBats(int numAtBats) {
//       int atBats = numAtBats;
//
//       return atBats;
//    }
//    public static double addHits(double numHits) {
//        double hits = numHits;
//        return hits;
//    }



}

