package nyc.c4q.AnthonyFermin;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by davis on 4/4/15.
 */
public class Principal {
    private String name;
    private ArrayList<Teacher> teachers;

    public Principal(String name){
        this.name = name;
        teachers = new ArrayList<Teacher>();
    }
    public String getName(){
        return name;
    }
    public void addTeacher(Teacher teacher){
        //FIXME
        teachers.add(teacher);
    }
    // Given a color, return the number of students that have this
    // color lunchbox
    public int numOfStudentsWithCertainColorLunchbox(String color){
        //FIXME
        ArrayList<Student> allStudents = new ArrayList<Student>();
        int numOfStudents = 0;

        for(Teacher teacher : teachers){
            allStudents.addAll(teacher.getStudents());
        }

        for(Student student : allStudents){
            String lunchBoxColor = student.getLunchBox().getName();

            if(lunchBoxColor.equals(color)){
                numOfStudents++;
            }

        }
        return numOfStudents;
    }

    // Similar to the one above except that you should print the
    // names of students that have this color lunchbox.
    public void studentsWithCertainColorLunchbox(String color){
        //FIXME
        ArrayList<Student> allStudents = new ArrayList<Student>();

        for(Teacher teacher : teachers){
            allStudents.addAll(teacher.getStudents());
        }

        for(Student student : allStudents){
            String lunchBoxColor = student.getLunchBox().getName();

            if(lunchBoxColor.equals(color)){
                System.out.println(student.getName());
            }

        }

    }

    // Given a student's name, return the student's teacher.
    // If no teacher is found, then print "new student"
    public String whoIsThisStudentsTeacher(String studentname){
        //FIXME

        for(Teacher teacher : teachers){
            ArrayList<Student> students = teacher.getStudents();

            for(Student student : students){

                if(student.getName().equals(studentname)){
                   return teacher.getName();
                }

            }


        }

        return "new student";
    }

    // Print the teachers who have students with less than 3 pencils
    // in their pocket.
    public void teachersThatHaveStudentsWithLessThanACertainNumberOfPencils(int numOfPencils ){
        //FIXME

        HashSet<String> teacherNames = new HashSet<String>();

        for(Teacher teacher : teachers){
            ArrayList<Student> students = teacher.getStudents();

            for(Student student : students){

                int studentNumOfPencils = student.getNumOfPencilsInPocket();

                if(studentNumOfPencils < numOfPencils){
                    teacherNames.add(teacher.getName());
                }
            }
        }

        System.out.println(teacherNames);

    }

}
