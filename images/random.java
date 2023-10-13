import java .util.Scanner;
import java .util.Random;
public class random {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("enter a number");
            int r = input.nextInt();
            Random random = new Random();
            int randomNumber = random.nextInt(10);
                    System.out.println("Random number: " + randomNumber);
                    if(r == randomNumber) 
                    System.out.println("you win");
                    
                    
                    
        else if (r > 10) 
         System.out.println("please enter a valid range");
         else
         System.out.println("please try again");
                        
                                 
                                 




    }

    
}
}
