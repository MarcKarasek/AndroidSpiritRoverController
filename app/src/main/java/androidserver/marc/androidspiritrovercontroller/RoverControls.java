package androidserver.marc.androidspiritrovercontroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.github.controlwear.virtual.joystick.android.JoystickView;

public class RoverControls extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rover_controls);

        JoystickView joystick1;
        joystick1 = (JoystickView) findViewById(R.id.joystick1);
        joystick1.setOnMoveListener(new JoystickView.OnMoveListener() {
            @Override
            public void onMove(int angle, int strength) {
                // do whatever you want
            }
        });

        JoystickView joystick2;
        joystick2 = (JoystickView) findViewById(R.id.joystick2);
        joystick2.setOnMoveListener(new JoystickView.OnMoveListener() {
            @Override
            public void onMove(int angle, int strength) {
                // do whatever you want
            }
        });

    }
}
