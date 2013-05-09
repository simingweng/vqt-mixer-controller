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
        System.loadLibrary("AmixWrapper");
    }
    /**
     * 
     */
    public ALSAMixerController() {
    }
    
    public native int controllMixer(String mixerName, int value);

}
