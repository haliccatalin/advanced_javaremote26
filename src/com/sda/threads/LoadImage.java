package com.sda.threads;

import java.util.concurrent.Callable;

public class LoadImage implements Callable<String> {

    @Override
    public String call() throws Exception {
        return "https://docs.jboss.org/jbossas/docs/Server_Configuration_Guide/4/html/images/deadlock-definition.jpg";
    }
}
