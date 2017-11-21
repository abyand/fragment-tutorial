package com.example.abyandafa.tutorfragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public void onClick(View view) {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        switch (view.getId())
        {
            case R.id.pindah_satu:
                FragmentSatu fragmentSatu = new FragmentSatu();
                fragmentTransaction.add(R.id.frame_content, fragmentSatu);
                fragmentTransaction.addToBackStack("fragmentSatu");
                fragmentTransaction.commit();
                break;
            case R.id.pindah_dua:
                FragmentDua fragmentDua= new FragmentDua();
                fragmentTransaction.replace(R.id.frame_content, fragmentDua);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case R.id.pindah_tiga:
                FragmentTiga fragmentTiga = new FragmentTiga();
                fragmentTransaction.add(R.id.frame_content, fragmentTiga);
                fragmentTransaction.addToBackStack("fragmentTiga");
                fragmentTransaction.commit();
                break;
            case R.id.pindah_empat:
                FragmentEmpat fragmentEmpat = new FragmentEmpat();
                fragmentTransaction.add(R.id.frame_content, fragmentEmpat);
                fragmentTransaction.addToBackStack("fragmentEmpat");
                fragmentTransaction.commit();
                break;
        }
    }
}
