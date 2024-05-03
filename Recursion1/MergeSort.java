package Recursion1;

public class MergeSort {

    public static void main(String[] args) {
        int arr[]={4,7,9,8,6,5,3,1,4};
        mergesort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    static void mergesort(int arr[]){
        if(arr.length<=1){
            return;
        }
        int a[]=new int[arr.length/2];
        int b[]=new int[arr.length-a.length];

        for(int i=0;i<arr.length/2;i++){
            a[i]=arr[i];
        }
        for(int i=arr.length/2;i<arr.length;i++){
            b[i-arr.length/2]=arr[i];
        }
        mergesort(a);
        mergesort(b);
        merge(a,b,arr);
    }

    static void merge(int a[],int b[],int arr[]){
        int i=0;
        int j=0;
        int k=0;

        while(i<a.length&&j<b.length){
            if(a[i]<=b[j]){
                arr[k++]=a[i++];
            }else{
                arr[k++]=b[j++];
            }
        }

        while(i<a.length){
            arr[k++]=a[i++];
        }
        while(j<b.length){
            arr[k++]=b[j++];
        }
    }
}
