package auk.customlistdemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity
{
    ListView lv;
    Integer[] img = {R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5};
    String[]  name = {"a","b","c","d","e"};
    String[]  number = {"1","2","3","4","5"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.lv);
        AdapterAishu aa = new AdapterAishu(MainActivity.this,img,name,number);
        lv.setAdapter(aa);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Intent call = new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+number[position]));
                startActivity(call);

            }
        });

    }
}
