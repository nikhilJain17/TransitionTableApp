package caufcauf.booleanequationgenerator;

import android.app.Activity;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;


public class TwoFlipFlops extends Activity {

    /* EditText ns_00 = (EditText) findViewById(R.id.ns_00);
     EditText ns_10 = (EditText) findViewById(R.id.ns_10);
     EditText ns_20 = (EditText) findViewById(R.id.ns_20);
     EditText ns_30 = (EditText) findViewById(R.id.ns_30);
     EditText ns_40 = (EditText) findViewById(R.id.ns_40);
     EditText ns_50 = (EditText) findViewById(R.id.ns_50);
     EditText ns_60 = (EditText) findViewById(R.id.ns_60);
     EditText ns_70 = (EditText) findViewById(R.id.ns_70);

     EditText ns_01 = (EditText) findViewById(R.id.ns_01);
     EditText ns_11 = (EditText) findViewById(R.id.ns_11);
     EditText ns_21 = (EditText) findViewById(R.id.ns_21);
     EditText ns_31 = (EditText) findViewById(R.id.ns_31);
     EditText ns_41 = (EditText) findViewById(R.id.ns_41);
     EditText ns_51 = (EditText) findViewById(R.id.ns_51);
     EditText ns_61 = (EditText) findViewById(R.id.ns_61);
     EditText ns_71 = (EditText) findViewById(R.id.ns_71);
 */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_flip_flops);

        // first column
        Switch sw00 = (Switch) findViewById(R.id.sw00);
        Switch sw10 = (Switch) findViewById(R.id.sw10);
        Switch sw20 = (Switch) findViewById(R.id.sw20);
        Switch sw30 = (Switch) findViewById(R.id.sw30);
        Switch sw40 = (Switch) findViewById(R.id.sw40);
        Switch sw50 = (Switch) findViewById(R.id.sw50);
        Switch sw60 = (Switch) findViewById(R.id.sw60);
        Switch sw70 = (Switch) findViewById(R.id.sw70);

        // second column

        Switch sw01 = (Switch) findViewById(R.id.sw01);
        Switch sw11 = (Switch) findViewById(R.id.sw11);
        Switch sw21 = (Switch) findViewById(R.id.sw21);
        Switch sw31 = (Switch) findViewById(R.id.sw31);
        Switch sw41 = (Switch) findViewById(R.id.sw41);
        Switch sw51 = (Switch) findViewById(R.id.sw51);
        Switch sw61 = (Switch) findViewById(R.id.sw61);
        Switch sw71 = (Switch) findViewById(R.id.sw71);

        // set listeners for first column
        sw00.setOnClickListener(zeroOrOneListener);
        sw10.setOnClickListener(zeroOrOneListener);
        sw20.setOnClickListener(zeroOrOneListener);
        sw30.setOnClickListener(zeroOrOneListener);
        sw40.setOnClickListener(zeroOrOneListener);
        sw50.setOnClickListener(zeroOrOneListener);
        sw60.setOnClickListener(zeroOrOneListener);
        sw70.setOnClickListener(zeroOrOneListener);

        // set listeners for second column
        sw01.setOnClickListener(zeroOrOneListener);
        sw11.setOnClickListener(zeroOrOneListener);
        sw21.setOnClickListener(zeroOrOneListener);
        sw31.setOnClickListener(zeroOrOneListener);
        sw41.setOnClickListener(zeroOrOneListener);
        sw51.setOnClickListener(zeroOrOneListener);
        sw61.setOnClickListener(zeroOrOneListener);
        sw71.setOnClickListener(zeroOrOneListener);

        // when you click the go button
        Button go = (Button) findViewById(R.id.go);


    }

    public void showBooleanEquations (String eq1, String eq2){

        // add a string to the bundle (current state?)
        Bundle bundle = new Bundle();

        bundle.putString("D1", eq1);
        bundle.putString("D2", eq2);

        // set the bundle (with string) as an argument
        DialogFragment equations = new DisplayFormulasFragment();
        equations.setArguments(bundle);

        equations.show(getFragmentManager(), "");

    }

  /*  public void CalculateDInputs () {
        // array of booleans to see if they are clicked
        boolean[][] isClicked = new boolean[8][2];
        // what minterms to use
        int [] minterms = new int[8];

        // initialize first row
        // THERE ARE VIEW ARRAYS???!Q!?!?!?!?!?!?!??!?!?!? SHOOT.
        isClicked[0][0] = sw00.isChecked();
        isClicked[1][0] = sw10.isChecked();
        isClicked[2][0] = sw20.isChecked();
        isClicked[3][0] = sw30.isChecked();
        isClicked[4][0] = sw40.isChecked();
        isClicked[5][0] = sw50.isChecked();
        isClicked[6][0] = sw60.isChecked();
        isClicked[7][0] = sw70.isChecked();
        // initialize second row
        isClicked[0][1] = sw01.isChecked();
        isClicked[1][1] = sw11.isChecked();
        isClicked[2][1] = sw21.isChecked();
        isClicked[3][1] = sw31.isChecked();
        isClicked[4][1] = sw41.isChecked();
        isClicked[5][1] = sw51.isChecked();
        isClicked[6][1] = sw61.isChecked();
        isClicked[7][1] = sw71.isChecked();

        // now find the values for next state that are selected
        // these values are the exact same for the d outputs, so you can easily find the equations!

        for(int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                if(isClicked[i][j])
                {
                    ;
                }
            }
        }
    }*/

    public void GoButtonClick (View view) {

        // display the equations
        TextView d1 = (TextView) findViewById(R.id.d1);

        // first column
        Switch sw00 = (Switch) findViewById(R.id.sw00);
        Switch sw10 = (Switch) findViewById(R.id.sw10);
        Switch sw20 = (Switch) findViewById(R.id.sw20);
        Switch sw30 = (Switch) findViewById(R.id.sw30);
        Switch sw40 = (Switch) findViewById(R.id.sw40);
        Switch sw50 = (Switch) findViewById(R.id.sw50);
        Switch sw60 = (Switch) findViewById(R.id.sw60);
        Switch sw70 = (Switch) findViewById(R.id.sw70);

        // second column

        Switch sw01 = (Switch) findViewById(R.id.sw01);
        Switch sw11 = (Switch) findViewById(R.id.sw11);
        Switch sw21 = (Switch) findViewById(R.id.sw21);
        Switch sw31 = (Switch) findViewById(R.id.sw31);
        Switch sw41 = (Switch) findViewById(R.id.sw41);
        Switch sw51 = (Switch) findViewById(R.id.sw51);
        Switch sw61 = (Switch) findViewById(R.id.sw61);
        Switch sw71 = (Switch) findViewById(R.id.sw71);


        // array of booleans to see if they are clicked
        boolean[][] isClicked = new boolean[8][2];
        // what minterms to use
        int [] mintermsD1 = new int[8];
        int [] mintermsD2 = new int[8];

        // initialize first row
        // THERE ARE VIEW ARRAYS???!Q!?!?!?!?!?!?!??!?!?!? SHOOT.
        isClicked[0][0] = sw00.isChecked();
        isClicked[1][0] = sw10.isChecked();
        isClicked[2][0] = sw20.isChecked();
        isClicked[3][0] = sw30.isChecked();
        isClicked[4][0] = sw40.isChecked();
        isClicked[5][0] = sw50.isChecked();
        isClicked[6][0] = sw60.isChecked();
        isClicked[7][0] = sw70.isChecked();
        // initialize second row
        isClicked[0][1] = sw01.isChecked();
        isClicked[1][1] = sw11.isChecked();
        isClicked[2][1] = sw21.isChecked();
        isClicked[3][1] = sw31.isChecked();
        isClicked[4][1] = sw41.isChecked();
        isClicked[5][1] = sw51.isChecked();
        isClicked[6][1] = sw61.isChecked();
        isClicked[7][1] = sw71.isChecked();
        // actual equation
        String equationD1 = "";
        String equationD2 = "";
        // used to append strings
        StringBuffer sb = new StringBuffer(40);

        // now find the values for next state that are selected
        // these values are the exact same for the d outputs, so you can easily find the equations!
//==================================================================================================
        // calculate d equations for 1st column

            // convert switches into booleans

        for(int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                if(isClicked[i][j] && j == 0)   // if there is a zero in the first column
                {
                    // here we are concerned with the rows, so we pay attention to the i's
                    mintermsD1[i] = 1;

                }

                else if(isClicked[i][j] && j == 1) // if there is a one in the second column
                {
                    //Toast.makeText(this, "True -> " + i + j, Toast.LENGTH_SHORT).show();

                    mintermsD2[i] = 1;
                }

                else if (!isClicked[i][j] && (j == 0))
                {
                    mintermsD1[i] = 0;
                }

                else if (!isClicked[i][j] && (j==1))
                {
                    mintermsD2[i] = 0;
                }
                  //  Toast.makeText(this, "No tru", Toast.LENGTH_SHORT).show();
            }
        }
//==================================================================================================
        // calculate d equations for d2
        for (int i = 0; i < 8; i++)
        {
            if (mintermsD2[i] == 0) // if there is a zero in the minterm (WE DONT CARE ABOUT IT THEN), only care about 1's
            {
                continue;
                //Toast.makeText(this, "ocho sinco", Toast.LENGTH_SHORT).show();
            }

            else if (mintermsD2[i] == 1) // its a 1? we are interested in it!
            {
                switch (i)
                {
                    case 0:
                        equationD2 = sb.append("(!Qa & !Qb & !In) + ").toString();
                        break;

                    case 1:
                        equationD2 = sb.append(" (!Qa & !Qb & In) + ").toString();
                        break;

                    case 2:
                        equationD2 = sb.append(" (!Qa & Qb & !In) + ").toString();
                        break;

                    case 3:
                        equationD2 = sb.append(" (!Qa & Qb & In) + ").toString();
                        break;

                    case 4:
                        equationD2 = sb.append(" (Qa & !Qb & !In) + ").toString();
                        break;

                    case 5:
                        equationD2 = sb.append(" (Qa & !Qb & In) + ").toString();
                        break;

                    case 6:
                        equationD2 = sb.append(" (Qa & Qb & !In) + ").toString();
                        break;

                    case 7:
                        equationD2 = sb.append(" (Qa & Qb & In)  ").toString();
                        break;

                    default:
                        break;
                }

            }

        }

        Log.i("YOLOOOO",equationD2);

//==================================================================================================
            // analyze d1



        // iterate through all minterms
        for (int i = 0; i < 8; i++)
        {
            if (mintermsD1[i] == 0) // if there is a zero in the minterm (WE DONT CARE ABOUT IT THEN), only care about 1's
            {
                continue;
                //Toast.makeText(this, "ocho sinco", Toast.LENGTH_SHORT).show();
            }

            else if (mintermsD1[i] == 1) // its a 1? we are interested in it!
            {
                switch (i)
                {
                    case 0:
                        equationD1 = sb.append("(!Qa & !Qb & !In) + ").toString();
                        break;

                    case 1:
                        equationD1 = sb.append(" (!Qa & !Qb & In) + ").toString();
                        break;

                    case 2:
                        equationD1 = sb.append(" (!Qa & Qb & !In) + ").toString();
                        break;

                    case 3:
                        equationD1 = sb.append(" (!Qa & Qb & In) + ").toString();
                        break;

                    case 4:
                        equationD1 = sb.append(" (Qa & !Qb & !In) + ").toString();
                        break;

                    case 5:
                        equationD1 = sb.append(" (Qa & !Qb & In) + ").toString();
                        break;

                    case 6:
                        equationD1 = sb.append(" (Qa & Qb & !In) + ").toString();
                        break;

                    case 7:
                        equationD1 = sb.append(" (Qa & Qb & In)  ").toString();
                        break;

                    default:
                        break;
                }

            }

        }

        //Log.i("MyActivity", "MyClass.getView() — get item number " + position);

        Log.i("MYACTIVITY","Eq. D1 =>" + equationD1);

        // gets rid of last "+ "
        if((equationD1.length() > 2) && (equationD2.length() > 2)) {

            equationD1 = equationD1.substring(0, equationD1.length() - 2);
            equationD2 = equationD2.substring(0, equationD2.length() - 2);
        }






        // NOTE: You need to pass a string array, so this is a quick fix. I made a string array that equals the string so we can pass it through
        // (ALTHOUGH WE COULD JUST CAST IT) 

        showBooleanEquations(equationD1, equationD2);

        //DialogFragment equations = new DisplayFormulasFragment();

        //equations.show(getFragmentManager(), "");


    }

    // toggles text between 0 and 1 depending on what is clicked
    View.OnClickListener zeroOrOneListener = new View.OnClickListener() {


        public void onClick(View view) {

            Switch sw = (Switch) view;

            if (sw.isChecked())
                sw.setText("1");

            else
                sw.setText("0");
        }



    };































/*    public boolean validateText (int input) {

        // is the input of the next state a 0 or 1?
        if (input == 0 || input == 0) {
            Toast.makeText(this, "Valid input", Toast.LENGTH_SHORT).show();
            return true;
        }

        else {
            Toast.makeText(this, "Invalid input! 0 or 1", Toast.LENGTH_SHORT).show();
            return false;
        }

    }
*/
  /*  public void clear () {

        EditText ns_00 = (EditText) findViewById(R.id.ns_00);
        EditText ns_10 = (EditText) findViewById(R.id.ns_10);
        EditText ns_20 = (EditText) findViewById(R.id.ns_20);
        EditText ns_30 = (EditText) findViewById(R.id.ns_30);
        EditText ns_40 = (EditText) findViewById(R.id.ns_40);
        EditText ns_50 = (EditText) findViewById(R.id.ns_50);
        EditText ns_60 = (EditText) findViewById(R.id.ns_60);
        EditText ns_70 = (EditText) findViewById(R.id.ns_70);

        EditText ns_01 = (EditText) findViewById(R.id.ns_01);
        EditText ns_11 = (EditText) findViewById(R.id.ns_11);
        EditText ns_21 = (EditText) findViewById(R.id.ns_21);
        EditText ns_31 = (EditText) findViewById(R.id.ns_31);
        EditText ns_41 = (EditText) findViewById(R.id.ns_41);
        EditText ns_51 = (EditText) findViewById(R.id.ns_51);
        EditText ns_61 = (EditText) findViewById(R.id.ns_61);
        EditText ns_71 = (EditText) findViewById(R.id.ns_71);

            ns_00.setText("");
            ns_10.setText("");
            ns_20.setText("");
            ns_30.setText("");
            ns_40.setText("");
            ns_50.setText("");
            ns_60.setText("");
            ns_70.setText("");

            ns_01.setText("");
            ns_11.setText("");
            ns_21.setText("");
            ns_31.setText("");
            ns_41.setText("");
            ns_51.setText("");
            ns_61.setText("");
            ns_71.setText("");

    }

    public void calculate (View v) {

        EditText ns_00 = (EditText) findViewById(R.id.ns_00);
        EditText ns_10 = (EditText) findViewById(R.id.ns_10);
        EditText ns_20 = (EditText) findViewById(R.id.ns_20);
        EditText ns_30 = (EditText) findViewById(R.id.ns_30);
        EditText ns_40 = (EditText) findViewById(R.id.ns_40);
        EditText ns_50 = (EditText) findViewById(R.id.ns_50);
        EditText ns_60 = (EditText) findViewById(R.id.ns_60);
        EditText ns_70 = (EditText) findViewById(R.id.ns_70);

        EditText ns_01 = (EditText) findViewById(R.id.ns_01);
        EditText ns_11 = (EditText) findViewById(R.id.ns_11);
        EditText ns_21 = (EditText) findViewById(R.id.ns_21);
        EditText ns_31 = (EditText) findViewById(R.id.ns_31);
        EditText ns_41 = (EditText) findViewById(R.id.ns_41);
        EditText ns_51 = (EditText) findViewById(R.id.ns_51);
        EditText ns_61 = (EditText) findViewById(R.id.ns_61);
        EditText ns_71 = (EditText) findViewById(R.id.ns_71);

        int[][] ns_values = new int[8][8];


    try {
        ns_values[0][0] = Integer.valueOf(ns_00.getText().toString());
        ns_values[1][0] = Integer.valueOf(ns_10.getText().toString().trim());
        ns_values[2][0] = Integer.valueOf(ns_20.getText().toString().trim());
        ns_values[3][0] = Integer.valueOf(ns_30.getText().toString().trim());
        ns_values[4][0] = Integer.valueOf(ns_40.getText().toString().trim());
        ns_values[5][0] = Integer.valueOf(ns_50.getText().toString().trim());
        ns_values[6][0] = Integer.valueOf(ns_60.getText().toString().trim());
        ns_values[7][0] = Integer.valueOf(ns_70.getText().toString().trim());

        ns_values[0][1] = Integer.valueOf(ns_01.getText().toString().trim());
        ns_values[1][1] = Integer.valueOf(ns_11.getText().toString().trim());
        ns_values[2][1] = Integer.valueOf(ns_21.getText().toString().trim());
        ns_values[3][1] = Integer.valueOf(ns_31.getText().toString().trim());
        ns_values[4][1] = Integer.valueOf(ns_41.getText().toString().trim());
        ns_values[5][1] = Integer.valueOf(ns_51.getText().toString().trim());
        ns_values[6][1] = Integer.valueOf(ns_61.getText().toString().trim());
        ns_values[7][1] = Integer.valueOf(ns_71.getText().toString().trim());
    }
    catch (NumberFormatException n) {

        Toast.makeText(this, "God dammit", Toast.LENGTH_SHORT).show();

    }

        boolean valid = false;


        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                valid = validateText(ns_values[i][j]);
            }

        }

        // had to initialize, might have to change the init if it doesnt work
        if (!valid) {
            clear();
            Toast.makeText(this, "no", Toast.LENGTH_SHORT).show();
        }

        // if the input is valid, go on

        else {
            Toast.makeText(this, "yes", Toast.LENGTH_SHORT).show();

       // finish();



        }

    }

*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.two_flip_flops, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
