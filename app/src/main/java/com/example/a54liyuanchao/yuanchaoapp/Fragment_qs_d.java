package com.example.a54liyuanchao.yuanchaoapp;


import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_qs_d extends Fragment {


    public Fragment_qs_d() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment_qs_d, container, false);

        String s= "Problem"+
                "\n" +
                "\n" +
                "We sort the array\n" +
                "A = (38 81 22 48 13 69 93 14 45 58 79 72)\n" +
                "with quicksort, always choosing the pivot element to be the element\n" +
                "in position (left+right)/2 " +
                "\n" +
                "\n" +
                "Solution"+
                "\n" +
                "\n" +
                "void quicksort2( T[] A, Integer left, Integer right)\n" +
                " while ( left < right )\n" +
                "q = partition( A, left, right);\n" +
                "if ( q \u0010 left < right \u0010 q )\n" +
                "quicksort2( A, left, q–1); // Recursive call sorts smaller sublist\n" +
                "left = q + 1; // Loop back to sort larger sublist\n" +
                "else\n" +
                "quicksort2( A, q+1, right); // Recursive call sorts smaller sublist\n" +
                "right = q \u0010 1; // Loop back to sort larger sublist";
        SpannableString ss1=  new SpannableString(s);
        int index = s.indexOf("Solution");
        StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);
        ss1.setSpan(boldSpan, 0, 7, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss1.setSpan(boldSpan, index, index + 8, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss1.setSpan(new RelativeSizeSpan(1.5f), 0,7, 0); // set size
        ss1.setSpan(new ForegroundColorSpan(Color.BLUE), 0, 7, 0);// set color
        ss1.setSpan(new RelativeSizeSpan(1.5f), index,index + 8, 0); // set size
        ss1.setSpan(new ForegroundColorSpan(Color.GREEN), index, index + 8, 0);// set color
        TextView tv= (TextView)v.findViewById(R.id.textViewqs_d);
        tv.setText(ss1);
        return v;
    }

}
