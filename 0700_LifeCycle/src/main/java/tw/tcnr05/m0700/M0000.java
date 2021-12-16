package tw.tcnr05.m0700;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class M0000 extends AppCompatActivity {
    //*******************************************************************************************
    @Override
    public void onBackPressed() {
//super.onBackPressed();//不執行這行
        Toast.makeText(getApplication(), "禁用返回鍵", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.m0000, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch (item.getItemId()) {
            case R.id.action_about:
                break;
            case R.id.action_settings:
                this.finish();

                break;
        }

        return super.onOptionsItemSelected(item);
    }
    //*******************************************************************************************









}