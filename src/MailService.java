import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Object> {
    private final Map<String, List<T>> mailBox = new HashMap<>();

    @Override
    public void accept(Object obj) {
        if (obj instanceof MailMessage) {
            MailMessage message = (MailMessage) obj;
            processMailMessage(message);
        } else if (obj instanceof Salary) {
            Salary salary = (Salary) obj;
            processSalary(salary);
        }
    }

    private void processMailMessage(MailMessage message) {
        addToMailbox(message.getTo(), (T) message.getContent());
    }

    private void processSalary(Salary salary) {
        addToMailbox(salary.getTo(), (T) Integer.valueOf(salary.getSalary()));
    }

    private <U extends T> void addToMailbox(String recipient, U content) {
        mailBox.computeIfAbsent(recipient, key -> new ArrayList<>()).add(content);
    }

    public Map<String, List<T>> getMailBox() {
        return Collections.unmodifiableMap(mailBox);
    }
}
