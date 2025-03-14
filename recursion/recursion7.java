// tower of hanoi transfer n  disks from source to destination over 3 towers
// rules : only one disk can be move at one time and bigger disk can't be placed on smaller disks
public class recursion7 {
    public static void towerofhanoi(int n , String source, String helper, String dest){
        if(n == 1){
            System.out.println("transfer disk "+ n + " from "+source+" to "+dest);
            return;
        }
        
        towerofhanoi(n-1, source, dest, helper );
        System.out.println("transfer disk "+ n + " from "+source+" to "+dest);
        towerofhanoi(n-1, helper, source, dest);

    }
     public static void main(String[] args) {
        int n = 3;
        towerofhanoi(n, "S", "H", "D");

     }
}
