import cooking.Chef;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import cooking.steaks.MediumRareStrategy;
import cooking.steaks.RareStrategy;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

public class CookingTests {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(System.out);
    }

    @Test
    public void canCookSteakMediumRare() {
        Chef gordon = new Chef();
        gordon.cook(new MediumRareStrategy());

        assertEquals("Cooking steak medium-rare...", outContent.toString());
    }

    @Test
    public void canCookSteakRare() {
        Chef gordon = new Chef();
        gordon.cook(new RareStrategy());

        assertEquals("Cooking steak rare...", outContent.toString());
    }
}