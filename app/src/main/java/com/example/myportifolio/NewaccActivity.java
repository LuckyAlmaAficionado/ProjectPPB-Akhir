package com.example.myportifolio;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class NewaccActivity extends Activity {

    // Deklarasi EditText
    EditText editTextPassword;
    EditText editUsername;
    EditText editConfirmPassword;
    EditText editEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newacc);

        // Binding EditText
        editTextPassword = findViewById(R.id.new_pass);
        editEmail = findViewById(R.id.new_email);
        editConfirmPassword = findViewById(R.id.confirm_pass);
        editUsername = findViewById(R.id.new_username);
    }

    public void postChangePassword(View view) {
        // Validasi kosong
        if (TextUtils.isEmpty(editEmail.getText().toString().trim())) {
            Toast.makeText(view.getContext(), "Email harus diisi!", Toast.LENGTH_LONG).show();
        } else if (TextUtils.isEmpty(editTextPassword.getText().toString().trim())) {
            Toast.makeText(view.getContext(), "Isi Password Baru Anda!", Toast.LENGTH_LONG).show();
        } else if (TextUtils.isEmpty(editConfirmPassword.getText().toString().trim())) {
            Toast.makeText(view.getContext(), "Konfirmasi Password Baru Anda!", Toast.LENGTH_LONG).show();
        }
        // cek inputan new dan confirm
        else if (editTextPassword.getText().toString().equals(editConfirmPassword.getText().toString())) {
            Intent i = new Intent(NewaccActivity.this, SuccesActivity.class);
            startActivity(i);
        } else if (editTextPassword.getText().toString().equalsIgnoreCase(editConfirmPassword.getText().toString())) {
            Toast.makeText(view.getContext(), "Password harus sama", Toast.LENGTH_LONG).show();
        }
    }
}
