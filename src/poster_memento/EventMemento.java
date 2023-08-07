package poster_memento;

public class EventMemento {
    private String name;
    private String date;
    private String venue;

    public EventMemento(String name, String date, String venue){
        this.name = name;
        this.date = date;
        this.venue = venue;
    }

    // getters
    public String getName(){ return name;}
    public String getDate(){ return date;}
    public String getVenue(){ return venue;}
}
