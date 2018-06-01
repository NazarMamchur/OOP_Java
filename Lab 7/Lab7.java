package com.tasks7.rpn;

import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Lab7 {

    public static double parse(String rpnString){
        StringTokenizer st = new StringTokenizer(rpnString);
        LinkedList<String> list = new LinkedList<>();
        Stack<String> tempList = new Stack<String>();
        while (st.hasMoreTokens()) {
            list.add(st.nextToken());
        }

        for (int i = 0, size = list.size(); i < size; i++) {
            String currentChar = list.get(i);
            if (currentChar.matches("[0-9].*") ||( currentChar.contains("-") && currentChar.length() > 1)){
                tempList.push(currentChar);
            } else if (currentChar.matches("[*-/+]")) {
                if(tempList.size() < 2)
                    throw new RPNParserException();
                if (currentChar.equals("*")) {
                    double rs = Double.parseDouble(tempList.pop());
                    double ls = Double.parseDouble(tempList.pop());
                    double result = ls * rs;
                    tempList.push("" + result);
                } else if (currentChar.equals("-")) {
                    double rs = Double.parseDouble(tempList.pop());
                    double ls = Double.parseDouble(tempList.pop());
                    double result = ls - rs;
                    tempList.push("" + result);
                } else if (currentChar.equals("/")) {

                    double rs = Double.parseDouble(tempList.pop());
                    double ls = Double.parseDouble(tempList.pop());
                    if(rs == 0)
                        throw new ArithmeticException();
                    double result = ls/rs;
                    tempList.push("" + result);


                } else if (currentChar.equals("+")) {
                    double rs = Double.parseDouble(tempList.pop());
                    double ls = Double.parseDouble(tempList.pop());
                    double result = ls + rs;
                    tempList.push("" + result);
                }

            }
            else{
                throw new RPNParserException();
            }
        }
        return Double.parseDouble(tempList.pop());
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        System.out.println(parse(str));
    }
}