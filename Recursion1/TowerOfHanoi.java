package Recursion1;

public class TowerOfHanoi {

    public static void main(String[] args) {
        int disk=3;
        toh(disk,"s","h","d");
    }

    static void toh(int disk,String source,String helper,String destination){
        if(disk==0){
            return;
        }
        toh(disk-1,source,destination,helper);
        System.out.println("move the first disk from "+source +" to "+destination);
        toh(disk-1,helper,source,destination);
    }
}
