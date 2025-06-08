package Trilha_02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestePerformanceListas {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for(int i = 0; i < 1000000; i++){
            arrayList.add(i);
            linkedList.add(i);
        }

        long startTimeArrayList = System.currentTimeMillis();

        for(int i = 0; i < 1000; i++){
            arrayList.get(i * 200);
        }
        long endTimeArrayList = System.currentTimeMillis();

        long startTimeLinkedList = System.currentTimeMillis();

        for(int i = 0; i < 1000; i++){
            linkedList.get(i * 200);
        }

        long endTimeLinkedList = System.currentTimeMillis();

        System.out.println("Arraylist: " + (endTimeArrayList-startTimeArrayList) + " ms");
        System.out.println("LinkedList: " + (endTimeLinkedList-startTimeLinkedList) + " ms");
    }
}
