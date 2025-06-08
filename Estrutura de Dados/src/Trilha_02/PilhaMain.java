package Trilha_02;

import java.util.Stack;

public class PilhaMain {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Pagina 1");
        stack.push("Pagina 2");
        stack.push("Pagina 3"); //adiciona elemento no topo
        System.out.println(stack.pop()); //remove o elemento do topo e visualiza
        System.out.println(stack.peek()); //visualiza o topo sem remover
    }
}
