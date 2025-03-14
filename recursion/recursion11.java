//move all 'x'to the end of the string 
public class recursion11{
    public static void moveallx(String str, int index, int count, String newString){
        if(index == str.length()){
            for(int i=0; i<count; i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        
        char currChar = str.charAt(index);
        if(currChar == 'x'){
            count++;
            moveallx(str, index+1, count, newString);
        }else{
            newString += currChar;  //+= means adding new string + currchar
            moveallx(str, index+1, count, newString);
        }  
    }
    public static void main(String[] args) {
        String str = "abxcxdxex";
        moveallx(str, 0, 0, "");
    }
}

