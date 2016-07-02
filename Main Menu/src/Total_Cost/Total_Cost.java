/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Total_Cost;

/**
 *
 * @author Collin Kemner
 */
public class Total_Cost {
  Float MealCost;
  
  public Float getMealCost()
  {
      return MealCost;
  }
  
  public Total_Cost()
  {
      MealCost = 0.0f;
  }
  
  public void Meal1Cost(Float Cost)
  {
      MealCost = MealCost + Cost;
  }
  
  public void Meal2Cost(Float Cost)
  {
      MealCost = MealCost + Cost;
  }
  
  
}
