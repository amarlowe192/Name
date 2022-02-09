package com.company;
import java.util.Random;

public class Maze {
    Random random = new Random();
    int mazeLength;
    double sidePaths;
    double mainPath;
   double initialPosition = 0.0;
    double characterLocation;
    int difficulty;
    double endpoint;
    boolean isRightMove;
    String move;
    String wasd;
    Character character = new Character();

    public int getMazeDifficulty(int number1){
        //1 is easy between 30 and 40 main pathway, etc
        switch(number1) {
            case 1:
                mazeLength = random.nextInt(30, 41);
                difficulty = 1;

                break;
            case 2:
                mazeLength = random.nextInt(40, 51);
                difficulty = 2;
                break;
            case 3:
                mazeLength = random.nextInt(50, 71);
                difficulty = 3;

                break;
            default:
                return 0;
        }
        return mazeLength;
    }

    public void createMaze(int mazeLength){
        endpoint = mazeLength;
        initialPosition = 0;
    }

    public String fullWASD(String nextMove){
        switch (nextMove){
            case "W":
                wasd = "Forward";
                break;
            case "A":
                wasd = "Left";
                break;
            case "S":
                wasd = "Back";
                break;
            case "D":
                wasd = "Right";
                break;
            default:
        }

        return this.wasd;
    }


    public boolean move(String nextMove){
        System.out.println("You go " + fullWASD(nextMove));
        this.move = nextMove;
        isRightMove = random.nextBoolean();

        if(isRightMove){
            characterLocation = character.location + 1;

        }
        else{
            isRightMove = false;
        }
        return this.isRightMove;
    }

}
