import java.util.Scanner;

public class Assign1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // check for leap year
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        // sum of two numbers
        System.out.println("\nEnter two numbers:");
        int num_1 = sc.nextInt();
        int num_2 = sc.nextInt();
        System.out.println("Sum of the two numbers is " + (num_1 + num_2));

        // Print table of a number
        System.out.println("\nEnter a number to print it\'s table: ");
        int table_num = sc.nextInt();
        System.out.println("Table of " + table_num + " is:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(table_num + " x " + i + " = " + (table_num * i));
        }

        // HCF and LCM of two numbers
        System.out.println("\nEnter two numbers to find their HCF and LCM: ");
        num_1 = sc.nextInt();
        num_2 = sc.nextInt();
        if (num_1 > num_2) {
            num_1 = num_1 + num_2;
            num_2 = num_1 - num_2;
            num_1 = num_1 - num_2;
        }
        int hcf = 1;
        for (int i = 2; i <= num_1; i++) {
            if (num_1 % i == 0 && num_2 % i == 0)
                hcf = i;
        }
        System.out.println("The HCF of the two numbers is: " + hcf);

        int lcm = num_2;
        while (lcm % num_1 != 0 || lcm % num_2 != 0) {
            lcm++;
        }
        System.out.println("The LCM of the two numbers is: " + lcm);

        // taking inputs and until user enters a certain number, and printing the sum

        System.out.println(
                "\nAt last, this program will run until you do not enter x, and will print the sum of all the numbers entered in the process, including x entered in the end.\nEnter the value of x: ");
        hcf = 0;// to be used for the sum
        num_2 = sc.nextInt();
        num_1 = 0;
        do {
            System.out.println("Enter a number: ");
            num_1 = sc.nextInt();
            hcf += num_1;
        } while (num_1 != num_2);

        System.out.println("The sum of all the numbers entered is: " + hcf);

        sc.close();
    }
}