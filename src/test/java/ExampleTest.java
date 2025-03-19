import domain.Student;
import service.Service;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Tag("ExamplePack")
class ExampleTest {

    @Test
    void exampleTestCase() {
        System.out.println("Running an example test...");
        assertTrue(true, "Example assertion passed");
    }

    @Test
    void addStudentTestCase() {
        System.out.println("addStudentTestCase incoming...");

        System.out.println("Testing unicity of IDs:");
        Student Alex = new Student("9", "Alex", 222);
        Student Joe = new Student("9", "Joe", -1);
        assertEquals(Alex.getID(), Joe.getID(), "IDs should not be equal");

        System.out.println("Testing if group number is integer:");
        assertNotEquals("a", Alex.getGrupa(), "Group number should be integer");

        System.out.println("Testing if group number is positive:");
        assertTrue(Alex.getGrupa() > 0, "Group number should be positive");    }
}
