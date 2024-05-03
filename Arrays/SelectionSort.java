package Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int arr[]={6,7,9,5,3,1,5,2};
        selectionsort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }


    }

    static void selectionsort(int arr[]){

        for(int i=0;i<arr.length;i++){
            int minIndex=-1;
            int minValue=Integer.MAX_VALUE;

            for(int j=i;j<arr.length;j++){
                if(arr[j]<minValue){
                    minValue=arr[j];
                    minIndex=j;
                }
            }

            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }


    }

}
