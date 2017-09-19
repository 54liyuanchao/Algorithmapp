package com.example.a54liyuanchao.yuanchaoapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.dd.CircularProgressButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_Algorithm extends Fragment {


    public Fragment_Algorithm() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment__algorithm, container, false);
        CircularProgressButton circularProgressButton = (CircularProgressButton)v.findViewById(R.id.BreadthFirstSearch);
        circularProgressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),BFSActivity.class);
                startActivity(intent);
            }
        });
        CircularProgressButton circularProgressButton2 = (CircularProgressButton)v.findViewById(R.id.DepthFirstSearch);
        circularProgressButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),DFSActivity.class);
                startActivity(intent);
            }
        });
        CircularProgressButton circularProgressButton3 = (CircularProgressButton)v.findViewById(R.id.BinarySearch);
        circularProgressButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),BSActivity.class);
                startActivity(intent);
            }
        });
        CircularProgressButton circularProgressButton4 = (CircularProgressButton)v.findViewById(R.id.MergeSort);
        circularProgressButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),MSActivity.class);
                startActivity(intent);
            }
        });
        CircularProgressButton circularProgressButton5 = (CircularProgressButton)v.findViewById(R.id.QuickSort);
        circularProgressButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),QSActivity.class);
                startActivity(intent);
            }
        });
        CircularProgressButton circularProgressButton6 = (CircularProgressButton)v.findViewById(R.id.Tree);
        circularProgressButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),TIActivity.class);
                startActivity(intent);
            }
        });
        return v;
    }
}


