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

    @Test
    public void testPing() {
        ToDoController controller = new ToDoController();
        String result = controller.ping();
        String expectedResponse = "{ \"status\": \"ok\", \"userId\": \"admin\", \"languageCode\": \"de\",\"version\": \"0.0.1\"}";
        Assertions.assertEquals(expectedResponse, result);
    }

    @Test
    public void testGetTodo() {
        ToDoController controller = new ToDoController();
        controller.init(); // Initialize todos

        ToDo todo = controller.getTodo(1);

        // Assert
        Assertions.assertEquals(1, todo.getId());
        Assertions.assertEquals("Neuer Job", todo.getTitle());
        Assertions.assertEquals("5 DevOps Engineers einstellen", todo.getDescription());

    }

    @Test
    public void testCreateTodo() {
        ToDoController controller = new ToDoController();
        ToDo todo = new ToDo(1, "Test Todo", "This is a test todo");

        controller.createTodo(todo);
        ToDo createdTodo = controller.getTodo(1);

        Assertions.assertEquals(1, createdTodo.getId());
        Assertions.assertEquals("Test Todo", createdTodo.getTitle());
        Assertions.assertEquals("This is a test todo", createdTodo.getDescription());

    }

    @Test
    public void testDeleteTodo() {
        ToDoController controller = new ToDoController();
        controller.init(); 

        ToDo deletedTodo = controller.deleteTodo(3);

        Assertions.assertEquals(3, deletedTodo.getId());
        Assertions.assertNull(controller.getTodo(3));
    }

}
