package pizzamaker_temlate;

public class Main {
    public static void main(String[] args) {
        Pizza cheesePizza = new CheesePizza();
        cheesePizza.preparePizza();

        System.out.println("\n========= Следующая пицца ==========\n");

        Pizza pepperoniPizza = new PepperoniPizza();
        pepperoniPizza.preparePizza();
    }
}
