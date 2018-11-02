import java.util.*;  
public class Main {
  public static void main(String args[]){                       
          String s = "Hello, This is, Data, I am a poorly made chat bot.";  
          //Create scanner Object and pass string in it  
          Scanner scan = new Scanner(s);  
          //Check if the scanner has a token  
          System.out.println("Boolean Result: " + scan.hasNext());  
          //Print the string  
          System.out.println("String: " +scan.nextLine());  
          scan.close();          
          Scanner in = new Scanner(System.in);  
          System.out.print("What is your Name?");    
<<<<<<< HEAD
          String name = in.next();
          System.out.print("Hello"+" "+ name + " ");              
          System.out.print("How old are you?");  
=======
          String name = in.next();              
          System.out.print("How old are you, "+name+"?");  
>>>>>>> 1f05033c27c113babe53cdebe621927b2498e6e1
          int age = in.nextInt();            
          in.close();  
  }
}
