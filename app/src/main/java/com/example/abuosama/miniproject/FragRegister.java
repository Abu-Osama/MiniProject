package com.example.abuosama.miniproject;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragRegister extends Fragment {

    EditText eno,ename,email,epassword,confirm,hint;
    Button register,login;
    SharedPreferences sharedPreferences;


    public FragRegister() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_frag_register, container, false);
        eno = (EditText) v.findViewById(R.id.eno);
        ename = (EditText) v.findViewById(R.id.ename);
        email = (EditText) v.findViewById(R.id.email);
        epassword = (EditText) v.findViewById(R.id.password);
        confirm = (EditText) v.findViewById(R.id.confirm);
        hint = (EditText) v.findViewById(R.id.hint);
        register = (Button) v.findViewById(R.id.register);
        login = (Button) v.findViewById(R.id.login);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(eno.getText().length()<=0){

                    Toast.makeText(getActivity(), "fill data", Toast.LENGTH_SHORT).show();
                }

                else if(ename.getText().length()<=0){

                    Toast.makeText(getActivity(), "fill data", Toast.LENGTH_SHORT).show();
                }
                else if(email.getText().length()<=0){

                    Toast.makeText(getActivity(), "fill data", Toast.LENGTH_SHORT).show();
                }

                else if(epassword.getText().length()<=0){

                    Toast.makeText(getActivity(), "fill data", Toast.LENGTH_SHORT).show();
                }

                else if(confirm.getText().length()<=0){

                    Toast.makeText(getActivity(), "fill data", Toast.LENGTH_SHORT).show();
                }
                else if(hint.getText().length()<=0){

                    Toast.makeText(getActivity(), "fill data", Toast.LENGTH_SHORT).show();
                }

                else {


                    sharedPreferences = getActivity().getSharedPreferences("credentials", 0);
                    SharedPreferences.Editor editor = sharedPreferences.edit();//open editor
                    editor.putString("eno", eno.getText().toString());
                    editor.putString("name", ename.getText().toString());
                    editor.putString("mail", email.getText().toString());
                    editor.putString("password", epassword.getText().toString());
                    editor.putString("confirm", confirm.getText().toString());
                    editor.putString("hint", hint.getText().toString());
                    editor.commit();
                    Log.d("B_34","error"+editor);

                    Toast.makeText(getActivity(), "fill data " + editor, Toast.LENGTH_SHORT).show();
                    eno.setText("");
                    ename.setText("");
                    email.setText("");
                    epassword.setText("");
                    confirm.setText("");
                    hint.setText("");
                    eno.requestFocus();

                    MainActivity m = (MainActivity) getActivity();
                    m.login();


                }
            }
        });


           login.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   MainActivity m = (MainActivity) getActivity();
                   m.login();

               }
           });

        return v;


    }



    private boolean isValidEmail(String email) {
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    // validating password with retype password
    private boolean isValidPassword(String pass) {
        if (pass != null && pass.length() > 6) {
            return true;
        }
        return false;
    }

}
