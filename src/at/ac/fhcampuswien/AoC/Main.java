package at.ac.fhcampuswien.AoC;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("What is your name?:");
        Scanner s1 = new Scanner(System.in);
        String name = s1.nextLine();

        System.out.println("What is your age?:");
        Scanner s2 = new Scanner(System.in);
        String age = s2.nextLine();

        System.out.println("What is your username?:");
        Scanner s3 = new Scanner(System.in);
        String username = s3.nextLine();

        System.out.println("your name is " + name + ", you are " + age + " years old, and your username is " + username);
    }
}
