package ch.zhaw.iwi.devops.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ToDoControllerTest {
    
    @Test
    public void testCreate() {
        ToDoController controller = new ToDoController();
        var todo = new ToDo(1, "t", "d");
        controller.createTodo(1, todo);
        assertEquals(1, controller.count());
        assertEquals(1, controller.todo().size());
    }

    @Test
    public void testTest() {
        ToDoController controller = new ToDoController();
        //String result = controller.test();
        assertEquals("ToDo app is up and running!", controller.test());
    }

    /*@Test
    public void testCreateTodo() {
        ToDoController controller = new ToDoController();
        ToDo todo = new ToDo(1, "Test Todo", "This is a test todo");

        controller.createTodo(todo);
        ToDo createdTodo = controller.getTodo(1);

        Assertions.assertEquals(1, createdTodo.getId());
        Assertions.assertEquals("Test Todo", createdTodo.getTitle());
        Assertions.assertEquals("This is a test todo", createdTodo.getDescription());

    }*/

}
