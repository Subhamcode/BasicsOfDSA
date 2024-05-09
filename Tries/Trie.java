package Tries;

public class Trie {

    public TrieNode root;

    public Trie(){
        root=new TrieNode('\0');
    }

    public void add(String word){

        addhelper(root,word);
    }

    private void addhelper(TrieNode root,String word){
        if(word.length()==0){
            root.isTerminal=true;
            return;
        }
        int childIndex=word.charAt(0)-'A';
        TrieNode child=root.children[childIndex];
        if(child==null){
            child=new TrieNode(word.charAt(0));
            root.children[childIndex]=child;
            root.childcount++;
        }
        addhelper(child,word.substring(1));
    }

    public void remove(String word){

        removhelper(root,word);
    }
    private void removhelper(TrieNode root,String word){
        if(word.length()==0){
            root.isTerminal=false;
            return;
        }

        int childIndex=word.charAt(0)-'A';
        TrieNode child=root.children[childIndex];
        if(child==null){
            return;
        }
        removhelper(child,word.substring(1));
        if(!child.isTerminal&&child.childcount==0){
            root.children[childIndex]=null;
            root.childcount--;
        }
    }

    public boolean search(String word){
        return searchhelper(root,word);
    }

    private boolean searchhelper(TrieNode root,String word){
        if(word.length()==0){
            return root.isTerminal;
        }
        int childIndex=word.charAt(0)-'A';
        TrieNode child=root.children[childIndex];
        if(child==null){
            return false;
        }
        return searchhelper(child,word.substring(1));
    }
}
