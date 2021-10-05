import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;
public class Number32 {
    public static void main(String[] args) {
        int n = 1;
        for (int i = 1; i < 9 * 8; i++){
            if (i%9==0) System.out.println();
            else if(i%1==0) System.out.print("*");
        }
    }
}

