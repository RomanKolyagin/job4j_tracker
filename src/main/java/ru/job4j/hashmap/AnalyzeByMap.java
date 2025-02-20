package ru.job4j.hashmap;

import java.util.*;

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
        List<Label> labels = new ArrayList<>();
        int sumScore = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                sumScore += subject.score();
            }
            labels.add(new Label(pupil.name(), (double) sumScore / pupils.size()));
        }
        return labels;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                map.merge(subject.name(), subject.score(), Integer::sum);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String subject = entry.getKey();
            int sumScore = entry.getValue();
            double averageScore = Math.round((double) sumScore / pupils.size());
            labels.add(new Label(subject, averageScore));
        }
        return labels;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        int sumScore = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                sumScore += subject.score();
            }
            labels.add(new Label(pupil.name(), sumScore));
            sumScore = 0;
        }
        labels.sort(Comparator.naturalOrder());
        return labels.getLast();
    }

    public static Label bestSubject(List<Pupil> pupils) {
        return null;
    }
}