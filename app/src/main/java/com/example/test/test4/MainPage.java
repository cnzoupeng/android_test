package com.example.test.test4;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


public class MainPage extends ActionBarActivity {
    protected static final String TAG = "MainPage";
    private View currentButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main_page);

        initComponents();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_page, menu);
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

    private void initComponents() {
        ImageButton btn_one = (ImageButton) findViewById(R.id.buttom_one);
        ImageButton btn_two = (ImageButton) findViewById(R.id.buttom_two);
        ImageButton btn_three = (ImageButton) findViewById(R.id.buttom_three);

        btn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                Fragment_One fragment_one = new Fragment_One();
                ft.replace(R.id.fl_content, fragment_one, MainPage.TAG);
                ft.commit();
                setButton(v);

            }
        });

        btn_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                Fragment_Two fragment_two = new Fragment_Two();
                ft.replace(R.id.fl_content, fragment_two, MainPage.TAG);
                ft.commit();
                setButton(v);

            }
        });


        btn_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                Fragment_Three fragment_three = new Fragment_Three();
                ft.replace(R.id.fl_content, fragment_three, MainPage.TAG);
                ft.commit();
                setButton(v);
            }
        });

        btn_one.performClick();
    }

    private void setButton(View v) {
        if (currentButton != null && currentButton.getId() != v.getId()) {
            currentButton.setEnabled(true);
        }
        v.setEnabled(false);
        currentButton = v;
    }
}
