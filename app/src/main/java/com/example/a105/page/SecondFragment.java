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
public class SecondFragment extends Fragment {


    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       /* return inflater.inflate(R.layout.fragment_second, container, false);*/

        View view2 = inflater.inflate(R.layout.fragment_second,container,false);
        TextView t2 = (TextView) view2.findViewById(R.id.title2);
        TextView c2 = (TextView)view2.findViewById(R.id.textView2);
        return view2;

    }

}
