package com.android.perera.malaka.heartofthesea;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by Acer on 2017-05-23.
 */

@RunWith(AndroidJUnit4.class)
public class MenuActivityUITest {

    @Rule
    public ActivityTestRule<MenuActivity> mMenuActivityTestRule =
            new ActivityTestRule<MenuActivity>(MenuActivity.class);

    @Test
    public void clickEasyButton_startsTheGame() throws Exception
    {
        onView(withId(R.id.button_easy))
                .perform(click());
        onView(withId(R.id.game_screen))
                .check(matches(isDisplayed()));
    }
}
