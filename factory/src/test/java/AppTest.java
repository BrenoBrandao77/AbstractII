import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void test(){
        KingdomFactory kingdomFactory = new OrcKingdomFactory();

    }
    class AlunoTest {

        @Test
        void deveConferirKing() {
            King king = new ElfKing();
            App app = new App(king);
            assertEquals("Conferir KING", king.getDescription());
        }

        @Test
        void deveConferircastle() {
            Castle castle = new ElfCastle();
                    App app = new App((King) castle);
            assertEquals("Conferir Castelo", castle.getCastle());
        }
}