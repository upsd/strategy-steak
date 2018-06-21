package cooking.steaks;

public class MediumRareStrategy implements SteakStrategy {

    @Override
    public void cook() {
        System.out.print("Cooking steak medium-rare...");
    }
}
