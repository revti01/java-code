// print x^n (stack height = logn)
public class recursion6 {
    public static int printPower(int x, int n) {
        if(n == 0 || x == 0) {
        return 1;
        }
        if(n % 2 == 0) {
        return printPower(x, n/2) * printPower(x, n/2);
        }
        else {
        return x * printPower(x, n/2) * printPower(x, n/2);
        }
        }
        public static void main(String args[]) {
        int x = 2, n = 5;
        int ans = printPower(x, n);
        System.out.println(ans);
        }
}
