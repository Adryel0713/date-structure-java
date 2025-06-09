package Trilha_05;

import java.util.Stack;

public class BalanceadorParenteses {

    private static boolean estaBalanceado(String expressao){
        Stack<Character> pilha = new Stack<>();

        for (char c : expressao.toCharArray()){
            if(c == '('){
                pilha.push(c);
            }
            else if(c == ')'){
                if (pilha.empty())
                    return false;
                else
                    pilha.pop();
            }
        }
        return pilha.isEmpty();
    }

    public static void main(String[] args) {

        String[] expressoes = {
                "(a + b)",
                "(a + b) * c",
                "(a - (b * c))",
                "(a + b"
        };
        for(String exp : expressoes){
            boolean resultado = estaBalanceado(exp);
            System.out.println("Expressão: " + resultado);
        }
    }
}
