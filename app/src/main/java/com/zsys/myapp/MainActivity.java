package com.zsys.myapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText tdtext;


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //2.准备数据源
        String[] Data = {"think",
                "word",
                "what",
                "are",
                "you",
                "manager",
                "word",
                "what",
                "are",
                "you",
                "manager",
                "word",
                "what",
                "are",
                "you",
                "manager",
                "word",
                "what",
                "are",
                "you",
                "manager",
                "word",
                "what",
                "are",
                "you",
                "manager"
        };
        setContentView(R.layout.main);

//        <!--1.先拿到LIST变量-->
        ListView listview = (ListView) findViewById(R.id.lv);
        ArrayAdapter<String> ada = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Data);
        listview.setAdapter(ada);

//        Log.i("zhl", "what is are you ");
//        btn = (Button) findViewById(R.id.btnsearch);
//        btn.setOnClickListener(this);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String text = "hello world";
//                Toast.makeText(MainActivity.this, text, LENGTH_SHORT).show();
//            }
//        });

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
//        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


}
