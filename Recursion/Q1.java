import java.util.*;

public class Q1 {

    public static void changeFormat(String str,  int i){
        if(i==str.length()) return;
        switch (str.charAt(i)) {
            case '0':
                System.out.print("zero ");
                break;
            case '1':
                System.out.print("one ");
                break;
            case '2':
                System.out.print("two ");
                break;
            case '3':
                System.out.print("three ");
                break;
            case '4':
                System.out.print("four ");
                break;
            case '5':
                System.out.print("five ");
                break;
            case '6':
                System.out.print("six ");
                break;
            case '7':
                System.out.print("seven ");
                break;
            case '8':
                System.out.print("eight ");
                break;
            case '9':
                System.out.print("nine ");
                break;
            

        }
        changeFormat(str,  i+1);

    }
    public static void main(String[] args) {
        int n = 5097;
        changeFormat(""+n,0);
    }
    
}