package net.nikonorov.advandroidhw1;

import android.content.Intent;
import android.graphics.Color;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by vitaly on 11.10.15.
 */


@RunWith(AndroidJUnit4.class)
public class ActivityListTest {
    @Rule
    public ActivityTestRule<ActivityList> mActivityTestRule = new
            ActivityTestRule<ActivityList>(ActivityList.class, false, false);

    private Intent getActivityListLaunchIntent() {
        Intent returnIntent = new Intent(InstrumentationRegistry.getTargetContext(),
                ActivityList.class);
        return returnIntent;
    }
    @Test
    public void testActivityUnAuthorized() throws Throwable {
        final ActivityList activityList =
                mActivityTestRule.launchActivity(getActivityListLaunchIntent());
        try {
            mActivityTestRule.runOnUiThread(new Runnable() {
                @Override
                public void run() {

                    List<ListItem> list = activityList.getList();
                    for (int idx = 0; idx < list.size(); ++idx) {
                        if (idx % 2 == 1) {
                            assertEquals(Color.parseColor("#aaaaaa"), list.get(idx).getColor());
                        }
                        else {
                            assertEquals(Color.parseColor("#ffffff"), list.get(idx).getColor());
                        }
                    }

                } });
        } catch (InterruptedException e) {
            Assert.assertTrue("Interrupted exception", false);
        }
    }
}