public class Student {
    private String name;
    private int roll;
    public Student() {
       
    }
    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
   

    public String toString() {
        return name+"  "+roll;
    }
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student("Rahul",2);
        Student s3=new Student("Amit",3);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }


}
