import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a name: ");
    String name = input.nextLine();
    if (name.charAt(0)=='A'){
      System.out.println(" oh, Cool. My name startes with an A too.");
  }else{
    System.out.println("oh, our names start with differnt letters.");
     }
    }
  }