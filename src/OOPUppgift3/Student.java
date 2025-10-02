package OOPUppgift3;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    protected Course[] attends;
    private List<Course> courses = new ArrayList<>();

    public Course[] getAttends() {
        return attends;
    }

    public void setAttends(Course[] attends) {
        this.attends = attends;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public int getCourseCounter() {
        return courseCounter;
    }

    public void setCourseCounter(int courseCounter) {
        this.courseCounter = courseCounter;
    }

    private int courseCounter = 0;

    public Student(String name, String personalId){
        super(name, personalId);
        attends = new Course[10];
    }

    public void addToCourse(Course kurs){
        attends[courseCounter++] = kurs;
    }

    public Course[] getAllCourses()
    {
        return attends;
    }

    public String getName() {
        return name;
    }

    public void addCourse(Course course){
        courses.add(course);
    }
}






