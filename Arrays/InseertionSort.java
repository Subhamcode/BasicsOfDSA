package Arrays;

public class InseertionSort {

    public static void main(String[] args) {
        int arr[]={6,8,9,4,1,2,4};

        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>=temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;


        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
