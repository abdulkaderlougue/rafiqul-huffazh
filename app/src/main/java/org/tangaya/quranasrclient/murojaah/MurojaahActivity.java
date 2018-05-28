package org.tangaya.quranasrclient.murojaah;

import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.tangaya.quranasrclient.ViewModelFactory;
import org.tangaya.quranasrclient.service.repository.TranscriptionsRepository;
import org.tangaya.quranasrclient.R;

public class MurojaahActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_murojaah);

        MurojaahFragment murojaahFragment = obtainViewFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.murojaahFrame, murojaahFragment);
        transaction.commit();

    }

    public static MurojaahViewModel obtainViewModel(MurojaahActivity activity,
                                                    TranscriptionsRepository repository) {
        ViewModelFactory factory = ViewModelFactory.getInstance(activity.getApplication(), repository);

        return ViewModelProviders.of(activity, factory).get(MurojaahViewModel.class);
    }

    @NonNull
    private MurojaahFragment obtainViewFragment() {
        // View Fragment
        MurojaahFragment murojaahFragment = (MurojaahFragment) getSupportFragmentManager()
                .findFragmentById(R.id.murojaahFrame);

        if (murojaahFragment == null) {
            murojaahFragment = MurojaahFragment.newInstance();

            // Send the task ID to the fragment
            // Bundle bundle = new Bundle();
            // bundle.putString(MurojaahFragment.ARGUMENT_EDIT_TASK_ID,
               //     getIntent().getStringExtra(AddEditTaskFragment.ARGUMENT_EDIT_TASK_ID));
            // addEditTaskFragment.setArguments(bundle);
        }
        return murojaahFragment;
    }

}
