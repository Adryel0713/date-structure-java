package Trilha_01;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    private static final int TAMANHO = 1000000;

    public static void main(String[] args) {

        Map<Integer,Produto> mapa = new HashMap<>();

        for(int i = 1; i <= TAMANHO; i++){
            mapa.put(i,new Produto(i, "Produto " + i, i * 20.0));
        }

        long startTime = System.currentTimeMillis();
        int codigoASerEncontrado = TAMANHO;

        for(int quant = 0; quant < TAMANHO; quant++){
            Produto p = mapa.get(codigoASerEncontrado);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Tempo de execução: " + (endTime - startTime) + "ms");
    }
}
