package pascaltriangle;

import java.util.Scanner;

public class PascalTriangle {
    static void Pascal(int n){
        for(int line =1; line <= n; line++){
            int num = 1;
            for(int i = 1; i <= line; i++){
                System.out.print(num + " ");
                num = num*(line-i)/i;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter the value of n => ");
        n = input.nextInt();
        n++;
        Pascal(n);
    }
}