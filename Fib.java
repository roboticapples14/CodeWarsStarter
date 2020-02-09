import java.util.Scanner;


public class Fib{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[30];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;

        //Fibonacci Sequence
         for (int i = 2; i < arr.length; i++){
             arr[i] = arr[i -1] + arr[i -2];
             //System.out.println(arr[i]);
         }

         //Print index given
         while (1 != 0){
            int index = sc.nextInt();
             if (index == -1)
                break;
            else{
                System.out.println(arr[index]);
            }
         }
         

    }
    
}