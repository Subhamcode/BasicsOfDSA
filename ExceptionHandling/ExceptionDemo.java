package ExceptionHandling;

public class ExceptionDemo {

    static int divide(int a,int b)throws DivideByZero{
        if(b==0){
            throw new DivideByZero();
        }
        return a/b;
    }

    public static void main(String[] args) {
        try {
           int r= divide(4, 3);
            System.out.println(r);
        }catch(Exception e){
            System.out.println("you are trying to divide by zero");
        }finally {
            System.out.println("end of program");
        }

    }
}
