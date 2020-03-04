package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Classroom {

    Student[] students;

    public Classroom(Student[] students) { this.students = students; }

    public Classroom(int maxNumberOfStudents) { this.students = new Student[maxNumberOfStudents]; }

    public Classroom() { this.students = new Student[30]; }

    public Student[] getStudents() { return students; }

    public Double getAverageExamScore() {
        Double sum = 0.0;
        Integer totalExams = 0;

        for (Student student : students){
            for (Double examScore : student.examScores){
                sum += examScore;
                totalExams++;
            }
        }
        return sum / totalExams;
    }

    public void addStudent(Student student){
        ArrayList<Student> studentsList = new ArrayList<>(Arrays.asList(students));
        studentsList.add(student);
        students = studentsList.toArray(students);
    }

    public Student[] removeStudent(String firstName, String lastName){

        ArrayList<Student> studentsList = new ArrayList<>(Arrays.asList(students));

        Iterator<Student> iterator = studentsList.iterator();
        while (iterator.hasNext()) {
            Student nextStudent = iterator.next();

            String studentFirstName = nextStudent.getFirstName();
            String studentLastName = nextStudent.getLastName();

            if (studentFirstName.equals(firstName) && studentLastName.equals(lastName)) {
                iterator.remove();
            }
        }

        students = new Student[studentsList.size()];
        students = studentsList.toArray(students);
        return students;
    }

}
