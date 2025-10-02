package OOPUppgift3;

public class Deltagande {

    private Student s;
    private Course k;

    public Deltagande(Student s, Course k) {
        this.s = s;
        this.k = k;
    }

    public Student getS() {
        return s;
    }

    public void setS(Student s) {
        this.s = s;
    }

    public Course getK() {
        return k;
    }

    public void setK(Course k) {
        this.k = k;
    }
}
