public class Student {
    String name;
    int id;
    String course;
    String address;
    String phno;

    public Student(String name, int id, String course,String address, String phno) {
        this.name = name;
        this.id = id;
        this.course = course;
        this.address=address;
        this.phno=phno;
    }
    
    public void display(){
        System.out.println("Student Details");
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("Course : "+course);
    }

    public static void main(String[] args) {
        Student s = new Student("Anah", 201, "BCA","Hubli","9710655223");
    }
}
