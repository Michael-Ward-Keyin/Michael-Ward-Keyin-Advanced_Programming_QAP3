public class Teacher extends Person {
    private double mySalary;
    private String mySubject;

    public Teacher(String name, int age, String gender, double salary, String subject) {
        super(name, age, gender);
        mySalary = salary;
        mySubject = subject;
    }

    public String getSubject() {
        return mySubject;
    }

    public void setSubject(String subject) {
        mySubject = subject;
    }

    public double getSalary() {
        return mySalary;
    }

    public void setSalary(double salary) {
        mySalary = salary;
    }

    public String toString() {
        return super.toString() + ", Salary: $" + mySalary + ", Subject; " + mySubject;
    }
}