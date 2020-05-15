package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        //Interact with a VirtualPet object in this method
        System.out.println("Welcome to VirtualPet!");
        System.out.println("Gus the Pup needs your help. Let's begin to take care of him.");
        System.out.println("His current stats are:");

        VirtualPet pet = new VirtualPet("Gus");
        System.out.println(pet.getName());
        System.out.println("Boredom level: " + pet.getBoredom());

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Press 1 to play with pet. Press 2 to quit.");
            int userInput = scanner.nextInt();
            if (userInput == 1) {
                pet.playWithPet();
            }
            else if(userInput == 2) {
                break;
            }

        }
        }

//        will have a while loop -reference guessing game
//        while (true){

        }
//        VirtualPet dam1 = new VirtualPet("Hoover", 7);
//        System.out.println(dam1.name);

//        VirtualPet newVirtualPetHunger = new VirtualPet("Hunger", 1);
//        System.out.println(newVirtualPetHunger.name);
    }

