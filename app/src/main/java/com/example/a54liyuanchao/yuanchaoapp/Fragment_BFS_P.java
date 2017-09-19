package com.example.a54liyuanchao.yuanchaoapp;


import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
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
public class Fragment_BFS_P extends Fragment {


    public Fragment_BFS_P() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment__bfs_, container, false);
        String s = "Description" +
                "\n" +
                "\n" +
                "Breadth-first search (BFS) is an algorithm for traversing or searching tree or graph data structures. It starts at the tree root (or some arbitrary node of a graph, sometimes referred to as a 'search key') and explores the neighbor nodes first, before moving to the next level neighbors."+
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
                Uri uri = Uri.parse("https://en.wikipedia.org/wiki/Breadth-first_search");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        };
        int index = s.indexOf("Reference");
        int index2 = s.indexOf("Wikipedia");
        ss1.setSpan(clickableSpan,index2,index2 + 9,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);
        ss1.setSpan(boldSpan, 0, 11, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss1.setSpan(boldSpan, index, index + 9, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss1.setSpan(new RelativeSizeSpan(1.5f), 0,11, 0); // set size
        ss1.setSpan(new ForegroundColorSpan(Color.BLUE), 0, 11, 0);// set color
        ss1.setSpan(new RelativeSizeSpan(1.5f), index,index + 9, 0); // set size
        ss1.setSpan(new ForegroundColorSpan(Color.GREEN), index, index + 9, 0);// set color
        TextView tv= (TextView)v.findViewById(R.id.textView_bfsp);
        tv.setText(ss1);
        tv.setMovementMethod(LinkMovementMethod.getInstance());
        return v;
    }

}
