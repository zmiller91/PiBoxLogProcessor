/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zm.pblp.client;

import com.zm.pblp.Api;
import com.zm.pblp.configuration.LogChannel;
import com.zm.pblp.configuration.LogHost;
import com.zm.pblp.model.GeneralLog;
import com.zm.rabbitmqservice.RMQClient;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;

/**
 *
 * @author zmiller
 */
public class LogClient extends RMQClient implements Api{

    public LogClient(LogHost host, LogChannel channel, int executorPoolSize) 
            throws IOException, TimeoutException {
        super(host.getValue(), channel.getValue(), executorPoolSize);
    }

//    public void log(GeneralLog message) {
//        this.makeRequest("log", message);
//    }

    @Override
    public GeneralLog log(GeneralLog message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void testVoid(GeneralLog message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Map<String, String>> testComplexType(GeneralLog message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
