//print all unique subsequences of a string "aaa"

import java.util.HashSet;

public class recursion13{
    public static void subsequences(String str, int index, String newString, HashSet<String>set){
        if(index == str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
            
        }

        char currChar = str.charAt(index);
        // every element has two choices to be in a string or not to be in a string 
        // to be 
        subsequences(str, index+1, newString+currChar, set);
        //not to be
        subsequences(str, index+1, newString, set);
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subsequences(str, 0, "", set);
    }
}
