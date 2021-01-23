package com.candycoded.androidbridgelibrary;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.HapticFeedbackConstants;
import android.view.View;
import android.widget.Toast;

public class AndroidPlugin {

    private Context context;

    private Activity activity;

    public AndroidPlugin(Context context) {
        this.context = context;
        this.activity = (Activity)context;
    }

    public void ToastMakeText(String message, int length) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

    public void HapticFeedback(int hapticFeedbackConstant) {
        View view = activity.getWindow().getDecorView().findViewById(android.R.id.content);
        view.performHapticFeedback(hapticFeedbackConstant, HapticFeedbackConstants.FLAG_IGNORE_GLOBAL_SETTING);
    }

    public void ShowAlert(String title, String message) {
        AlertDialog alertDialog = new AlertDialog.Builder(context).create();
        alertDialog.setTitle(title);
        alertDialog.setMessage(message);
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        alertDialog.show();
    }

}
