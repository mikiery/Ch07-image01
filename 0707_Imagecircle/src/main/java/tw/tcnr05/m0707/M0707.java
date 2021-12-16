package tw.tcnr05.m0707;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class M0707 extends AppCompatActivity implements View.OnClickListener {


    private TextView ans;
    private CircleImgbutton imag02;
    private CircleImgView imag01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0707);
        setupViewComponent();
    }

    private void setupViewComponent() {
        ans = (TextView) findViewById(R.id.m0707_t001);
        imag01=(CircleImgView)findViewById(R.id.circleImgView);
        imag02=(CircleImgbutton)findViewById(R.id.circleImgbutton);
        // ---啟動監聽事件----
        imag01.setOnClickListener(this);
        imag02.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
    switch (v.getId()){
        case R.id.circleImgView:
            ans.setText("這是圓形圖");

        break;
        case  R.id.circleImgbutton:
        ans .setText("這是按鈕圖形");
        break;
    }


    }
}