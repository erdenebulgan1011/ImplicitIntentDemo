package com.example.lab73;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnDial, btnWeb, btnGoogle, btnSearch, btnSms,
            btnGallery; @Override
    protected void onCreate(Bundle savedInstanceState)
    { super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDial = (Button) findViewById(R.id.btn_dial); btnWeb =
            (Button) findViewById(R.id.btn_web); btnGoogle = (Button)
            findViewById(R.id.btn_google); btnSearch = (Button)
            findViewById(R.id.btn_search); btnSms = (Button)
            findViewById(R.id.btn_sms); btnGallery = (Button)
            findViewById(R.id.btn_gallery);
        btnDial.setOnClickListener(new View.OnClickListener()
        { @Override
        public void onClick(View v) {
            Uri uri = Uri.parse("tel:89111145");
            Intent intent = new Intent(Intent.ACTION_DIAL,
                    uri); startActivity(intent);
        }
        });
        btnWeb.setOnClickListener(new View.OnClickListener()
        { @Override
        public void onClick(View v) {
            Uri uri = Uri.parse("http://must.edu.mn");
            Intent intent = new Intent(Intent.ACTION_VIEW,
                    uri); startActivity(intent);
        }
        });
        btnGoogle.setOnClickListener(new View.OnClickListener()
        { @Override
        public void onClick(View v) {
            Uri uri = Uri.parse("geo:47.9207334,106.9665429"); Intent intent = new
            Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }
        });
        btnSearch.setOnClickListener(new View.OnClickListener()
        { @Override
        public void onClick(View v) {
            Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
            intent.putExtra(SearchManager.QUERY, "Android");
            startActivity(intent);
        }
        });
        btnSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("smsto:89111143");
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.putExtra("sms_body", "Hello, Android test");
                startActivity(intent);
            }
        });
        btnGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                startActivity(intent);
            }
        });
    }
}