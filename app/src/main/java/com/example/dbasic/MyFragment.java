package com.example.dbasic;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dbasic.databinding.FragmentMyBinding;

public class MyFragment extends Fragment {

    private FragmentMyBinding fragmentMyBinding;
    Bundle bundle;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentMyBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_my, container, false);
        fragmentMyBinding.subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = fragmentMyBinding.nameEt.getText().toString();
                String number = fragmentMyBinding.numberEt.getText().toString();
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.f1(name, number);
            }
        });

        Bundle bundle = this.getArguments();
        String fName = bundle.getString("keyName");
        //String fName = bundle.getString("keyName");
        String fNumber = bundle.getString("keyNumber");
        fragmentMyBinding.nameTv.setText(fName);
        fragmentMyBinding.numberTv.setText(fNumber);

        return fragmentMyBinding.getRoot();
    }
}