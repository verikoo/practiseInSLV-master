package lambdafunctionsexample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;
import java.util.function.Function;

public class SquareOfIntegersExample {
    private final static Logger LOGGER = LogManager.getLogger(SquareOfIntegersExample.class);
    public static void main(String[] args) {
        Function<List<Integer>, Map<Integer, Integer>> squares = (numbers) -> {
            Map<Integer, Integer> result = new HashMap<>();
            for (int n : numbers) {
                result.put(n, n * n);
            }
            return result;
        };

        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9 ,10);
        Map<Integer, Integer> output = squares.apply(input);
        LOGGER.error(output);
        System.out.println(output);
    }




}
