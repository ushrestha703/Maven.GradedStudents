package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ClassroomTest {

    ArrayList<Student> expectedA = new ArrayList<>();
    ArrayList<Student> expectedB = new ArrayList<>();
    ArrayList<Student> expectedC = new ArrayList<>();
    ArrayList<Student> expectedD = new ArrayList<>();
    ArrayList<Student> expectedF = new ArrayList<>();

        Double[] oneExamScores = {10.0, 10.0, 20.0, 20.0, 10.0};
        Student Tom = new Student("Tom", "Hank", oneExamScores);

        Double[] twoExamScores = {20.0, 10.0, 30.0, 40.0, 40.0};
        Student Lady = new Student("Lady", "Gaga", twoExamScores);

        Double[] threeExamScores = {20.0, 30.0, 40.0, 12.0, 30.0};
        Student Jerry = new Student("Jerry", "Chu", threeExamScores);

        Double[] sixExamScores = {0.0, 0.0, 0.0, 0.0, 0.0};
        Student Ted = new Student("Ted", "Hank", sixExamScores);

        Double[] addedExamScores = {20.0, 25.5, 45.0, 70.5, 10.0};
        Student added = new Student("Added", "ToList", addedExamScores);

        Student[] classStudents = {Tom, Lady, Jerry, Ted};
        Classroom classroom1 = new Classroom(classStudents);

    @Test
    public void getStudents() {
        Student[] expected = {Tom, Lady, Jerry, Ted};
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
        Student[] expected = {Tom, Lady, Jerry, Ted, added};
        classroom1.addStudent(added);
        Student[] actual = classroom1.getStudents();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeStudent() {
        Student[] expected = {Tom, Lady, Jerry, Ted};
        classroom1.removeStudent("George", "Washington");
        Student[] actual = classroom1.getStudents();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void getStudentsByScore() {
        Student[] expected = {Tom, Lady, Jerry, Ted};
        classroom1.getStudents();
        Student[] actual = classroom1.getStudents();
        Assert.assertArrayEquals(expected, actual);
    }
}
