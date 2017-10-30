package com.example.marin.trabalhopt2;


import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class UpFragment extends Fragment implements View.OnClickListener {


    private Button btn;
    private contador c;

    public UpFragment() {

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (!(context instanceof contador)){
            throw new RuntimeException("Errou!");
        }
        c = (contador)context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_up, container, false);

        btn = (Button) view.findViewById(R.id.btnInc);
        btn.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        int cont = 0;
        if(view.getId() == R.id.btnInc){
            cont++;
            c.contar(cont);
        }

    }
    public interface contador{
        public void contar(int cont);
    }
}
