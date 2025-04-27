public class Q5 {

    public static void gcd(int a, int b){
        if(b==0) {
            System.out.println(a);
            return;
        }
        gcd(b,a%b);
    }
    public static void main(String[] args) {
        int a = 18;
        int b = 48;
        gcd(a,b);
    }
}
