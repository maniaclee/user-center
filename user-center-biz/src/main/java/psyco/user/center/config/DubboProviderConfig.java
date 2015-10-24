/**
 * pajk.com Inc.
 * Copyright (c) 2014-2014 All Rights Reserved.
 */
package psyco.user.center.config;

import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.ProviderConfig;
import com.alibaba.dubbo.config.spring.ServiceBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import psyco.user.center.client.service.UserService;

/**
 * Created by lipeng on 15/10/15.
 */
@Configuration
public class DubboProviderConfig extends DubboConfig {

    @Value("${dubbo.port}")
    private Integer port;


    @Value("${dubbo.provider.dubbo.version}")
    private String dubboExportVersion;

    @Value("${dubbo.provider.dubbo.timeout}")
    private int timeout;

    @Value("${dubbo.provider.dubbo.retries}")
    private int retries;


    @Bean
    public ProtocolConfig protocol() {
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setPort(port);
        return protocolConfig;
    }


    @Bean
    public ProviderConfig provider() {
        ProviderConfig providerConfig = new ProviderConfig();
        providerConfig.setMonitor(monitorConfig());
        return providerConfig;
    }


    private ServiceBean bean(Object service, Class<?> clz) {
        ServiceBean serviceBean = new ServiceBean();
        serviceBean.setProxy("javassist");
        serviceBean.setVersion(dubboExportVersion);
        serviceBean.setInterface(clz.getName());
        serviceBean.setRef(service);
        serviceBean.setTimeout(timeout);
        serviceBean.setRetries(retries);
        return serviceBean;
    }

    @Bean
    public ServiceBean<UserService> userServiceBean(UserService userService) {
        return bean(userService, UserService.class);
    }

}
