import java.util.Scanner;
public class unsorted {
    static int getunsorted(int arr[],int size){
int i;
        for( i=0;i<size;i++){
            if(arr[i+1]<=arr[i]){
        return arr[i+1];}
    }return -1;
    }
    public static void main (String[] args){
        
        Scanner sc=new Scanner(System.in);
                System.out.println("Enter the size of the array"); int size=sc.nextInt();
                int []arr=new int[size];
       
        System.out.println("Enter the elements in the array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        } System.out.println("unsorted element in the array:");
    System.out.println( getunsorted(arr, size));
    
}
}
