import java.util.Scanner;
public class Number36 {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       int a = scanner.nextInt();
       int b = scanner.nextInt();
       int c = scanner.nextInt();
       int max;
       int min1;
       int min2;
       if (a > b){
           max = a;
           min1 = b;
           min2 = c;
       } else{
           max = b;
           min1 = a;
           min2 = c;
       }
       if (c > max){
           max = c;
           min1 = b;
           min2 = a;
       }
       System.out.println(max > (min1 + min2));
    }
}
