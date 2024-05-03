package GenericsDemo;

public class PairUse {

    public static void main(String[] args) {
        Pair<Integer,Integer>p1=new Pair<>(10,15);
        Pair<Integer,String>p2=new Pair<>(1,"sam");


        System.out.println(p1.first);
        System.out.println(p1.second);

        System.out.println("roll no is "+p2.first+" and name is "+p2.second);
    }
}
