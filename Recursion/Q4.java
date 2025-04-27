public class Q4 {

    public static int power(int n, int power){
        if(power==0) return 1;
        return n*power(n,power-1);
    }
    public static void main(String[] args) {
        int n = 5;
        int power = 2;
        System.out.println(power(n,power));
    }
}
