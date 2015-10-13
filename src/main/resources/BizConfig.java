/**
 * pajk.com Inc.
 * Copyright (c) 2014-2015 All Rights Reserved.
 */
package com.pajk.tradecenter;

import com.pajk.tradecenter.manager.order.checker.BaseBizChecker;
import com.pajk.tradecenter.manager.order.checker.CheckList;
import com.taobao.tair.impl.DefaultTairManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * @author yuewenxin
 * @version v 0.1 15/6/16 14:09 aaronyue Exp $$
 */
@Configuration
public class BizConfig {

    @Bean
    public CheckList checkList(BaseBizChecker doctorOutChecker, BaseBizChecker guideDoctorConsultChecker,
                               BaseBizChecker healthEntityCardChecker, BaseBizChecker oldHealthAdviceChecker,
                               BaseBizChecker renewalsChecker, BaseBizChecker specialistDoctorConsultChecker) {

        CheckList checkList = new CheckList();
        checkList.setBaseBizCheckerList(Arrays.asList(doctorOutChecker, guideDoctorConsultChecker, healthEntityCardChecker, oldHealthAdviceChecker, renewalsChecker, specialistDoctorConsultChecker));
        return checkList;
    }

    @Bean(initMethod = "init", destroyMethod = "close")
    public DefaultTairManager tairManager(@Value("${tair.configServer.main}") String mainServer,
                                          @Value("${tair.configServer.slave}") String slaveServer,
                                          @Value("${tair.groupName.per}") String groupName,
                                          @Value("${tair.timeout}") int timeout) {
        DefaultTairManager defaultTairManager = new DefaultTairManager();
        defaultTairManager.setConfigServerList(Arrays.asList(mainServer, slaveServer));
        defaultTairManager.setGroupName(groupName);
        defaultTairManager.setTimeout(timeout);
        return defaultTairManager;
    }
}
