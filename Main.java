import java.util.*;  
public class Main {
  public static void main(String args[]){                       
          String s = "Hello, This is, Data, I am a poorly made chat bot.";  
          //Create scanner Object and pass string in it  
          Scanner scan = new Scanner(s);  
          //Check if the scanner has a token  
          System.out.println("Boolean Result: " + scan.hasNext());  
          //Print the string  
          String nextin = scan.nextLine();
          System.out.println("String: " +nextin);  
          scan.close();          
          Scanner in = new Scanner(System.in);  
          System.out.println("What is your name?");    
          String name = in.next();
          System.out.println("Hello, "+ name + ". ");                          
          System.out.println("How old are you?");  
          int age = in.nextInt();
          String answer = "Well, now that I have your basic information, let's chat.";
          nextin = scan.nextLine();
          if (nextin.contains("Who are you") || nextin.contains("who are you")){
            answer = "A poorly made chat bot, I said that didn't I?";
          }
          System.out.println(answer);
  }
}