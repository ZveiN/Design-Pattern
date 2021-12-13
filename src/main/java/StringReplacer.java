import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringReplacer implements StringTransformer{

    char ch1, ch2;

    public StringReplacer(char ch1, char ch2) {
        this.ch1 = ch1;
        this.ch2 = ch2;
    }

    @Override
    public void execute(StringDrink drink) {
        drink.setText(drink.getText().replace(ch1, ch2));
    }
}
