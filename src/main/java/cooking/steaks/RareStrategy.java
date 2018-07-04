package cooking.steaks;

import cooking.output.Console;

public class RareStrategy implements SteakStrategy {

    private final Console console;

    public RareStrategy(Console console) {
        this.console = console;
    }

    @Override
    public void cook() {
        this.console.print("Cooking steak rare...");
    }
}
