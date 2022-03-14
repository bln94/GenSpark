import static org.junit.jupiter.api.Assertions.*;

class DragonCaveTest {

    @org.junit.jupiter.api.Test
    void chooseCave() throws Exception {
        try {
            assertEquals("LOSE", DragonCave.chooseCave("1"));
            assertEquals("WIN", DragonCave.chooseCave("2"));
        } catch(Exception e) {
            System.out.println("Invalid");
        }
    }
}