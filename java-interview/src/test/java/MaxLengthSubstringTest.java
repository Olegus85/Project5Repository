import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.olegus85.javainterview.MainSlidingWindowClass;

public class MaxLengthSubstringTest {
    @Test
    public void substringTest(){
        Assertions.assertEquals("Romani", MainSlidingWindowClass.getMaxUnequalSubstring("Romania"));
    }
    @Test
    public void substringTest2(){
        Assertions.assertEquals("abcd", MainSlidingWindowClass.getMaxUnequalSubstring("abcdabc"));
    }

}
