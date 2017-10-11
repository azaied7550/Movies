package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        String exit ="";
        String movie;
        int counter=0;
        while (!exit.equalsIgnoreCase("quit")){
            System.out.println("Enter movie name: ");
            movie = Keyboard.nextLine();
            if (movie.equalsIgnoreCase("quit")){
                exit="quit";
            }

            else {
                System.out.println ("The title of the movie is : "+ movie);
                counter++;
                }
            }

            System.out.println("You entered " +counter+ " movies");
        }
    }
