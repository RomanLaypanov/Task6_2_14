public class MailMessage extends Sample<String> {
    public MailMessage(String from, String to, String content) {
        super(from, to, content);
    }

    public String getContent() {
        return sample;
    }
}
