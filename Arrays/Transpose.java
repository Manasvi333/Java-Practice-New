import java.util.Scanner;
public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int arr[][]=new int[rows][cols];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<arr.length;i++){    
            for(int j=0;j<arr[i].length;j++){    
                arr[i][j]=sc.nextInt();    
            }    
        }
        System.out.println("The elements of the array after transposing are: ");
        for(int i=0;i<arr[0].length;i++){    
            for(int j=0;j<arr.length;j++){    
                System.out.print(arr[j][i]+" ");    
    
}
System.out.println();    
        }
        for(int i=0;i<arr.length;i++){    
            for(int j=0;j<arr[i].length;j++){    
                if(arr[i][j]==arr[j][i]){
                    continue;
                }
                else{
                    System.out.println("The array is not symmetric");
                    return;
                }
            }
        }
System.out.println("The array is symmetric");
    }
}

