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
public class FragmentDua extends Fragment {

    private Button klikdua;


    public FragmentDua() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        klikdua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "FragmentDua", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_dua, container, false);
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("fragment dua");
        ((MainActivity) getActivity()).getSupportActionBar().setSubtitle("(fragment_fragment_satu.xml)");
        ((MainActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(false);

        klikdua = (Button) view.findViewById(R.id.klikdua);

        // Inflate the layout for this fragment
        return view;
    }

}
