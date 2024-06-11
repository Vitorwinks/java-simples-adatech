import java.util.Scanner;

public class Exe03 {
  public static void main(String[] args) {

    Scanner num = new Scanner(System.in);

    System.out.println("Enter First Number");
    int number1 = num.nextInt();
    System.out.println("Enter Second Number");
    int number2 = num.nextInt();

    int sum = number1 + number2;
    System.out.println("Your Result Is " + sum);

  }
}
