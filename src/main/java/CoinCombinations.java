import java.util.ArrayList;

public class CoinCombinations {

  public static ArrayList<Object> runCoinCombination(Integer inputAmount) {
    ArrayList<Object> changeArray = new ArrayList<Object>();

    int quarters = 0;
    int dimes = 0;
    int nickels = 0;
    int pennies = 0;
    int change = inputAmount;

      while ( change > 24 ) {
        quarters += 1;
        change -= 25;
      }
      while ( change > 9 ) {
        dimes += 1;
        change -= 10;
      }
      while ( change > 4 ) {
        nickels += 1;
        change -= 5;
      }
      while ( change > 0 ) {
        pennies += 1;
        change -= 1;
      }

    changeArray.add(quarters);
    changeArray.add(dimes);
    changeArray.add(nickels);
    changeArray.add(pennies);
    return changeArray;
  }
}


// } while ( change > .10 ) {
//   dimes + 1;
// } while ( change > .5 ) {
//   nickels + 1;
// } while (change > 0 ) {
//   pennies + 1;
// }
