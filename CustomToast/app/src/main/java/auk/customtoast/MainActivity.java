package auk.customtoast;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.bauk);
        b.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
//                LayoutInflater li = getLayoutInflater();
//                View v1 = li.inflate(R.layout.ctoast,null);
//                Toast aishu = new Toast(MainActivity.this);
//                aishu.setView(v1);
//                aishu.setGravity(Gravity.CENTER_HORIZONTAL,100,200);
//                aishu.setDuration(Toast.LENGTH_LONG);
//                aishu.show();

                LayoutInflater li = getLayoutInflater();
                View v2 = li.inflate(R.layout.cdialog,null);
                final EditText ed;
                Button b1;
               final  Dialog d = new Dialog(MainActivity.this);
                d.setContentView(v2);

                ed = (EditText) d.findViewById(R.id.cd);
                b1 = (Button) d.findViewById(R.id.bok);

                d.setTitle("Custom title");
                d.show();

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v)
                    {
                        Toast.makeText(MainActivity.this, "lolol "+ed.getText().toString(),
                                Toast.LENGTH_SHORT).show();

                        d.dismiss();

                    }
                });




            }
        });
    }
}
