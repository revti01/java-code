//check if arry is sorted(strictly increasing) next elmenet should be bigger than last element
public class recursion10 {
    public static boolean issorted(int arr[], int index){
        if(index == arr.length-1){
            return true;
        }
        
        if(arr[index] < arr[index+1]){
            //array is sorted till now
            return issorted(arr, index+1);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,6};
        System.out.println(issorted(arr, 0));
    }
}
