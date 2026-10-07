import java.util.Scanner;
public class Sumofdiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns:");
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int arr[][]=new int[rows][cols];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<arr.length;i++){    
            for(int j=0;j<arr[i].length;j++){    
                arr[i][j]=sc.nextInt(); 
            }    
        }
int sum=0;
        for(int i=0;i<arr.length;i++){    
            for(int j=0;j<arr[i].length;j++){    
                if(i==j){
                    sum+=arr[i][j];
                }
            }    
        }
        System.out.println("The sum of the diagonal elements of the array is: "+sum);
    }
}