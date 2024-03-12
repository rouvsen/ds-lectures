package org.rouvsen.example;

public class Human implements Comparable<Human> {
    private String name;
    private Integer priority;

    public Human(String name, Integer priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Human[name=%s, priority=%d]".formatted(name, priority);
    }

    @Override
    public int compareTo(Human o) {
        return o.priority - this.priority;
    }
}
