package EventManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private List<Event> events;

    public EventManager(){
        this.events = new ArrayList<>();
    }

    public void addEvent(Event event){
        events.add(event);
    }

    public List<Event> getEvents(){
        return events;
    }

    public void removeEvent(Event event){
        events.remove(event);
    }

    public Event findEventByName(String name){
        for (Event event : events){
            if (event.getName().equals(name)){
                return event;
            }
        }
        return null;
    }





}
