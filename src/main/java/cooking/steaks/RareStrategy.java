package cooking.steaks;

public class RareStrategy implements SteakStrategy {

    @Override
    public void cook() {
        System.out.print("Cooking steak rare...");
    }
}
