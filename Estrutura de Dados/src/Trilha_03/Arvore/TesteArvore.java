package Trilha_03.Arvore;

public class TesteArvore {
    public static void main(String[] args) {
        Arvore arvore = new Arvore(new Folha(30));
        arvore.inserir(new Folha(15));
        arvore.inserir(new Folha(45));
        arvore.inserir(new Folha(7));
        arvore.inserir(new Folha(19));
    }
}
