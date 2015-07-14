package com.example.test.test4;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2015/7/14.
 */
public class Fragment_Two extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View  contentView=  inflater.inflate(R.layout.fragment_two,null);
        return contentView;
    }
}
