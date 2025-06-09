package Trilha_03;

import java.util.Collections;
import java.util.PriorityQueue;

public class minHeap_maxHeap {

    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(100);
        minHeap.add(20);
        minHeap.add(300);
        minHeap.add(490);
        System.out.println(minHeap.poll());

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>
                (Collections.reverseOrder());
        maxHeap.add(100);
        maxHeap.add(200);
        maxHeap.add(10);
        maxHeap.add(80);
        System.out.println(maxHeap.poll());
    }
}
