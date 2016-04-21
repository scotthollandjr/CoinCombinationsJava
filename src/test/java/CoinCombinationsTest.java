import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class CoinCombinationsTest {

  @Test
  public void runCoinCombination_shouldReturnQuarters_ArrayList() {
    CoinCombinations changeTest = new CoinCombinations();
    ArrayList<Object> expected = new ArrayList<Object>();
    expected.add("Quarters: " + 2);
    expected.add("Dimes: " + 0);
    expected.add("Nickels: " + 0);
    expected.add("Pennies: " + 0);
    assertEquals(expected, changeTest.runCoinCombination(50));
  };

  @Test
  public void runCoinCombination_shouldReturnDimes_ArrayList() {
    CoinCombinations changeTest = new CoinCombinations();
    ArrayList<Object> expected = new ArrayList<Object>();
    expected.add("Quarters: " + 2);
    expected.add("Dimes: " + 1);
    expected.add("Nickels: " + 0);
    expected.add("Pennies: " + 0);
    assertEquals(expected, changeTest.runCoinCombination(60));
  };

  @Test
  public void runCoinCombination_shouldReturnNickels_ArrayList() {
    CoinCombinations changeTest = new CoinCombinations();
    ArrayList<Object> expected = new ArrayList<Object>();
    expected.add("Quarters: " + 2);
    expected.add("Dimes: " + 1);
    expected.add("Nickels: " + 1);
    expected.add("Pennies: " + 0);
    assertEquals(expected, changeTest.runCoinCombination(65));
  };

  @Test
  public void runCoinCombination_shouldReturnPennies_ArrayList() {
    CoinCombinations changeTest = new CoinCombinations();
    ArrayList<Object> expected = new ArrayList<Object>();
    expected.add("Quarters: " + 2);
    expected.add("Dimes: " + 1);
    expected.add("Nickels: " + 1);
    expected.add("Pennies: " + 1);
    assertEquals(expected, changeTest.runCoinCombination(66));
  };

}

// return an array with change amount
// return a penny when amount entered is .01
// return a nickel when amount entered is .05
// return a dime when amount entered is .1
// return a quarter when amount entered is .25
//
