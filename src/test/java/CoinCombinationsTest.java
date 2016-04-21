import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class CoinCombinationsTest {

  @Test
  public void runCoinCombination_shouldReturnArray_ArrayList() {
    CoinCombinations changeTest = new CoinCombinations();
    ArrayList<Object> expected = new ArrayList<Object>();
    expected.add(.1);
    assertEquals(expected, changeTest.runCoinCombination(.1));
  };

  @Test
  public void runCoinCombination_shouldReturnArray_ArrayList() {
    CoinCombinations changeTest = new CoinCombinations();
    ArrayList<Object> expected = new ArrayList<Object>();
    expected.add("quarter");
    expected.add("quarter");
    assertEquals(expected, changeTest.runCoinCombination(.50));
  };

}

// return an array with change amount
// return a penny when amount entered is .01
// return a nickel when amount entered is .05
// return a dime when amount entered is .1
// return a quarter when amount entered is .25
//
