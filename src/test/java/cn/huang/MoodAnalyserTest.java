package cn.huang;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoodAnalyserTest {
    @Test
    public void shouldAnalyseHapplyMessages() throws Exception {
        Mood actual = MoodAnalyser.analysMood("This is a happy message");

        Assert.assertEquals(actual, Mood.HAPPY);
    }

    @Test
    public void shouldBeCaseInsensitive() throws Exception {
        Mood actual = MoodAnalyser.analysMood("This is a HAPPY message");

        Assert.assertEquals(actual, Mood.HAPPY);
    }

    @Test
    public void shouldAnalyseSadMessages() throws Exception {
        Mood actual = MoodAnalyser.analysMood("This is a sad message");

        Assert.assertEquals(actual, Mood.SAD);
    }
} 