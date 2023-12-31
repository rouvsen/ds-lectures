package org.rouvsen.queue.prioroty;

import java.util.Comparator;

public class Patient implements Comparable<Patient> {
    private String name;
    private Integer urgency;

    public Patient(final String name, final Integer urgency) {
        this.name = name;
        this.urgency = urgency;
    }

    @Override
    public String toString() {
        return "Patient{name='%s', urgency=%d}".formatted(name, urgency);
    }

    @Override
    public int compareTo(Patient patient) {
        return patient.urgency - this.urgency;
    }
}
