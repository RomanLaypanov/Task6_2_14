public class Salary extends Sample<Integer> {
    public Salary(String from, String to, int salary) {
        super(from, to, salary);
    }

    public int getSalary() {
        return sample;
    }
}
