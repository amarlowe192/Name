package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    //Start Program
    public static void programStart(){
        //Initializations
        Maze maze = new Maze();
        String response;
        Scanner input = new Scanner(System.in);
        Character character = new Character();
        //Start Story
        System.out.println("Left, Right, or Forward? (Type L, R, F)");
        response = input.nextLine();
        //Chooses what Character story you will play
        character.setDirection(response);
        character.generateCharacter(response.toUpperCase());
        System.out.println("Choose a difficulty (1, 2, 3: Three Being The Most Difficult)");
        //Sets maze endpoint by utilizing random numbers between a range
        maze.getMazeDifficulty(input.nextInt());

        System.out.println("You have chosen difficulty: "+ maze.difficulty+ "\nYour main maze path will be " + maze.mazeLength +" moves, remember that.");
        System.out.println("You go " + character.fullDirection + "\nWhat is your next move? (WASD)");
        input.nextLine();
        response = input.nextLine();
        maze.createMaze(maze.mazeLength);

        if(maze.move(response)){
            while (character.location % 1 != 0){
                System.out.println("What is your next Move? (WASD)");
                input.nextLine();
                response = input.nextLine();
                maze.move(response);
            }
            character.setCharacterLocationRightPath(response);
        }
        else{
            character.setCharacterLocationWrongPath(response);
            while (character.setCharacterLocationWrongPath(response) == false){
                System.out.println("What is your next Move? (WASD)");
              input.nextLine();
                response = input.nextLine();
                character.setCharacterLocationWrongPath(response);
            }



        }
    }
}
