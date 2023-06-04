package ch.zhaw.iwi.devops.demo;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonControllerTest {
    
    
    @Test
    public void getPersonTest() {
        PersonController personController = new PersonController();
        personController.init();
        Integer id = 1;
        String expectedName = "Barack Obama";
        
        Person person = personController.getPerson(id);

        Assertions.assertEquals(expectedName, person.getName());
    }

    
    @Test
    public void testGetAllPerson() {
        
        PersonController personController = new PersonController();
        personController.init();

        Map<Integer, Person> expectedPersons = new HashMap<>();
        expectedPersons.put(1, new Person(1, "Barack Obama"));
        expectedPersons.put(2, new Person(2, "Donald Trump"));
        expectedPersons.put(3, new Person(3, "Joe Biden"));

        Map<Integer, Person> actualPersons = personController.getAllPerson();

        Assertions.assertEquals(expectedPersons.size(), actualPersons.size());
        
        for (Integer id : expectedPersons.keySet()) {
            Assertions.assertTrue(actualPersons.containsKey(id));
            Assertions.assertEquals(expectedPersons.get(id).getId(), actualPersons.get(id).getId());
            Assertions.assertEquals(expectedPersons.get(id).getName(), actualPersons.get(id).getName());
        }
    }

    @Test
    public void testCreatePerson(){  
        PersonController personController = new PersonController();
        personController.init();

        Person newPerson = new Person(4, "Angela Merkel");

        personController.createPerson(newPerson);
        Person retrievedPerson = personController.getPerson(4);

        Assertions.assertEquals(newPerson.getId(), retrievedPerson.getId());
        Assertions.assertEquals(newPerson.getName(), retrievedPerson.getName());
    }

    @Test
    public void testUpdatePerson() {
        PersonController personController = new PersonController();
        personController.init();

        Integer id = 1;
        Person updatedPerson = new Person(id, "Updated Name");


        personController.updatePerson(id, updatedPerson);
        Person retrievedPerson = personController.getPerson(id);


        Assertions.assertEquals(updatedPerson.getId(), retrievedPerson.getId());
        Assertions.assertEquals(updatedPerson.getName(), retrievedPerson.getName());
    }

    @Test
    public void testDeletePerson() {
        PersonController personController = new PersonController();
        personController.init();

        Integer id = 1;
        Person deletedPerson = personController.deletePerson(id);
        Person retrievedPerson = personController.getPerson(id);

        Assertions.assertEquals(id, deletedPerson.getId());
        Assertions.assertNull(retrievedPerson);
    }
    
}
