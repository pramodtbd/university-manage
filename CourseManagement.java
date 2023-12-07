import java.util.ArrayList;
import java.util.List;

public class CourseManagement {
    private List<Course> courses;

    public  CourseManagement() {
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void displayAllCourses() {
        System.out.println("All Courses:");
        for (Course course : courses) {
            course.displayCourseInfo();
        }
    }

    public static void main(String[] args) {
        // Creating instances of Student, Teacher, Course, and CourseManagement
        Student student1 = new Student("S001", "Pramod");
        Student student2 = new Student("S002", "Abhisek");

        Teacher teacher1 = new Teacher("T001", "Prof.malaya");

        Course course1 = new Course("C001", "Introduction to Java", teacher1);
        course1.enrollStudent(student1);
        course1.enrollStudent(student2);

        Course course2 = new Course("C002", "Data Structures", teacher1);
        course2.enrollStudent(student1);

        CourseManagement courseManagement = new CourseManagement();
        courseManagement.addCourse(course1);
        courseManagement.addCourse(course2);

        // Displaying course information
        courseManagement.displayAllCourses();
    }
}