package com.ability44.cashoutcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends BaseActivity {

	public EditText et100d, et50d, et20d, et10d, et5d, et1d, et25c, et10c,
			et5c, et1c, et25r, et10r, et5r, et1r;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void calculate(View view) {
		double total = 0.00;
		et100d = (EditText) findViewById(R.id.et_100d);
		et50d = (EditText) findViewById(R.id.et_50d);
		et20d = (EditText) findViewById(R.id.et_20d);
		et10d = (EditText) findViewById(R.id.et_10d);
		et5d = (EditText) findViewById(R.id.et_5d);
		et1d = (EditText) findViewById(R.id.et_1d);
		et25c = (EditText) findViewById(R.id.et_25c);
		et10c = (EditText) findViewById(R.id.et_10c);
		et5c = (EditText) findViewById(R.id.et_5c);
		et1c = (EditText) findViewById(R.id.et_1c);
		et25r = (EditText) findViewById(R.id.et_25r);
		et10r = (EditText) findViewById(R.id.et_10r);
		et5r = (EditText) findViewById(R.id.et_5r);
		et1r = (EditText) findViewById(R.id.et_1r);

		if (et100d.getText().toString().equals("") != true) {
			int amount = (Integer.parseInt(et100d.getText().toString()) * 100);
			total = amount + total;
		}
		if (et50d.getText().toString().equals("") != true) {
			int amount = (Integer.parseInt(et50d.getText().toString()) * 50);
			total = amount + total;
		}
		if (et20d.getText().toString().equals("") != true) {
			int amount = (Integer.parseInt(et20d.getText().toString()) * 20);
			total = amount + total;
		}
		if (et10d.getText().toString().equals("") != true) {
			int amount = (Integer.parseInt(et10d.getText().toString()) * 10);
			total = amount + total;
		}
		if (et5d.getText().toString().equals("") != true) {
			int amount = (Integer.parseInt(et5d.getText().toString()) * 5);
			total = amount + total;
		}
		if (et1d.getText().toString().equals("") != true) {
			int amount = (Integer.parseInt(et1d.getText().toString()) * 1);
			total = amount + total;
		}
		if (et25c.getText().toString().equals("") != true) {
			double amount = (Double.parseDouble(et25c.getText().toString()) * 0.25);
			total = amount + total;
		}
		if (et10c.getText().toString().equals("") != true) {
			double amount = (Double.parseDouble(et10c.getText().toString()) * 0.10);
			total = amount + total;
		}
		if (et5c.getText().toString().equals("") != true) {
			double amount = (Double.parseDouble(et5c.getText().toString()) * 0.05);
			total = amount + total;
		}
		if (et1c.getText().toString().equals("") != true) {
			double amount = (Double.parseDouble(et1c.getText().toString()) * 0.01);
			total = amount + total;
		}
		if (et25r.getText().toString().equals("") != true) {
			double amount = (Double.parseDouble(et25r.getText().toString()) * 10.00);
			total = amount + total;
		}
		if (et10r.getText().toString().equals("") != true) {
			double amount = (Double.parseDouble(et10r.getText().toString()) * 5.00);
			total = amount + total;
		}
		if (et5r.getText().toString().equals("") != true) {
			double amount = (Double.parseDouble(et5r.getText().toString()) * 2.00);
			total = amount + total;
		}
		if (et1r.getText().toString().equals("") != true) {
			double amount = (Double.parseDouble(et1r.getText().toString()) * 0.50);
			total = amount + total;
		}

		Toast.makeText(this, String.valueOf(total), Toast.LENGTH_LONG).show();
	}
}
