package com.github.probonopd.hdmi;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        try {
            // Create intent to launch the HDMI activity
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.setComponent(new ComponentName(
                "com.softwinner.awlivetv",
                "com.softwinner.awlivetv.MainActivity"
            ));
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            
            // Launch the HDMI activity
            startActivity(intent);
            
            // Close this activity
            finish();
            
        } catch (Exception e) {
            // Show error message if HDMI app is not available
            Toast.makeText(this, 
                "HDMI app not found. Please ensure the device supports HDMI.", 
                Toast.LENGTH_LONG).show();
            finish();
        }
    }
}
