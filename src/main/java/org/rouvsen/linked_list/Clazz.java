package org.rouvsen.linked_list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Clazz {
    public static void main(String[] args) {

        // Synchronized version of Linked-List
        List<Object> list = Collections.synchronizedList(
                new LinkedList<>()
        );

        // ArrayList(searching O(1) - time complexity)
        // and LinkedList(searching - has execution time equal to O(n).
        // A LinkedList(prev and nex obj ref) consumes more memory than an ArrayList

        LinkedList<Object> linkedLIst = new LinkedList<>();
        linkedLIst.add("");
        linkedLIst.addAll(List.of("", ""));
        linkedLIst.addFirst(""); //respectively
        linkedLIst.addLast("");  //respectively

        linkedLIst.removeFirst();
        linkedLIst.removeLast();

        linkedLIst.removeFirstOccurrence("");
        linkedLIst.removeLastOccurrence("");

        //remove first element in the LinkedList (UnLinking)
        linkedLIst.poll(); // If list is null, it can be return null
        linkedLIst.pop();  // If list is null, it can be throw NoSuchElementException

    }
}
