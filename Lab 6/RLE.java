import java.util.Scanner;

public class RLE {

    public static void main( String[] args ) {
//        String str = args[0];
        Scanner in = new Scanner(System.in);
        String str = in.next();
        if(str.equals("")) {
            System.out.println("");
            return;
        }
        str += '-';

        char[] arr = str.toCharArray();
        int cou = 0, times = 0, oth = 0;
        StringBuffer finstr = new StringBuffer();

        for(int i = 0, len = arr.length - 1; i < len; i++) {
            if(arr[i] == arr[i + 1]) {
                cou++;
            }
            else if(arr[i] != arr[i + 1] || i == len - 1) {
                times = cou / 9;
                oth = cou % 9;
                if(times > 0) {
                    while (times > 0) {
                        finstr.append(arr[i]);
                        finstr.append("9");
                        times--;

                    }
                }
                if(oth > 0) {
                    oth++;
                    finstr.append(arr[i]);
                    finstr.append(oth);
                    cou = 0;
                }
                else {
                    finstr.append(arr[i]);
                }
            }
        }
        System.out.println(finstr);
    }
}
