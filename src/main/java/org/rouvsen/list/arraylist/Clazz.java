package org.rouvsen.list.arraylist;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toCollection;

public class Clazz {
    public static void main(String[] args) {

//        List<String> list = new ArrayList<>();
//        assertTrue(list.isEmpty());

        // Set an initial capacity
//        List<String> list = new ArrayList<>(20);

//        Collection<Integer> numbers = IntStream.range(0,10).boxed()
//                .collect(Collectors.toSet());
//        for (int num : numbers) {
//            System.out.println(num);
//        }
//
//        System.out.println("*************");
//
//        List<Integer> list = new ArrayList<>(numbers);
//        for (int num : list) {
//            System.out.println(num);
//        }

//        List<Long> list = new ArrayList<>();
//
//        list.add(1L);
//        list.add(2L);
//        list.forEach(System.out::println);
//
//        System.out.println("//////////////");
//
//        list.add(1, 3L);
//        list.forEach(System.out::println);

//        List<Long> list = new ArrayList<>(Arrays.asList(1L, 2L, 3L));
//
//        LongStream.range(4, 10).boxed()
//                .collect(collectingAndThen(
//                        toCollection(ArrayList::new),
//                        ys -> list.addAll(0, ys)
//                ));
////        assertThat(Arrays.asList(4L, 5L, 6L, 7L, 8L, 9L, 1L, 2L, 3L), equalTo(list));
//        list.forEach(System.out::println);

//        List<Integer> list = new ArrayList<>(
//                IntStream.range(0, 10).boxed().collect(toCollection(ArrayList::new))
//        );
//
//        ListIterator<Integer> it = list.listIterator(list.size());
//
//        List<Integer> result = new ArrayList<>(list.size());

        // reverse elements
//        while (it.hasPrevious()) {
//            result.add(it.previous());
//        }
//        (result is reversed version of list now)

        // list will be reversed
//        Collections.reverse(list);

//        assertThat(result, equalTo(list));

//        list.forEach(System.out::println);
//        result.forEach(System.out::println);

//        List<String> list = LongStream.range(0, 16)
//                .boxed()
//                .map(Long::toHexString)
//                .collect(toCollection(ArrayList::new));
//
//        List<String> stringsToSearch = new ArrayList<>(list);
//        stringsToSearch.addAll(list);
//
//        stringsToSearch.forEach(System.out::println);

        List<String> copy = new ArrayList<>(List.of("c", "b", "a"));
        Collections.sort(copy);
        int index = Collections.binarySearch(copy, "f");
//        assertThat(index, not(equalTo(-1)));  //Notice that if an element is not found then -1 will be returned.



    }
}
