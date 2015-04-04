package nyc.c4q.AnthonyFermin;

import java.util.ArrayList;

/**
 * Created by davis on 4/4/15.
 */
public class Teacher {
    private String             name;
    private ArrayList<Student> students;

    public Teacher(String name)
    {
        this.name = name;
        students = new ArrayList<Student>();
    }

    public String getName()
    {
        return name;
    }
    public void addStudent(Student student){
        //FIXME
        this.students.add(student);
    }
    public ArrayList<Student> getStudents(){
        return students;
    }
}
