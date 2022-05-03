package in.codingtimes.labexe3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    int num;
    Button b, b2, b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) this.findViewById(R.id.textview2);
        b = (Button) this.findViewById(R.id.button);
        b2 = (Button) this.findViewById(R.id.button2);
        b3 = (Button) this.findViewById(R.id.button3);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = Integer.parseInt(textView.getText().toString());
                num++;
                textView.setText(Integer.toString(num));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              num =0;
              textView.setText(Integer.toString(num));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = Integer.parseInt(textView.getText().toString());
                num--;
                textView.setText(Integer.toString(num));
            }
        });


    }

}