import java.util.Scanner;
public class Number24 {
    public static void main(String[] args){
        System.out.println("Enter Vending Machine number(number 0-1):");
        Scanner scan = new Scanner(System.in);
        int VendMachNo = scan.nextInt();
        while(VendMachNo < 0 || VendMachNo > 1)
        {
            System.out.println("Invalid machine number, please enter again!");
            VendMachNo = scan.nextInt();
        }
        System.out.println("Exiting!");
    }
}
