package Recursion1;

public class ReplaceAWithB {

    public static void main(String[] args) {
        String s="acxaxca";
        String result=replace(s,"",0);
        System.out.println(result);
    }

    static String replace(String s,String ans,int index){
        if(index>=s.length()){
            return ans;
        }
        if(s.charAt(index)=='a'){
            ans+='b';
        }else{
            ans+=s.charAt(index);
        }
        return replace(s,ans,index+1);
    }
}
