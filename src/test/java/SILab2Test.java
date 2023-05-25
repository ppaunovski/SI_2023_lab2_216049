import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    @Test
    void everyBranchTest(){
        List<User> allUsers = new ArrayList<>();
        allUsers.add(new User("pavel", "password!", "email@email.com"));
        allUsers.add(new User("email@email.com", "password!", "test@test.com"));

        assertAll(
                () -> assertThrows(RuntimeException.class, () -> SILab2.function(null, null)),
                () -> assertFalse(SILab2.function(new User(null, "password*", "email@email.com"), allUsers)),
                () -> assertFalse(SILab2.function(new User("username", "username123", "emailemail.com"), allUsers)),
                () -> assertFalse(SILab2.function(new User("username", "pass word*", "email@emailcom"), allUsers)),
                () -> assertFalse(SILab2.function(new User("username", "password", "email"), allUsers))
        );

    }

    @Test
    void multipleConditionTest(){
        List<User> allUsers = new ArrayList<>();
        allUsers.add(new User("user", "password!", "email@email.com"));

        assertThrows(RuntimeException.class, () -> SILab2.function(null, allUsers));

        assertThrows(RuntimeException.class, () -> SILab2.function(new User("pavel", null, "email@email.com"), allUsers));

        assertThrows(RuntimeException.class, () -> SILab2.function(new User("pavel", "password!!", null), allUsers));

        assertDoesNotThrow(() -> SILab2.function(new User("pavel", "password!!", "email.@email.com"), allUsers));

    }
}
