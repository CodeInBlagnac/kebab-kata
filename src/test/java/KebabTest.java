import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(Enclosed.class)
public class KebabTest {
    public static class isVeggie {
        @Test public void default_should_be_vegetarian() {
            assertTrue(new Kebab().isVeggie());
        }

        @Test public void should_return_true_if_only_cheddar() {
            assertTrue(new Kebab(Kebab.Ingredient.CHEDDAR).isVeggie());
        }

        @Test public void should_return_false_if_only_boeuf() {
            assertFalse(new Kebab(Kebab.Ingredient.BEEF).isVeggie());
        }

        @Test public void should_return_false_with_oignon_and_boeuf() {
            assertFalse(new Kebab(Kebab.Ingredient.ONION, Kebab.Ingredient.BEEF).isVeggie());
        }
    }

    public static class isPescetarian {
        @Test public void should_be_pescetarian_with_oignon_and_thon() {
            assertTrue(new Kebab(Kebab.Ingredient.ONION, Kebab.Ingredient.TUNA).isPescetarian());
        }

        @Test public void should_not_be_pescetarian_with_oignon_and_boeuf() {
            assertFalse(new Kebab(Kebab.Ingredient.ONION, Kebab.Ingredient.BEEF).isPescetarian());
        }
    }
}
