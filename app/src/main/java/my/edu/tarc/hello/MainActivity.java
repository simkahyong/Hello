package my.edu.tarc.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewMessage; // TextView = Class
                                     // textViewMessage = instance

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        //onCreate = main function

        setContentView(R.layout.activity_main);
        //show me the UI
        //R = resources
        //layout = folder


        textViewMessage = findViewById(R.id.textViewMessage);

    }

    public void showMessage(View view){
        textViewMessage.setText("Hello my love Amrie69");
    }
}
