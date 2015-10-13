package com.pajk.tradecenter;

import com.pajk.tradecenter.util.SpringbootCompatibleVFS;
import com.pajk.troy.client.bootstrap.MonitorBootstrap;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.io.VFS;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
@EnableScheduling
@ComponentScan
public class ApplicationMain {

    static {
        VFS.addImplClass(SpringbootCompatibleVFS.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ApplicationMain.class, args);
        System.out.println(new SimpleDateFormat("[yyyy-MM-dd HH:mm:ss]").format(new Date())
                + "Tc service server started!");
    }

    @Bean(initMethod = "start")
    public MonitorBootstrap monitorBootstrap(@Value("${tc.provider.dubbo.version}") String env, @Value("${app.name}") String appName) {
        MonitorBootstrap.setLogStatEnable(true);
        MonitorBootstrap.setAppName(appName);
        MonitorBootstrap.setSpringStatEnable(true);
        MonitorBootstrap.setJdbcStatEnable(true);
        MonitorBootstrap.setMonitorEnable(true);
        MonitorBootstrap.setDubboProviderStatEnable(true);
        MonitorBootstrap.setDubboConsumerStatEnable(true);
        MonitorBootstrap.setRocketMQConsumerStatEnable(true);
        MonitorBootstrap.setRocketMQProducerStatEnable(true);
        MonitorBootstrap.setLogCollectionEnable(false);
        if (StringUtils.equalsIgnoreCase("INTEGRATION", env)) {
            MonitorBootstrap.getInstance().setAgentHost("10.0.128.189");
        }
        return MonitorBootstrap.getInstance();
    }
}
