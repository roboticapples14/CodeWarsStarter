import java.util.Scanner;
import java.lang.Math;
public class intPerLineTerminalValue{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while (true){
            int n = scan.nextInt();
            //terminate condition
            if (n == -1)
                break;
            //every line given
            else{
                //do things with input n

                /*int arr[] = new int[n];
                for(int i = 0; i < n; i++){
                    arr[i] = (i + 1);
                }

                int count = 0;
                //convert and compare string
                for(int i = 0; i < n; i++){
                    //int to string
                    String t = Integer.toString(arr[i]);
                    String[] split = t.split("");
                    for (int k = 0; k < split.length; k++){
                        if (split[k].equals("1")){
                            count++;
                        }
                    }

                }
            System.out.println(count);*/
            }
        }
    }
}