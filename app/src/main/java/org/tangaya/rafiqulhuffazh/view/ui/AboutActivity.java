package org.tangaya.rafiqulhuffazh.view.ui;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import org.tangaya.rafiqulhuffazh.R;
import org.tangaya.rafiqulhuffazh.databinding.ActivityAboutBinding;
import org.tangaya.rafiqulhuffazh.view.navigator.AboutNavigator;
import org.tangaya.rafiqulhuffazh.viewmodel.AboutViewModel;

import timber.log.Timber;

public class AboutActivity extends Activity implements AboutNavigator {

    private AboutViewModel mViewModel;
    private ActivityAboutBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Timber.d("start onCreate");

        mViewModel = new AboutViewModel();
        mViewModel.onActivityCreated(this);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_about);
        mBinding.setViewmodel(mViewModel);

        setTitle("About");
        Timber.d("end of onCreate");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }

    @Override
    public void backToHome() {
        finish();
    }
}
