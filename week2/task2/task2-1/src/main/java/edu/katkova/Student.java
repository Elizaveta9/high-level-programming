package edu.katkova;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Student {
    private String name;
    private LocalDateTime birthDate;
    private String group;
    private int studentId;
    private double averageScore;

    public Student(String name, LocalDateTime birthDate, String group, int studentId, double averageScore) {
        this.name = name;
        this.birthDate = birthDate;
        this.group = group;
        this.studentId = studentId;
        this.averageScore = averageScore;
    }

    // Используется статический метод between() класса Period для нахождения разницы между датами
    public int getAge() {
        return Period.between(birthDate.toLocalDate(), LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return String.format("""
                        Студент (№%d):
                         - имя: %s
                         - дата рождения: %s
                         - возраст: %d
                         - группа: %s
                         - средний балл: %.1f
                         - хороший студент: %s""",
                studentId,
                name,
                DateTimeFormatter.ofPattern("dd.MM.yy (HH:mm)").format(birthDate),
                getAge(),
                group,
                averageScore,
                // Тернарный оператор. Если isExcellentStudent() возвращает true ставится "да". При false - "нет"
                isExcellentStudent() ? "да" : "нет");
    }

    public boolean isExcellentStudent() {
        return averageScore >= 4.8;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }
}
