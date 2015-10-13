/**
 * pajk.com Inc.
 * Copyright (c) 2014-2015 All Rights Reserved.
 */
package com.pajk.tradecenter;

import com.pajk.tradecenter.rocketmq.common.BaseConsumer;
import com.pajk.tradecenter.rocketmq.consumer.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yuewenxin
 * @version v 0.1 15/6/16 15:47 aaronyue Exp $$
 */
@Configuration
public class MQconsumerConfig {

    @Value("${rocketmq.domain.name}")
    private String domain;

    @Value("${rocketmq.domain.group}")
    private String group;

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BaseConsumer orderEnableDoneConsumer() {
        BaseConsumer c = new OrderEnableDoneConsumer();
        c.setGroup(group);
        c.setNameServer(domain);
        return c;
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BaseConsumer orderPaidDoneConsumer() {
        BaseConsumer c = new OrderPaidDoneConsumer();
        c.setGroup(group);
        c.setNameServer(domain);
        return c;
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BaseConsumer shippedDoneConsumer() {
        BaseConsumer c = new ShippedDoneConsumer();
        c.setGroup(group);
        c.setNameServer(domain);
        return c;
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BaseConsumer tradeSuccessConsumer() {
        BaseConsumer c = new TradeSuccessConsumer();
        c.setGroup(group);
        c.setNameServer(domain);
        return c;
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BaseConsumer lgOrderSendGoodsConsumer() {
        BaseConsumer c = new LgOrderSendGoodsConsumer();
        c.setGroup(group);
        c.setNameServer(domain);
        return c;
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BaseConsumer lgOrderCreateConsumer() {
        BaseConsumer c = new LgOrderCreateConsumer();
        c.setGroup(group);
        c.setNameServer(domain);
        return c;
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BaseConsumer creditExchangeConsumer() {
        BaseConsumer c = new CreditExchangeConsumer();
        c.setGroup(group);
        c.setNameServer(domain);
        return c;
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BaseConsumer CreditDistributeConsumer() {
        BaseConsumer c = new CreditDistributeConsumer();
        c.setGroup(group);
        c.setNameServer(domain);
        return c;
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BaseConsumer PaygwPaidDoneConsumer() {
        BaseConsumer c = new PaygwPaidDoneConsumer();
        c.setGroup(group);
        c.setNameServer(domain);
        return c;
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BaseConsumer PaygwPrepayDoneConsumer() {
        BaseConsumer c = new PaygwPrepayDoneConsumer();
        c.setGroup(group);
        c.setNameServer(domain);
        return c;
    }


    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BaseConsumer CardPassSendConsumer() {
        BaseConsumer c = new CardPassSendConsumer();
        c.setGroup(group);
        c.setNameServer(domain);
        return c;
    }


    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BaseConsumer VoucherBindAddCreditConsumer() {
        BaseConsumer c = new VoucherBindAddCreditConsumer();
        c.setGroup(group);
        c.setNameServer(domain);
        return c;
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BaseConsumer ServiceRecordConsumer() {
        BaseConsumer c = new ServiceRecordConsumer();
        c.setGroup(group);
        c.setNameServer(domain);
        return c;
    }


    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BaseConsumer CloseOrderConsumer() {
        BaseConsumer c = new CloseOrderConsumer();
        c.setGroup(group);
        c.setNameServer(domain);
        return c;
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BaseConsumer ServiceFinishDoneConsumer() {
        BaseConsumer c = new ServiceFinishDoneConsumer();
        c.setGroup(group);
        c.setNameServer(domain);
        return c;
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BaseConsumer HandleMitOutOrderConsumer() {
        BaseConsumer c = new HandleMitOutOrderConsumer();
        c.setGroup(group);
        c.setNameServer(domain);
        return c;
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BaseConsumer ServiceCancelConsumer() {
        BaseConsumer c = new ServiceCancelConsumer();
        c.setGroup(group);
        c.setNameServer(domain);
        return c;
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BaseConsumer RefundingConsumer() {
        BaseConsumer c = new RefundingConsumer();
        c.setGroup(group);
        c.setNameServer(domain);
        return c;
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BaseConsumer CardPassOrderConsumer() {
        BaseConsumer c = new CardPassOrderConsumer();
        c.setGroup(group);
        c.setNameServer(domain);
        return c;
    }

}
