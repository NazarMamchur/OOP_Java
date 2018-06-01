package ua.lpnuai.Mamchur08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lab8 {
    public static void main(String[] args) throws IOException{

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String text = read.readLine();
        StringTokenizer token = new StringTokenizer(text);
        char[] arr = text.toCharArray();
        int m = 1, l = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == ' ') {
                m++;
            }
        }

        String[] textarr = new String[m];
        String[] textarrinv = new String[m];

        while(token.hasMoreTokens()) {
            textarr[l] = token.nextToken();
            textarrinv[l] = new StringBuffer(textarr[l]).reverse().toString();
            l++;
        }

        for(int i = 0; i < textarr.length; i++) {
            for(int j = 0; j < textarr.length; j++) {
                if(textarr[i].equals(textarrinv[j]) && !textarr[j].equals(" ")) {
                    System.out.println(textarr[i] + " - " + new StringBuffer(textarr[i]).reverse());
                    textarr[j] = " ";
                }
            }
        }
    }
}
