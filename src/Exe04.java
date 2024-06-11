import java.util.Scanner;

public class Exe04 {

  public static void main(String[] args) {

    Scanner numsScanner = new Scanner(System.in);

    System.out.println("Your first note 1:  ");
    int num1 = numsScanner.nextInt();
    System.out.println("Your first note 2:  ");
    int num2 = numsScanner.nextInt();
    System.out.println("Your first note 3:  ");
    int num3 = numsScanner.nextInt();
    System.out.println("Your first note 4:  ");
    int num4 = numsScanner.nextInt();

    float average = (num1 + num2 + num3 + num4) / 4;
    System.out.println("Your average is: " + average);

  }
}
