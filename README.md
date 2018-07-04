# Strategy Steak :fork_and_knife:
Within this project you can find an example of the Strategy design pattern.

## How it works
The user/client is in control of which [Strategy](./src/main/java/cooking/steaks/SteakStrategy.java) is executed by the
[Chef](./src/main/java/cooking/Chef.java), which ultimately means how they want their steak cooked. The options are as
follows:
* [Medium Rare](./src/main/java/cooking/steaks/MediumRareStrategy.java)
* [Rare](./src/main/java/cooking/steaks/RareStrategy.java)

An example is shown below
```java
// Create chef
Chef gordon = new Chef();

// Cook the steak, specifying the strategy (will output "Cooking steak medium-rare...")
gordon.cook(new MediumRareStrategy(new Console()));
```
## Running the tests
In the project root, run the [tests](./src/test/java/ChefShould.java) by running the below:

    $ ./gradlew test