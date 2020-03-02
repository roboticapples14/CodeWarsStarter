import java.util.*;
import java.lang.*;
import java.lang.Math;
public class howToCode{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        String[] sArray = new String[10];
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        //calculations

        // String to Int
        String myString = "1234";
        int x = Integer.parseInt(myString);

        //Int to String
        int i = 0;
        String t = Integer.toString(i);

        //string to double
        double dub = Double.parseDouble("3.59");


        //Split string by value
        String splitStringBy = "";
        String[] split = splitStringBy.split("");



        //sArray length for loop
        for(int j = 0; j< sArray.length; j++){
         //   sArray[j] = "";
        
        }

        //root of num   sqrt(num)
        double num = 1;
        double a = Math.sqrt(num);

        //num to the power of x     pow(num, x)
        double power = Math.pow(num, 2);




        //sorts
        /*
        int n = array.length;
        
        for (int i = 1; i < n; i++){
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key){
                array[j + 1] = array[j];
                j = j - 1;
            }
        }

        System.out.print(array);
        */

        
        //Substring
        /*
        substring(10) - takes the substring from 10 and up
        substring(10, 16) - takes the substring from [10,16)
        */

        //Palindrome
        /*
        boolean ifPal = true;
                int l = translate.length();
                for (int k = 0; k <= l / 2; k++){
                    int l2 = k + 1;
                    if (translate.substring(k, l2).equals(translate.substring(l-l2, l-k))){
                    }
                    else
                        ifPal = false;
                }
        */

        //Binary to ASCII
        /*
        String str = "";

        for (int i = 0; i < s.length()/8; i++) {

            int a = Integer.parseInt(s.substring(8*i,(i+1)*8),2);
            str += (char)(a);
        }    
        */

        //rouding
        //round(double, 2);
        list.add(1);
        System.out.println(input * 8 - 95);

        //2D array
        //data_type[1st dimension][2nd dimension] array_name = new data_type[size1][size2];
        int[][] twoD_arr = new int[10][20];
    }
}