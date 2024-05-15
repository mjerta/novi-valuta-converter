import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // this variables are used in the switch case below
    double currentExchange;

    double euroPrice;
    double dollarPrice;
    double japaneseYenPrice;
    double britishPoundPrice;
    double bitCoinPrice;

    // Instance of scanner Class to read out prompt value
    Scanner input =  new Scanner(System.in);

    // answers of prompt
    int answerChoise;
    double inputAmmount;
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
        answerChoise = input.nextInt();
        if (answerChoise >= 1 && answerChoise <= 8) {
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


    switch (answerChoise) {
      case 1:
        while (true) {
          try {

            System.out.println("1: Euro to Dollar");
            currentExchange = 1.0822;
            System.out.println("What ammount you want to exchange?");
            inputAmmount = input.nextDouble();
            dollarPrice = inputAmmount * currentExchange;
            System.out.println("$" + dollarPrice + " for € " + inputAmmount);
            break;
          } catch (InputMismatchException e) {
            System.out.println("This is not a valid number");
            input.nextLine(); // clear the scanner value
          }
        }
        break;
      case 2:
        while (true) {
          try {
            System.out.println("2: Dollar to Euro");
            currentExchange = 1.0822;
            System.out.println("What ammount you want to exchange?");
            inputAmmount = input.nextDouble();
            euroPrice = inputAmmount / currentExchange;
            System.out.println("€" + euroPrice + " for $ " + inputAmmount);
            break;
          } catch (InputMismatchException e) {
            System.out.println("This is not a valid number");
            input.nextLine(); // clear the scanner value
          }
        }
        break;
      case 3:
        while (true) {
          try {
              System.out.println("3: Euro to Japanese Yen");
              currentExchange = 169.265;
              System.out.println("What ammount you want to exchange?");
              inputAmmount = input.nextDouble();
              japaneseYenPrice = inputAmmount * currentExchange;
              System.out.println("¥" + japaneseYenPrice + " for € " + inputAmmount);
              break;
            } catch (InputMismatchException e) {
              System.out.println("This is not a valid number");
              input.nextLine(); // clear the scanner value
          }
        }
        break;
      case 4:
        while (true) {
          try {
            System.out.println("4: Japanase Yen to Dollar");
            currentExchange = 169.265;
            System.out.println("What ammount you want to exchange?");
            inputAmmount = input.nextDouble();
            euroPrice = inputAmmount / currentExchange;
            System.out.println("€" + euroPrice + " for ¥ " + inputAmmount);
            break;
          } catch (InputMismatchException e) {
            System.out.println("This is not a valid number");
            input.nextLine(); // clear the scanner value
          }
        }
        break;
      case 5:
        while(true) {
          try {
            System.out.println("5: Euro to British Pound");
            currentExchange = 0.8593;
            System.out.println("What ammount you want to exchange?");
            inputAmmount = input.nextDouble();
            britishPoundPrice = inputAmmount * currentExchange;
            System.out.println("£" + britishPoundPrice + " for € " + inputAmmount);
          break;
          } catch (InputMismatchException e) {
            System.out.println("This is not a valid number");
            input.nextLine(); // clear the scanner value
          }
        }
        break;
      case 6:
        while (true) {
          try {
            System.out.println("6: British Pound to Euro");
            currentExchange = 0.8593;
            System.out.println("What ammount you want to exchange?");
            inputAmmount = input.nextDouble();
            euroPrice = inputAmmount / currentExchange;
            System.out.println("€" + euroPrice + " for £ " + inputAmmount);
          break;
          } catch (InputMismatchException e) {
            System.out.println("This is not a valid number");
            input.nextLine(); // clear the scanner value
          }
        }
        break;
      case 7:
        while (true) {
          try {
            System.out.println("7: Euro to Bitcoin");
            currentExchange = 56981.56;
            System.out.println("What ammount you want to exchange?");
            inputAmmount = input.nextDouble();
            bitCoinPrice = inputAmmount / currentExchange;
            System.out.println("btc " + bitCoinPrice + " for € " + inputAmmount);
          break;
          } catch (InputMismatchException e) {
            System.out.println("This is not a valid number");
            input.nextLine(); // clear the scanner value
          }
        }
        break;
      case 8:
        while (true) {
          try {
            System.out.println("8: Bitcoin to Euro");
            currentExchange = 56981.56;
            System.out.println("What ammount you want to exchange?");
            inputAmmount = input.nextDouble();
            euroPrice = inputAmmount * currentExchange;
            System.out.println("€" + euroPrice + " for btc " + inputAmmount);
            break;
          } catch (InputMismatchException e) {
            System.out.println("This is not a valid number");
            input.nextLine(); // clear the scanner value
          }
        }
        break;
      default:
        System.out.println("Default case, should not be reached");
        break;
    }
    input.close(); // Closing the scanner

  }

}
