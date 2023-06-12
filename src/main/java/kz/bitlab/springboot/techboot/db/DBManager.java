package kz.bitlab.springboot.techboot.db;

import kz.bitlab.springboot.techboot.db.Student;

import java.util.ArrayList;

public class DBManager {
    private static  final ArrayList<Student> students = new ArrayList<>();
    static Long id  = 2L;

    static {
        students.add(new Student(1L, "Adilet", "Teleuov", 90, "A"));
    }

    public static ArrayList<Student> getStudents(){
        return students;
    }
    public static void addStudent(Student student){
        if(student.getExam() >= 90){
            student.setMark("A");
        }
        else if(student.getExam() >= 75 && student.getExam() <= 89){
            student.setMark("B");
        }
        else if(student.getExam() >= 60 && student.getExam() <= 74){
            student.setMark("C");
        }
        else if(student.getExam() >= 50 && student.getExam() <= 59){
            student.setMark("D");
        }
        else if(student.getExam() < 50){
            student.setMark("F");
        }
        student.setId(id);
        id++;
        students.add(student);
    }


}
