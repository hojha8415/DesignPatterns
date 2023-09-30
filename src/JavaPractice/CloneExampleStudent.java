package JavaPractice;

public class CloneExampleStudent implements Cloneable{
    int rollno;
    String name;
    CloneExampleStudent(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[]args){
        CloneExampleStudent s1 = new CloneExampleStudent(101, "Utkarsh");
        CloneExampleStudent s2 = new CloneExampleStudent(102, "Harshita");
        try {
            CloneExampleStudent s3 = (CloneExampleStudent)s1.clone();
            System.out.println(s3.name);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(s1.name);
        System.out.println(s2.name);

    }
}
