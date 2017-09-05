/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zm.pblp.configuration;

import com.zm.rabbitmqservice.RMQConfiguration;

/**
 *
 * @author zmiller
 */
public enum LogHost implements RMQConfiguration{

    LOCAL("localhost"),
    PROD("localhost");
    
    private final String value;

    private LogHost(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
