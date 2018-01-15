package androidserver.marc.androidspiritrovercontroller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.IOException;

public class SrvrLogin extends AppCompatActivity {


    public static final String IPADDR = "ipaddr";
    public static final String UDPPORT = "port";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_srvr_login);
    }

    /* Called when the user taps the Connect button */
    public void server_connect(View view) throws IOException {
        send_srvr srvr_snd = new send_srvr();
        Intent intent = new Intent(this, DemoCode.class);
        EditText IpAddr = (EditText) findViewById(R.id.editIpAddr);
        String ipaddr = IpAddr.getText().toString();
        EditText Port = (EditText) findViewById(R.id.editPort);
        int port = Integer.valueOf(Port.getText().toString());
        // Send the initial paramters to the server
        srvr_snd.send_initparams(ipaddr, port);
        intent.putExtra(IPADDR, ipaddr);
        intent.putExtra(UDPPORT, port);
        startActivity(intent);

    }

}
