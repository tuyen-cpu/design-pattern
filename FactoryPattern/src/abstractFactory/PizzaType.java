package abstractFactory;

public enum PizzaType {

  CHEESE {
    @Override
    public Pizza get(PizzaIngredientFactory pizzaIngredientFactory) {
     return new CheesePizza(pizzaIngredientFactory);
    }
  },
  VEGGIE {
    @Override
    public Pizza get(PizzaIngredientFactory pizzaIngredientFactory) {
     return new VeggiePizza(pizzaIngredientFactory);
    }
  },
  CLAM {
    @Override
    public Pizza get(PizzaIngredientFactory pizzaIngredientFactory) {
      return new ClamPizza(pizzaIngredientFactory);
    }
  },
  PEPPERONI {
    @Override
    public Pizza get(PizzaIngredientFactory pizzaIngredientFactory) {
      return new PepperoniPizza(pizzaIngredientFactory);
    }
  };
  public abstract Pizza get(PizzaIngredientFactory pizzaIngredientFactory);
}
