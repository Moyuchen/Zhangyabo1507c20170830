package com.bwie.test.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bwie.test.R;

/**
 * User: 张亚博
 * Date: 2017-08-30 14:37
 * Description：
 */
public class LeftFragment extends Fragment {
    private View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        if (view==null){
            view=inflater.inflate(R.layout.fragment_left,container,false);
        }

        return view;
    }
}
