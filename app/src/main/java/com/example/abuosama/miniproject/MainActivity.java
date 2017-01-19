package com.example.abuosama.miniproject;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {



    public  void student(){

        StudentTable studentTable=new StudentTable();
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.replace(R.id.container1,studentTable);
        transaction.addToBackStack(null);
        transaction.commit();

    }



    public  void welcomePage(){

        WelcomeFirstPageFrag fragwelcome=new WelcomeFirstPageFrag();
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.replace(R.id.container1,fragwelcome);
        transaction.addToBackStack(null);
        transaction.commit();

    }


    public  void login(){

        FragLogin fragLogin=new FragLogin();
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.replace(R.id.container1,fragLogin);
        transaction.addToBackStack(null);
        transaction.commit();



    }

   public void registerData(){
       FragRegister fragRegister=new FragRegister();

       FragmentManager manager=getSupportFragmentManager();
       FragmentTransaction transaction=manager.beginTransaction();
       transaction.replace(R.id.container1,fragRegister);
       transaction.addToBackStack(null);
       transaction.commit();
   }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragWelcomeScreen fragWelcomeScreen=new FragWelcomeScreen();
        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.add(R.id.container1,fragWelcomeScreen);
        transaction.commit();


    }
}
