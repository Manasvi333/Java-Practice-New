import java.util.Scanner;
public class Hollowrectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=6;j++){
                if(i==1||i==n){
                System.out.print("*");
                }
                else{
                    if(j==1||j==6)
                    System.out.print("*");
                    else
                    System.out.print(" ");
                }
                } 
                System.out.println();
            }
           sc.close(); 
        }

      
    }

