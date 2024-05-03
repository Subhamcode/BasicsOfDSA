package Stacks;

public class StackUsingArray {

  private  int data[];
  private int top;
    public StackUsingArray(){
        data=new int[3];
        top=-1;
    }

    public void push(int elem){
        if(top==data.length-1){
            restructure();
        }
        data[++top]=elem;


    }
    public int size(){
        return top+1;
    }
    public int top(){
        if(top==-1){
            System.out.println("stack is empty");
            return -1;
        }
        return data[top];
    }

    public boolean isEmpty(){
        return top==-1;
    }
    public int pop(){
        if(top==-1){
            System.out.println("cannot pop from empty stack");
            return -1;
        }
        int elem=data[top];
        top--;
        return elem;
    }

    public void restructure(){
        int temp[]=data;
        data=new int[temp.length*2];
        for(int i=0;i<temp.length;i++){
            data[i]=temp[i];
        }

    }
}
