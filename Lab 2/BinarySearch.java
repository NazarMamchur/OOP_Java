public class BinarySearch {

    public static void main(String args[]){
        int data[] = { 3, 6, 7, 10, 34, 56, 60 };
        int numberToFind = 10;
        search(data, numberToFind);
    }

    private static void search(int data[], int numberToFind) {
        int first = 0, last = data.length - 1, middle = (first + last)/2;
        if (data[middle] == numberToFind){
            System.out.println(middle);
            return;
        }

        while(first <= last){
            if(data[middle] == numberToFind) {
                System.out.println(middle);
                break;
            }
            else if(data[middle] < numberToFind) {
                first = middle + 1;
            }
            else {
                last = middle - 1;
            }

            middle = (first + last)/2;
            if(first > last) {
                System.out.println(-1);
            }
        }
    }
}