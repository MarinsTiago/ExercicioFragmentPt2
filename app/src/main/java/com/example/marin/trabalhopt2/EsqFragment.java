package com.example.marin.trabalhopt2;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class EsqFragment extends Fragment {


    private TextView esq;

    public EsqFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_esq, container, false);

        esq = view.findViewById(R.id.esq);

        return view;
    }
    public void conta(int cont){
        esq.setText(String.valueOf(cont));
    }
}
