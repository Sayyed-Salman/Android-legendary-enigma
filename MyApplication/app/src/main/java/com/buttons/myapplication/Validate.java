package com.buttons.myapplication;
import android.widget.EditText;

public class Validate {

    // Error Messages
    String REQUIRED_MSG = "Required";

    // Calling Methods


    // has text
    public boolean hasText(EditText ed){
        String text = ed.getText().toString().trim();
        ed.setError(null);

        if(text.length() == 0){
            ed.setError(REQUIRED_MSG);
            return false;
        }
        return true;
    }


    public boolean isValid(EditText ed,String err,boolean required){

        if(required && !hasText(ed)) return false;

        if(hasText(ed)){
            return true;
        }else {
            ed.setError(err);
        }

        return true;
    }

}
