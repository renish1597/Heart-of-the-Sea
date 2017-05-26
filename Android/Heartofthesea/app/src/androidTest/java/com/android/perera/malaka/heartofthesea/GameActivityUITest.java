package com.android.perera.malaka.heartofthesea;

import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.isFocusable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.allOf;

/**
 * Created by Acer on 2017-05-23.
 */

@RunWith(AndroidJUnit4.class)
public class GameActivityUITest {


    @Rule
    public ActivityTestRule<GameActivityEasy> mGameActivityTestRule =
            new ActivityTestRule<GameActivityEasy>(GameActivityEasy.class);

    @Test
    public void clickPauseButton_openDialogViewMenu() throws Exception {
        onView(withId(R.id.ib_pause))
                .perform(click());
        onView(withId(R.id.pause_dialog))
                .check(matches(isDisplayed()));
    }

    @Test
    public void openDialogViewMenu_TextandImages() throws Exception {
        onView(withId(R.id.ib_pause))
                .perform(click());

        onView(withId(R.id.textView))
                .check(matches(allOf(withText(R.string.pause_message), isDisplayed())));
    }

}
