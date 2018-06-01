package ua.lpnuai.Mamchur08;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Lab10> list = new ArrayList<>();
        String input = "";

        while(!input.equals("end")) {
            System.out.println("Enter a command: (enter \"end\" to end)");
            input = in.next();
            switch(input) {
                case "add":
                    System.out.println("Enter bus time");
                    BusTime time = new BusTime(in.next());
                    System.out.println("Enter bus number");
                    Number num = new Number(in.nextInt());
                    System.out.println("Enter days (enter \"end\" to end)");
                    ArrayList<String> days = new ArrayList<>();
                    while(true) {
                        String day = in.next();
                        if(!day.equals("end")) {
                            days.add(day);
                        } else {
                            break;
                        }
                    }
                    DayWeek dayWeek = new DayWeek(days);
                    System.out.println("Enter numbers of seats");
                    Seats seats = new Seats(in.nextByte());
                    System.out.println("Enter stations and arrival time (enter \"end\" to end)");
                    ArrayList<Direction> directions = new ArrayList<>();
                    while(true) {
                        String stat = in.next();
                        String arrival = in.next();
                        if(!stat.equals("end")) {
                            directions.add(new Direction(stat, arrival));
                        } else {
                            break;
                        }
                    }
                    Route route = new Route(directions);
                    list.add(new Lab10(time, num, dayWeek, seats, route));
                    break;
                case "delete":
                    int index;
                    do {
                        System.out.println("Enter index");
                        index = in.nextInt();
                    } while(index > list.size() - 1|| index < 0);
                    list.remove(index);
                    break;
                case "find":
                    int toFind = in.nextInt();
                    int res = -1;
                    for(int i = 0; i < list.size(); i++) {
                        if(toFind == list.get(i).getBusNumber().getNumber()) {
                            res = i;
                        }
                    }
                    System.out.println((res == -1) ? ("Not found") : ("Found at " + res));
                    break;
                case "end":
                    System.out.println("Thanks");
                    break;
                default:
                    System.out.println("Invalid command, please try again");
            }
        }
    }
}
