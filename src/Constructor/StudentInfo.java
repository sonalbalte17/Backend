package Constructor;

public
class StudentInfo {
    int rollno;
    String studentname;
    static String collegeName="Magnus";
    StudentInfo(int rollno1,String studentname1){
        this.rollno=rollno1; //can do rollno also instead of rollno1
        this.studentname=studentname1;//can do studentname also instaed of studentname1
    }

    public static
    void main (String[] args) {
        StudentInfo s1=new StudentInfo (101,"Sonal");
        StudentInfo s2=new StudentInfo (102,"Anup19");
        System.out.println (s1.studentname+  "----"+s1.rollno+ "----"+collegeName);
        System.out.println (s2.studentname+"----"+s2.rollno+"----"+collegeName);
        System.out.println ();
    }
}
