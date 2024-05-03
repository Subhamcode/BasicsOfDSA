package HashMaps;

import java.util.HashMap;

public class HIghestFrquencyCHaracter {

    public static void main(String[] args) {
        String s="adbdadcdadadefdad";
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }

        char c='\0';
        int max=-1;

        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int value=map.get(s.charAt(i));
                if(value>max){
                    max=value;
                    c=s.charAt(i);
                }
            }
        }
        System.out.println(c);
    }
}
