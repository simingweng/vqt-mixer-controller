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
        controllMixer("", on ? 1 : 0);
    }
    
    public native int controllMixer(String mixerName, int value);

}
