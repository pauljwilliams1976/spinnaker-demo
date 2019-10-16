package com.starlingbank.spinnakerdemo;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class StartTimeContributor implements InfoContributor {

    private static final long startTimeMillis = System.currentTimeMillis();
    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("Start time", startTimeMillis);
    }
}
