//print all the subsets of a set of first  n natural numbers

import java.util.ArrayList;

public class recursion20 {
    public static void printsubset(ArrayList<Integer> subset){
        for(int i=-0; i<subset.size(); i++){
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }
    public static void printsubset(int n , ArrayList<Integer> subset){
        if(n == 0){
            printsubset(subset);
            return;
        }
    

// every element has choice to be in a subset or not to be in a subsey
//add hua 
        subset.add(n);
        printsubset(n-1, subset);
        
        // add nhi hua 
        subset.remove(subset.size()-1);
        printsubset(n-1, subset);
    }
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        printsubset(n, subset);

    }
}
