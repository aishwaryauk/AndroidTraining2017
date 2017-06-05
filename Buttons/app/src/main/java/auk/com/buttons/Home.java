package auk.com.buttons;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Home extends AppCompatActivity
{
    Button a,b,c,d;
    LinearLayout blay;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        blay = (LinearLayout) findViewById(R.id.aukbuttons);
        a = (Button) findViewById(R.id.bcolor);
        a.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
               blay.setBackgroundColor(Color.parseColor("#5b2121"));
            }
        });

        b = (Button) findViewById(R.id.bimage);
        b.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                blay.setBackgroundResource(R.drawable.hills);
            }
        });

        c = (Button) findViewById(R.id.btext);
        c.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                c.setText("TEXT CHANGED!!");
            }
        });

        d = (Button) findViewById(R.id.bdisappear);
        d.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                a.setVisibility(View.INVISIBLE);
                b.setVisibility(View.INVISIBLE);
                c.setVisibility(View.INVISIBLE);
                d.setVisibility(View.INVISIBLE);
            }
        });
    }
}
