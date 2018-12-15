package daily.quote.project.dailyquote;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Main extends AppCompatActivity {

    List<String> list;
    TextView textView;
    Data data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = new Data();
        list = data.LoadData();
        textView = findViewById(R.id.textView);

       // for (int i=0; i < list.size(); i++) {
         //   textView.setText(list.get(i));
       // }
        int random = (int )(Math.random() * 2 + 1);
        textView.setText(String.valueOf(random));
    }
}
