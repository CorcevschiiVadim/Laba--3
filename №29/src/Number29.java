import java.util.Scanner;
public class Number29 {
    public static void main(String[] args) {
        int row = 1;
        int column = 2;
        int side;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of the square side: ");
        side = input.nextInt();

        while (row <= side)
        {
            column = 1;
            System.out.print("*");
            while (column <= (side - 2))
            {
                System.out.print(row == 1 || row == side ? "*" : " ");
                ++column;
            }
            ++row;
            System.out.printf("*%n");
        }
    }
}
