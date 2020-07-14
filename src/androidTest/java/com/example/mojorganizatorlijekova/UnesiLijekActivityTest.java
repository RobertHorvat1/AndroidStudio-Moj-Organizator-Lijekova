package com.example.mojorganizatorlijekova;

import android.support.test.rule.ActivityTestRule;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.*;

public class UnesiLijekActivityTest {

    @Rule
    public ActivityTestRule<UnesiLijekActivity> unesiLijekActivityActivityTestRule = new ActivityTestRule<UnesiLijekActivity>(UnesiLijekActivity.class);

    private UnesiLijekActivity unesiLijekActivity = null;
    @Before
    public void setUp() throws Exception {
        unesiLijekActivity = unesiLijekActivityActivityTestRule.getActivity();
    }

    @After
    public void tearDown() throws Exception {
        unesiLijekActivity = null;
    }

    @Test
    public void onCreate() {
        unesiLijekActivity = unesiLijekActivityActivityTestRule.getActivity();
        View viewById_UnesiImeLijekaEditText = unesiLijekActivity.findViewById(R.id.editTextUnesiImeLijeka);
        View viewById_UnesiKolicinuLijekaEditText = unesiLijekActivity.findViewById(R.id.editTextUnesiKolicinuLijeka);
        View viewById_UnesiTrajanjeLijekaEditText = unesiLijekActivity.findViewById(R.id.editTextUnesiTrajanjeLijeka);
        View viewById_UnesiFrekvencijuLijekaEditText = unesiLijekActivity.findViewById(R.id.editTextUnesiFrekvencijuLijeka);
        View viewById_UnesiVrijemeLijekaEditText = unesiLijekActivity.findViewById(R.id.editTextUnesiVrijemeKoristenjaLijeka);
        View viewById_ButtonSpremi = unesiLijekActivity.findViewById(R.id.buttonSpremiLijek);

        assertThat(viewById_UnesiImeLijekaEditText,notNullValue());
        assertThat(viewById_UnesiKolicinuLijekaEditText,notNullValue());
        assertThat(viewById_UnesiTrajanjeLijekaEditText,notNullValue());
        assertThat(viewById_UnesiFrekvencijuLijekaEditText,notNullValue());
        assertThat(viewById_UnesiVrijemeLijekaEditText,notNullValue());
        assertThat(viewById_ButtonSpremi,notNullValue());

        assertThat(viewById_UnesiImeLijekaEditText, instanceOf(EditText.class));
        assertThat(viewById_UnesiKolicinuLijekaEditText, instanceOf(EditText.class));
        assertThat(viewById_UnesiTrajanjeLijekaEditText, instanceOf(EditText.class));
        assertThat(viewById_UnesiFrekvencijuLijekaEditText, instanceOf(EditText.class));
        assertThat(viewById_UnesiVrijemeLijekaEditText, instanceOf(EditText.class));
        assertThat(viewById_ButtonSpremi, instanceOf(Button.class));

    }
    @Test
    public void testLaunch(){
        View view = unesiLijekActivity.findViewById(R.id.textViewUL);
        assertNotNull(view);
    }
}