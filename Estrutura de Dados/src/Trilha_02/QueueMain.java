package Trilha_02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.offer("Fila 1");
        fila.offer("Fila 2");
        fila.offer("Fila 3");
        fila.offer("Fila 4"); //adiciona ao final da fila
        System.out.println(fila.poll()); //remove o primeiro e visualiza
        System.out.println(fila.peek()); //visualiza sem remover
    }
}
