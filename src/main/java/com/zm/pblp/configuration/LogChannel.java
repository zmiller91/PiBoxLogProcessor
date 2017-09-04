/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zm.pblp.configuration;

/**
 *
 * @author zmiller
 */
public enum LogChannel {
    
    LOGS("logs");

    private final String value;

    private LogChannel(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
