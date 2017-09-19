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
public class Fragment_ms extends Fragment {


    public Fragment_ms() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment_ms, container, false);

        String s= "Problem"+
                "\n" +
                "\n" +
                "Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists." +
                "\n" +
                "\n" +
                "Solution"+
                "\n" +
                "\n" +
                "public ListNode mergeTwoLists(ListNode l1, ListNode l2){\n" +
                "\t\tif(l1 == null) return l2;\n" +
                "\t\tif(l2 == null) return l1;\n" +
                "\t\tif(l1.val < l2.val){\n" +
                "\t\t\tl1.next = mergeTwoLists(l1.next, l2);\n" +
                "\t\t\treturn l1;\n" +
                "\t\t} else{\n" +
                "\t\t\tl2.next = mergeTwoLists(l1, l2.next);\n" +
                "\t\t\treturn l2;\n" +
                "\t\t}\n" +
                "}";
        SpannableString ss1=  new SpannableString(s);
        int index = s.indexOf("Solution");
        StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);
        ss1.setSpan(boldSpan, 0, 7, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss1.setSpan(boldSpan, index, index + 8, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss1.setSpan(new RelativeSizeSpan(1.5f), 0,7, 0); // set size
        ss1.setSpan(new ForegroundColorSpan(Color.BLUE), 0, 7, 0);// set color
        ss1.setSpan(new RelativeSizeSpan(1.5f), index,index + 8, 0); // set size
        ss1.setSpan(new ForegroundColorSpan(Color.GREEN), index, index + 8, 0);// set color
        TextView tv= (TextView)v.findViewById(R.id.textViewms_d);
        tv.setText(ss1);

        return v;
    }

}
