package com.company;

public class Character {

    String name;
    double location = 0;
    double wrongMove = 0.1;
    int characterNumber;
    String initialDirection;
    String fullDirection;
    boolean deadEnd = false;
    Maze maze = new Maze();

    public void generateCharacter(String direction){

        switch (direction){
            case "L":
                this.name = "Carly";
                this.characterNumber = 1;
                this.initialDirection = direction;
                fullDirection = "Left";
                break;
            case "R":
                this.name = "Tyler";
                this.characterNumber = 2;
                this.initialDirection = direction;
                fullDirection = "Right";
                break;
            case "F":
                this.name = "Mark";
                this.characterNumber = 3;
                this.initialDirection = direction;
                fullDirection = "Forward";
                break;
            default:
                fullDirection = "Back";
        }

    }
    //returns the initial direction
    public String getInitDirection(){
        return this.fullDirection;
    }

public void setDirection(String direction){
        this.initialDirection = direction;
}
    public void setCharacterLocationRightPath(String charDirection){
        switch (charDirection){
            case "S":
                location --;
                break;
            default:
                location++;
                break;
        }
        if(location == maze.endpoint){
            System.out.println("You win. Yay");
        }
        else {

        }

    }
    public boolean setCharacterLocationWrongPath(String charDirection){

        switch (charDirection){
            case "S":
                this.location -= this.wrongMove;
                break;
            default:
                location += this.wrongMove;
                if(location % 1 != 0){
                    if(Math.round(location) == (location += 1)){
                        System.out.println("Dead End. Go back");
                        deadEnd = true;
                        break;
                    }
                }
        }
        return deadEnd;
    }
}
