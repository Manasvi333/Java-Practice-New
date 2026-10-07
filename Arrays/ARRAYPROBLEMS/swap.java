import java.util.Scanner;
public class swap
 { static int[] swapelement(int arr[],int size){  
    
    int temp=0;
    for(int i=0;i<size;i+=2){
temp=arr[i];
arr[i]=arr[i+1];
arr[i+1]=temp;
    }
return arr;
 }
    public static void main (String[] args){
        
        Scanner sc=new Scanner(System.in);
                System.out.println("Enter the size of the array"); int size=sc.nextInt();
                int []arr=new int[size];
       
        System.out.println("Enter the elements in the array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        } System.out.println("Elements after swapping the alternate elements in the array:");
        int result[]=swapelement(arr, size);
        for(int i: result){
   System.out.println(i);}
   
}
}
