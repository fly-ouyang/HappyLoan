package fly.com.happyloan.Activity.Me.Setting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import fly.com.happyloan.R;

public class Setting_FeedBackActivity extends AppCompatActivity implements View.OnClickListener {

    EditText me_setting_feedback_edtiText;
    LinearLayout me_setting_feedback_phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_feed_back);
        me_setting_feedback_edtiText = (EditText) findViewById(R.id.me_setting_feedback_edtiText);
        me_setting_feedback_phone = (LinearLayout) findViewById(R.id.me_setting_feedback_phone);
        listener();
    }

    public void submit(View view){
        Toast.makeText(Setting_FeedBackActivity.this, "提交按钮！", Toast.LENGTH_SHORT).show();
    }

    public void back(View view){
        finish();
    }

    public void listener(){
        me_setting_feedback_phone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(Setting_FeedBackActivity.this, "电话！", Toast.LENGTH_SHORT).show();
    }
}
