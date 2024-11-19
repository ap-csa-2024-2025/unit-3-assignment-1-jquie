import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    System.out.println("Give me two numbers");
    Scanner userInput = new Scanner(System.in);
    int x = userInput.nextInt();
    int y = userInput.nextInt();
    Rectangle r1 = new Rectangle (x, y);
    Rectangle r2 = new Rectangle (y, x);
    boolean isRotated = (r1.getLength() == r2.getWidth()) && (r1.getWidth() == r2.getLength()); 
    boolean isCongruent = r1.equals(r2) || isRotated;
    boolean isSimilar = isCongruent || (r1.getLength()/r2.getLength()) == (r1.getWidth()/r2.getWidth());
    System.out.println(isRotated);
    System.out.println(isCongruent);
    System.out.println(isSimilar);
  }
}
