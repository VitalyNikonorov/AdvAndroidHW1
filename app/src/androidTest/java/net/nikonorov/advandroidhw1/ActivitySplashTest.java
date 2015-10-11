package net.nikonorov.advandroidhw1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by vitaly on 11.10.15.
 */
public class ActivitySplashTest{

    @Test
    public void testActionBarAbsence() {

        ActivitySplash as = new ActivitySplash();

        android.app.ActionBar ab = as.getActionBar();

        assertEquals(ab, null);
    }
}