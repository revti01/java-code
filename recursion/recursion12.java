// print all subsequences of a string 
public class recursion12 {
    public static void subsequences(String str, int index, String newString){
        if(index == str.length()){
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(index);
        // every element has two choices to be in a string or not to be in a string 
        // to be 
        subsequences(str, index+1, newString+currChar);
        //not to be
        subsequences(str, index+1, newString);
    }
    public static void main(String[] args) {
        String str = "abcd";
        subsequences(str, 0, "");
    }
}