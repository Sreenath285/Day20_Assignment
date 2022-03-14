import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MoodAnalyserTest {

    MoodAnalyser moodAnalyser = new MoodAnalyser();

    /***
     * created getMoodResultSad test case method to check mood sad
     */
    @Test
    void getMoodResultSad() {
        String mood = moodAnalyser.analyseMood("Sad message");
        Assert.assertEquals("SAD", mood);
    }

    /***
     * created getMoodResultHappy test case method to check mood happy
     */
    @Test
    void getMoodResultHappy() {
        String mood = moodAnalyser.analyseMood("Happy message");
        Assert.assertEquals("HAPPY", mood);
    }
}