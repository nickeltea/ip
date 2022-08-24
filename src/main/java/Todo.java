public class Todo extends Task {

    /**
     * A constructor that creates an instance of Todo.
     *
     * It takes in the description of the task.
     *
     * @param description The description of the task.
     * @throws DukeException
     */
    public Todo(String description) throws DukeException {
        super(description);
        if (description.length() == 0) {
            throw new DukeException("☹ OOPS!!! The description of a todo cannot be empty.");
        }
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }

    @Override
    public String toStore() {
        return "T" + super.toStore();
    }
}
