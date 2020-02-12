package id.ac.polinema.androidlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	protected void onStart(){
		super.onStart();
		Toast.makeText(this, "App on Start",Toast.LENGTH_SHORT).show();
	}
	protected void onStop(){
		super.onStop();
		Toast.makeText(this, "App on Stop", Toast.LENGTH_SHORT).show();
	}
	protected void onRestart(){
		super.onRestart();
		Toast.makeText(this, "Application On Restart", Toast.LENGTH_SHORT).show();
	}
	protected void onResume() {
		super.onResume();
		Toast.makeText(this, "Application On Resume", Toast.LENGTH_SHORT).show();
	}
	@Override
	protected void onPause() {
		super.onPause();
		Toast.makeText(this, "Application On Pause", Toast.LENGTH_SHORT).show();
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Toast.makeText(this, "Application On Destroy", Toast.LENGTH_SHORT).show();
	}


}
