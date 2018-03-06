// Alia Dudkin
// COSC 1430 -501
// Project #3
// Due date: 3/7/2018

import java.util.Scanner;

public class LetterGrade {

    public static void main(String[] args) {

        // create instance of scanner
        Scanner keyboard = new Scanner(System.in);

        // create variables
        int grade, A = 0, B = 0, C = 0, D = 0, F = 0, total = 0;

        // ask for a grade input from keyboard
        System.out.print("Please enter a grade: ");

        // store keyboard inputs in grade variable
        grade = keyboard.nextInt();

        /* create loop that stores all data as A, B, C, D, or F for
         * input greater than or equal to zero,
         * but not greater than 100
         * and stops after negative number is input */
        while (grade >= 0) {
            if (grade > 100) {
                System.out.println("Error, must be a number between 0 - 100");
            } else if (grade >= 90) {
                A++;
            } else if (grade >= 80) {
                B++;
            } else if (grade >= 70) {
                C++;
            } else if (grade >= 60) {
                D++;
            } else {
                F++;
            }

            // ask for a grade input from keyboard
            System.out.print("Please enter a grade: ");

            // store keyboard inputs in grade variable
            grade = keyboard.nextInt();
        }

        // adds total inputs for A, B, C, D, and F
        total = A + B + C + D + F;

        // output results
        System.out.println("Total number of grades = " + total);
        System.out.println("Number of A's = " + A);
        System.out.println("Number of B's = " + B);
        System.out.println("Number of C's = " + C);
        System.out.println("Number of D's = " + D);
        System.out.println("Number of F's = " + F);

        keyboard.close();
    }

}
