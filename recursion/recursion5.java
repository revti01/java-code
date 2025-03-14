// print x^n (stack height = n )
public class recursion5 {
    public static int calcpower(int x , int n){
        if (n == 0 || x == 0  ){
            return 1;
        }
        
        
        int x_ = calcpower(x , n-1);
        int xn = x * x_;
        return xn; 
    } 
    public static void main(String[] args) {
        int x = 2 , n = 5;
        int ans = calcpower(x, n);
        System.out.println(ans);
        
    }
    
}
