import java.util.Scanner;

public class Average{
     public static void main(String[] args) {
         int[] catch_num = new int[9999];
         Scanner scanner = new Scanner(System.in);
         System.out.println("Please type in the number of integer you want put in!");
         try {
             int number = scanner.nextInt();
             if (number < 0) {
                 throw new Exception();
             }
             for (int i = 0; i < number; i++) {
                 int test;
                 System.out.println("Please put in your " + (i + 1) + " number!");
                 test = scanner.nextInt();
                 catch_num[i] = test;
             }
             double sum = 0;
             double avg;
             for (int i = 0; i < number; i++) {
                 sum = sum + catch_num[i];
             }
             avg = sum / number;
             System.out.println("The average of your numbers is " + avg + " !");
         }catch (Exception e){
             System.out.println("number must be positive.");
         }
     }
}
