/**
 * pajk.com Inc.
 * Copyright (c) 2014-2015 All Rights Reserved.
 */
package com.pajk.tradecenter;

import com.pajk.idgen.IDGenService;
import com.pajk.tradecenter.manager.IDPool;
import com.pajk.tradecenter.manager.id.IdPoolImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yuewenxin
 * @version v 0.1 15/6/16 15:46 aaronyue Exp $$
 */
@Configuration
public class IdgenConfig {

    @Value("${tc.id.generator.domain}")
    private String domain;

    @Value("#{globalIdGenerator}")
    private IDGenService globalIdGenerator;

    @Bean
    public IDPool refundTradeIdPool(@Value("${tc.service.order.refund.id.generator.key}") String configKey) {
        return new IdPoolImpl(domain, configKey, 20, globalIdGenerator);
    }

    @Bean
    public IDPool syncOutOrderId(@Value("${tc.outorder.id.generator.key}") String configKey) {
        return new IdPoolImpl(domain, configKey, 20, globalIdGenerator);
    }

    @Bean
    public IDPool bizOrderIdPool(@Value("${tc.order.id.generator.key}") String configKey) {
        return new IdPoolImpl(domain, configKey, 20, globalIdGenerator);
    }

    @Bean
    public IDPool serviceOrderIdPool(@Value("${tc.service.order.id.generator.key}") String configKey) {
        return new IdPoolImpl(domain, configKey, 20, globalIdGenerator);
    }

    @Bean
    public IDPool serviceOrderItemIdPool(@Value("${tc.service.order.item.id.generator.key}") String configKey) {
        return new IdPoolImpl(domain, configKey, 20, globalIdGenerator);
    }

    @Bean
    public IDPool rateIdPool(@Value("${tc.rate.id.generator.key}") String configKey) {
        return new IdPoolImpl(domain, configKey, 20, globalIdGenerator);
    }


    @Bean
    public IDPool creditTransIdPool(@Value("${credit.trans.id.generator.key}") String configKey) {
        return new IdPoolImpl(domain, configKey, 20, globalIdGenerator);
    }

    @Bean
    public IDPool lgOrderIdPool(@Value("${tc.lgorder.id.generator.key}") String configKey) {
        return new IdPoolImpl(domain, configKey, 20, globalIdGenerator);
    }

    @Bean
    public IDPool mqMsgIdPool(@Value("${tc.mq.msg.id.generator.key}") String configKey) {
        return new IdPoolImpl(domain, configKey, 20, globalIdGenerator);
    }
}
