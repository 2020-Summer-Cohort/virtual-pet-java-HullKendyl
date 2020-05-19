package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to VirtualPet!");
        System.out.println("Would you like to adopt a cat or dog?");
        String adoptPetSpecies = input.nextLine();
        System.out.println("Congratulations on adopting your new VirtualPet " + adoptPetSpecies + "!");
        System.out.println("What would you like it's name to be?");
        String petName = input.nextLine();
        System.out.println("That's a great name! " + petName + " it is.");
        System.out.println("Now that you have adopted " + petName + ", you need to make sure " + petName + " is happy and healthy!");
        System.out.println("Let's check out the statuses of " + petName + "'s current needs.");

        VirtualPet pet = new VirtualPet(22, 22, 20, 20, 20);

        while (true) {

            pet.tick();

            System.out.println("\n" + " - Current Stats -" + "\n");

            System.out.println("Hunger  - " + pet.getHunger());
            System.out.println("Thirst  - " + pet.getThirst());
            System.out.println("Boredom - " + pet.getBoredom());
            System.out.println("Energy  - " + pet.getEnergy());
            System.out.println("Love    - " + pet.getLove());

            if (pet.getHunger() <= 0) {
                System.out.println("\n" + "Unfortunately, the Hunger level has reached 0. " + petName + " is starving and has been taken by animal control. You Lose!");
                break;
            }
            if (pet.getThirst() <= 0) {
                System.out.println("Unfortunately, the Thirst level has reached 0." + petName + " is severely dehydrated and has been taken by animal control. You Lose!");
                break;
            }
            if (pet.getEnergy() <= 0) {
                System.out.println("Unfortunately, the Energy level has reached 0." + petName + " is sleep deprived and has passed out. You Lose!");
                break;
            }
            if (pet.getBoredom() <= 0) {
                System.out.println("Unfortunately, the Boredom level has reached 0." + petName + " is neglected and has been taken by animal control. You Lose!");
                break;
            }
            if (pet.getLove() <= 0) {
                System.out.println("Unfortunately, the Love level has reached 0." + petName + " is neglected and has been taken by animal control. You Lose!");
                break;
            }
            if (pet.getHunger() >= 50 || pet.getThirst() >= 50 || pet.getBoredom() >= 50 || pet.getEnergy() >= 50 || pet.getLove() >= 50){
                System.out.println("Congratulations! " + petName + " has reached a maximum level of 50." + "\n" + "Great job taking care of your VirtualPet!");
            break;
        }
            System.out.println("\n" + "What would you like to do to take care of " + petName + "?" + "\n" + "Press 0-5 to confirm your decision." + "\n");
            System.out.println("1. Give food");
            System.out.println("2. Give water");
            System.out.println("3. Play with toy");
            System.out.println("4. Take a nap");
            System.out.println("5. Give cuddles");
            System.out.println("0. Quit Game");
            Scanner scanner = new Scanner(System.in);
            int userSelection = scanner.nextInt();

            if (userSelection == 1) {
                System.out.println("You give " + petName + " kibble.");
                pet.updateHunger();
            } else if (userSelection == 2) {
                System.out.println("You give " + petName + " a cold drink of water.");
                pet.updateThirst();
            } else if (userSelection == 3) {
                System.out.println("You grab " + petName + "'s favorite toy and play until " + petName + " is exhausted.");
                pet.updateBoredom();
            }else if (userSelection == 4) {
                System.out.println("You encourage " + petName + " to take a nap. " + petName + " falls fast asleep.");
                pet.updateEnergy();
            }else if (userSelection == 5){
                System.out.println("You give " + petName + " loads of cuddles and pets.");
                pet.updateLove();
            } else if (userSelection == 0) {
                System.out.println("See you later!");
                break;
            } else {
                continue;
            }

        }
    }
}


