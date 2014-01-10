package com.amex.androidTest3.tests;

import android.test.ActivityInstrumentationTestCase2;

import com.amex.androidTest3.MainActivity;
import com.robotium.solo.Solo;

import junit.framework.Assert;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
    private Solo solo;

    public MainActivityTest() {
        super(MainActivity.class);
    }


    @Override
    protected void setUp() throws Exception {
        solo = new Solo(getInstrumentation(), getActivity());
    }


    public void testLaunch() {
        Assert.assertTrue(solo.searchText("Hello"));
    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }
}