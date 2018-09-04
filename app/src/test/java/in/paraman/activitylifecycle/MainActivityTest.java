package in.paraman.activitylifecycle;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MainActivityTest {

    @Test
    public void stringValue() {
        MainActivity mainActivity = new MainActivity();
        String actualValue = mainActivity.stringValue("Hello");
        String expectedString;
        assertEquals("Success", actualValue);
    }
}
