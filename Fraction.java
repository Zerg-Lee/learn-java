import java.util.Scanner;

public class Fraction {
    public static void main(String[] args) {
        int the_numerator = 0;
        int the_denominator = 0;
        int the_big = 0;
        int the_small = 0;
        int the_max_common_divisor = 0;
        double the_den = 0.00;
        double the_ans =0;
        var scanner = new Scanner(System.in);

        System.out.println("Please give the numerator you set");
        the_numerator = scanner.nextInt();

        System.out.println("Please give the denominator you set");
        the_denominator = scanner.nextInt();

        the_den = the_denominator;

        the_ans = the_numerator / the_den;

        System.out.println("the answer is "+the_ans+" ");

        if( the_numerator <= the_denominator )
        {
            the_big = the_denominator;
            the_small = the_numerator;
        }
        else
        {
            the_small = the_denominator;
            the_big = the_numerator;
        }

        for(int i = the_small; the_small % i == 0;i-- )
        {
            the_max_common_divisor = i;
            if( the_big % i == 0) {
                break;
            }
            the_max_common_divisor = 1;
        }
        the_denominator = the_denominator/the_max_common_divisor;
        the_numerator = the_numerator/the_max_common_divisor;
        System.out.println(the_numerator+"/"+the_denominator+". ");

    }
}
