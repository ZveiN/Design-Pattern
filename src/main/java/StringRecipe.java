import java.util.List;

public class StringRecipe {
    List<StringTransformer> transformers; // recebe uma lista do StringTransformer

    public StringRecipe(List<StringTransformer> transformers) { //construtor
        this.transformers = transformers;
    }

    public void mix(StringDrink drink) {
        for (StringTransformer transformer : transformers)
            transformer.execute(drink);
    }
}
// teste