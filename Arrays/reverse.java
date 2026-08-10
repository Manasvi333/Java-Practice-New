import java.util.Scanner;
public class reverse {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int start,end;
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (start = 0, end = size - 1; start < end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        System.out.println("The elements of the array in reverse order are: ");
        for (int i =0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
