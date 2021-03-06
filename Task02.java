import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {


/*      Write a program:
        - to show a greeting message in the console if time is known.
                - to format and print out the value of the date.

●      Create a variable time with value 8.
●      Create variables day, month and year.
●      Initialize the variables with the values as You want.
●      Verify the time value:
        a.      If the value is smaller than 12, then the greeting message “Good Morning Sunshine!” will be printed out in the console.
        b.      If the value is between 13 and 19, then the greeting message “Good Afternoon. Work Hard!” will be printed out in the console.
        c.      If the value is between 20 and 24, then the greeting message “Good Evening. Get some rest!” will be printed out in the console.

●      Change the time variable value to 20 and look at the console. Which greeting message is printed out in the console?
●      Change the time variable value to -2 and look at the console. Please add correct verification in the code!
●      Change the time variable value to 100 and look at the console. Please add correct verification in the code!
●      Verify if day, month and year are correct. For example, day can not be -10, or month can not be 34, year can not be -2032. If the variables are incorrect, please inform the user. If all variables are in the correct range, please print out the date in the following format:

        YYYY/MM/DD
        NB! Error messages should be in English and are informative meaning - should not interrupt execution of program.

*/
        //int day = 31;
        //int month = 12;
        //int year = 3030;
        //int time = 13; //integer?

        Scanner scan = new Scanner(System.in);
        System.out.println("Write the year (>1995): ");
        int year = scan.nextInt();
        // Java 1995
        if (year >= 1995 && year <= 9999) {
            System.out.println("Write the month: ");
            int month = scan.nextInt();
            if (month > 0 && month <= 12) {
                System.out.println("Write the day: ");
                int day = scan.nextInt();
                if (day >=1 && day <=31) {
                    System.out.println("*****************************");
                    System.out.println ("Date: " + year + "/" + month + "/" + day);
                    System.out.println("Write the time (hours in whole numbers): ");
                    int time = scan.nextInt();
                    if (time < 12 && time >=0) {
                        System.out.println("Good Morning Sunshine!");
                    } else if (time == 12) {
                        System.out.println("Good Day!");
                    } else if (time >= 13 && time <= 19) {
                        System.out.println("Good Afternoon!");
                    } else if (time >= 20 && time <= 24) {
                        System.out.println("Good Evening. Get some rest!");
                    }
                    else {System.out.println("Format of the time is not recognized!");
                    }
                }
                else {System.out.println("Format of the day is not recognized!");
                }
            }
            else {System.out.println("Format of the month is not recognized!");
            }
        }
        else {
            System.out.println("Format of the year is not recognized!");
            }
        }
    }


