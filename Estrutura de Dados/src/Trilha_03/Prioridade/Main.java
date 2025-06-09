package Trilha_03.Prioridade;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<Tarefas> filaTarefas = new PriorityQueue<Tarefas>();
        filaTarefas.add(new Tarefas("Tomar um banho",2));
        filaTarefas.add(new Tarefas("Ligar o rádio",1));
        filaTarefas.add(new Tarefas("Se alimentar",3));
        filaTarefas.add(new Tarefas("Beber Agua",3));
        filaTarefas.add(new Tarefas("ir ao Banheiro",5));

        System.out.println("Prioridades: ");
        while (!filaTarefas.isEmpty()){
            System.out.println(filaTarefas.poll());
        }
    }
}
