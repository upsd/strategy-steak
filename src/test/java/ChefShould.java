import cooking.Chef;
import cooking.output.Console;
import cooking.steaks.MediumRareStrategy;
import cooking.steaks.RareStrategy;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ChefShould {

    private Console console = mock(Console.class);

    @Test
    public void cookSteakMediumRare() {
        Chef gordon = new Chef();
        gordon.cook(new MediumRareStrategy(console));

        verify(console).print("Cooking steak medium-rare...");
    }

    @Test
    public void cookSteakRare() {
        Chef gordon = new Chef();
        gordon.cook(new RareStrategy(console));

        verify(console).print("Cooking steak rare...");
    }
}