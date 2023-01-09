package lambdafunctionsexample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ToUppercaseExample {
    private final static Logger LOGGER = LogManager.getLogger(ToUppercaseExample.class);
    public static void main(String[] args) {
    Function<List<String>, List<String>> toUppercase = (strings) -> {
        List<String> result = new ArrayList<>();
        for (String s : strings) {
            result.add(s.toUpperCase());
        }
        return result;
    };

    List<String> input = Arrays.asList("a", "b", "c");
    List<String> output = toUppercase.apply(input); // output is ["A", "B", "C"]
    LOGGER.error(output);
    LOGGER.info(output);
    System.out.println(output);
}




}
