package Trilha_03.Prioridade;

public class Tarefas implements Comparable<Tarefas>{
    private String name;
    private Integer prioridade;

    public Tarefas(String name, Integer prioridade) {
        this.name = name;
        this.prioridade = prioridade;
    }

    @Override
    public int compareTo(Tarefas o) {
        return Integer.compare(this.prioridade,o.prioridade);
    }

    @Override
    public String toString() {
        return "Tarefas: " + name + ", Prioridade: " + prioridade;
    }
}
