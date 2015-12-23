package com.example.android.clickcounter;

import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.test.suitebuilder.annotation.MediumTest;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by thabetak on 12/23/2015.
 */
public class ClickActivityTest extends ActivityInstrumentationTestCase2<ClickActivity> {

    public ClickActivityTest() {
        super(ClickActivity.class);
    }

    private ClickActivity mClickActivity;
    private Button mButton;
    private TextView mTextView;

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        setActivityInitialTouchMode(true);

        mClickActivity = getActivity();
        mButton = (Button) mClickActivity.findViewById(R.id.click_button);
        mTextView = (TextView) mClickActivity.findViewById(R.id.click_count_text_view);
    }

    @MediumTest
    public void testInitialValue() {
        int initialValue = Integer.parseInt(mTextView.getText().toString());
        assertEquals(initialValue, 0);
    }

    @MediumTest
    public void testIncrementClickButton() {
        int previousValue = Integer.parseInt(mTextView.getText().toString());
        TouchUtils.clickView(this, mButton);
        int currentValue = Integer.parseInt(mTextView.getText().toString());
        assertEquals(currentValue, previousValue + 1);
    }
}