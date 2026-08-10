import java.util.Scanner;
public class DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][]=new int[5][7];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The elements of the array are: ");
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int max=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                 if(arr[i][j]>max){
                    max=arr[i][j];
                 }
            }
        }
        System.out.println("The maximum element in the array is: "+max);
 
 int min=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                 if(arr[i][j]<min){
                    min=arr[i][j];
                 }
            }
        }
        System.out.println("The minimum element in the array is: "+min);
        sc.close();
    }
}

