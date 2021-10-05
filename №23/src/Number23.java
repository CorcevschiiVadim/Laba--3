import java.util.Scanner;
public class Number23 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = 1, max1st = 0, max2nd = 0;
        do {
            num = sc.nextInt();
            max2nd = (num >= max1st) ? max1st : (num > max2nd) ? num : max2nd;
            max1st = num > max1st ? num : max1st;
        }
        while(num != 0);
            System.out.println("\nThe largest value is " + max1st);
            System.out.println("The second largest value is " + max2nd);
    }
}
