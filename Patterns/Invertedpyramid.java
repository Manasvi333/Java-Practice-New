import java.util.Scanner;
public class Invertedpyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for (int j= 0;j<=i-1;j++){
                System.out.print("  ");}
                for(int j=1;j<=2*n-(2*i-1);j++){
                    System.out.print("* ");
                }
            System.out.println();
        }
        sc.close();
    }
}
