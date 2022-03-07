package com.example.dbasic;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dbasic.databinding.FragmentDataBinding;

public class DataFragment extends Fragment {

    private FragmentDataBinding fragmentDataBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        fragmentDataBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_data,container,false);
        fragmentDataBinding.fSubBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("keyName", fragmentDataBinding.fNameEt.getText().toString());
                bundle.putString("keyNumber",fragmentDataBinding.fNumberEt.getText().toString());
                MyFragment myFragment = new MyFragment();
                myFragment.setArguments(bundle);
                getParentFragmentManager().beginTransaction().replace(R.id.my_frame,myFragment).commit();
            }
        });
        return fragmentDataBinding.getRoot();
    }
}