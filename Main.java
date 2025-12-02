//Not every IDE support Unicode, so you could try to run chcp 65001 to see the characterForms

//import scanner
import java.util.Scanner;  

public class Main {




    

    public static void main(String[] args) {
    //new scanner to take user input
    Scanner scanner = new Scanner(System.in);



     System.out.println("Lets create a Little Pet:");
     System.out.println("______________________________");

     System.out.println("Choose: 1. Dog    2.Cat    3.Mouse");
     String chooseInput = scanner.nextLine();
    
  
    //scanner.nextLine();


     System.out.println("Name of the Pet: ");
     String name = scanner.nextLine();


     System.out.println("Age of the Pet: ");

    //better to use String, because int keeps trying to get userInput if empty
    // int age = scanner.nextInt();
     String ageInput = scanner.nextLine();


     System.out.println("How many pet treats (1-4): ");
     String timesInput = scanner.nextLine();
     
    
    


     //if the scanner is empty (space or enter etc pressed)
     if(chooseInput.trim().isEmpty()){
        LittleCreature defaultCreature = new BasicCreature();
        System.out.print(defaultCreature);
        return;
     }
  
     



     



    //converts the String scanner into int
    int choose = Integer.parseInt(chooseInput);
    int age = Integer.parseInt(ageInput);
    int times = Integer.parseInt(timesInput);

    //times limits
    // [if input is empty, error will show, fix later]
    // [integers < or > will still make the program continue, fix later]
     if(times < 1) times = 1;
     if(times > 4) times = 4;
   
     

     
     //close the scanner, otherwise errors can occur
     scanner.close();



    

    //check what user choosed, then creating object based on that
    if(choose == 1){

    Dog doggo = new Dog(name, age, times);
    System.out.println(doggo);
    doggo.howManyTimes();

    }else if (choose == 2){

     Cat catto = new Cat(name, age, times);
     System.out.println(catto );
     catto.howManyTimes();

    }else if (choose == 3){

     Mouse mouse = new Mouse(name, age, times);
     System.out.println(mouse);
     mouse.howManyTimes();
    }  
    



    }



}
