import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a hexadecimal number: ");
        String input = scanner.nextLine();
        int length = input.length();
        int x;
        int a;
        double b;
        int i =1;
        double sum = 0;


        while (i<=length) {

            a = input.charAt(length - i);
            if (a == 'A' || a == 'B' || a == 'C' || a == 'D' || a == 'E' || a == 'F')
                x = (a - 55);
            else if (a == 'a' || a == 'b' || a == 'c' || a == 'd' || a == 'e' || a == 'f')
                x = (a - 87);
            else if(a == 'x')
                x = (a - 'x');
            else
                x = (a - '0');
            b = x * Math.pow(16, i-1);
            sum =sum+b;
            i++;
        }
        System.out.println("Your number is " + (long) sum + " in decimal");


    }
}

