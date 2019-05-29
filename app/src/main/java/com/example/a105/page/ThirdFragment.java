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
public class ThirdFragment extends Fragment {


    public ThirdFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        /*return inflater.inflate(R.layout.fragment_third, container, false);*/
        View view3 = inflater.inflate(R.layout.fragment_third,container,false);
        TextView t3 = (TextView) view3.findViewById(R.id.title3);
        TextView c3 = (TextView)view3.findViewById(R.id.textView3);
        return view3;
    }

}
