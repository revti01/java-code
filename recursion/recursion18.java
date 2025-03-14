public class recursion18 {
    public static boolean[] map = new boolean[26];
    public static void removeduplicates(String str, int index, String newString) {
        if(index == str.length()){
            System.out.println(newString);
            return;
        }
        
        char currChar = str.charAt(index);
        if(map[currChar - 'a'] == true){
            removeduplicates(str, index+1, newString);
        }else{
           newString += currChar;
           map[currChar - 'a'] = true;
           removeduplicates(str, index, newString);
        }
    }
    public static void main(String[] args) {
        String str = "abbccddssaa";
        removeduplicates(str, 0, "");
    }
    
}
