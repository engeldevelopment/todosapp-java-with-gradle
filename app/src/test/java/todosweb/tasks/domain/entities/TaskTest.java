package todosweb.tasks.domain.entities;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import todosweb.tasks.domain.exceptions.TaskWasDoneException;


public class TaskTest {
    private Task task;

    @Before
    public void setUp() {
        task = new Task("TDD");
    }

    @Test
    public void testDeberiaEstarPendienteAlCrearla() {
        assertFalse(task.isDone());
    }

    @Test
    public void testDeberiaEstarTerminadaCuandoLaMarque() throws TaskWasDoneException {
        task.markAsDone();

        assertTrue(task.isDone());
    }

    @Test(expected = TaskWasDoneException.class)
    public void testDeberiaDarErrorAlIntentarMarcarUnaTareaTerminada() throws TaskWasDoneException {
        task.markAsDone();

        task.markAsDone();
    }
}
