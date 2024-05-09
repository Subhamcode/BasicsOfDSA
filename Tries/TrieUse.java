package Tries;

public class TrieUse {

    public static void main(String[] args) {
        Trie t=new Trie();
        t.add("NOTE");
        t.add("APPLE");


        System.out.println(t.search("APPLE"));
        System.out.println(t.search("BOT"));
        System.out.println(t.search("APPL"));
        System.out.println(t.search("NOT"));
        System.out.println(t.search("NOTE"));
    }
}
