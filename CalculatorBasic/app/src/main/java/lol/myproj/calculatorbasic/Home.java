package lol.myproj.calculatorbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Home extends AppCompatActivity
{
    Button a,s,m,d;
    EditText n1,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        n1 = (EditText) findViewById(R.id.n1);
        n2 = (EditText) findViewById(R.id.n2);
       // int num1 = Integer.parseInt(n1.getText().toString());
       // int num2 = Integer.parseInt(n2.getText().toString());
        a = (Button) findViewById(R.id.badd);
        s = (Button) findViewById(R.id.bsub);
        m = (Button) findViewById(R.id.bmul);
        d = (Button) findViewById(R.id.bdiv);

        a.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (TextUtils.isEmpty(n1.getText().toString()) || TextUtils.isEmpty(n2.getText().toString()))
                {
                    Toast.makeText(Home.this, "Please enter a number", Toast.LENGTH_LONG).show();
                }
                else
                {
                    float num1 = Float.parseFloat(n1.getText().toString());
                    float num2 = Float.parseFloat(n2.getText().toString());
                    float addition = num1 + num2;
                    Toast.makeText(Home.this, "The addition is " + addition, Toast.LENGTH_SHORT).show();
                }
            }
        });

        s.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (TextUtils.isEmpty(n1.getText().toString()) || TextUtils.isEmpty(n2.getText().toString()))
                {
                    Toast.makeText(Home.this, "Please enter a number", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    float num1 = Float.parseFloat(n1.getText().toString());
                    float num2 = Float.parseFloat(n2.getText().toString());
                    float difference = num1-num2;
                    Toast.makeText(Home.this, "The difference is "+ difference, Toast.LENGTH_SHORT).show();
                }

            }
        });

        m.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (TextUtils.isEmpty(n1.getText().toString()) || TextUtils.isEmpty(n2.getText().toString()))
                {
                    Toast.makeText(Home.this, "Please enter a number", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    float num1 = Float.parseFloat(n1.getText().toString());
                    float num2  =Float.parseFloat(n2.getText().toString());
                    float product = num1*num2;
                    Toast.makeText(Home.this, "The product is "+ product, Toast.LENGTH_SHORT).show();
                }

            }
        });

        d.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (TextUtils.isEmpty(n1.getText().toString()) || TextUtils.isEmpty(n2.getText().toString()))
                {
                    Toast.makeText(Home.this, "Please enter a number", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    float num1 = Float.parseFloat(n1.getText().toString());
                    float num2 = Float.parseFloat(n2.getText().toString());
                    float division = num1/num2;
                    Toast.makeText(Home.this, "The division is "+ division, Toast.LENGTH_SHORT).show();

                }

            }
        });
    }
}
