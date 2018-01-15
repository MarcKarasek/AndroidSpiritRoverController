package androidserver.marc.androidspiritrovercontroller;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by MARC on 1/14/2018.
 */

public class send_srvr {

    private int betole(int val) throws IOException {
        return (((val & 0xff000000) >> 24) | ((val & 0x00ff0000) >> 8) | ((val & 0x0000ff00) << 8) | ((val & 0x000000ff) << 24));
    }

    private byte[] net_parameters() throws IOException {
        netparams default_params = new netparams();
        default_params.init_params();
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        DataOutputStream dataOut = new DataOutputStream(byteOut);
        dataOut.writeByte(default_params.netopcode);
        dataOut.writeByte(default_params.rsvd0);
        dataOut.writeByte(default_params.rsvd1);
        dataOut.writeByte(default_params.rsvd2);
        return byteOut.toByteArray();
    }

    private byte[] srvr_disconnect() throws IOException {
        netparams disconnect_params = new netparams();
        disconnect_params.disconnet();
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        DataOutputStream dataOut = new DataOutputStream(byteOut);
        dataOut.writeByte(disconnect_params.netopcode);
        dataOut.writeByte(disconnect_params.rsvd0);
        dataOut.writeByte(disconnect_params.rsvd1);
        dataOut.writeByte(disconnect_params.rsvd2);
        return byteOut.toByteArray();
    }

    private byte[] srvr_buzzer() throws IOException {
        netparams buzzer_params = new netparams();
        buzzer_params.buzzer();
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        DataOutputStream dataOut = new DataOutputStream(byteOut);
        dataOut.writeByte(buzzer_params.netopcode);
        dataOut.writeByte(buzzer_params.rsvd0);
        dataOut.writeByte(buzzer_params.rsvd1);
        dataOut.writeByte(buzzer_params.rsvd2);
        return byteOut.toByteArray();
    }

    private byte[] srvr_leds_all() throws IOException {
        netparams ledsall_params = new netparams();
        ledsall_params.leds_all();
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        DataOutputStream dataOut = new DataOutputStream(byteOut);
        dataOut.writeByte(ledsall_params.netopcode);
        dataOut.writeByte(ledsall_params.rsvd0);
        dataOut.writeByte(ledsall_params.rsvd1);
        dataOut.writeByte(ledsall_params.rsvd2);
        return byteOut.toByteArray();
    }

    private byte[] srvr_leds_right() throws IOException {
        netparams ledsright_params = new netparams();
        ledsright_params.leds_right();
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        DataOutputStream dataOut = new DataOutputStream(byteOut);
        dataOut.writeByte(ledsright_params.netopcode);
        dataOut.writeByte(ledsright_params.rsvd0);
        dataOut.writeByte(ledsright_params.rsvd1);
        dataOut.writeByte(ledsright_params.rsvd2);
        return byteOut.toByteArray();
    }

    private byte[] srvr_leds_left() throws IOException {
        netparams ledsleft_params = new netparams();
        ledsleft_params.leds_left();
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        DataOutputStream dataOut = new DataOutputStream(byteOut);
        dataOut.writeByte(ledsleft_params.netopcode);
        dataOut.writeByte(ledsleft_params.rsvd0);
        dataOut.writeByte(ledsleft_params.rsvd1);
        dataOut.writeByte(ledsleft_params.rsvd2);
        return byteOut.toByteArray();
    }

    private byte[] srvr_move_fwd() throws IOException {
        netparams movefwd_params = new netparams();
        movefwd_params.move_fwd();
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        DataOutputStream dataOut = new DataOutputStream(byteOut);
        dataOut.writeByte(movefwd_params.netopcode);
        dataOut.writeByte(movefwd_params.rsvd0);
        dataOut.writeByte(movefwd_params.rsvd1);
        dataOut.writeByte(movefwd_params.rsvd2);
        return byteOut.toByteArray();
    }

    private byte[] srvr_move_bkwd() throws IOException {
        netparams movebkwd_params = new netparams();
        movebkwd_params.move_bkwd();
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        DataOutputStream dataOut = new DataOutputStream(byteOut);
        dataOut.writeByte(movebkwd_params.netopcode);
        dataOut.writeByte(movebkwd_params.rsvd0);
        dataOut.writeByte(movebkwd_params.rsvd1);
        dataOut.writeByte(movebkwd_params.rsvd2);
        return byteOut.toByteArray();
    }

    private byte[] srvr_turn_left() throws IOException {
        netparams turnleft_params = new netparams();
        turnleft_params.turn_left();
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        DataOutputStream dataOut = new DataOutputStream(byteOut);
        dataOut.writeByte(turnleft_params.netopcode);
        dataOut.writeByte(turnleft_params.rsvd0);
        dataOut.writeByte(turnleft_params.rsvd1);
        dataOut.writeByte(turnleft_params.rsvd2);
        return byteOut.toByteArray();
    }

    private byte[] srvr_turn_right() throws IOException {
        netparams turnright_params = new netparams();
        turnright_params.turn_right();
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        DataOutputStream dataOut = new DataOutputStream(byteOut);
        dataOut.writeByte(turnright_params.netopcode);
        dataOut.writeByte(turnright_params.rsvd0);
        dataOut.writeByte(turnright_params.rsvd1);
        dataOut.writeByte(turnright_params.rsvd2);
        return byteOut.toByteArray();
    }

    private byte[] srvr_head_left() throws IOException {
        netparams headleft_params = new netparams();
        headleft_params.head_left();
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        DataOutputStream dataOut = new DataOutputStream(byteOut);
        dataOut.writeByte(headleft_params.netopcode);
        dataOut.writeByte(headleft_params.rsvd0);
        dataOut.writeByte(headleft_params.rsvd1);
        dataOut.writeByte(headleft_params.rsvd2);
        return byteOut.toByteArray();
    }

    private byte[] srvr_head_right() throws IOException {
        netparams headright_params = new netparams();
        headright_params.head_right();
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        DataOutputStream dataOut = new DataOutputStream(byteOut);
        dataOut.writeByte(headright_params.netopcode);
        dataOut.writeByte(headright_params.rsvd0);
        dataOut.writeByte(headright_params.rsvd1);
        dataOut.writeByte(headright_params.rsvd2);
        return byteOut.toByteArray();
    }


    private byte[] srvr_head_down() throws IOException {
        netparams headdown_params = new netparams();
        headdown_params.head_down();
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        DataOutputStream dataOut = new DataOutputStream(byteOut);
        dataOut.writeByte(headdown_params.netopcode);
        dataOut.writeByte(headdown_params.rsvd0);
        dataOut.writeByte(headdown_params.rsvd1);
        dataOut.writeByte(headdown_params.rsvd2);
        return byteOut.toByteArray();
    }

    private byte[] srvr_head_up() throws IOException {
        netparams headup_params = new netparams();
        headup_params.head_up();
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        DataOutputStream dataOut = new DataOutputStream(byteOut);
        dataOut.writeByte(headup_params.netopcode);
        dataOut.writeByte(headup_params.rsvd0);
        dataOut.writeByte(headup_params.rsvd1);
        dataOut.writeByte(headup_params.rsvd2);
        return byteOut.toByteArray();
    }

    private byte[] srvr_picture() throws IOException {
        netparams picture_params = new netparams();
        picture_params.picture();
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        DataOutputStream dataOut = new DataOutputStream(byteOut);
        dataOut.writeByte(picture_params.netopcode);
        dataOut.writeByte(picture_params.rsvd0);
        dataOut.writeByte(picture_params.rsvd1);
        dataOut.writeByte(picture_params.rsvd2);
        return byteOut.toByteArray();
    }

    private byte[] srvr_stop() throws IOException {
        netparams stop_params = new netparams();
        stop_params.stop();
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        DataOutputStream dataOut = new DataOutputStream(byteOut);
        dataOut.writeByte(stop_params.netopcode);
        dataOut.writeByte(stop_params.rsvd0);
        dataOut.writeByte(stop_params.rsvd1);
        dataOut.writeByte(stop_params.rsvd2);
        return byteOut.toByteArray();
    }

    private byte[] srvr_video_on() throws IOException {
        netparams videoon_params = new netparams();
        videoon_params.video_on();
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        DataOutputStream dataOut = new DataOutputStream(byteOut);
        dataOut.writeByte(videoon_params.netopcode);
        dataOut.writeByte(videoon_params.rsvd0);
        dataOut.writeByte(videoon_params.rsvd1);
        dataOut.writeByte(videoon_params.rsvd2);
        return byteOut.toByteArray();
    }

    private byte[] srvr_video_off() throws IOException {
        netparams videooff_params = new netparams();
        videooff_params.video_off();
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        DataOutputStream dataOut = new DataOutputStream(byteOut);
        dataOut.writeByte(videooff_params.netopcode);
        dataOut.writeByte(videooff_params.rsvd0);
        dataOut.writeByte(videooff_params.rsvd1);
        dataOut.writeByte(videooff_params.rsvd2);
        return byteOut.toByteArray();
    }

    send_srvr() {

    }
    // This is where we will connect to the server and send cmds in
    void send_initparams(String ipaddr, int port) throws IOException
    {
        byte[] initparams = net_parameters();

        DatagramSocket client_socket = new DatagramSocket();
        InetAddress IPAddress = InetAddress.getByName(ipaddr);
        DatagramPacket send_packet = new DatagramPacket(initparams, initparams.length, IPAddress, port);
        client_socket.send(send_packet);
    }

    void send_disconnect(String ipaddr, int port) throws IOException
    {
        byte[] initparams = srvr_disconnect();

        DatagramSocket client_socket = new DatagramSocket();
        InetAddress IPAddress = InetAddress.getByName(ipaddr);
        DatagramPacket send_packet = new DatagramPacket(initparams, initparams.length, IPAddress, port);
        client_socket.send(send_packet);
    }

    void srvr_kill(String ipaddr, int port) throws IOException
    {
        byte[] initparams = srvr_kill();

        DatagramSocket client_socket = new DatagramSocket();
        InetAddress IPAddress = InetAddress.getByName(ipaddr);
        DatagramPacket send_packet = new DatagramPacket(initparams, initparams.length, IPAddress, port);
        client_socket.send(send_packet);
    }

    void tcpstop(String ipaddr, int port) throws IOException
    {
        byte[] initparams = srvr_tcpstop();

        DatagramSocket client_socket = new DatagramSocket();
        InetAddress IPAddress = InetAddress.getByName(ipaddr);
        DatagramPacket send_packet = new DatagramPacket(initparams, initparams.length, IPAddress, port);
        client_socket.send(send_packet);
    }


}
