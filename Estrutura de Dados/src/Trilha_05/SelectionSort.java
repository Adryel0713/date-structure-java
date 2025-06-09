package Trilha_05;

public class SelectionSort {

    public static void selectionSort(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < array.length;j++){
                if(array[j] < array[min]){
                    min = j;
                }
            }
        int temp = array[i];
        array[i] = array[min];
        array[min] = temp;
        }
    }

    public static void main(String[] args) {
        int[] numeros = {51,16,82,443,55,34,23};
        System.out.println("Desordem: ");
        for(int numb : numeros){
            System.out.print(numb + " ");
        }
        System.out.println();
        System.out.println("Ordem: ");

        selectionSort(numeros);

        for (int numb : numeros){
            System.out.print(numb + " ");
        }
    }
}
