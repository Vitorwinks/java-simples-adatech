import java.util.Scanner;

public class Exe05 {

  public static void main(String[] args) {

    Scanner scanNumber = new Scanner(System.in);
    System.out.println("How much do you earn per hour : ");
    Double wage = scanNumber.nextDouble();
    System.out.println("How many hours did you work in the month : ");
    Double month = scanNumber.nextDouble();
    double totalsum = wage * month;
    Double inss = totalsum * 0.08;
    Double syndicate = totalsum * 0.05;
    Double liquid = totalsum * 0.11;
    System.out.println("Salary value : $ " + totalsum);
    System.out.println("Your net salary is : " + liquid);
    System.out.println("Your union is : " + syndicate);
    System.out.println("Your inss is : " + inss);

  }
}
