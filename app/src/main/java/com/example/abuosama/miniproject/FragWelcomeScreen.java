package com.example.abuosama.miniproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragWelcomeScreen extends Fragment {

    Button register,login;


    public FragWelcomeScreen() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_frag_welcome_screen, container, false);

        register = (Button) v.findViewById(R.id.btnregister);

        login = (Button) v.findViewById(R.id.btnlogin);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MainActivity mainActivity= (MainActivity) getActivity();

                mainActivity.registerData();

            }
        });

         login.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 MainActivity mainActivity= (MainActivity) getActivity();

                 mainActivity.login();


             }
         });
        return v;
    }

}
