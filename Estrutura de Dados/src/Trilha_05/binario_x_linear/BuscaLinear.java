package Trilha_05.binario_x_linear;

public class BuscaLinear {

    public static int buscar(int[] tamanho,int valor){
        for(int i = 0; i < tamanho.length; i++){
            if(tamanho[i] == valor){
                return i;
            }
        }
        return -1;
    }
}
