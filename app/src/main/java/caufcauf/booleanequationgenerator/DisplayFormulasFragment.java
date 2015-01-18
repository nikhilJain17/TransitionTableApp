package caufcauf.booleanequationgenerator;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

/**
 * Used to display the formulas for the d inputs; there is no room left on the screen!
 */
public class DisplayFormulasFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder dialog = new AlertDialog.Builder(getActivity()); // builds the fragment (o rly?)

        dialog.setTitle("Boolean Equations: ");

        String D1 = getArguments().getString("D1");
        String D2 = getArguments().getString("D2");

        dialog.setMessage("D1: " + D1 + "\n\n D2: " + D2);

        // builds the OK button and its listener
        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                // you have to use getActivity instead of this for the context because you are no longer in an activity class, you are in a fragment!
                //Toast.makeText(getActivity(), "You clicked ok", Toast.LENGTH_SHORT).show();


            }
        });

        return dialog.create();
    }


}
