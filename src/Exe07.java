import java.util.Scanner;

public class Exe07 {

    public static void main(String[] args) {

        Scanner scanNumber = new Scanner(System.in);
        System.out.println("Which multiplication tabledo you want? : ");
        int num1 = scanNumber.nextInt();
        System.out.println("Where do you want to start? : ");
        int num2 = scanNumber.nextInt();
        System.out.println("What number do you want to finish ? : ");
        int num3 = scanNumber.nextInt();
        if (num2 >= num3) {
            System.out.println("Initial number greater than number error! ");
        } else {
            for (int i = num2; i <= num3; i++) {
                int tabuada = i * num1;
                System.out.println(num1 + " x " + i + " = " + tabuada);
            }

        }

    }
}
