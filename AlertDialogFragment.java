package bigdogconsultants.co.uk.stormy2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by stevehunter on 06/02/15.
 */
public class AlertDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context)
                                            .setTitle(context.getString(R.string.error_title))
                                            .setMessage(context.getString(R.string.error_message))
                                            .setPositiveButton(context.getString(R.string.error_OK_button_text), null);

        AlertDialog dialog = builder.create();
        return dialog;

    }
}
