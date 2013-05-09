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
    
    public native int controllMixer(String mixerName, int value);

}
