package de.telran.hw_10_22okt_GreedyAlgorithm;

import de.telran.lesson_10_22okt_greedyAlgorithms.Activity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TasksSelection {

    public void selectTasks(List<Task> list) {
        list.sort(Comparator.comparingInt(Task::getCost).thenComparing((a, b) -> a.getTime() - b.getTime())); // правила сортировки
        List<Task> res = new ArrayList<>();
        System.out.println(" полный список возможных вариантов в сортированном виде : ");
        print(list);
        System.out.println(" всего в рабочей неделе может быть 40 рабочих часов !!! ");
        int sum=0; // считаем возможный заработок
        int sumTime=0; // время, которое необходимо для выполнения задачи
        int time =40; // количество рабочих часов в неделе
        for(int i = list.size()-1; i >=0; i--) {
            if (time -list.get(i).getTime()> 0) {
                sum +=list.get(i).getCost();
                sumTime +=list.get(i).getTime();
                res.add(list.get(i));
                time -=list.get(i).getTime();
            }else continue;
        }
        System.out.println();
        System.out.println( " отобранные задачи :  ");
        print(res); // список выбранных событий
        System.out.println( " можно заработать :  " +sum + " будет использовано :  " + sumTime + " часов");

    }
    private void print(List<Task> list) {
        for (Task e : list) {
            System.out.println(e.getName() + "  стоимость= "+e.getCost()+"->  требуется времени:  "+e.getTime()+ " часов");
        }
    }
}
