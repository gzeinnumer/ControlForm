package com.gzeinnumer.cf;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class ControlForm {

    private final ArrayList<EditText> views;

    public ControlForm() {
        views = new ArrayList<>();
    }

    public void addForm(EditText view) {
        views.add(view);
    }

    public void addForm(ArrayList<EditText> view) {
        views.addAll(view);
    }

    public void addForm(EditText view, ControlFormCallBack controlFormCallBack) {
        view.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.toString().length() > 0)
                    controlFormCallBack.afterTextChanged(s);
                else
                    controlFormCallBack.afterTextChanged(null);
            }
        });
        views.add(view);
    }

    public void addForm(EditText view, ControlFormCallBackDisableSpace controlFormCallBack) {
        view.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.toString().length() > 0) {
                    if (s.length() > 0 && s.toString().charAt(0) == ' ') {
                        final String newText = s.toString().substring(1);
                        view.setText(newText);
                        view.setSelection(newText.length());
                    } else {
                        controlFormCallBack.afterTextChanged(s);
                    }
                } else
                    controlFormCallBack.afterTextChanged(null);
            }
        });
        views.add(view);
    }

    public void addForm(EditText view, ControlFormCallBackDisableZero controlFormCallBack) {
        view.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.toString().length() > 0) {
                    if (s.length() > 0 && s.toString().charAt(0) == '0') {
                        final String newText = s.toString().substring(1);
                        view.setText(newText);
                        view.setSelection(newText.length());
                    } else {
                        controlFormCallBack.afterTextChanged(s);
                    }
                } else
                    controlFormCallBack.afterTextChanged(null);
            }
        });
        views.add(view);
    }

    public void addForm(EditText view, ControlFormCallBackDisableZeroSpace controlFormCallBack) {
        view.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.toString().length() > 0){
                    if (s.length() > 0 && (s.toString().charAt(0) == ' ' || s.toString().charAt(0) == '0')) {
                        final String newText = s.toString().substring(1);
                        view.setText(newText);
                        view.setSelection(newText.length());
                    } else {
                        controlFormCallBack.afterTextChanged(s);
                    }
                }
                else
                    controlFormCallBack.afterTextChanged(null);
            }
        });
        views.add(view);
    }

    public void clearForm() {
        for (EditText editText : views) {
            editText.setText(null);
        }
    }

    public void disableAllForm() {
        for (EditText editText : views) {
            editText.setEnabled(false);
        }
    }

    public void enableAllForm() {
        for (EditText editText : views) {
            editText.setEnabled(true);
        }
    }
}
