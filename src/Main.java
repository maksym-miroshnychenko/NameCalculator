import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        while(true) {
            System.out.println("Enter name");

            String name = myObj.nextLine();

            int sum = new NameCalculator().calculate(name);

            System.out.println(name + " => " + sum);

        }
    }
}