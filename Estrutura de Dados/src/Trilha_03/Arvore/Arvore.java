package Trilha_03.Arvore;

public class Arvore {

    private Folha folha;
    private Arvore esquerda;
    private Arvore direita;

    public Arvore(){
        this.folha = null;
        this.esquerda = null;
        this.direita = null;
    }
    public Arvore(Folha folha){
        this.folha = folha;
        this.esquerda = null;
        this.direita = null;
    }
    public void inserir(Folha novo) {
        if (isEmpty()) {
            this.folha = novo;
        } else {
            Arvore novaArvore = new Arvore(novo);
            if (novo.getValue() < this.folha.getValue()) {
                if (this.esquerda == null) {
                    this.esquerda = novaArvore;
                    System.out.println("Folha: " + novo.getValue() + " a esquerda de: " + this.folha.getValue());
                } else {
                    this.esquerda.inserir(novo);
                }
            } else if (novo.getValue() > this.folha.getValue()) {
                if (this.direita == null) {
                    this.direita = novaArvore;
                    System.out.println("Folha: " + novo.getValue() + " a esquerda de: " + this.folha.getValue());
                } else {
                    this.direita.inserir(novo);
                }
            }
        }
    }
        public boolean isEmpty() {
            return this.folha == null;
        }
}
