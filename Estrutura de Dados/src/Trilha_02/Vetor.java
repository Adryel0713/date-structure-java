package Trilha_02;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(final int quantidade){
        this.elementos = new String[quantidade];
        this.tamanho = 0;
    }

    /*
    public void adicionar(final String elemento){
        for(int i = 0; i < elementos.length; i++){
            if (elementos[i] == null) {
                this.elementos[i] = elemento;
                break;
            }
        }
    }
    */
    public boolean adicionar(final String elemento) throws Exception {
        aumentar();
        if(tamanho < elementos.length){
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }
    private void aumentar(){
        if (tamanho == elementos.length) {
            String[] aumento = new String[elementos.length * 2];
            for (int i = 0; i < elementos.length;i++){
                aumento[i] = elementos[i];
            }
            this.elementos = aumento;
        }
    }
}
