import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest {

    @Test
    public void matchesSimpleTask() {
        SimpleTask task = new SimpleTask(12, "кот в сапогах");

        boolean result = task.matches("дом");
        boolean result1 = task.matches("сапог");

        Assertions.assertFalse(result);
        Assertions.assertTrue(result1);
        Assertions.assertEquals(false, result);
        Assertions.assertEquals(true, result1);


    }

    @Test
    public void matchesMeeting() {
        Meeting task = new Meeting(2, "учеба", "школа", "1 сентября 2023");

        boolean result = task.matches("учеба");
        //Assertions.assertTrue(result); //можно сравнить таким способом
        Assertions.assertEquals(true, result);

        boolean result1 = task.matches("отдых");
        //Assertions.assertFalse(result1); //можно сравнить таким способом
        Assertions.assertEquals(false, result1);

    }

    @Test
    public void matchesEpic() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб", "Вода"};
        Epic task = new Epic(5, subtasks);

        boolean result = task.matches("Хлеб");
        //Assertions.assertTrue(result); //можно сравнить таким способом
        Assertions.assertEquals(true, result);

        boolean result1 = task.matches("хлеб");
        //Assertions.assertFalse(result1); //можно сравнить таким способом
        Assertions.assertEquals(false, result1);

    }

}
