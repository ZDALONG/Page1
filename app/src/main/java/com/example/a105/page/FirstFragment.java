package com.example.a105.page;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {


    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       /* return inflater.inflate(R.layout.fragment_first, container, false);*/

        View view1 = inflater.inflate(R.layout.fragment_first,container,false);
        TextView t1 = (TextView) view1.findViewById(R.id.title1);
        TextView c1 = (TextView)view1.findViewById(R.id.textView1);
        return view1;


    }

}
