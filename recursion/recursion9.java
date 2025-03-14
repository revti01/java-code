// find the 1st and last occurance of an element in string  // string = revtiranjanjha ; element = a
public class recursion9{
    public static int first = -1;
    public static int last = -1;

    public static void findoccu(String str, int index, char element){
        if(index == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(index);
        if(currChar == element){
            if (first == -1){
                first = index;
            }else {
                last = index;
            }
        }
        findoccu(str, index+1, element);
    }
    public static void main(String[] args) {
        String str = "revtiranjanjha";
        findoccu(str, 0, 'a');
    }
}