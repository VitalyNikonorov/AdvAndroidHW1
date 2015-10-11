package net.nikonorov.advandroidhw1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ActivitySplashTest {
    @Test
    public void testActionBarAbsence() {

        ActivitySplash as = new ActivitySplash();

        android.app.ActionBar ab = as.getActionBar();

        assertEquals(ab, null);
    }
}