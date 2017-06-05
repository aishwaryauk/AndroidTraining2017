package auk.conecttoxampp;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity
{

    @Override

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Aishu().execute("http://10.0.0.2/azure/helloworld.php"); // emulator - 10.0.0.2
    }

    class Aishu extends AsyncTask<String, String, String>
    {
        @Override
        protected void onPreExecute()
        {
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(String s)
        {
            super.onPostExecute(s);
            //Toast.makeText(MainActivity.this, "" + s, Toast.LENGTH_SHORT).show();
            try
            {
                JSONArray ja = new JSONArray(s);
                for (int i=0; i<ja.length(); i++)
                {
                    JSONObject jo = ja.getJSONObject(i);
                    Toast.makeText(MainActivity.this, ""+ jo.getString("sname"), Toast.LENGTH_SHORT).show();
                }
            }
            catch (JSONException e)
            {
                e.printStackTrace();
            }

        }

        @Override
        protected String doInBackground(String... params)
        {
            OkHttpClient ohc = new OkHttpClient();
            Request req = new Request.Builder().url(params[0]).build();
            try
            {
                Response res = ohc.newCall(req).execute();
                return res.body().string(); // returning respnse to the user
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }


            return null;
        }
    }


}
