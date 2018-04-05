package com.springboot.contributor;

import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class UserInfoContributor implements InfoContributor {

    @Override
    public void contribute(final Builder builder) {
        
        final int userCount = 8; // Dynamic db call
        
        builder.withDetail("user-count", userCount);  // /info outputs as user-count: 8
    }
}
