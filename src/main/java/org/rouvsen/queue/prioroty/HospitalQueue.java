package org.rouvsen.queue.prioroty;

import java.util.PriorityQueue;

public class HospitalQueue {
    public static void main(String[] args) {

        PriorityQueue<Patient> queue = new PriorityQueue<>();

        queue.offer(new Patient("P-1", 5));
        queue.offer(new Patient("P-2", 7));
        queue.offer(new Patient("P-3", 10));
        queue.offer(new Patient("P-4", 3));

        while (!queue.isEmpty()) {
            Patient nextPatient = queue.poll();
            System.out.println("Tedavi edilen hasta: "  + nextPatient);
        }

    }
}
