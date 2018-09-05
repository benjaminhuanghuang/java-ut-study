package cn.huang;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Arrays;


public class MoodAnalyser {
    private static final Map<String, Mood> WORD_TO_MOOD = new HashMap<>();

    static {
        WORD_TO_MOOD.put("happy", Mood.HAPPY);
        WORD_TO_MOOD.put("good", Mood.HAPPY);
        WORD_TO_MOOD.put("great", Mood.HAPPY);
        WORD_TO_MOOD.put("awesome", Mood.HAPPY);
        WORD_TO_MOOD.put("marvelous", Mood.HAPPY);

        WORD_TO_MOOD.put("sad", Mood.SAD);
        WORD_TO_MOOD.put("terrible", Mood.SAD);
        WORD_TO_MOOD.put("horrible", Mood.SAD);
        WORD_TO_MOOD.put("bad", Mood.SAD);
        WORD_TO_MOOD.put("awful", Mood.SAD);
    }

    private MoodAnalyser() {
    }

    public static Mood analysMood(String sentence) {
        String[] wordsInMessage = sentence.split("\\s");
        Optional<Mood> moodOptional = Arrays.stream(wordsInMessage)
                .map(String::toLowerCase)
                .map(word -> WORD_TO_MOOD.get(word))
                .filter(mood -> mood != null)
                .findFirst();

        return moodOptional.get();
    }
}
