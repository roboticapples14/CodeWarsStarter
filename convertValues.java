import java.util.Scanner;
public class convertValues{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        String[] english = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
        "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", 
        "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
        ",", ".", "?" };

        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
        ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
        "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
        "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
        "-----", "--..--", ".-.-.-", "..--.."};

        //binary to ascii
        String s = "01100"; //binary
        String asc = ""; //ascii
        for (int i = 0; i < s.length()/8; i++) {
            int a = Integer.parseInt(s.substring(8*i,(i+1)*8),2);
            asc += (char)(a);
        }
        System.out.println(asc);
        

        //translate code
        String word = "thing to translate";
        //array of characters in str
        String[] ch = word.split("");
        String translate = "";
        //goes through chars in arr
        for (int i = 0; i < ch.length; i++){
            //itterates english alphabet
            for(int j = 0; j < english.length; j++){
                //for whatever english char, translate into coorelated symbol in crypt
                if (ch[i].equals(english[j])){
                    translate += morse[j];
                }
            }
        }



    }
}