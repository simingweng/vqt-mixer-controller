/**
 * 
 */
package com.jdsu.simon.mixer.controller;

/**
 * @author simingweng
 *
 */
public class ALSAMixerController {

    static{
        System.loadLibrary("amixwrapper");
    }
    /**
     * 
     */
    public ALSAMixerController() {
    }
    
    public void setInCallMusicDelivery(boolean on){
        String[] arguments = {"mixer_name", on ? "1" : "0"};
        controllMixer(arguments);
    }
    
    public native int controllMixer(String[] args);

}
