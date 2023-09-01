public class Todo extends Task {
    private boolean isDone;

    public Todo(String description) {
        super(description);
        this.isDone = false;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        this.isDone = done;
    }
}
