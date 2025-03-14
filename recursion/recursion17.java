// place tiles of size 1*m in a floor of size n*m   n =4 m =2
public class recursion17 {
    public static int settiles(int n, int m){
        if (n == m ){
            return 2;
        }
        if(n<m){
            return 1 ;
        }
        //vertically 
        int vertplacements = settiles(n-1, m);
        // hhorizontally 
        int horiplacements = settiles(n-1, m);
        return vertplacements + horiplacements;
    }
    public static void main(String[] args) {
        int n = 3 , m = 3;
        
        System.out.println(settiles(n, m));
        
    }
}
