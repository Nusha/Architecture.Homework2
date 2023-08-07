package poster_memento;

public class Event {
    private String name;
    private String date;
    private String venue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public EventMemento saveToMemento(){
        // Saves the current state to memento
        return new EventMemento(this.name, this.date, this.venue);
    }

    public void restoreFromMemento(EventMemento memento){
        // Restores state from memento
        this.name = memento.getName();
        this.date = memento.getDate();
        this.venue = memento.getVenue();
    }
}
