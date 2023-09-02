public class Todo extends Task {
    protected boolean isDone;

    public Todo(String description) {
        super(description);
        this.isDone = false;
    }

    @Override
    public String toString() {
        String done = (isDone ? "Yes" : "No");
        return String.format("description: %s\nis done? %s", description, done);
    }

    public void setDone(boolean done) {
        this.isDone = done;
    }

    public boolean isDone() {
        return this.isDone;
    }
}