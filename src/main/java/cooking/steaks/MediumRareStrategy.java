package cooking.steaks;

import cooking.output.Console;

public class MediumRareStrategy implements SteakStrategy {

    private final Console console;

    public MediumRareStrategy(Console console) {
        this.console = console;
    }

    @Override
    public void cook() {
        console.print("Cooking steak medium-rare...");
    }
}
