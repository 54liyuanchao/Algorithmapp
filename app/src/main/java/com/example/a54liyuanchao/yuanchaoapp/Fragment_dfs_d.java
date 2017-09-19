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
public class Fragment_dfs_d extends Fragment {


    public Fragment_dfs_d() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment_dfs_d, container, false);

        String s= "Problem"+
                "\n" +
                "\n" +
                "Given two binary trees, write a function to check if they are equal or not.\n" +
                "\n" +
                "Two binary trees are considered equal if they are structurally identical and the nodes have the same value." +
                "\n" +
                "\n" +
                "Solution"+
                "\n" +
                "\n" +
                "public boolean isSameTree(TreeNode p, TreeNode q) {\n" +
                "    if(p == null && q == null) return true;\n" +
                "    if(p == null || q == null) return false;\n" +
                "    if(p.val == q.val)\n" +
                "        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);\n" +
                "    return false;\n" +
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
        TextView tv= (TextView)v.findViewById(R.id.textViewdfs_d);
        tv.setText(ss1);

        return v;
    }

}
