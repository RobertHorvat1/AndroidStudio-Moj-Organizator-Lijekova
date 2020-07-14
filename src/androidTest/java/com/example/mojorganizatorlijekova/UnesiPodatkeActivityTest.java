package com.example.mojorganizatorlijekova;

import android.support.test.rule.ActivityTestRule;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.os.Build.VERSION_CODES.LOLLIPOP;
import static org.junit.Assert.*;

import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;



public class UnesiPodatkeActivityTest {

    @Rule
    public ActivityTestRule<UnesiPodatkeActivity> unesiPodatkeActivityActivityTestRule = new ActivityTestRule<UnesiPodatkeActivity>(UnesiPodatkeActivity.class);

    private UnesiPodatkeActivity unesiPodatkeActivity = null;
    @Before
    public void setUp() throws Exception {
        unesiPodatkeActivity = unesiPodatkeActivityActivityTestRule.getActivity();
    }

    @Test
    public void onCreate() {
        unesiPodatkeActivity = unesiPodatkeActivityActivityTestRule.getActivity();
        View viewById_UnesiImeEditText = unesiPodatkeActivity.findViewById(R.id.editTextUnesiIme);
        View viewById_UnesiGodineEditText = unesiPodatkeActivity.findViewById(R.id.editTextUnesiGodine);
        View viewById_UnesiSpolEditText = unesiPodatkeActivity.findViewById(R.id.editTextUnesiSpol);
        View viewById_ButtonSpremi = unesiPodatkeActivity.findViewById(R.id.buttonSpremi);
        assertThat(viewById_UnesiImeEditText,notNullValue());
        assertThat(viewById_UnesiGodineEditText,notNullValue());
        assertThat(viewById_UnesiSpolEditText,notNullValue());
        assertThat(viewById_ButtonSpremi,notNullValue());
        assertThat(viewById_UnesiImeEditText, instanceOf(EditText.class));
        assertThat(viewById_UnesiGodineEditText, instanceOf(EditText.class));
        assertThat(viewById_UnesiSpolEditText, instanceOf(EditText.class));
        assertThat(viewById_ButtonSpremi, instanceOf(Button.class));
    }

    @Test
    public void testLaunch(){
        View view = unesiPodatkeActivity.findViewById(R.id.textView6);
        assertNotNull(view);
    }

    @After
    public void tearDown() throws Exception {
        unesiPodatkeActivity = null;
    }


}