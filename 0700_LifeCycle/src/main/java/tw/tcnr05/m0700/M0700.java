package tw.tcnr05.m0700;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class M0700 extends AppCompatActivity {
    private static final String    TAG = "tcnr05=>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0700);
        Log.d(TAG, "顯示onCreate");
        setupViewconponent();
    }

    private void setupViewconponent() {
        int a=9999+123;
        Log.d(TAG, "setupViewconponent"+a);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "顯示onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "顯示onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "顯示onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "顯示onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.m0000, menu);
        return true;
    }

    public void onBackPressed() {
        // super.onBackPressed();
        Toast.makeText(getApplication(),"禁用返回鍵",Toast.LENGTH_SHORT).show();
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            this.finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}





