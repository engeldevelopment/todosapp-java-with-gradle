package todosweb.entities;

import todosweb.exceptions.TaskWasDoneException;

public class Task {
    private String name;
    private boolean done;

    public Task(String name) {
        this.name = name;
        this.done = false;
    }

    public boolean isDone() {
        return this.done;
    }

    public void markAsDone() throws TaskWasDoneException {
        if (this.isDone()) {
            throw new TaskWasDoneException();
        }
        this.done = true;
    }
}
