package Trilha_05.binario_x_linear;

public class BuscaBinaria {

    private static int buscar(int[] tamanho,int valor){
        int inicio = 0;
        int fim = tamanho.length - 1;

        while(inicio <= fim){
            int meio = (inicio + fim) / 2;
            if(tamanho[meio] == valor){
                return meio;
            }

            if(tamanho[meio] < valor){
                inicio = meio + 1;
            }else{
                fim = meio - 1;
            }
        }
        return -1;
    }
}
