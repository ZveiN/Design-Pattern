import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringDrink {
    private String teste;

    public StringDrink(String teste) {
        this.teste = teste;
    }

     public String getText() {
        return teste;
    }

    void setText(String teste) {
        this.teste = teste;
    }

}