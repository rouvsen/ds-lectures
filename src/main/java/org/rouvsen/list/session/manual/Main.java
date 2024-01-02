package org.rouvsen.list.session.manual;

public class Main {
    public static void main(String[] args) {
        Clazz clazz1 = new Clazz();
        Clazz clazz2 = new Clazz();
        Clazz clazz3 = new Clazz();

        clazz1.chapter = 11;
        clazz2.chapter = 22;
        clazz3.chapter = 33;

//        System.out.println(clazz1.chapter);
//        System.out.println(clazz2.chapter);
//        System.out.println(clazz3.chapter);

        clazz1.nextClazz = clazz2;
        clazz2.nextClazz = clazz3;
        clazz3.nextClazz = null;

        Clazz temp = clazz1;

        while ( temp != null ) {
            System.out.println(temp.chapter);
            temp = temp.nextClazz;
        }

    }
}
