package com.ivantheterrible.lesson.task1.name;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class NameEntry {
    public static void main(String[] args) {
        out.println("Enter your name: ");
        //ввод имени
        Scanner scanner = new Scanner(in);
        String userName = scanner.nextLine();
        //вывод приветствия
        out.format("Hello, %s!", userName);
    }
}
