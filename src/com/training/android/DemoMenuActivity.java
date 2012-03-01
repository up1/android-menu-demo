package com.training.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class DemoMenuActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater menuInflater = getMenuInflater();
		menuInflater.inflate(R.layout.menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		switch (item.getItemId()) {
		case R.id.menu_bookmark:
			// Single menu item is selected do something
			// Ex: launching new activity/screen or show alert message
			Toast.makeText(DemoMenuActivity.this, "Bookmark is Selected",
					Toast.LENGTH_SHORT).show();
			return true;
		case R.id.menu_save:
			Toast.makeText(DemoMenuActivity.this, "Save is Selected",
					Toast.LENGTH_SHORT).show();
			return true;
		case R.id.menu_search:
			Toast.makeText(DemoMenuActivity.this, "Search is Selected",
					Toast.LENGTH_SHORT).show();
			return true;
		case R.id.menu_share:
			Intent sendIntent = new Intent(Intent.ACTION_SEND);		
			sendIntent.putExtra(android.content.Intent.EXTRA_TEXT, "TEST TEST FROM MY ANDROID APP.");
			sendIntent.setType("text/plain");
			startActivity(Intent.createChooser(sendIntent, "เลือกสักทาง"));
			return true;
		case R.id.menu_delete:
			Toast.makeText(DemoMenuActivity.this, "Delete is Selected",
					Toast.LENGTH_SHORT).show();
			return true;
		case R.id.menu_preferences:
			Toast.makeText(DemoMenuActivity.this,
					"Preferences is Selected", Toast.LENGTH_SHORT).show();
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}

}