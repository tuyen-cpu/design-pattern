package factory.abstractFactory;

public class ChicagoPizzaStore extends PizzaStore{
  @Override
  protected Pizza createPizza(PizzaType type) {
    PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
    Pizza pizza =type.get(ingredientFactory);
    pizza.setName("Chicago Style "+type.name().substring(0, 1).toUpperCase() + type.name().substring(1).toLowerCase() +" Pizza");
    return pizza;
  }
}
