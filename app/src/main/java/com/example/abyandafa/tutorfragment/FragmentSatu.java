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
public class FragmentSatu extends Fragment {

    private Button klikSatu;

    public FragmentSatu() {
        // Required empty public constructor
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        klikSatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "FragmentSatu", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_satu, container, false);
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("fragment pertama");
        ((MainActivity) getActivity()).getSupportActionBar().setSubtitle("(fragment_fragment_satu.xml)");
        ((MainActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(false);

        klikSatu = (Button) view.findViewById(R.id.kliksatu);

        // Inflate the layout for this fragment
        return view;
    }

}
