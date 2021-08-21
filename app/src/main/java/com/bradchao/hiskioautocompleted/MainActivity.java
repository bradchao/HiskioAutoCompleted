package com.bradchao.hiskioautocompleted;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private AutoCompleteTextView pname;
    private TextView display;
    private String[] pnames = {"趙令文","趙令一","趙令二","趙令三","bbb","bbc","bbd"};
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pname = findViewById(R.id.pname);
        display = findViewById(R.id.display);

        adapter = new ArrayAdapter<>(this,
                R.layout.support_simple_spinner_dropdown_item,
                pnames);
        pname.setAdapter(adapter);
        pname.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String item = adapterView.getItemAtPosition(i).toString();
        display.setText(item);
    }
}