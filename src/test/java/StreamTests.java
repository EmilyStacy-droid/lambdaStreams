import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StreamTests {
    @Test
    void filterOutAdults() {
        List<Person> peeps = createPeople();

        List<Person> kids = peeps.stream().filter(p -> p.getAge() < 18).collect(Collectors.toList());

        assertEquals(1,kids.size());
        assertEquals("Anna",kids.get(0).getName());
    }

    @Test
    void getAllNames() {
        List<Person> peeps = createPeople();
        List<String> names = peeps.stream().map(pr -> pr.getName()).collect(Collectors.toList());

        assertEquals(peeps.size(),names.size());
        assertEquals("Alex",names.get(0));
        assertEquals("Anna",names.get(2));
    }

    private List<Person> createPeople() {
        List<Person> peeps = new ArrayList<>();
        peeps.add(new Person("Alex", 30));
        peeps.add(new Person("Emily", 32));
        peeps.add(new Person("Anna", 3));
        peeps.add(new Person("Carter", 18));
        peeps.add(new Person("John", 90));
        return peeps;
    }
}
