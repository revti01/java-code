//print all possible arrangements
public class backtracking1 {
    public static void printpermutation(String str, String permutation, int index){
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }


        for(int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
           printpermutation(newStr, permutation + currChar, index+1);
        }
    }
    
    public static void main(String[] args) {
        String str = "ABC";
        printpermutation(str, "", 0);
    }
}
