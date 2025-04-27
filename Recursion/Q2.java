public class Q2 {

    public static void printReverse(int n){
        if(n==0) return;
        System.out.print(n%10);
        printReverse(n/10);
    }
    public static void main(String[] args) {
        int n = 7674;
        printReverse(n);
    }
}
