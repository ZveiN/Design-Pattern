import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringDrink {

    public StringDrink(String teste) {
    }

    @Test
    public void stringDrink(String s){
        StringDrink drink = new StringDrink("ABCD");
        assertEquals("ABCD", drink.getText());
        drink.setText("DCBA");
        assertEquals("DCBA", drink.getText());
    }

    double getText() {
        return 0;
    }

    private void setText(String teste) {
    }

}