package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int hours;
        int minutes;
        int sec;
        hours = seconds/3600 ;
        minutes = (seconds - hours*3600)/60;
        sec = (seconds - hours*3600 - minutes*60);
        int formattedHours = hours >=24 ? hours -24 : hours;
        String result = String.format("%d:%02d:%02d", formattedHours, minutes, sec);
        System.out.println(result);
    }
}
