public class Q1{
    public static void q1(){
        int n = 7;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0 || i==n-1|| j==0 || j==n-1) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void q2(){
        int n = 5;
        int times = 1;
        for(int i=1; i<=n; i++){
            for(int k=0; k<n-i; k++){
                System.out.print("  ");
            }
            for(int j=1; j<=times; j++){
                System.out.print(" "+i);
            }
            System.out.println();
            
            times+=2;
        }
    }
    public static void q3(){
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void q4(){
        int n = 5;
        for(int i= n; i>=1; i--){
            for(int j=n; j>=n-i+1; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void q5(){
        int count = 1;
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count++ +" ");
            }
            System.out.println();
        }
    }
    public static void q6(){
        int n = 5;
        for(int i=1; i<=n; i++){
            boolean flag = i%2==0? false: true;
            for(int j=1; j<=i; j++){
                if(flag){
                    System.out.print("1 ");
                    flag = !flag;
                }else{
                    System.out.print("0 ");
                    flag = !flag;
                }
            }
            System.out.println();
        }
    }
    public static void q7(){
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int k = 1;k<=n-i; k++) System.out.print("  ");
            for(int j=i; j>=1; j--) System.out.print(j+" ");
            for(int j=2; j<=i; j++) System.out.print(j+" ");
            System.out.println();
        }
    }
    public static void q8(){
        int n = 10;
        for(int i=1; i<=n; i++){
            for(int j=2; j<=i; j++) System.out.print("  ");
            for(int k=1; k<=n-1; k++) System.out.print("* ");
            System.out.println();
        }
    }

    public static void q9() {
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=n-i; j>0; j--) System.out.print(" ");
            for(int k=1; k<=i; k++) System.out.print("* ");
            System.out.println();
        }
        for(int i=n-1; i>0; i--){
            for(int j=n-i; j>0; j--) System.out.print(" ");
            for(int k=1; k<=i; k++) System.out.print("* ");
            System.out.println();
        }
    }
    
    public static void q10(){
        int n=7;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==j || i+j==n-1) {
                    System.out.print("*  ");
                }else if (i>j && i+j<n && (i+j)%2==0) {
                    System.out.print("*  ");
                }else if (i<j && i+j>n && (i+j)%2==0) {
                    System.out.print("*  ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
}
    public static void q11(){
        int n=5;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void q12(){
        int n=5;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void q13(){
        int n=5;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void q14(){
        int n = 5;
        for(int i=0; i<n; i++){
            for(int j=0;j<n-i; j++) System.out.print("  ");
            for(int k = 0; k<=i; k++) System.out.print("* ");
            System.out.println();
        }
    }
    public static void q15(){
        int n = 5;
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++) System.out.print("  ");
            for(int k=0; k<n-i;k++) System.out.print("* ");
            System.out.println();
        }
    }

    public static void q16(){
        int n=5;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void q17(){
        int n=5;
        for(int i=0; i<n; i++){
            for(int j=0; j<(n-i); j++) System.out.print(" ");
            for(int k=0; k<=i; k++) System.out.print("* ");
            System.out.println();
        }
    }
    public static void q18(){
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++) System.out.print(" ");
            for(int k=i; k<=n; k++) System.out.print(""+k+" ");
            System.out.println();
        }
    } 

    public static void q19(){
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++) System.out.print(" ");
            for(int k=i; k<=n; k++) System.out.print(""+k+" ");
            System.out.println();
        }
        for(int i=n-1; i>=1; i--){
            for(int j=0; j<i; j++) System.out.print(" ");
            for(int k=i; k<=n; k++) System.out.print(""+k+" ");
            System.out.println();
        }
    }

    public static void q20(){
        int n = 9;
        for(int i=0; i<n; i++){
            for(int space = 0; space<n-i-1; space++) System.out.print(" ");
            if(i==0){
                System.out.println("* ");
                continue;
            }
            else if(i==n-1){
                for(int j=0; j<n; j++){
                    System.out.print("* ");
                }
            }
            else{
                System.out.print("* ");
                for(int sp2 = 1; sp2<i ; sp2++) System.out.print("  ");
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void q21(){
        int n = 9;
        for(int i=n-1; i>=0; i--){
            for(int space = 0; space<n-i-1; space++) System.out.print(" ");
            if(i==0){
                System.out.println("* ");
                continue;
            }
            else if(i==n-1){
                for(int j=0; j<n; j++){
                    System.out.print("* ");
                }
            }
            else{
                System.out.print("* ");
                for(int sp2 = 1; sp2<i ; sp2++) System.out.print("  ");
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void q22(){
        int n = 5;
        for(int i=0; i<n; i++){
            for(int space = 0; space<n-i-1; space++) System.out.print(" ");
            if(i==0){
                System.out.println("* ");
                continue;
            }
            else{
                System.out.print("* ");
                for(int sp2 = 1; sp2<i ; sp2++) System.out.print("  ");
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-2; i>=0; i--){
            for(int space = 0; space<n-i-1; space++) System.out.print(" ");
            if(i==0){
                System.out.println("* ");
                continue;
            }
            else{
                System.out.print("* ");
                for(int sp2 = 1; sp2<i ; sp2++) System.out.print("  ");
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void q23(){
        int n = 5;
        for(int i=n-1; i>=0; i--){
            for(int space = 0; space<n-i-1; space++) System.out.print(" ");
            if(i==0){
                System.out.println("* ");
                continue;
            }
            else if(i==n-1){
                for(int j=0; j<n; j++){
                    System.out.print("* ");
                }
            }
            else{
                System.out.print("* ");
                for(int sp2 = 1; sp2<i ; sp2++) System.out.print("  ");
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1; i<n; i++){
            for(int space = 0; space<n-i-1; space++) System.out.print(" ");
            if(i==n-1){
                for(int j=0; j<n; j++){
                    System.out.print("* ");
                }
            }
            else{
                System.out.print("* ");
                for(int sp2 = 1; sp2<i ; sp2++) System.out.print("  ");
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void q24() {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n - i - 1; k++) System.out.print(" ");
            
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    public static void q25(){
        int n= 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if ((i + j) % 2 == 0) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if ((i + j) % 2 == 0) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // q1();
        // q2();
        // q3();
        // q4();
        // q5();
        // q6();
        // q7();
        // q8();
        // q9();
        // q10();
        // q11();
        // q12();
        // q13();
        // q14();
        // q15();
        // q16();
        // q17();
        // q18();
        // q19();
        // q20();
        // q21();
        // q22();
        // q23();
        // q24();
        // q25();
    }
}