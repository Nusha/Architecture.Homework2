package pizzamaker_temlate;

public abstract class Pizza {
    final void preparePizza() {
        prepareDough();
        addToppings();
        bake();
        cut();
        box();
    }

    abstract void prepareDough();
    abstract void addToppings();

    void bake() {
        System.out.println("Выпекание 25 мин при температуре 350");
    }

    void cut() {
        System.out.println("Резка пиццы на куски");
    }

    void box() {
        System.out.println("Положить пиццу в коробку");
    }
}
