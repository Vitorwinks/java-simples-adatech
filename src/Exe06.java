import java.util.Scanner;

public class Exe06 {

    public static void main(String[] args) {

        Scanner scannumber = new Scanner(System.in);
        System.out.println("how many numbers in the fibonacci sequence ");
        int numb = scannumber.nextInt();
        if (numb <= 0) {
            System.out.println("It is not possible to perform this operation ");
        } else {
            System.out.println("Its sequence until : " + numb);
            long a = 0;
            long b = 1;
            System.out.println(" , " + b);
            for (int i = 3; i <= numb; i++) {
                long c = a + b;
                System.out.println(" , " + c);
                a = b;
                b = c;

            }
        }

    }

}
