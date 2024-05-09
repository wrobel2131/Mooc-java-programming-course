/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author other21
 */
public class Timer {
    private ClockHand miliSeconds;
    private ClockHand seconds;
    
    public Timer() {
        this.miliSeconds = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    
    public void advance() {
        this.miliSeconds.advance();
        if(this.miliSeconds.value() == 0) {
            this.seconds.advance();
        }
    }
    
    public String toString() {
        String secondsValue = seconds.value() > 10 ? String.valueOf(seconds.value()) : "0"+seconds.value();
        String miliSecondsValue = miliSeconds.value() > 10 ? String.valueOf(miliSeconds.value()) : "0"+miliSeconds.value();
        return secondsValue + ":" + miliSecondsValue;
    }
    
}
