
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import org.junit.Test;




public class ExerciseManagementTest {

    @Test
    public void exerciseListEmptyAtBeginning() {
        ExerciseManagement management = new ExerciseManagement();
        assertEquals(0, management.exerciseList().size());
    }
    
    @Test
    public void addingExerciseGrowsListByOne() {
        ExerciseManagement management = new ExerciseManagement();
        management.add("Write a test");
        assertEquals(1, management.exerciseList().size());
    }
    
    @Test
    public void addedExerciseIsInList() {
        ExerciseManagement management = new ExerciseManagement();
        management.add("Write a test");
        assertTrue(management.exerciseList().contains("Write a test"));
    }
    
    @Test
    public void exerciseCanBeMardkerAsCompleted() {
        ExerciseManagement management = new ExerciseManagement();
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        assertTrue(management.isCompleted("New exercise"));
    }
    
    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {
        ExerciseManagement management = new ExerciseManagement();
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        assertFalse(management.isCompleted("exercise"));
    }
    
    
}
