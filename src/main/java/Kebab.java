import java.util.Arrays;

public class Kebab {
    private Ingredient[] ingredients;

    private static final boolean     VEGGIE = true;
    private static final boolean NOT_VEGGIE = false;
    private static final boolean     PESCETARIAN = true;
    private static final boolean NOT_PESCETARIAN = false;

    public enum Ingredient {
        LETTUCE(VEGGIE, PESCETARIAN), ROCKET(    VEGGIE,     PESCETARIAN), TOMATO(    VEGGIE,     PESCETARIAN),
        ONION  (VEGGIE, PESCETARIAN), LAMB  (NOT_VEGGIE, NOT_PESCETARIAN), BEEF  (NOT_VEGGIE, NOT_PESCETARIAN),
        CHEDDAR(VEGGIE, PESCETARIAN), TUNA  (NOT_VEGGIE,     PESCETARIAN);

        private boolean veggie;
        private boolean pescetarian;

        Ingredient(boolean veggie, boolean pescetarian) {
            this.veggie = veggie;
            this.pescetarian = pescetarian;
        }

        public boolean isVeggie() {
            return veggie;
        }

        public boolean isPescetarian() {
            return pescetarian;
        }
    }

    public Kebab(Ingredient... ingredients) {
        this.ingredients = ingredients;
    }

    public boolean isVeggie() {
        return Arrays.stream(ingredients).allMatch(Ingredient::isVeggie);
    }

    public boolean isPescetarian() {
        return Arrays.stream(ingredients).allMatch(Ingredient::isPescetarian);
    }
}
