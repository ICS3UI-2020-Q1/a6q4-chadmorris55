import java.util.Scanner;
/**
 * 
 * @Chad 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates Scanner for user input
    Scanner input = new Scanner(System.in);
    
    //creates two 3 element arrays
    int [] firstVector = new int [3];
    int [] secondVector = new int [3];
    //asks user to input numbers and records them
    System.out.println("Please enter the 3 values for the first vector");
    for (int i = 0; i < firstVector.length; i++){
      firstVector[i] = input.nextInt();
    }
    System.out.println("Please enter the 3 values for the second vector");
    for (int i = 0; i < secondVector.length; i++){
      secondVector[i] = input.nextInt();
    }
    //adds the vector 1-3 together for both
    int sumOne = firstVector[0] * secondVector[0];
    int sumTwo = firstVector[1] * secondVector[1];
    int sumThree = firstVector[2] * secondVector[2];
    int sumTotal = sumOne + sumTwo + sumThree;
    System.out.println("The dot product is " + sumTotal);
  }
}
