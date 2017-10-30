package com.example.marin.trabalhopt2;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements UpFragment.contador{

    private EsqFragment esqFragment;
    private DirFragment dirFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getFragmentManager();
        UpFragment upFragment = new UpFragment();
        dirFragment = new DirFragment();
        esqFragment = new EsqFragment();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.rig, dirFragment);
        ft.add(R.id.lef, esqFragment);
        ft.add(R.id.upp, upFragment);
        ft.commit();

    }

    @Override
    public void contar(int cont) {
            dirFragment.contar(cont);
            esqFragment.conta(cont);
        }
    }


