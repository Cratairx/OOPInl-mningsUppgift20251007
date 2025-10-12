package OvningsUppgifter_Sprint1.OOPUppgift3;

import java.util.ArrayList;
import java.util.List;

public class Main {
     public static void main(String[] args) {


         Student student = new Student("Daniel Inserte", "12353");
         Student student1 = new Student("Simon Mollander", "158896");
         Teacher teacher = new Teacher("Sigrun ");

         List<Student> studenter = new ArrayList<>();
         studenter.add(student);
         studenter.add(student1);

         Course java = new Course("Objectorienterad programmering i java");
         Course databas = new Course("Databastekniker");
         Course fp = new Course("Funktionell programmering");
         java.addStudent(student);
         java.addStudent(student1);
         java.addTeacher(teacher);
         databas.addTeacher(teacher);
         fp.addTeacher(teacher);
         fp.addStudent(student);
         databas.addTeacher(teacher);
         databas.addStudent(student1);



        printCourse(java);
        Deltagande d1 = new Deltagande(student,java);
        Deltagande d2 = new Deltagande(student1,fp);
        List<Deltagande> deltagandes = List.of(d1,d2);
         System.out.println();

         System.out.println("Kursnamn " + java.getName());
         System.out.println("Lärare " + java.getTeacher());

         for (Deltagande d : deltagandes){
             if (d.getK().getName().equals(java.getName())){
                 System.out.println("Deltagende " + d.getS().getName());
             }

         }

         System.out.println("**********************************");
         System.out.println("Namn " + student.getName());

         for (Course course :student.getCourses()){
             System.out.println("Kurs " + course.getName() );
         }




    }

    public static void printCourse(Course course){

        System.out.println("Course: " + course.getName());
        System.out.println("Teacher: " + course.getTeacher().getName());



        for (Student s : course.getStudents()){
            if (s != null) {
                System.out.println("Student: " +" " +s.getName());
            }
        }
    }
}

