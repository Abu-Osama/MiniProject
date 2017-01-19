package com.example.abuosama.miniproject;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragLogin extends Fragment {


    EditText et1,et2;
    Button b1;
    SharedPreferences sp;
    MainActivity mainActivity;



    public FragLogin() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             final Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_frag_login, container, false);
        et1 = (EditText) v.findViewById(R.id.usernamelogin);
        et2 = (EditText) v.findViewById(R.id.passwordlogin);
        b1 = (Button) v.findViewById(R.id.loginbutton1);



//        if(sp.contains("name")&& sp.contains("password")){
//
//             mainActivity= (MainActivity) getActivity();
//            mainActivity.registerData();



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sp=getActivity().getSharedPreferences("credentials",0);
                final String str_UserName =et1.getText().toString();
                final String  str_Password =et2.getText().toString();
                final String userf=sp.getString("name",null);
                final String passf=sp.getString("password",null);

                if(str_UserName.equals(userf)&& str_Password.equals(passf)){

                    Toast.makeText(getActivity(), "logging succfully", Toast.LENGTH_SHORT).show();

                     mainActivity= (MainActivity) getActivity();
                     mainActivity.welcomePage();
                }
                  else {

                    Toast.makeText(getActivity(), "wrong password", Toast.LENGTH_SHORT).show();
                }


                //  loginCheck();


//                String username=et1.getText().toString();
//                String password=et2.getText().toString();
                // Validate if username, password is filled






//                if(username.trim().length() > 0 && password.trim().length() > 0) {
//
//                    if (sp.contains("name")) {
//
//                        String v1 = sp.getString("name", null);
//                    }
//
//                    if (sp.contains("password")) {
//
//                        String v2 = sp.getString("possword", null);
//
//                    }




//                    if (username.equals(v1) && password.equals(v2)) {
//
//                        MainActivity mainActivity= (MainActivity) getActivity();
//
//                        mainActivity.registerData();


                        // Starting MainActivity
                       // Intent i = new Intent(getActivity(), MainActivity.class);
                        //i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

                        // Add new Flag to start new Activity
                       // i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                       // startActivity(i);

                    }
                    // MainActivity mainActivity= (MainActivity) getActivity();
                    //mainActivity.login();


        });

        return  v;
        }

//    public void loginCheck() {
//        //check username and password are correct and then add them to SharedPreferences
//        if (et1.getText().toString().equals("name") && et2.getText().toString().equals("password")) {
//            SharedPreferences.Editor e = sp.edit();
//            e.putString("name", "name");
//            e.putString("password", "password");
//            e.commit();
//
//            Toast.makeText(getActivity(), "Login Successful", Toast.LENGTH_LONG).show();
//            mainActivity= (MainActivity) getActivity();
//            mainActivity.registerData();
//
//
//        } else {
//            Toast.makeText(getActivity(), "Incorrect Login Details", Toast.LENGTH_LONG).show();
//        }

}
