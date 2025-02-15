package ru.job4j.hashmap;

import java.util.HashMap;
import java.util.List;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        int sumScore = 0;
        int count = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                sumScore += subject.score();
            }
            count += pupil.subjects().size();
        }
        return (double) sumScore / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        return List.of();
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        return List.of();
    }

    public static Label bestStudent(List<Pupil> pupils) {
        return null;
    }

    public static Label bestSubject(List<Pupil> pupils) {
        return null;
    }
}