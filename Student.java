public class Student {
    String name;
    int id;
    String course;

    public Student(String name, int id, String course) {
        this.name = name;
        this.id = id;
        this.course = course;
    }
    
    public void display(){
        System.out.println("Student Details");
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("Course : "+course);
    }

    public static void main(String[] args) {
        Student s = new Student("Anah", 201, "BCA");
    }
}
