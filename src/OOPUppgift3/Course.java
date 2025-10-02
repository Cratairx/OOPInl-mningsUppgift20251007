package OOPUppgift3;

import java.util.ArrayList;
import java.util.List;

public class Course {

    protected String name;
    protected Teacher teacher;
    protected Student[] students;
    private int studentCounter = 0;
    private List<Student> studenter = new ArrayList<>();

    public Course(Teacher teacher){
        this.teacher = teacher;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getStudentCounter() {
        return studentCounter;
    }

    public void setStudentCounter(int studentCounter) {
        this.studentCounter = studentCounter;
    }

    public List<Student> getStudenter() {
        return studenter;
    }

    public void setStudenter(List<Student> studenter) {
        this.studenter = studenter;
    }

    Course(String name){
        this.name = name;
        students = new Student[10];
    }

    public String getName(){
        return name;
    }

    public Teacher getTeacher(){
        return teacher;
    }

    public Student[] getStudents(){
        return students;
    }

    public void addStudent(Student student){
       this.students[studentCounter++] = student;

    }

    public void addTeacher(Teacher teacher){

        this.teacher = teacher;
    }


    public void removeTeacher(){
        this.teacher
                = null;
    }

}
