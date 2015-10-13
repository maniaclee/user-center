/**
 * pajk.com Inc.
 * Copyright (c) 2014-2015 All Rights Reserved.
 */
package com.pajk.tradecenter;

import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.spring.ReferenceBean;
import com.pajk.diablo.im.message.api.ChatMessageSendService;
import com.pajk.diablo.im.message.api.TempGroupService;
import com.pajk.diablo.im.message.api.UserRelationService;
import com.pajk.ic.api.service.depot.DepotOrderService;
import com.pajk.ic.api.service.depot.DepotService;
import com.pajk.ic.api.service.item.CategoryService;
import com.pajk.ic.api.service.item.ItemPublishService;
import com.pajk.ic.api.service.item.ItemQueryService;
import com.pajk.ic.api.service.item.ItemSkuService;
import com.pajk.ic.api.service.item.cards.CardSecretGenService;
import com.pajk.ic.api.service.item.cards.CardSecretQueryService;
import com.pajk.ic.api.service.item.cards.CardSecretTradeService;
import com.pajk.ic.api.service.item.goods.GoodsQueryService;
import com.pajk.ic.api.service.item.voucher.UserVoucherBalService;
import com.pajk.ic.api.service.item.voucher.UserVoucherPassService;
import com.pajk.ic.api.service.serve.ServeCategoryService;
import com.pajk.ic.api.service.serve.ServeMealQueryService;
import com.pajk.ic.api.service.serve.ServeQueryService;
import com.pajk.idgen.IDGenService;
import com.pajk.message.api.SmsService;
import com.pajk.paygw.service.PayService;
import com.pajk.paygw.service.PointCoreService;
import com.pajk.pointcore.service.PointcoreQueryService;
import com.pajk.registrationcenter.service.facade.RegistrationQueryService;
import com.pajk.registrationcenter.service.facade.RegistrationService;
import com.pajk.silver.service.SilverService;
import com.pajk.sims.api.UserConsultService;
import com.pajk.sims.service.DoctorQueueService;
import com.pajk.sims.service.RegistrationQueueService;
import com.pajk.user.api.UserProfileService;
import com.pajk.user.api.UserService;
import com.pajk.user.vendor.api.MerchantService;
import com.pajk.user.vendor.api.SalesInfoService;
import com.pajk.user.vendor.api.VendorService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yuewenxin
 * @version v 0.1 15/2/26 11:57 aaronyue Exp $$
 */
@Configuration
public class ReferServiceConfig extends DubboBaseConfig {

    @Value("${tc.consume.timeout}")
    private int timeout;

    @Value("${tc.consumer.dubbo.retries}")
    private int retries;

    @Value("${tc.consumer.service.check}")
    private String check;

    @Value("${tc.consume.idgenerator.dubbo.version}")
    private String idgeneratorVersion;

    @Value("${tc.consume.silver.dubbo.version}")
    private String silverVersion;

    @Value("${tc.consume.paygw.dubbo.version}")
    private String paygwVersion;

    @Value("${tc.consume.pointcore.dubbo.version}")
    private String pcVersion;

    @Value("${tc.consume.user.dubbo.version}")
    private String userVersion;

    @Value("${tc.consume.ic.dubbo.version}")
    private String icVersion;

    @Value("${tc.consume.doctor.version}")
    private String IMVersion;

    @Value("${tc.consume.sims.dubbo.version}")
    private String simsVersion;

    @Value("${tc.consume.registrationcenter.dubbo.version}")
    private String rcVersion;

    @Value("${tc.consume.message.dubbo.version}")
    private String messageVersion;

    @Bean
    public ReferenceConfig referenceConfig() {
        ReferenceConfig rc = new ReferenceConfig();
        rc.setMonitor(monitorConfig());
        return rc;
    }

    @Bean
    public ReferenceBean globalIdGenerator() {
        ReferenceBean<IDGenService> ref = new ReferenceBean<>();
        ref.setVersion(idgeneratorVersion);
        ref.setInterface(IDGenService.class);
        ref.setTimeout(timeout);
        ref.setCheck(Boolean.parseBoolean(check));
        ref.setRetries(retries);
        return ref;
    }

    @Bean
    public ReferenceBean silverService() {
        ReferenceBean<SilverService> ref = new ReferenceBean<>();
        ref.setVersion(silverVersion);
        ref.setInterface(SilverService.class);
        ref.setTimeout(timeout);
        ref.setCheck(Boolean.parseBoolean(check));
        ref.setRetries(retries);
        return ref;
    }

    @Bean
    public ReferenceBean pointCoreService() {
        ReferenceBean<PointCoreService> ref = new ReferenceBean<>();
        ref.setVersion(paygwVersion);
        ref.setInterface(PointCoreService.class);
        ref.setTimeout(timeout);
        ref.setCheck(Boolean.parseBoolean(check));
        ref.setRetries(retries);
        return ref;
    }

    @Bean
    public ReferenceBean pointcoreQueryService() {
        ReferenceBean<PointcoreQueryService> ref = new ReferenceBean<>();
        ref.setVersion(pcVersion);
        ref.setInterface(PointcoreQueryService.class);
        ref.setTimeout(timeout);
        ref.setCheck(Boolean.parseBoolean(check));
        ref.setRetries(retries);
        return ref;
    }

    @Bean
    public ReferenceBean payService() {
        ReferenceBean<PayService> ref = new ReferenceBean<>();
        ref.setVersion(paygwVersion);
        ref.setInterface(PayService.class);
        ref.setTimeout(timeout);
        ref.setCheck(Boolean.parseBoolean(check));
        ref.setRetries(retries);
        return ref;
    }

    @Bean
    public ReferenceBean userService() {
        ReferenceBean<UserService> ref = new ReferenceBean<>();
        ref.setVersion(userVersion);
        ref.setInterface(UserService.class);
        ref.setTimeout(timeout);
        ref.setCheck(Boolean.parseBoolean(check));
        ref.setRetries(retries);
        return ref;
    }

    @Bean
    public ReferenceBean merchantService() {
        ReferenceBean<MerchantService> ref = new ReferenceBean<>();
        ref.setVersion(userVersion);
        ref.setInterface(MerchantService.class);
        ref.setTimeout(timeout);
        ref.setCheck(Boolean.parseBoolean(check));
        ref.setRetries(retries);
        return ref;
    }

    @Bean
    public ReferenceBean salesInfoService() {
        ReferenceBean<SalesInfoService> ref = new ReferenceBean<>();
        ref.setVersion(userVersion);
        ref.setInterface(SalesInfoService.class);
        ref.setTimeout(timeout);
        ref.setCheck(Boolean.parseBoolean(check));
        ref.setRetries(retries);
        return ref;
    }

    @Bean
    public ReferenceBean vendorService() {
        ReferenceBean<VendorService> ref = new ReferenceBean<>();
        ref.setVersion(userVersion);
        ref.setInterface(VendorService.class);
        ref.setTimeout(timeout);
        ref.setCheck(Boolean.parseBoolean(check));
        ref.setRetries(retries);
        return ref;
    }

    @Bean
    public ReferenceBean itemQueryService() {
        ReferenceBean<ItemQueryService> ref = new ReferenceBean<>();
        ref.setVersion(icVersion);
        ref.setInterface(ItemQueryService.class);
        ref.setTimeout(timeout);
        ref.setCheck(Boolean.parseBoolean(check));
        ref.setRetries(retries);
        return ref;
    }

    @Bean
    public ReferenceBean goodsQueryService() {
        ReferenceBean<GoodsQueryService> ref = new ReferenceBean<>();
        ref.setVersion(icVersion);
        ref.setInterface(GoodsQueryService.class);
        ref.setTimeout(timeout);
        ref.setCheck(Boolean.parseBoolean(check));
        ref.setRetries(retries);
        return ref;
    }

    @Bean
    public ReferenceBean depotService() {
        ReferenceBean<DepotService> ref = new ReferenceBean<>();
        ref.setVersion(icVersion);
        ref.setInterface(DepotService.class);
        ref.setTimeout(timeout);
        ref.setCheck(Boolean.parseBoolean(check));
        ref.setRetries(retries);
        return ref;
    }

    @Bean
    public ReferenceBean itemPublishService() {
        ReferenceBean<ItemPublishService> ref = new ReferenceBean<>();
        ref.setVersion(icVersion);
        ref.setInterface(ItemPublishService.class);
        ref.setTimeout(timeout);
        ref.setCheck(Boolean.parseBoolean(check));
        ref.setRetries(retries);
        return ref;
    }

    @Bean
    public ReferenceBean serveCategoryService() {
        ReferenceBean<ServeCategoryService> ref = new ReferenceBean<>();
        ref.setVersion(icVersion);
        ref.setInterface(ServeCategoryService.class);
        ref.setTimeout(timeout);
        ref.setCheck(Boolean.parseBoolean(check));
        ref.setRetries(retries);
        return ref;
    }

    @Bean
    public ReferenceBean serveQueryService() {
        ReferenceBean<ServeQueryService> ref = new ReferenceBean<>();
        ref.setVersion(icVersion);
        ref.setInterface(ServeQueryService.class);
        ref.setTimeout(timeout);
        ref.setCheck(Boolean.parseBoolean(check));
        ref.setRetries(retries);
        return ref;
    }

    @Bean
    public ReferenceBean categoryService() {
        ReferenceBean<CategoryService> ref = new ReferenceBean<>();
        ref.setVersion(icVersion);
        ref.setInterface(CategoryService.class);
        ref.setTimeout(timeout);
        ref.setCheck(Boolean.parseBoolean(check));
        ref.setRetries(retries);
        return ref;
    }

    @Bean
    public ReferenceBean userVoucherBalService() {
        ReferenceBean<UserVoucherBalService> ref = new ReferenceBean<>();
        ref.setVersion(icVersion);
        ref.setInterface(UserVoucherBalService.class);
        ref.setTimeout(timeout);
        ref.setCheck(Boolean.parseBoolean(check));
        ref.setRetries(retries);
        return ref;
    }

    @Bean
    public ReferenceBean serveMealQueryService() {
        ReferenceBean<ServeMealQueryService> ref = new ReferenceBean<>();
        ref.setVersion(icVersion);
        ref.setInterface(ServeMealQueryService.class);
        ref.setTimeout(timeout);
        ref.setCheck(Boolean.parseBoolean(check));
        ref.setRetries(retries);
        return ref;
    }

    @Bean
    public ReferenceBean cardSecretQueryService() {
        ReferenceBean<CardSecretQueryService> ref = new ReferenceBean<>();
        ref.setVersion(icVersion);
        ref.setInterface(CardSecretQueryService.class);
        ref.setTimeout(timeout);
        ref.setCheck(Boolean.parseBoolean(check));
        ref.setRetries(retries);
        return ref;
    }

    @Bean
    public ReferenceBean cardSecretTradeService() {
        ReferenceBean<CardSecretTradeService> ref = new ReferenceBean<>();
        ref.setVersion(icVersion);
        ref.setInterface(CardSecretTradeService.class);
        ref.setTimeout(timeout);
        ref.setCheck(Boolean.parseBoolean(check));
        ref.setRetries(retries);
        return ref;
    }

    @Bean
    public ReferenceBean tempGroupService() {
        ReferenceBean<TempGroupService> ref = new ReferenceBean<>();
        ref.setVersion(IMVersion);
        ref.setInterface(TempGroupService.class);
        ref.setTimeout(timeout);
        ref.setCheck(Boolean.parseBoolean(check));
        ref.setRetries(retries);
        return ref;
    }

    @Bean
    public ReferenceBean chatMessageSendService() {
        ReferenceBean<ChatMessageSendService> ref = new ReferenceBean<>();
        ref.setVersion(IMVersion);
        ref.setInterface(ChatMessageSendService.class);
        ref.setTimeout(timeout);
        ref.setCheck(Boolean.parseBoolean(check));
        ref.setRetries(retries);
        return ref;
    }

    @Bean
    public ReferenceBean userRelationService() {
        ReferenceBean<UserRelationService> ref = new ReferenceBean<>();
        ref.setVersion(IMVersion);
        ref.setInterface(UserRelationService.class);
        ref.setTimeout(timeout);
        ref.setCheck(Boolean.parseBoolean(check));
        ref.setRetries(retries);
        return ref;
    }

    @Bean
    public ReferenceBean depotOrderService() {
        ReferenceBean<DepotOrderService> ref = new ReferenceBean<>();
        ref.setVersion(icVersion);
        ref.setInterface(DepotOrderService.class);
        ref.setTimeout(timeout);
        ref.setCheck(Boolean.parseBoolean(check));
        ref.setRetries(retries);
        return ref;
    }

    @Bean
    public ReferenceBean itemSkuService() {
        ReferenceBean<ItemSkuService> ref = new ReferenceBean<>();
        ref.setVersion(icVersion);
        ref.setInterface(ItemSkuService.class);
        ref.setTimeout(timeout);
        ref.setCheck(Boolean.parseBoolean(check));
        ref.setRetries(retries);
        return ref;
    }

    @Bean
    public ReferenceBean userConsultService() {
        ReferenceBean<UserConsultService> ref = new ReferenceBean<>();
        ref.setVersion(simsVersion);
        ref.setInterface(UserConsultService.class);
        ref.setTimeout(timeout);
        ref.setCheck(Boolean.parseBoolean(check));
        ref.setRetries(retries);
        return ref;
    }

    @Bean
    public ReferenceBean doctorQueueService() {
        ReferenceBean<DoctorQueueService> ref = new ReferenceBean<>();
        ref.setVersion(simsVersion);
        ref.setInterface(DoctorQueueService.class);
        ref.setTimeout(timeout);
        ref.setCheck(Boolean.parseBoolean(check));
        ref.setRetries(retries);
        return ref;
    }

    @Bean
    public ReferenceBean registrationQueueService() {
        ReferenceBean<RegistrationQueueService> ref = new ReferenceBean<>();
        ref.setVersion(simsVersion);
        ref.setInterface(RegistrationQueueService.class);
        ref.setTimeout(timeout);
        ref.setCheck(Boolean.parseBoolean(check));
        ref.setRetries(retries);
        return ref;
    }

    @Bean
    public ReferenceBean registrationService() {
        ReferenceBean<RegistrationService> ref = new ReferenceBean<>();
        ref.setVersion(rcVersion);
        ref.setInterface(RegistrationService.class);
        ref.setTimeout(timeout);
        ref.setCheck(Boolean.parseBoolean(check));
        ref.setRetries(retries);
        return ref;
    }

    @Bean
    public ReferenceBean registrationQueryService() {
        ReferenceBean<RegistrationQueryService> ref = new ReferenceBean<>();
        ref.setVersion(rcVersion);
        ref.setInterface(RegistrationQueryService.class);
        ref.setTimeout(timeout);
        ref.setCheck(Boolean.parseBoolean(check));
        ref.setRetries(retries);
        return ref;
    }

    @Bean
    public ReferenceBean userProfileService() {
        ReferenceBean<UserProfileService> ref = new ReferenceBean<>();
        ref.setVersion(userVersion);
        ref.setInterface(UserProfileService.class);
        ref.setTimeout(timeout);
        ref.setCheck(Boolean.parseBoolean(check));
        ref.setRetries(retries);
        return ref;
    }

    @Bean
    public ReferenceBean userVoucherPassService() {
        ReferenceBean<UserVoucherPassService> ref = new ReferenceBean<>();
        ref.setVersion(icVersion);
        ref.setInterface(UserVoucherPassService.class);
        ref.setTimeout(timeout);
        ref.setCheck(Boolean.parseBoolean(check));
        ref.setRetries(retries);
        return ref;
    }

    @Bean
    public ReferenceBean smsService() {
        ReferenceBean<SmsService> ref = new ReferenceBean<>();
        ref.setVersion(messageVersion);
        ref.setInterface(SmsService.class);
        ref.setTimeout(timeout);
        ref.setCheck(Boolean.parseBoolean(check));
        ref.setRetries(retries);
        return ref;
    }

    @Bean
    public ReferenceBean cardSecretGenService() {
        ReferenceBean<CardSecretGenService> ref = new ReferenceBean<>();
        ref.setVersion(icVersion);
        ref.setInterface(CardSecretGenService.class);
        ref.setTimeout(timeout);
        ref.setCheck(Boolean.parseBoolean(check));
        ref.setRetries(retries);
        return ref;
    }

}
