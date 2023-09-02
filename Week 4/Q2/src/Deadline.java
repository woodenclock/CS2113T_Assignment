public class Deadline extends Todo {

    protected String by;

    public Deadline(String description, String by) {
        super(description);
        this.by = by;
    }

    @Override
    public String toString() {
        String doneToDo = super.toString();
        return String.format("%s\ndo by: %s", doneToDo, by);
    }

    public void setBy(String by) {
        this.by = by;
    }

    public String getBy() {
        return by;
    }
}