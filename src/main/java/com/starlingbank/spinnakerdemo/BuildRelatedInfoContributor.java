package com.starlingbank.spinnakerdemo;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class BuildRelatedInfoContributor implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {

    }

    /*private final BuildProperties buildProperties;

    @Autowired
    public BuildRelatedInfoContributor(BuildProperties buildProperties) {
        this.buildProperties = buildProperties;
    }



    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("Artifact", buildProperties.getArtifact());
        builder.withDetail("Version",buildProperties.getVersion());
        builder.withDetail("Group", buildProperties.getGroup());
        builder.withDetail("Name", buildProperties.getName());
        builder.withDetail("Time", buildProperties.getTime());
    }*/


}
