package de.telran.hw_10_22okt_GreedyAlgorithm;

public class Task {
    private String name;
    private int time; //время выполнения (часов)
    private int cost; //стоимость

    public Task(String name, int time, int cost) {
        this.name = name;
        this.time = time;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    public int getCost() {
        return cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
