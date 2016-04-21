// import java.util.Map;
// import java.util.HashMap;
import java.util.ArrayList;

public class CoinCombinations {

  public static ArrayList<Object> runCoinCombination(double inputAmount) {
    ArrayList<Object> changeArray = new ArrayList<Object>();
    // Integer change = userInput;
    // String quarters = new String();
    // String dimes = new String();
    // String nickels = new String();
    // String pennies = new String();
    //
    String quarters = 0

    while ( change > .25 ) {
    quarters += 1;
    return quarters;
    }
    // } while ( change > .10 ) {
    //   dimes + 1;
    // } while ( change > .5 ) {
    //   nickels + 1;
    // } while (change > 0 ) {
    //   pennies + 1;
    // }
    changeArray.add(inputAmount);
    return changeArray;
  }
}
