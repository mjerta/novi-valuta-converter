// All necessary imports
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.List;

public class Main {
  public static void main(String[] args) {
  // Declaring neccessary variable
  // Instance of scanner Class to read out prompt value
    Scanner input =  new Scanner(System.in);
    int answerChoice = firstPrompt(input);
    secondPrompt(answerChoice, input);
  }
  // end of main method



  //  This method is to setup  the first prompt and return a value of int that will be used in the method secondPrompt
  //  It takes in the Scanner variable for reading out the value
  public static int firstPrompt(Scanner input) {
    // this is the value that will be returned and also to process the value is valid.
    int answerChoice;


    // This will always print out and only stops if a valid number and a number between 1 and 8 is prompted
    while (true) {
      // The try catch is used to catch if there is not a valid number being used;
      try {

        System.out.println("Which exchange rate you want to use?");
        System.out.println("1: Euro to Dollar");
        System.out.println("2: Dollar to Euro");
        System.out.println("3: Euro to Japanese Yen");
        System.out.println("4: Japanase Yen to Dollar");
        System.out.println("5: Euro to British Pound");
        System.out.println("6: British Pound to Euro");
        System.out.println("7: Euro to Bitcoin");
        System.out.println("8: Bitcoin to Euro");
        answerChoice = input.nextInt();
        if (answerChoice >= 1 && answerChoice <= 8) {
          break;
        }
        else {
          System.out.println("Please fill in a number between 1 and 8");
        }
      } catch (InputMismatchException e) {
        System.out.println("This is not a valid number");
        input.nextLine(); // clear the scanner value
      }
    }
    return answerChoice;
  }
  // end of firstPrompt method

  // This method does not return anything but takes in 2 variables:
  // The first is for the choise of coversion to use.
  // The second is again to read out the scanner, so you dont need to make a new instance of this; I think :p
  public static void secondPrompt(int answerChoise, Scanner input) {
    switch (answerChoise) {
      case 1:
        System.out.println("1: Euro to Dollar");
        // Here I am calling the method printOutConversion. Where the conversion it is happening and return an array
        // This will be an array of the actual price that has beend converted, and the amount that has been filled in
        // Take not the boolean im using this will be used for choosing the kind of calculation; true for * false for /
        List<Double> output1 = printOutConversion(1.0822, input, true);
        System.out.println("$" + output1.get(0) + " for € " + output1.get(1));
        break;
      case 2:
        System.out.println("2: Dollar to Euro");
        List<Double> output2 = printOutConversion(1.0822, input, false);
        System.out.println("€" + output2.get(0) + " for $ " + output2.get(1));
        break;
      case 3:
        System.out.println("3: Euro to Japanese Yen");
        List<Double> output3 = printOutConversion(169.265, input, true);
        System.out.println("¥" + output3.get(0) + " for € " + output3.get(1));
        break;
      case 4:
        System.out.println("4: Japanase Yen to Dollar");
        List<Double> output4 = printOutConversion(169.265, input, false);
        System.out.println("€" + output4.get(0) + " for ¥ " + output4.get(1));
        break;
      case 5:
        System.out.println("5: Euro to British Pound");
        List<Double> output5 = printOutConversion(0.8593, input, true);
        System.out.println("£" + output5.get(0) + " for € " + output5.get(1));
        break;
      case 6:
        System.out.println("6: British Pound to Euro");
        List<Double> output6 = printOutConversion(0.8593, input, false);
        System.out.println("€" + output6.get(0) + " for £ " + output6.get(1));
        break;
      case 7:
        System.out.println("7: Euro to Bitcoin");
        List<Double> output7 = printOutConversion(56981.56, input, false);
        System.out.println("btc" + output7.get(0) + " for € " + output7.get(1));
        break;
      case 8:
        System.out.println("8: Bitcoin to Euro");
        List<Double> output8 = printOutConversion(56981.56, input, true);
        System.out.println("btc" + output8.get(0) + " for € " + output8.get(1));
        break;
      default:
        System.out.println("Default case, should not be reached");
        break;
    }
    input.close(); // Closing the scanner
  }

  //  This is most difficult method of all the methods.
  //  It is returning an array and it takes in 3 variables.
  //  currentExchange is for  current exchange obviously.
  //  The Scanner input is again for reading out the same scanner instance.
  //  The last boolean is important this lets you know which calculation to use, eighter TRUE for / or FALSE for /
  // The last variable I made so I dont have to write to seperates methods for writing the 2 kinds of calculations.
  public static List<Double> printOutConversion(double currentExchange, Scanner input, boolean chooseOperator)  {
    while (true) {
      try {
        List<Double> results = new ArrayList<>();
        double[] values = {};
        System.out.println("What ammount you want to exchange?");
        double inputAmmount = input.nextDouble();
        double price;
        if(chooseOperator) {
          price = inputAmmount * currentExchange;
        } else {
          price = inputAmmount / currentExchange;
        }
        results.add(price);
        results.add(inputAmmount);
        return results;
      } catch (InputMismatchException e) {
        System.out.println("This is not a valid number");
        input.nextLine(); // clear the scanner value
      }
    }
  }

}
