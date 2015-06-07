package com.example.sj.order_check;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    private CheckBox pizza,burger,sandwich;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        order();
    }

    public void order(){

        pizza=(CheckBox)findViewById(R.id.checkBox);
        burger=(CheckBox)findViewById(R.id.checkBox2);
        sandwich=(CheckBox)findViewById(R.id.checkBox3);
        btn=(Button)findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int totalamt=0;
                StringBuilder res=new StringBuilder();
                res.append("Your order:");
                if(pizza.isChecked()){

                    res.append("\nPizza: Rs.100/-");
                    totalamt+=100;
                }

                if(burger.isChecked()){

                    res.append("\nBurger: Rs.120/-");
                    totalamt+=120;
                }

                if(sandwich.isChecked()){

                    res.append("\nSandwich: Rs.150/-");
                    totalamt+=150;
                }
                res.append("\nTotal ammount:"+ totalamt+ "Rs/-");

                Toast.makeText(getApplicationContext(),res.toString(),Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
