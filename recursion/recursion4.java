// print fibonacci series
// a, b, c where c = a+b

public class recursion4 { 
public static void printFib(int a, int b, int n ){
    // a = second last term  ; b = last term ; n = next term 
     if ( n == 0){
    return;
} 
     int c = a + b;
     System.out.println(c);
     printFib(b, c, n-1);
}

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        printFib(a, b, n);
    }
    
}
