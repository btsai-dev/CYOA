package decisiontree;
import java.util.Scanner;
public class Decisiontree {


    public static void main(String[] args) {
    int end,count = 0;
    int choice[] = new int[6];
    // determines which ending we get
    Scanner input = new Scanner(System.in);
    // to provide user input
    
    //output first scenario
     System.out.println("choice 1");
     choice[0] = input.nextInt();
     //output second scenario
     System.out.println("choice 2");
     choice[1] = input.nextInt();
     //outpput third scenario
     System.out.println("choice 3");
     choice[2] = input.nextInt();
     //output fourth
     System.out.println("choice 4");
     choice[3] = input.nextInt();
     //output fifth
     System.out.println("choice 5");
     choice[4] = input.nextInt();
     //output sixth
     System.out.println("choice 6");
     choice[5] = input.nextInt();
     for(int n = 0; n < choice.length; n++)
     {
        count += choice[n];         
     }
     
     if(count >= 3)
     {
         end = 1;
         //good ending
         System.out.println("Good");
     }
     
     if(count < 3)
     {
         end = 2;
         //bad ending
         System.out.println("Bad");
     }
}
}
