package Methods;
import java.util.Scanner;
public class Table {
   static void table(){
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
        sc.close();
    }
    public static void main(String[] args) {
        System.out.println("Table of the no. you want");
        table();
    }
}
