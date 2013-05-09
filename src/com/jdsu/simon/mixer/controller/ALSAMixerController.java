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
        // TODO Auto-generated constructor stub
    }
    
    private native void controllMixer(String mixerName, int value);

}
