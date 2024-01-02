package org.rouvsen.list.session.manual;

public class Clazz {
    public Integer chapter;
    public Clazz nextClazz;

    @Override
    public String toString() {
        return "Clazz{chapter=%d, nextClazz=%s}"
                .formatted(chapter, nextClazz);
    }
}
