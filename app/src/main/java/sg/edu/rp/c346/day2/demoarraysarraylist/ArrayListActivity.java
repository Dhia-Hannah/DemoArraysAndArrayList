package sg.edu.rp.c346.day2.demoarraysarraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ArrayListActivity extends AppCompatActivity {

    TextView tv;

    String title = "Fruits\n=====\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_list);

        tv = findViewById(R.id.textView2);

        //continue view the code in the worksheet

        ArrayList<String> fruits = new ArrayList<String>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.set(3, "durian"); // OR fruits.add("durian");

        // get second element
        String theFruit = fruits.get(1);

        // remove first element
        fruits.remove(0); // OR fruits.remove("apple");

        // change last element
        fruits.set(fruits.size(), "dargon fruit"); // OR fruits.set(3, "dargon fruit");

        String msg = "";
        msg += title;
        for (int i = 0; i < fruits.size(); i ++){
            msg += fruits.get(i) + "\n";
        }

        tv.setText(msg);

    }
}