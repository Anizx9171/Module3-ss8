package ra.bt1;

public class Student extends User{
   private String subject;
    public Student(String subject, String password, String name) {
        super(password, name);
        this.subject = subject;
    }
    @Override
    public void displayData() {
        super.displayData();
        System.out.println("subject: " + this.subject);
    }
}