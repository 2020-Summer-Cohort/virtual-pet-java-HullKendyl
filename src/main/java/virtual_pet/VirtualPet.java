package virtual_pet;

import java.util.Random;
import java.util.Scanner;

public class VirtualPet {

    Scanner scanner = new Scanner(System.in);

//    declare variables

    private String name;
    private int hunger;
    private int thirst;
    private int boredom;
    private int energy;
    private int love;

    Random random = new Random();

//    build constructor (initiate new object keyword) *See Dam Example

    public VirtualPet(int hunger, int thirst, int boredom, int energy, int love) {

        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
        this.energy = energy;
        this.love = love;
    }

    public void actionGiveFood(){
        hunger += 6;
        thirst -= 2;
        energy += 1;
        love +=  1;
    }
    public void actionGiveWater(){
        thirst += 6;
        energy += 1;
        love += 1;
    }
    public void actionPlay(){
        boredom += 3;
        energy -= 4;
        hunger -= 4;
        thirst -= 4;
        love += 3;
    }
    public void actionTakeNap(){
        energy += 6;
        hunger -= 2;
        thirst -= 2;
        love -= 6;
    }
    public void actionGiveCuddles(){
        love += 4;
        energy -= 1;
        hunger -=1;
        thirst -=1;
    }

//    add getter for each variable declared at top

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getEnergy() {
        return energy;
    }

    public int getLove() {
        return love;
    }

//    set up tick method

    void tick(){
        hunger = hunger -= 2;
        thirst = thirst -= 2;

    }


        }


