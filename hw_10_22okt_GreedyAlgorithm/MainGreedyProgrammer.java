package de.telran.hw_10_22okt_GreedyAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class MainGreedyProgrammer {
    // Начало недели, у разработчика в бэклоге есть список задач от разных отделов,
    //каждая из которых требует определённого времени для выполнения.
    //Разработчик может в неделю работать определенное количество времени maxTime.
    //Мы хотим выбрать максимальное количество задач, которые можно выполнить,
    //учитывая ограничение по времени.
    //Используйте подход жадного алгоритма по критерию: время выполнения задачи.
    //Например класс на Java:
    //public class Task {
    //private String name;
    //private int time; //время выполнения (дней)
    //private int cost; //стоимость
    //}
    public static void main(String[] args) {
        List<Task> list = new ArrayList<>();
        list.add(new Task("new BD", 8,150));
        list.add(new Task("apgrateAltBD", 5,95));
        list.add(new Task("new Pattern", 20, 280));
        list.add(new Task("new App", 26,450));
        list.add(new Task("apgrate Alte App", 8,160));
        list.add(new Task("new documents", 11, 165));
        list.add(new Task("apgrate alte documents", 5,100));
        list.add(new Task("consultations new worker", 2, 30));


        TasksSelection selection= new TasksSelection();
        selection.selectTasks(list);
    }
}
