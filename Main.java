import java.util.*;  
public class Main {
  public static void main(String args[]){                       
          String start = "Hello, This is, Data, I am a poorly made chat bot.";  
          //Create scanner Object and pass string in it  
          Scanner scan = new Scanner(start);  
Scanner reader = new Scanner(System.in);
          //Print the string  
          String nextin = scan.nextLine();
          System.out.println(nextin);  
          scan.close();          
          Scanner in = new Scanner(System.in);  
          System.out.println("What is your name?");    
          String name = in.next();
          System.out.println("Hello, "+ name + ". ");                          
          System.out.println("How old are you?");  
          int age = in.nextInt();
          System.out.println("Well, now that I have your basic information, let's chat.");
          String who = reader.nextLine();
          
          if (who.equals("Who are you") || who.equals("who are you")){
          String a1 = "A poorly made chat bot, I said that didn't I?";
          System.out.println("hello");
          System.out.println(a1);
          }

          String q1 = in.next();

  }
}