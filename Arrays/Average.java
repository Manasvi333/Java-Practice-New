import java.util.Scanner;
public class Average {
    
static double avg(int arr[],int size){
    int sum=0;
for(int i: arr){
    sum=sum+i;
}
double average=(double) sum/size;
return average;
}

    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
                System.out.println("Enter the size of the array");
        int size =sc.nextInt();int []arr=new int[size];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
      double result=  avg(arr, size);
              System.out.println(result);

    }

    
}
