package by.it.chaikova.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA1 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder(Poem.text);
        Pattern pattern = Pattern.compile("[а-яА-яёЁ]{4,}");
        Matcher matcher = pattern.matcher(builder);
        while (matcher.find()) {
            int start = matcher.start();
            int wordLength = matcher.end() - matcher.start();
            builder.setCharAt(start + 3, '#');
            if (wordLength >= 7) {
                builder.setCharAt(start + 6, '#');
            }
        }
        System.out.println(builder);

    }
}
