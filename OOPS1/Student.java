package OOPS1;

public class Student {

   final private int roll;
    public String name;

   static int numStudents;

    public Student(int roll,String name){
        this.roll=roll;
        this.name=name;
        numStudents++;
    }
    public int getRoll(){
        return this.roll;
    }
//    public void setRoll(int roll){
//       if(roll<=0){
//           return;
//       }
//        this.roll=roll;
//    }
}
