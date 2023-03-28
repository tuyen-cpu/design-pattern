package abstractFactory;


public class NYPizzaStore extends PizzaStore{

  @Override
  protected Pizza createPizza(PizzaType type) {
    PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
    Pizza pizza=type.get(ingredientFactory);
    pizza.setName("New York "+type.name().substring(0, 1).toUpperCase() + type.name().substring(1).toLowerCase()+" Pizza");
    return pizza;
  }
}
