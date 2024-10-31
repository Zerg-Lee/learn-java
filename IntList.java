import java.util.Scanner;

public class IntList {
    public static void main(String[] args) {
        int[] num_list;
        char test ='Y';
        num_list = new int[50];
        var scanner = new Scanner(System.in);
        for (int the_list_num=0;test == 'Y';the_list_num++)
        {
            System.out.println("please put your num in the list!");
            num_list[the_list_num]=scanner.nextInt();
            System.out.println("Do you want put more number? Y/N");
            test =scanner.next().charAt(0);
        }
        for(int i=0;i<=num_list.length-1;i++)
        {
            for(int j=0;j<=num_list.length-1;j++)
            {
                if (num_list[i]>=num_list[j])
                {
                    int mid;
                    mid =num_list[i];
                    num_list[i]=num_list[j];
                    num_list[j]=mid;
                }
            }
        }
        int num_ex=1;
        for(int i=0;i<=num_list.length-2;i++)
        {

            if(num_list[i]==num_list[i+1])
            {
                num_ex++;
            }
            else
            {
                System.out.println(num_list[i]+" " + num_ex);
                num_ex=1;

            }
        }
    }
}
