package ua.lviv.ki;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

class LetterFinderTest {

    @Test
    public void testProperEditingOfText() {
        String text = "Here is some testing text : osada,dota,chuvash,osu,tanki";
        InputStream in = new ByteArrayInputStream(text.getBytes());
        System.setIn(in);

        @SuppressWarnings("resource")
        Scanner myScanner = new Scanner(System.in);
        System.out.println(text);

        String result = LetterFinder.replaceWords(myScanner.nextLine(), " ");
        System.out.println(result);
        assertEquals("  is some testing text :  , , ,osu, ", result);
    }

}
