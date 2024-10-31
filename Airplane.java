import java.util.Scanner;

public class Airplane {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int row_num;
        char line_char;
        int line_num;
        int check=1;
        int[][] Air_plane_seat;
        Air_plane_seat = new int[][]
                {
                        {0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}
                };
        while (check==1)
        {
            check = 0;
            System.out.println("Please check in your seat! ");
            System.out.println("Please put in your seat row! ");
            row_num = scanner.nextInt()-1;
            System.out.println("Please put in your seat line! ");
            line_char = scanner.next().charAt(0);
            line_num = line_char - 97;
            if (Air_plane_seat[row_num][line_num] != 1) {
                Air_plane_seat[row_num][line_num] = 1;
                for (int i = 0; i <= 6; i++) {
                    for (int j = 0; j <= 3; j++) {
                        if (Air_plane_seat[i][j] == 1) {
                            System.out.print(" X ");
                        } else {
                            System.out.print(" - ");
                            check =1;
                        }
                    }
                    System.out.println("\n");
                }
            } else {
                System.out.println("the seat is not valuable now please chose other seat!");
                check =1;
            }
        }

    }
}
