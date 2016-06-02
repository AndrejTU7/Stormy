package com.example.andrej.stormy.ui;

        import android.app.AlertDialog;
        import android.app.Dialog;
        import android.app.DialogFragment;
        import android.content.Context;
        import android.os.Bundle;

        import com.example.andrej.stormy.R;

/**
 * Created by Andrej on 4.11.2015..
 */
public class AlertDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context) // ta metoda ce biti pozvana kada stvorimo dialog
                .setTitle(R.string.errror_title)
                .setMessage(R.string.error_message)
                .setPositiveButton(R.string.error_ok_button_text, null); // null ce samo zatvoriti dialog ne poduzimajuci daljnje radnje
        AlertDialog dialog = builder.create(); // tu stvaramo dialog pomocu onDialog metode
        return dialog;

    }
}
