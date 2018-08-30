package com.example.androidbti.comunicationfragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class TopFragment extends Fragment implements View.OnClickListener {

    private EditText editText;
    private Button button;

    private onInvertListener listener;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        if (!(activity instanceof onInvertListener)){
            throw new RuntimeException("Deve ser instancia de onInvertListener");
        }
        listener = (onInvertListener) activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_fragment, container, false);
        editText = view.findViewById(R.id.edtTexto);
        button = view.findViewById(R.id.btnInverter);
        button.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View v) {
        if (listener != null){
            String texto = editText.getText().toString();
            listener.onInvert(texto);
        }

    }

    public interface onInvertListener{
        public void onInvert(String text);
    }
}
