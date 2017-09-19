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
public class Fragment_bs_d extends Fragment {


    public Fragment_bs_d() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment_bs_d, container, false);

        String s= "Problem"+
                "\n" +
                "\n" +
                "Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.\n" +
                "\n" +
                "You may assume no duplicates in the array.\n" +
                "\n" +
                "Here are few examples.\n" +
                "[1,3,5,6], 5 → 2\n" +
                "[1,3,5,6], 2 → 1\n" +
                "[1,3,5,6], 7 → 4\n" +
                "[1,3,5,6], 0 → 0" +
                "\n" +
                "\n" +
                "Solution"+
                "\n" +
                "\n" +
                "public int searchInsert(int[] A, int target) {\n" +
                "        int low = 0, high = A.length-1;\n" +
                "        while(low<=high){\n" +
                "            int mid = (low+high)/2;\n" +
                "            if(A[mid] == target) return mid;\n" +
                "            else if(A[mid] > target) high = mid-1;\n" +
                "            else low = mid+1;\n" +
                "        }\n" +
                "        return low;\n" +
                "    }";
        SpannableString ss1=  new SpannableString(s);
        int index = s.indexOf("Solution");
        StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);
        ss1.setSpan(boldSpan, 0, 7, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss1.setSpan(boldSpan, index, index + 8, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss1.setSpan(new RelativeSizeSpan(1.5f), 0,7, 0); // set size
        ss1.setSpan(new ForegroundColorSpan(Color.BLUE), 0, 7, 0);// set color
        ss1.setSpan(new RelativeSizeSpan(1.5f), index,index + 8, 0); // set size
        ss1.setSpan(new ForegroundColorSpan(Color.GREEN), index, index + 8, 0);// set color
        TextView tv= (TextView)v.findViewById(R.id.textViewbs_d);
        tv.setText(ss1);

        return  v;
    }

}
