import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Sort {
    private static void sort(int[] array, Comparator comp) {
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                int val = array[i];
                int j;
                for (j = i; j >= gap && comp.compare(array[j - gap], val) > 0; j -= gap) {
                    array[j] = array[j - gap];
                }
                array[j] = val;
            }
        }
    }

    public static void main(String[] args){
        int[] array = {1,5,2,4,10,6,0,3,10};
//        Comparator comp = new Comparator();

        //Change your code here
        Integer[] arr = new Integer[array.length];
        for(int i = 0; i < array.length; i ++) {
            arr[i] = new Integer(array[i]);
        }

        Comparator<Integer> comparator = Collections.reverseOrder();
        Arrays.sort(arr, comparator);

        for(int i = 0; i < array.length; i ++) {
            array[i] = arr[i].intValue();
        }
        //Change your code here

        for (int i = 0; i < array.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}