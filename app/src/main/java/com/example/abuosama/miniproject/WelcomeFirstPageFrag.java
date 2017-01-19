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
public class WelcomeFirstPageFrag extends Fragment {

    Button btnphd,btnmphil,btnstudent,btnfaculty,btngoogle;

    MainActivity mainActivity;


    public WelcomeFirstPageFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_welcome_first_page, container, false);
        btnphd = (Button) v.findViewById(R.id.phdstudent);
        btnmphil = (Button) v.findViewById(R.id.mphilstudent);
        btnstudent = (Button) v.findViewById(R.id.Enterstudentpro);
        btnfaculty = (Button) v.findViewById(R.id.facualtypublic);
        btngoogle = (Button) v.findViewById(R.id.googleserver);

        //prepare for open student form

        btnphd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mainActivity= (MainActivity) getActivity();
                mainActivity.student();

            }
        });

        btnmphil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mainActivity= (MainActivity) getActivity();
                mainActivity.student();


            }
        });

        btnstudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mainActivity= (MainActivity) getActivity();
                mainActivity.student();


            }
        });

           btnfaculty.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {

                   mainActivity= (MainActivity) getActivity();
                   mainActivity.student();


               }
           });

        return v;
    }

}
