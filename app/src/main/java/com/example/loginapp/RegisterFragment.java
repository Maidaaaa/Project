package com.example.loginapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class RegisterFragment extends Fragment {
     Button b1;

    public RegisterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_register, container, false);

        b1 = v.findViewById(R.id.btn_register);
        b1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
LoginFragment loginFragment = new LoginFragment();
                FragmentTransaction transaction =getFragmentManager().beginTransaction();
                transaction.replace(R.id.mainLayout,loginFragment);
                transaction.commit();
            }});
            return v;




    }
}