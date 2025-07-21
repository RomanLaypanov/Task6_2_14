abstract class Sample<T> {
    String from;
    String to;
    T sample;

    public Sample(String from, String to, T sample) {
        this.from = from;
        this.sample = sample;
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }
}
