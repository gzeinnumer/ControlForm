package com.gzeinnumer.controlform;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Toast;

import com.gzeinnumer.cf.ControlForm;
import com.gzeinnumer.cf.ControlFormCallBack;
import com.gzeinnumer.cf.ControlFormCallBackDisableSpace;
import com.gzeinnumer.cf.ControlFormCallBackDisableZero;
import com.gzeinnumer.cf.ControlFormCallBackDisableZeroSpace;
import com.gzeinnumer.controlform.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initView();
    }

    private void initView() {
        ControlForm controlForm = new ControlForm();

        controlForm.addForm(binding.ed1);
        controlForm.addForm(binding.ed2, new ControlFormCallBack() {
            @Override
            public void afterTextChanged(@Nullable Editable s) {
                if (s==null)
                    Toast.makeText(MainActivity.this, "null", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, s.toString(), Toast.LENGTH_SHORT).show();
            }
        });

        binding.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controlForm.clearForm();
            }
        });
    }
}