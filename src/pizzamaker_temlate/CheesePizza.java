package pizzamaker_temlate;

public class CheesePizza extends Pizza {
    void prepareDough() {
        System.out.println("Приготовить тесто с добавлением сыра");
    }

    void addToppings() {
        System.out.println("Добавить моцареллу и чеддер");
    }
}