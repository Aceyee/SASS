package com.example.zihan.sss;

/**
 * Created by Zihan on 2018/5/5.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ItemOneProfessorFragment extends Fragment {
    Button a;
    Button b;
    Button c;
    Button d;
    Button e;
    public static ItemOneProfessorFragment newInstance() {
        ItemOneProfessorFragment fragment = new ItemOneProfessorFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_item_one_professor, container, false);
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

    }
}