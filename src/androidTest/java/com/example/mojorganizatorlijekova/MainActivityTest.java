package com.example.mojorganizatorlijekova;

import android.support.test.rule.ActivityTestRule;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    private MainActivity mainActivity = null;

    @Before
    public void setUp() throws Exception {
        mainActivity = mainActivityActivityTestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View view = mainActivity.findViewById(R.id.textView);
        assertNotNull(view);
    }
    @Test
    public void onCreate() {
        mainActivity = mainActivityActivityTestRule.getActivity();
        View viewById_ButtonUnesiPodatke = mainActivity.findViewById(R.id.unesiPodatkeBtn);
        View viewById_ButtonPrikaziPodatke = mainActivity.findViewById(R.id.prikaziPodatkeBtn);
        View viewById_ButtonUnesiLijekove = mainActivity.findViewById(R.id.unesiLijekoveBtn);
        View viewById_ButtonPrikaziListuLijekova = mainActivity.findViewById(R.id.prikaziListuLijekovaBtn);
        assertThat(viewById_ButtonUnesiPodatke, instanceOf(Button.class));
        assertThat(viewById_ButtonPrikaziPodatke, instanceOf(Button.class));
        assertThat(viewById_ButtonUnesiLijekove, instanceOf(Button.class));
        assertThat(viewById_ButtonPrikaziListuLijekova, instanceOf(Button.class));
    }
    @After
    public void tearDown() throws Exception {
        mainActivity = null;
    }
}