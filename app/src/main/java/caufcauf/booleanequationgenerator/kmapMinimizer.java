package caufcauf.booleanequationgenerator;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class kmapMinimizer extends Activity {



    Switch[][] inputs = new Switch[4][2];
    TextView test;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kmap_minimizer);

        Log.i("kmapMinimizer","Hello World!");

        Button simplify = (Button) findViewById(R.id.simplify);
        test = (TextView) findViewById(R.id.textView);

        inputs[0][0] = (Switch) findViewById(R.id._00);
        inputs[0][1] = (Switch) findViewById(R.id._01);

        inputs[1][0] = (Switch) findViewById(R.id._10);
        inputs[1][1] = (Switch) findViewById(R.id._11);

        inputs[2][0] = (Switch) findViewById(R.id._20);
        inputs[2][1] = (Switch) findViewById(R.id._21);

        inputs[3][0] = (Switch) findViewById(R.id._30);
        inputs[3][1] = (Switch) findViewById(R.id._31);


        for (int i = 0; i < 4; i++)
            for (int j = 0; j > 2; j++)
            {
               // test.setText("HELLO");
                Log.i("kmapMinimizer","Setting OnClickListener");
                inputs[i][j].setText("Ocho Sinco?");
                inputs[i][j].setOnCheckedChangeListener(switchListener);    // or onClickListener???????
            }

    }


    // This method is used to handle switch change events.
    // As of now, it only changes the text from 0 to 1 or vice versa.

    View.OnClickListener switchListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };


    public void minimizeEquations (View v) {

        // 1st. Determine adjacent pairs
        //      a: left-right
        //      b: up-down




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.kmap_minimizer, menu);
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
