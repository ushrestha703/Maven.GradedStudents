package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class StudentTest {

        Double[] examScores = {90.5, 100.0, 87.3, 120.5, 90.0};
        Student Tom = new Student("Tom","Hank", examScores);

    @Test
    public void getFirstName() {
        String expected = "Tom";
        String actual = Tom.getFirstName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setFirstName() {
        Tom.setFirstName("Tom");
        String expected = "Tom";
        String actual = Tom.getFirstName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getLastName() {
        String expected = "Hank";
        String actual = Tom.getLastName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setLastName() {
        Tom.setLastName();
        String expected = "Hank";
        String actual = Tom.getLastName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getExamScores() {
        String expected = "Exam Scores:\n" +
                "       Exam 1  90\n" +
                "       Exam 2  100\n" +
                "       Exam 3  87\n" +
                "       Exam 4  120\n" +
                "       Exam 5  90";
        String actual = Tom.getExamScores();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addExamScore() {
        Tom.addExamScore(101.5);
        String expected = "Exam Scores:\n" +
                "       Exam 1  90\n" +
                "       Exam 2  100\n" +
                "       Exam 3  87\n" +
                "       Exam 4  120\n" +
                "       Exam 5  90\n" +
                "       Exam 6  101";
        String actual = Tom.getExamScores();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setExamScore() {

        Tom.setExamScore(2, 50.5);
        String expected = "Exam Scores:\n" +
                "       Exam 1  90\n" +
                "       Exam 2  50\n" +
                "       Exam 3  87\n" +
                "       Exam 4  120\n" +
                "       Exam 5  90";
        String actual = Tom.getExamScores();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAverageExamScore() {
        Integer expected = 97;
        Integer actual = Tom.getAverageExamScore();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setExamScores() {
        ArrayList<Double> newScores = new ArrayList<>();
        newScores.add(10.5);
        newScores.add(70.0);
        newScores.add(87.3);
        Tom.setExamScores(newScores);

        String expected = "Exam Scores:\n" +
                "       Exam 1  10\n" +
                "       Exam 2  70\n" +
                "       Exam 3  87";

        String actual = Tom.getExamScores();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfExamsTaken() {
        Integer expected = 5;
        Integer actual = Tom.getNumberOfExamsTaken();
        Assert.assertEquals(expected, actual);
    }

}