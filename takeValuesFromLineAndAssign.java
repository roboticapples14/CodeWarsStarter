import java.util.Scanner;
import java.lang.Math;
public class takeValuesFromLineAndAssign{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        while(true){
            //scan line
            String numbers = scan.nextLine();
            //terminal condition
            if (numbers.equals("0 0 0 0 0 0"))
                break;
            else{
                //make array of values in line
                String[] arr = numbers.split(" ");

                //assign arr values to vars
                double x0 = Double.parseDouble(arr[0]);
                double x1 = Double.parseDouble(arr[2]);
                double x2 = Double.parseDouble(arr[4]);

                double y0 = Double.parseDouble(arr[1]);
                double y1 = Double.parseDouble(arr[3]);
                double y2 = Double.parseDouble(arr[5]);


                //Calculations

                /*double a = Math.sqrt(Math.pow(x0 - x1, 2) + Math.pow(y0 - y1, 2));
                double b = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
                double c = Math.sqrt(Math.pow(x2 - x0, 2) + Math.pow(y2 - y0, 2));


                double w = Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b));

                double area = (a * b * Math.sin(w)) / 2;

                */
                System.out.println();
            }
        }
    }
}