package com.example.android.fragmentclass;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by pc on 12/5/2017.
 */

public class Fragment1 extends Fragment {

    private Unbinder mUnnbinder;
    @BindView(R.id.textview1)
    TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment1, null);
       mUnnbinder = ButterKnife.bind(this, view);
       textView.setText(R.string.frag1);
        return view;

    }
    @OnClick(R.id.btn)
    public void buttonClick(){
        Toast.makeText(getActivity(), "toast Fragment 1", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mUnnbinder.unbind();
    }
}
