package in.paraman.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private String string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle", "onCreate invoked activity A");
        Button clickButton = findViewById(R.id.click_for_secondActivity);
        clickButton.setOnClickListener(this);
        stringValue(string);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle", "onStart invoked activity A");
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.d("lifecycle", "onPostCreate invoked activity A");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle", "onResume invoked activity A");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle", "onPause invoked activity A");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle", "onStop invoked activity A");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle", "onRestart invoked activity A");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle", "onDestroy invoked activity A");
    }

    public void openActivity() {


    Intent intent = new Intent(this, SecondActivity.class);
    //EditText editText = (EditText) findViewById(R.id.editText);
    String message = "SecondActivity opened";
        intent.putExtra(EXTRA_MESSAGE,message);

    startActivity(intent);
}

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.click_for_secondActivity:
                openActivity();
                break;
        }
    }

    public String stringValue(String s)
    {
        if (s.equals("Hello"))
            return "Success";
        else
            return "Failure";
    }
}
