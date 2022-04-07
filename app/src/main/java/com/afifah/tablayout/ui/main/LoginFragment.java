package com.afifah.tablayout.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.afifah.tablayout.R;

public class LoginFragment extends Fragment  {

    String username = "Admin";
    String password = "admin123";
    EditText txt_user;
    EditText txt_pass;
    Button login;
    Button tutup;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmen_login, container, false);
        initComponent(view);

        login.setOnClickListener(View -> {
            if (txt_user.getText().toString().equalsIgnoreCase(username) && txt_pass.getText().toString().equalsIgnoreCase(password)) {
                Toast.makeText(getActivity(), "Berhasil Login", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getActivity(), "User atau Password Salah", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

    void initComponent(View view){
        txt_user = view.findViewById(R.id.txt_user);
        txt_pass = view.findViewById(R.id.txt_pass);
        login = view.findViewById(R.id.login);
        tutup = view.findViewById(R.id.tutup);
    }
}
