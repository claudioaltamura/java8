package de.claudioaltamura.java8.stream.other;

import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * From http://www.adam-bien.com/roller/abien/entry/java_8_reducing_a_list
 */
public class CsvStreamTest {

    @Test
    public void listToString() {
        List<String> mascots = new ArrayList<>();
        mascots.add("duke");
        mascots.add("juggy");

        String expected = "duke,juggy";
//        String actual = mascots.stream().
//                reduce((t, u) -> t + "," + u).
//                get();
//        assertThat(actual, is(expected));
    }
}