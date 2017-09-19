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
public class Fragment_TI extends Fragment {


    public Fragment_TI() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment__ti, container, false);

        String s= "Problem"+
                "\n" +
                "\n" +
                "Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.\n" +
                "\n" +
                "Note: \n" +
                "You may assume k is always valid, 1 ≤ k ≤ BST's total elements." +
                "    \n" +
                "    \n" +
                "Solution"+
                "\n" +
                "\n" +
                "public int kthSmallest(TreeNode root, int k) {\n" +
                "        int count = countNodes(root.left);\n" +
                "        if (k <= count) {\n" +
                "            return kthSmallest(root.left, k);\n" +
                "        } else if (k > count + 1) {\n" +
                "            return kthSmallest(root.right, k-1-count); // 1 is counted as current node\n" +
                "        }\n" +
                "        \n" +
                "        return root.val;\n" +
                "    }\n" +
                "    \n" +
                "    public int countNodes(TreeNode n) {\n" +
                "        if (n == null) return 0;\n" +
                "        \n" +
                "        return 1 + countNodes(n.left) + countNodes(n.right);\n" +
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
        TextView tv= (TextView)v.findViewById(R.id.textViewti_d);
        tv.setText(ss1);
        return  v;
    }

}
