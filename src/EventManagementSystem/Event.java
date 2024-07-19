package EventManagementSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Event {
    private String name;
    private LocalDate date;
    private List<Participant> participants;

    public Event(String name, LocalDate date){
        this.name = name;
        this.date = date;
        this.participants = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void addParticipant(Participant participant){
        participants.add(participant);
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", participants=" + participants +
                '}';
    }


}
