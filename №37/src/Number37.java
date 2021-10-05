import java.util.Scanner;
public class Number37 {
    public static void main(String[] args) {
       Scanner  sc= new Scanner(System.in);
       int i, num, a, b;
       int c = 1;
       System.out.println("Enter the no.= ");
       num=sc.nextInt();
       for (i = 1; i <= num; i++) {
           c= i*c;
        }
       System.out.println("Factorial is "+c);
    }
}
