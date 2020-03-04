package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    private String firstName;
    private String lastName;
    ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(Arrays.asList(examScores));
    }

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName){ this.firstName=firstName; }

    public String getLastName() { return lastName; }

    public void setLastName() { this.lastName=lastName; }

    public String getExamScores() {
        String scoresString = "Exam Scores:";
        for (Double score : examScores) {
            scoresString = scoresString + "\n       Exam " + (examScores.indexOf(score) + 1) + "  " + score.intValue();
        }
        return scoresString;
    }

    public void addExamScore(double score) { examScores.add(score); }

    public void setExamScore(int examNumber, double newScore) { examScores.set(examNumber -1,newScore); }

    public Integer getAverageExamScore() {
        Double sum = 0.0;
        for (Double score : examScores) { sum += score; }
        return (int) (sum / examScores.size());
    }

    public void setExamScores(ArrayList<Double> examScores) { this.examScores = examScores; }

    public Integer getNumberOfExamsTaken() { return examScores.size(); }

}
