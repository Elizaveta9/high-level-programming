package edu.katkova;

import java.time.LocalDateTime;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Алексеев Илья Львович", LocalDateTime.of(2003, Month.NOVEMBER, 3, 14, 40), "21ИТ1б", 13, 4.8);
        Student student2 = new Student("Белов Егор Романович", LocalDateTime.of(2001, Month.DECEMBER, 12, 10, 20), "20ВС1б", 14, 3.2);
        System.out.println(student1);
        System.out.println(student2);
    }
}
