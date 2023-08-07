package poster_memento;
import java.util.Stack;

public class CareTaker {
    private Stack<EventMemento> mementos = new Stack<>();

    public void saveMemento(EventMemento m){
        mementos.push(m);
    }

    public EventMemento getLastSavedMemento(){
        return mementos.pop();

    }
}
