package com.example.abyandafa.tutorfragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentEmpat extends Fragment {

    private Button klikEmpat;

    public FragmentEmpat() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        klikEmpat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "FragmentEmpat", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_empat, container, false);
        ((MainActivity)getActivity()).getSupportActionBar().setTitle("fragmentEmpat");
        ((MainActivity)getActivity()).getSupportActionBar().setSubtitle("");

        klikEmpat = (Button) view.findViewById(R.id.klikempat);
        // Inflate the layout for this fragment
        return view;
    }

}
