package androidserver.marc.androidspiritrovercontroller;

/**
 * Created by MARC on 1/14/2018.
 */

public class netparams {


    private static final int NET_BUZZER = 0x10;
    private static final int NET_LEDS_ALL = 0x11;
    private static final int NET_LEDS_LEFT = 0x12;
    private static final int NET_LEDS_RIGHT = 0x13;
    private static final int NET_MOVE_FWD = 0x14;
    private static final int NET_MOVE_BKWD = 0x15;
    private static final int NET_TURN_LEFT = 0x16;
    private static final int NET_TURN_RIGHT = 0x17;
    private static final int NET_HEAD_LEFT = 0x18;
    private static final int NET_HEAD_RIGHT = 0x19;
    private static final int NET_HEAD_DOWN = 0x1A;
    private static final int NET_HEAD_UP = 0x1B;
    private static final int NET_PICTURE = 0x1C;
    private static final int NET_STOP = 0x1D;
    private static final int NET_INIT_PARAMS = 0x1E;
    private static final int NET_CLIENT_DC = 0x1F;
    private static final int NET_VIDEO_ON = 0x20;
    private static final int NET_VIDEO_OFF= 0x21;


    byte netopcode;
    byte rsvd0;
    byte rsvd1;
    byte rsvd2;

    netparams() {
    }

    void init_params() {
        netopcode = NET_INIT_PARAMS;
        rsvd0 = 0;
        rsvd1 = 0;
        rsvd2 = 0;
    }

    void buzzer() {
        netopcode = NET_BUZZER;
        rsvd0 = 0;
        rsvd1 = 0;
        rsvd2 = 0;
    }

    void leds_all() {
        netopcode = NET_LEDS_ALL;
        rsvd0 = 0;
        rsvd1 = 0;
        rsvd2 = 0;
    }

    void leds_left() {
        netopcode = NET_LEDS_LEFT;
        rsvd0 = 0;
        rsvd1 = 0;
        rsvd2 = 0;
    }

    void leds_right() {
        netopcode = NET_LEDS_RIGHT;
        rsvd0 = 0;
        rsvd1 = 0;
        rsvd2 = 0;
    }

    void move_fwd() {
        netopcode = NET_MOVE_FWD;
        rsvd0 = 0;
        rsvd1 = 0;
        rsvd2 = 0;
    }

    void move_bkwd() {
        netopcode = NET_MOVE_BKWD;
        rsvd0 = 0;
        rsvd1 = 0;
        rsvd2 = 0;
    }

    void turn_left() {
        netopcode = NET_TURN_LEFT;
        rsvd0 = 0;
        rsvd1 = 0;
        rsvd2 = 0;
    }

    void turn_right() {
        netopcode = NET_TURN_RIGHT;
        rsvd0 = 0;
        rsvd1 = 0;
        rsvd2 = 0;
    }

    void head_left() {
        netopcode = NET_HEAD_LEFT;
        rsvd0 = 0;
        rsvd1 = 0;
        rsvd2 = 0;
    }

    void head_right() {
        netopcode = NET_HEAD_RIGHT;
        rsvd0 = 0;
        rsvd1 = 0;
        rsvd2 = 0;
    }

    void head_down() {
        netopcode = NET_HEAD_DOWN;
        rsvd0 = 0;
        rsvd1 = 0;
        rsvd2 = 0;
    }

    void head_up() {
        netopcode = NET_HEAD_UP;
        rsvd0 = 0;
        rsvd1 = 0;
        rsvd2 = 0;
    }

    void picture() {
        netopcode = NET_PICTURE;
        rsvd0 = 0;
        rsvd1 = 0;
        rsvd2 = 0;
    }

    void stop() {
        netopcode = NET_STOP;
        rsvd0 = 0;
        rsvd1 = 0;
        rsvd2 = 0;
    }

    void video_on() {
        netopcode = NET_VIDEO_ON;
        rsvd0 = 0;
        rsvd1 = 0;
        rsvd2 = 0;
    }

    void video_off() {
        netopcode = NET_VIDEO_OFF;
        rsvd0 = 0;
        rsvd1 = 0;
        rsvd2 = 0;
    }

    void disconnet() {
        netopcode = NET_CLIENT_DC;
        rsvd0 = 0;
        rsvd1 = 0;
        rsvd2 = 0;
    }

}
