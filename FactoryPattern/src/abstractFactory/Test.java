package abstractFactory;

import java.lang.reflect.InvocationTargetException;

public class Test {
  public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, ClassNotFoundException {
    PizzaStore nyStore = new NYPizzaStore();
    PizzaStore chicagoStore = new ChicagoPizzaStore();
    Pizza pizza = nyStore.orderPizza(PizzaType.CHEESE);
    System.out.println("Ethan ordered a " + pizza + "\n");
    pizza = chicagoStore.orderPizza(PizzaType.CHEESE);
    System.out.println("Ethan ordered a " + pizza + "\n");

    pizza = nyStore.orderPizza(PizzaType.CLAM);
    System.out.println("Ethan ordered a " + pizza + "\n");
    pizza = chicagoStore.orderPizza(PizzaType.CLAM);
    System.out.println("Ethan ordered a " + pizza + "\n");

    pizza = nyStore.orderPizza(PizzaType.PEPPERONI);
    System.out.println("Ethan ordered a " + pizza + "\n");
    pizza = chicagoStore.orderPizza(PizzaType.PEPPERONI);
    System.out.println("Ethan ordered a " + pizza + "\n");

    pizza = nyStore.orderPizza(PizzaType.VEGGIE);
    System.out.println("Ethan ordered a " + pizza + "\n");
    pizza = chicagoStore.orderPizza(PizzaType.VEGGIE);
    System.out.println("Ethan ordered a " + pizza + "\n");
  }
}
