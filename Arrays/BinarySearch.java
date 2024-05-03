package Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int arr[]={1,4,6,7,8,9};
        int target=4;
        int result=binarysearch(arr,target);
        System.out.println(result);
    }

    static int binarysearch(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target>arr[mid]){
                start=mid+1;
            }else if(target<arr[mid]){
                end=mid-1;
            }else {
                return mid;
            }

        }
        return -1;
    }
}
