import java.util.ArrayList;
import java.util.List;

class Course {
    private String courseId;
    private String courseName;
    private Teacher teacher;
    private List<Student> enrolledStudents;

    public Course(String courseId, String courseName, Teacher teacher) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.teacher = teacher;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void displayCourseInfo() {
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + courseName);
        System.out.println("Teacher: " + teacher.getName());
        System.out.println("Enrolled Students:");
        for (Student student : enrolledStudents) {
            System.out.println("  - " + student.getName() + " (ID: " + student.getId() + ")");
        }
        System.out.println();
    }
}
