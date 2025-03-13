public class getbit{
    public static void main(String args[]){
        int n = 5;
        int post = 2;
        int bitmask = 1<<post;

        if((bitmask & n ) == 0){
            System.out.println("bit was zero ");
        } else{
            System.out.println("bit was one");
        }
    }
}