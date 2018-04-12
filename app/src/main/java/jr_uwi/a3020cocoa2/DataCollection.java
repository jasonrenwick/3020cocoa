package jr_uwi.a3020cocoa2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebSettings;

/**
 * Created by Jason on 9/18/2017.
 */

public class DataCollection extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_collection);
        WebView simpleWebView=(WebView) findViewById(R.id.simpleWebView);
        WebSettings webSettings = simpleWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
// specify the url of the web page in loadUrl function
        simpleWebView.loadUrl("http://10.0.2.2:8000/");
    }

}
