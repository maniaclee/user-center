/**
 * pajk.com Inc.
 * Copyright (c) 2014-2014 All Rights Reserved.
 */
package com.pajk.tradecenter;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.MonitorConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

/**
 * @author yuewenxin
 * @version v 0.1 2015-05-06 17:11:45 aaronyue Exp $$
 */
public class DubboBaseConfig {


    @Value("${dubbo.registry.url}")
    private String dubboRegistryUrl;


    @Bean
    public RegistryConfig registry() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress(dubboRegistryUrl);
        registryConfig.setProtocol("zookeeper");
        return registryConfig;
    }

    @Bean
    public ApplicationConfig application(@Value("${app.name}") String appName) {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName(appName);
        return applicationConfig;
    }

    @Bean
    public MonitorConfig monitorConfig() {
        MonitorConfig mc = new MonitorConfig();
        mc.setProtocol("registry");
        return mc;
    }




}
