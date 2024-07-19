package EventManagementSystem;

import java.time.LocalDate;

public class Start {
    public void start(){
        EventManager eventManager = new EventManager();
        ConsoleUI consoleUI = new ConsoleUI();

        while (true) {
            consoleUI.showMessage("1. Add Event\n2. List Events\n3. Add Participant to Event\n4. Exit");
            String choice = consoleUI.getInput("Choose an option: ");

            switch (choice) {
                case "1":
                    String eventName = consoleUI.getInput("Enter event name: ");
                    LocalDate date = null;
                    while (date == null) {
                        String eventDate = consoleUI.getInput("Enter event date (dd-MM-yyyy): ");
                        date = DateUtil.parseDate(eventDate);
                        if (date == null) {
                            consoleUI.showMessage("Invalid date format. Please enter the date in dd-MM-yyyy format.");
                        }
                    }
                    Event event = new Event(eventName, date);
                    eventManager.addEvent(event);
                    consoleUI.showMessage("Event added.");
                    break;
                case "2":
                    for (Event e : eventManager.getEvents()) {
                        consoleUI.showMessage(e.toString());
                    }
                    break;
                case "3":
                    String searchEventName = consoleUI.getInput("Enter event name to add participant: ");
                    Event searchEvent = eventManager.findEventByName(searchEventName);
                    if (searchEvent != null) {
                        String participantName = consoleUI.getInput("Enter participant name: ");
                        String participantEmail = consoleUI.getInput("Enter participant email: ");
                        Participant participant = new Participant(participantName, participantEmail);
                        searchEvent.addParticipant(participant);
                        consoleUI.showMessage("Participant added.");
                    } else {
                        consoleUI.showMessage("Event not found.");
                    }
                    break;
                case "4":
                    consoleUI.showMessage("Exiting...");
                    return;
                default:
                    System.out.println("Please enter a valid input.");

            }


        }
    }
}
