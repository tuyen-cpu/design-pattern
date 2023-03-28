package abstractFactory;

import java.lang.reflect.InvocationTargetException;

public abstract class PizzaStore {
  protected abstract Pizza createPizza(PizzaType type) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, ClassNotFoundException;

  public Pizza orderPizza(PizzaType type) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
    Pizza pizza = createPizza(type);
    System.out.println("--- Making a " + pizza.getName() + " ---");
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }
}
