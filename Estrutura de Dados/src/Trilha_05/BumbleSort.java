package Trilha_05;

public class BumbleSort {

    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1;i++){
            for(int j = 0; j < arr.length - 1 - i;j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numeros = {5,6,8,4,5,3,2};
        System.out.println("Desordem: ");
        for(int numb : numeros){
            System.out.print(numb + " ");
        }
        System.out.println();
        System.out.println("Ordem: ");

        bubbleSort(numeros);
        for (int numb : numeros){
            System.out.print(numb + " ");
        }
    }
}
