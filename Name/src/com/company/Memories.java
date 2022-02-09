package com.company;

import java.util.Random;

public class Memories {
    String[] memoriesCarly = {"Volvo", "BMW", "Ford", "Mazda"};
    String[] memoriesTyler = {"Volvo", "BMW", "Ford", "Mazda"};
    String[] memoriesMark = {"Volvo", "BMW", "Ford", "Mazda"};
    String memory;
    int memoryCounter;
    Random random = new Random();
    int memoryLocations;
    public void insertMemories(int mazeLength){
        random.nextInt(6, mazeLength);
    }

    public String printMemory(int memoryNumber, int characterNumber){
        return memory;
    }


}
