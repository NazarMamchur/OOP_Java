public class BubbleSort {

    public static void main(String args[]){
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;
        boolean unsorted = true;

        while(unsorted){
            unsorted = false;
            for (int i = 0; i < length - 1; i++){
                if (array[i] > array[i + 1]){
                    array[i] ^= array[i + 1];
                    array[i + 1] = array[i] ^ array[i + 1];
                    array[i] ^= array[i + 1];
                    unsorted = true;
                }
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
