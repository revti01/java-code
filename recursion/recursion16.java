//count total paths in a maze to move from (0,0) to (n,m) n = 3 , m = 3; we can only movie right and downwards
public class recursion16 {
    public static int countpaths(int i , int j , int n , int m){
        if(i == n || j == m){
            return 0;
        }
        if(i == n-1 && j == m-1){
            return 1;
        }

        //move downwards
        int downpaths = countpaths(i+1, j, n, m);
        int sidewards = countpaths(i, j+1, n, m);
        return downpaths + sidewards;
    }
    public static void main(String[] args) {
        int n = 3 , m = 3;
        int totalpaths = countpaths(0 , 0 , n, n);
        System.out.println(totalpaths);
    }
}
