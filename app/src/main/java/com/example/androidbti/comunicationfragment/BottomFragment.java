package com.example.androidbti.comunicationfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class BottomFragment extends Fragment {

    private TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_fragment, container, false);
        textView = view.findViewById(R.id.textoText);
        return view;
    }

    public void invert(String texto){
        if (texto != null){
            String inverted = new StringBuilder(texto).reverse().toString();
            textView.setText(inverted);
        }
    }
}
