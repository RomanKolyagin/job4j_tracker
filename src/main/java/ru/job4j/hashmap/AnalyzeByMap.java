package ru.job4j.hashmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        int sumScore = 0;
        int count = 0;

        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                sumScore += subject.score();
                count++;
            }
        }
        return count == 0 ? 0.0 : (double) sumScore / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();

        for (Pupil pupil : pupils) {
            int sumScore = 0;
            for (Subject subject : pupil.subjects()) {
                sumScore += subject.score();
            }
            labels.add(new Label(pupil.name(), (double) sumScore / pupil.subjects().size()));
        }
        return labels;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> subjectScores = new HashMap<>();
        Map<String, Integer> subjectCount = new HashMap<>();

        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                subjectScores.put(subject.name(), subjectScores.getOrDefault(subject.name(), 0) + subject.score());
                subjectCount.put(subject.name(), subjectCount.getOrDefault(subject.name(), 0) + 1);
            }
        }

        List<Label> labels = new ArrayList<>();
        for (String subject : subjectScores.keySet()) {
            double average = (double) subjectScores.get(subject) / subjectCount.get(subject);
            labels.add(new Label(subject, average));
        }
        return labels;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();

        for (Pupil pupil : pupils) {
            int sumScore = 0;
            for (Subject subject : pupil.subjects()) {
                sumScore += subject.score();
            }
            labels.add(new Label(pupil.name(), sumScore));
        }
        labels.sort(Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> temp = new  LinkedHashMap<>();

        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                temp.put(subject.name(), temp.getOrDefault(subject.name(), 0) + subject.score());
            }
        }

        List<Label> rls = new ArrayList<>();
        for (Map.Entry<String, Integer> element : temp.entrySet()) {
            rls.add(new Label(element.getKey(), (double) element.getValue()));
        }
        rls.sort(Comparator.naturalOrder());
        return rls.get(rls.size() - 1);
    }
}
