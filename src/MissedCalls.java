
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class MissedCalls {
    private Map<LocalDateTime, String> missedCalls = new TreeMap<LocalDateTime, String>();


    public void printMissedCalls(Contacts contacts) {
        System.out.println("Список пропущенных вызовов");
        for (Map.Entry<LocalDateTime, String> entry : missedCalls.entrySet()) {
            String now = entry.getKey().format(DateTimeFormatter.
                    ofPattern("dd MMM yyyy  HH::mm::ss"));
            Contact target = contacts.getContacts(entry.getValue());
            if (target == null) {
                System.out.println(now + "  номер телефона  " + entry.getValue());
            } else {
                System.out.println(now + "  номер телефона  "+ entry.getValue()+" " + target );

            }

        }
    }



    public void putMissedCalls(LocalDateTime now, String value) {missedCalls.put(now, value); }



    public void clear() {
        missedCalls.clear();
    }

    @Override
    public String toString() {
        return "MissedCalls{" +
                "missedCalls=" + missedCalls ;
    }
}
