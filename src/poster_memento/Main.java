package poster_memento;

public class Main {
    public static void main(String[] args) {
        Event event = new Event();
        CareTaker careTaker = new CareTaker();

        event.setName("Новый Год");
        event.setDate("31/12/2023");
        event.setVenue("Центральная площадь");
        careTaker.saveMemento(event.saveToMemento());

        // Модифицируем мероприятие
        event.setDate("01/01/2024");

        // Отменяем изменения
        event.restoreFromMemento(careTaker.getLastSavedMemento());
    }
}
