package Trilha_02;

import java.util.PriorityQueue;

public class PriorityQueueMain {
    /** Ordena conforme a prioridade.. (baseado no heap) */

    public static void main(String[] args) {
        PriorityQueue<Integer> filaPrioridade = new PriorityQueue<>();
        filaPrioridade.offer(30);
        filaPrioridade.offer(10);
        filaPrioridade.offer(50);
        System.out.println(filaPrioridade.poll()); //saida 10

        }
}
