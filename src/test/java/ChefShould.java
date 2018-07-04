import cooking.Chef;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import cooking.steaks.MediumRareStrategy;
import cooking.steaks.RareStrategy;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

public class ChefShould {

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
    public void cookSteakMediumRare() {
        Chef gordon = new Chef();
        gordon.cook(new MediumRareStrategy());

        assertEquals("Cooking steak medium-rare...", outContent.toString());
    }

    @Test
    public void cookSteakRare() {
        Chef gordon = new Chef();
        gordon.cook(new RareStrategy());

        assertEquals("Cooking steak rare...", outContent.toString());
    }
}