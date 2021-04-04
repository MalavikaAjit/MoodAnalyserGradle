

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MoodAnalyserTest {
 @Test
    public void given_message_when_sad_returns_sad() {

        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is SAD message");
        Assertions.assertEquals("SAD", mood);
    }
    @Test
    public void  given_message_when_Happy_returns_Happy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a message");
        Assertions.assertEquals("HAPPY", mood);
    }
}
