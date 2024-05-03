package Recursion1;

public class CheckArraySorted {

    public static void main(String[] args) {
        int arr[]={4,5,6,5};
        System.out.println(isSorted(arr,0));
    }

    static boolean isSorted(int arr[],int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<=arr[index+1]&&isSorted(arr,index+1);
    }
}
