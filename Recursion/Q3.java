public class Q3 {

    public static int arithmeticSeries(int n){
        if(n==0) return 0;
        return n+arithmeticSeries(n-1);
    }
    public static void main(String[] args) {
        int n = 100;
        System.out.println(arithmeticSeries(n));
    }
}
