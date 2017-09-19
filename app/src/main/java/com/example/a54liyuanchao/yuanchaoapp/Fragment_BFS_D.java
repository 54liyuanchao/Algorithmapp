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
public class Fragment_BFS_D extends Fragment {


    public Fragment_BFS_D() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment__bfs__d, container, false);

        String s= "Problem"+
                "\n" +
                "\n" +
                "Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center)." +
                "\nFor example, this binary tree [1,2,2,3,4,4,3] is symmetric:" +
                "\n" +
                "\n" +
                "Solution"+
                "\n" +
                "\n" +
                "public boolean isSymmetric(TreeNode root) {\n" +
                "    return root==null || isSymmetricHelp(root.left, root.right);\n" +
                "}\n" +
                "\n" +
                "private boolean isSymmetricHelp(TreeNode left, TreeNode right){\n" +
                "    if(left==null || right==null)\n" +
                "        return left==right;\n" +
                "    if(left.val!=right.val)\n" +
                "        return false;\n" +
                "    return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);\n" +
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
        TextView tv= (TextView)v.findViewById(R.id.textViewbfs_e);
        tv.setText(ss1);

        return v;
    }

}
