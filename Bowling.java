import java.util.Scanner;

public class Bowling {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please give me the pins rows number");
        int rows = scanner.nextInt();
        int sum = 0;
        for (int i = 1 ; i<=rows;i++)
        {
            sum +=i;
        }
        System.out.println("The total number of pins is "+sum+" !");
    }
}
