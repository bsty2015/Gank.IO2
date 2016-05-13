package com.lvandroid.bsty.gankio2.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lvandroid.bsty.gankio2.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by bsty on 5/13/16.
 */
public class BaseFragment extends Fragment {

    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;
    @BindView(R.id.swipe)
    SwipeRefreshLayout mSwipe;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.android_layout, container, false);
        ButterKnife.bind(this, root);
        return root;
    }
}
