package com.afifah.tablayout.ui.main;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.afifah.tablayout.R;

import cn.pedant.SweetAlert.SweetAlertDialog;


public class AlertFragment extends Fragment {

    Button buttonAlert;
    Button buttonWarning;
    Button buttonToast;
    Button buttonCustome;
    Button buttonLoading;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_alert, container, false);
        initComponent(view);
        // 1. Alert messag
        buttonAlert.setOnClickListener(v -> new SweetAlertDialog(requireContext())
                .setTitleText("Hi! This is Afifah")
                .show());

        // 2. Confirmation message
        buttonWarning.setOnClickListener(v -> new SweetAlertDialog(requireContext(), SweetAlertDialog.WARNING_TYPE)
                .setTitleText("Are you sure? Go to Isekai")
                .setContentText("You will not be able to return to the world!")
                .setConfirmText("Yes!")
                .setConfirmClickListener(SweetAlertDialog::dismissWithAnimation)
                .setCancelButton("Cancel", SweetAlertDialog::dismissWithAnimation)
                .show());

        // 3. Toast message
        buttonToast.setOnClickListener(v -> {
            // Displaying simple Toast message
            Toast.makeText(requireContext(), "Hey! This is Toast", Toast.LENGTH_LONG)
                    .show();
        });

        // 4. Custome message
        buttonCustome.setOnClickListener(v -> {
            SweetAlertDialog pDialog = new SweetAlertDialog(requireContext(), SweetAlertDialog.CUSTOM_IMAGE_TYPE);
            pDialog.setTitleText("Woops!");
            pDialog.setContentText("Here's an Android Logo.");
            pDialog.setCustomImage(R.drawable.android_developer_logo_170920110556);
            pDialog.show();
        });

        // 5. Loading message
        buttonLoading.setOnClickListener(v -> {
            SweetAlertDialog pDialog = new SweetAlertDialog(requireContext(), SweetAlertDialog.PROGRESS_TYPE);
            pDialog.getProgressHelper().setBarColor(Color.parseColor("#A5DC86"));
            pDialog.setTitleText("Go to Isekai...");
            pDialog.setCancelable(true);
            pDialog.show();
        });
        return view;
    }

    void initComponent(View view){
        buttonAlert = view.findViewById(R.id.alertButton);
        buttonWarning = view.findViewById(R.id.confirmationButton);
        buttonToast = view.findViewById(R.id.toastButton);
        buttonCustome = view.findViewById(R.id.customeButton);
        buttonLoading = view.findViewById(R.id.loadingButton);
    }
}
