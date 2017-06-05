package auk.customlistdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Aishwarya UK on 31-May-17.
 */

public class AdapterAishu extends BaseAdapter
{
    Context con;
    Integer [] cimg; // img stored as integer
    String [] cname, cnumber;
    LayoutInflater li;

    public AdapterAishu(Context con, Integer[] cimg, String[] cname, String[] cnumber)
    {
        this.con = con;
        this.cimg = cimg;
        this.cname = cname;
        this.cnumber = cnumber;
        li = LayoutInflater.from(con);
    }

    @Override
    public int getCount()
    {
        return cname.length;
    }

    @Override
    public Object getItem(int position)
    {
        return cimg;
    }

    @Override
    public long getItemId(int position)
    {
        return 0;
    }

    ImageView iv;
    TextView tv1,tv2;

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View v1 = li.inflate(R.layout.clist, null);
        iv = (ImageView) v1.findViewById(R.id.iv);
        tv1 = (TextView) v1.findViewById(R.id.name);
        tv2 = (TextView) v1.findViewById(R.id.number);

        iv.setImageResource(cimg[position]);
        tv1.setText(cname[position]);
        tv2.setText(cnumber[position]);

        return v1;
    }
}
