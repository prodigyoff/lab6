package ua.lviv.ki;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LetterFinder {

    public static String replaceWords(String inputText, String replacement) {

        String requiredLetters = "\\w*[AaOrK]\\w*";

        Pattern pattern = Pattern.compile(requiredLetters);
        Matcher matcher = pattern.matcher(inputText);
        return matcher.replaceAll(replacement);
    }

}
