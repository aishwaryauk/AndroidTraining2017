package ameerpet.componentdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class Component extends AppCompatActivity
{
    CheckBox cbia;
    Button blogin; //same name as id or different name
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_component);
        cbia = (CheckBox) findViewById(R.id.cbia);
        blogin = (Button) findViewById(R.id.blogin);
        cbia.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    blogin.setVisibility(View.VISIBLE);
                }
                else
                {
                    blogin.setVisibility(View.GONE);
                }
            }
        });
    }
}
