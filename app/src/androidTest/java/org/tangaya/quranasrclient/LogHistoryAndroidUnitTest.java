package org.tangaya.quranasrclient;

import android.os.Parcel;
import android.support.test.filters.SmallTest;
import android.support.test.runner.AndroidJUnit4;
import android.util.Pair;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

// @RunWith is required only if you use a mix of JUnit3 and JUnit4.
@RunWith(AndroidJUnit4.class)
@SmallTest
public class LogHistoryAndroidUnitTest {

    public static final String TEST_STRING = "This is a string";
    public static final long TEST_LONG = 12345678L;
    //private LogHistory mLogHistory;

    @Before
    public void createLogHistory() {
        //mLogHistory = new LogHistory();
    }

    @Test
    public void logHistory_ParcelableWriteRead() {
        // Set up the Parcelable object to send and receive.
//        mLogHistory.addEntry(TEST_STRING, TEST_LONG);
//
//        // Write the data.
//        Parcel parcel = Parcel.obtain();
//        mLogHistory.writeToParcel(parcel, mLogHistory.describeContents());
//
//        // After you're done with writing, you need to reset the parcel for reading.
//        parcel.setDataPosition(0);
//
//        // Read the data.
//        LogHistory createdFromParcel = LogHistory.CREATOR.createFromParcel(parcel);
//        List<Pair<String, Long>> createdFromParcelData = createdFromParcel.getData();
//
//        // Verify that the received data is correct.
//        assertThat(createdFromParcelData.size(), is(1));
//        assertThat(createdFromParcelData.get(0).first, is(TEST_STRING));
//        assertThat(createdFromParcelData.get(0).second, is(TEST_LONG));
    }
}