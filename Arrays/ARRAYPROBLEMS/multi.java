import java.util.Scanner;
public class multi {
    static int[] mul(int arr[],int size){
        int i; int [] newarr= new int[size];
        for( i=0;i<size;i++){
            int element =arr[i];
            int newelement=element*10;
     newarr[i]=  newelement;

        } return newarr;
    }
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
                System.out.println("Enter the size of the array");
        int size =sc.nextInt();int []arr=new int[size];
       
        System.out.println("Enter the elements in the array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
     int ans[]= mul(arr, size);
     for(int i:ans){
        System.out.println(i);
     }

    }
}
