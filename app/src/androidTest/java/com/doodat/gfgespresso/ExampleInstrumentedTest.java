package com.doodat.gfgespresso;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)

public class ExampleInstrumentedTest{

    @Rule
     public ActivityScenarioRule<MainActivity> activityScenarioRule = new ActivityScenarioRule<>(MainActivity.class); // specifies that we are running test on MainActivity

    // test to check if the preferred language of user is displayed under the chosen language or not

    @Test
    public void selectLanguageAndCheck(){
        onView(withId(R.id.german)) // Looks for a view with an id 'german'
                .perform(click()); // Performs click action on view.
        onView(withId(R.id.preferred_language))  // Looks for a view with an id 'preferred_language'
                .check(matches(withText("German"))); // checks if preferred_language matches with the text "German" since we pressed german language button.

    }
}