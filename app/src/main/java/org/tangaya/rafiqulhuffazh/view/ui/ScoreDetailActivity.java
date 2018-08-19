package org.tangaya.rafiqulhuffazh.view.ui;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.LifecycleRegistry;
import android.arch.lifecycle.Observer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import org.tangaya.rafiqulhuffazh.R;
import org.tangaya.rafiqulhuffazh.data.model.EvaluationOld;
import org.tangaya.rafiqulhuffazh.databinding.ActivityScoreDetailBinding;
import org.tangaya.rafiqulhuffazh.view.adapter.EvalAdapter;
import org.tangaya.rafiqulhuffazh.viewmodel.ScoreDetailViewModel;

import java.util.ArrayList;

public class ScoreDetailActivity extends Activity implements LifecycleOwner {

    private ScoreDetailViewModel mViewModel;
    private ActivityScoreDetailBinding mBinding;
    private LifecycleRegistry mLifecycleRegistry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_score_detail);

        setTitle("Score Detail");

        mLifecycleRegistry = new LifecycleRegistry(this);
        mLifecycleRegistry.markState(Lifecycle.State.CREATED);

        final RecyclerView recyclerView = findViewById(R.id.score_detail_recycler);
        final RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        mViewModel = new ScoreDetailViewModel(getApplication(), new EvaluationOld(1,1,1));
        mViewModel.getArrayListMutableLiveData().observe(this, new Observer<ArrayList<ScoreDetailViewModel>>() {
            @Override
            public void onChanged(@Nullable ArrayList<ScoreDetailViewModel> devspaceDetailViewModels) {

                EvalAdapter mAdapter = new EvalAdapter(ScoreDetailActivity.this, devspaceDetailViewModels);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setAdapter(mAdapter);
            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();
        mLifecycleRegistry.markState(Lifecycle.State.STARTED);
    }


    @NonNull
    @Override
    public Lifecycle getLifecycle() {
        return mLifecycleRegistry;
    }
}