package com.example.projekt;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatDialogFragment;

public class AboutDialog extends AppCompatDialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Om appen")
                .setMessage("Denna appen är till för dig som letar efter den perfekta " +
                        "för just dig. Här kan du enkelt och smidigt läsa om olika hundraser. " +
                        "För tillfället finns bara en handfull raser med begränsad information " +
                        "i appen då den är i ett väldigt tidigt stadie.")
                .setPositiveButton("STÄNG", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
        return builder.create();
    }
}