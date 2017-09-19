package com.example.a54liyuanchao.yuanchaoapp;


import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
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
public class Fragment_bs_p extends Fragment {


    public Fragment_bs_p() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment_bs_p, container, false);

        String s = "Description" +
                "\n" +
                "\n" +
                "In computer science, binary search, also known as half-interval search,logarithmic search,or binary chop,is a search algorithm that finds the position of a target value within a sorted array.[4][5] Binary search compares the target value to the middle element of the array; if they are unequal, the half in which the target cannot lie is eliminated and the search continues on the remaining half until it is successful. If the search ends with the remaining half being empty, the target is not in the array."+
                "\n" +
                "\n" +
                "\n" +
                "Reference"+
                "\n" +
                "\n" +
                "Wikipedia";
        SpannableString ss1=  new SpannableString(s);
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View tv) {
                Uri uri = Uri.parse("https://en.wikipedia.org/wiki/Binary_search_algorithm");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        };
        int index = s.indexOf("Reference");
        int index2 = s.indexOf("Wikipedia");
        ss1.setSpan(clickableSpan,index2,index2 + 9, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);
        ss1.setSpan(boldSpan, 0, 11, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss1.setSpan(boldSpan, index, index + 9, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss1.setSpan(new RelativeSizeSpan(1.5f), 0,11, 0); // set size
        ss1.setSpan(new ForegroundColorSpan(Color.BLUE), 0, 11, 0);// set color
        ss1.setSpan(new RelativeSizeSpan(1.5f), index,index + 9, 0); // set size
        ss1.setSpan(new ForegroundColorSpan(Color.GREEN), index, index + 9, 0);// set color
        TextView tv= (TextView)v.findViewById(R.id.textViewbsp);
        tv.setText(ss1);
        tv.setMovementMethod(LinkMovementMethod.getInstance());
        return v;
    }

}
