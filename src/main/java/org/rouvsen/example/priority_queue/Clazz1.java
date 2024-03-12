package org.rouvsen.example.priority_queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Clazz1 {
    public static void main(String[] args) {
        Queue<Human> queue = new PriorityQueue<>();
        queue.add(new Human("h-1", 1));
        queue.add(new Human("h-2", 2));
        queue.add(new Human("h-3", 3));

        int order = 1;

        while(!queue.isEmpty()) {
            Human polled = queue.poll();
            System.out.println(order++ + "Polled: " + polled);
        }
    }
}
