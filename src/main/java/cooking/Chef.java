package cooking;

import cooking.steaks.SteakStrategy;

public class Chef {

    public void cook(SteakStrategy steakPreference) {
        steakPreference.cook();
    }
}
