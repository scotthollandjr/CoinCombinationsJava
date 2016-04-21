import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.ArrayList;

public class App {

  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/results", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/results.vtl");

      String inputString = request.queryParams("userInput");
      Integer inputAmount = Integer.parseInt(inputString);

      CoinCombinations newChange = new CoinCombinations();
      ArrayList<Object> resultsArray = newChange.runCoinCombination(inputAmount);
      Object[] stringArray = resultsArray.toArray();

      Object quarterResults = stringArray[0];
      Object dimeResults = stringArray[1];
      Object nickelResults = stringArray[2];
      Object pennyResults = stringArray[3];

      model.put("inputAmount", inputAmount);
      model.put("quarterResults", quarterResults);
      model.put("dimeResults", dimeResults);
      model.put("nickelResults", nickelResults);
      model.put("pennyResults", pennyResults);

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
