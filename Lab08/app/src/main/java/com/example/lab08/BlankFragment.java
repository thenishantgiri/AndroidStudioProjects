package com.example.lab08;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class BlankFragment extends Fragment {

    private static final String FragmentName = BlankFragment.class.getSimpleName();
    private static final String TAG = FragmentName;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i(TAG, FragmentName + " onAttach Function");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, FragmentName + " onCreate Function");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, FragmentName + " onCreateView Function");
        //Inflate the layout for this fragment
        return inflater.inflate(R.layout.blank_fragment, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, FragmentName + " onStart Function");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, FragmentName + " onResume Function");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, FragmentName + " onPause Function");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, FragmentName + " onDestroy Function");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, FragmentName + " onStop Function");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(TAG, FragmentName + " onDetach Function");
    }
}
