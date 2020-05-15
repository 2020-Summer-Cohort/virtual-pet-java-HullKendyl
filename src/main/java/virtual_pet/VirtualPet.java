package virtual_pet;

//import java.util.Scanner;

public class VirtualPet {

    private int hunger;
    private int thirst;
    private String name;
    private int boredom;
    private int sickness;

    public VirtualPet(String name){
        this.name = name;
        this.boredom = 5;
        this.hunger = 5;
        this.sickness = 5;
        this.thirst = 5;

    }

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getSickness() {
        return sickness;
    }

    static void myVirtualPetName(String firstName) {
        System.out.println("Gus");

//    void tick(){
//    }






//    Scanner scanner = new Scanner(System.in);

//    public void virtualPetHunger

//    private String name;
//    private int waterLevel;
//
//    public VirtualPet(String name, int waterLevel){
//        this.name = name;
//        this.waterLevel = waterLevel;

//    public String name;
//    public final int hungerLevel;
//
//    public VirtualPet(String name, int hungerLevel){
//        this.name = name;
//        this.hungerLevel = hungerLevel;
//    }
//    VirtualPet newVirtualPetHunger = new VirtualPet("Hunger",1);
//
//    public int getHungerLevel() {
//        return hungerLevel;
    }

    public void playWithPet() {
        boredom--;
    }
}
