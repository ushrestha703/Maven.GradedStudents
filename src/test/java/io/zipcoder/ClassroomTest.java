package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ClassroomTest {

    Student Tom;
    Student Lady;
    Student Jerry;
    Student ted;
    Student added;
    Student null1;
    Student null2;

    Classroom classroom1;

    ArrayList<Student> expectedA = new ArrayList<>();
    ArrayList<Student> expectedB = new ArrayList<>();
    ArrayList<Student> expectedC = new ArrayList<>();
    ArrayList<Student> expectedD = new ArrayList<>();
    ArrayList<Student> expectedF = new ArrayList<>();


    @Before
    public void setUp() {

        Double[] oneExamScores = {10.0, 10.0, 20.0, 20.0, 10.0};
        Tom = new Student("Tom", "Hank", oneExamScores);

        Double[] twoExamScores = {20.0, 10.0, 30.0, 40.0, 40.0};
        Lady = new Student("Lady", "Gaga", twoExamScores);

        Double[] threeExamScores = {20.0, 30.0, 40.0, 12.0, 30.0};
        Jerry = new Student("Jerry", "Chu", threeExamScores);

        Double[] sixExamScores = {0.0, 0.0, 0.0, 0.0, 0.0};
        ted = new Student("Ted", "Hank", sixExamScores);

        Double[] addedExamScores = {20.0, 25.5, 45.0, 70.5, 10.0};
        added = new Student("Added", "ToList", addedExamScores);

        Student[] classStudents = {Tom, Lady, Jerry, ted};
        classroom1 = new Classroom(classStudents);

    }


    @Test
    public void getStudents() {
        Student[] expected = {Tom, Lady, Jerry, ted};
        Student[] actual = classroom1.getStudents();

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void getAverageExamScore() {
        Double expected = 17.1;
        Double actual = classroom1.getAverageExamScore();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addStudent() {
        Student[] expected = {Tom, Lady, Jerry, ted, added};
        classroom1.addStudent(added);
        Student[] actual = classroom1.getStudents();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeStudent() {
        Student[] expected = {Tom, Lady, Jerry, ted};
        classroom1.removeStudent("George", "Washington");
        Student[] actual = classroom1.getStudents();
        Assert.assertArrayEquals(expected, actual);
    }


    @Test
    public void getStudentsByScore() {
        Student[] expected = {Tom, Lady, Jerry, ted};
        classroom1.getStudents();
        Student[] actual = classroom1.getStudents();
        Assert.assertArrayEquals(expected, actual);

    }

}
