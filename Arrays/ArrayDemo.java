package Arrays;

public class ArrayDemo {

    public static void main(String[] args) {
        int arr[]=new int[4];
        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;
        }

        for(int i:arr){
            System.out.print(i+" ");
        }
    }

}
