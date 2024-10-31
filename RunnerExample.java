import java.util.Scanner;

public class RunnerExample {
    public static void main(String[] args) {



        var scanner = new Scanner(System.in);
        String name1, name2;
        System.out.printf("Enter runner 1 name:");
        name1 = scanner.nextLine();

        System.out.printf("Enter runner 2 name:");
        name2 = scanner.nextLine();




        double time1, time2;
        System.out.printf("Enter runner 1 time:");
        time1 = scanner.nextDouble();

        System.out.printf("Enter runner 2 time:");
        time2 = scanner.nextDouble();



        if(time1<=time2)
        {
            System.out.printf("%s is the first, %s is the second.",name1,name2);
        }
        else
        {
            System.out.printf("%s is the first, %s is the second.",name2,name1);
        }

        System.out.println("Done");
    }
}
