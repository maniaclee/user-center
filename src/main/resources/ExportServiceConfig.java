/**
 * pajk.com Inc.
 * Copyright (c) 2014-2014 All Rights Reserved.
 */
package com.pajk.tradecenter;

import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.ProviderConfig;
import com.alibaba.dubbo.config.spring.ServiceBean;
import com.pajk.tradecenter.client.service.consult.TcClinicDoctorService;
import com.pajk.tradecenter.client.service.credit.*;
import com.pajk.tradecenter.client.service.hcode.HCodeService;
import com.pajk.tradecenter.client.service.logistics.LogisticsCompanyService;
import com.pajk.tradecenter.client.service.logistics.LogisticsOrderService;
import com.pajk.tradecenter.client.service.logistics.MallAddressService;
import com.pajk.tradecenter.client.service.personalcenter.MallTestReportService;
import com.pajk.tradecenter.client.service.personalcenter.TcExamineeService;
import com.pajk.tradecenter.client.service.personalcenter.TcReportService;
import com.pajk.tradecenter.client.service.serve.TcConsultService;
import com.pajk.tradecenter.client.service.serve.TcServeExecuteService;
import com.pajk.tradecenter.client.service.serve.TcUserServiceService;
import com.pajk.tradecenter.client.service.timeout.TcTimeoutService;
import com.pajk.tradecenter.client.service.trade.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yuewenxin
 * @version v 0.1 14/11/18 22:18 aaronyue Exp $$
 */
@Configuration
public class ExportServiceConfig extends DubboBaseConfig {


    @Value("${dubbo.port}")
    private Integer port;


    @Value("${tc.provider.dubbo.version}")
    private String dubboExportVersion;

    @Value("${tc.provider.dubbo.timeout}")
    private int timeout;

    @Value("${tc.provider.dubbo.retries}")
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

    @Bean
    public ServiceBean mallAddressServiceExport(MallAddressService mallAddressService) {
        ServiceBean serviceBean = new ServiceBean();
        serviceBean.setProxy("javassist");
        serviceBean.setVersion(dubboExportVersion);
        serviceBean.setInterface(MallAddressService.class.getName());
        serviceBean.setRef(mallAddressService);
        serviceBean.setTimeout(timeout);
        serviceBean.setRetries(retries);
        return serviceBean;
    }

    @Bean
    public ServiceBean mallTestReportServiceExport(MallTestReportService mallTestReportService) {
        ServiceBean serviceBean = new ServiceBean();
        serviceBean.setProxy("javassist");
        serviceBean.setVersion(dubboExportVersion);
        serviceBean.setInterface(MallTestReportService.class.getName());
        serviceBean.setRef(mallTestReportService);
        serviceBean.setTimeout(timeout);
        serviceBean.setRetries(retries);
        return serviceBean;
    }

    @Bean
    public ServiceBean logisticsCompanyServiceExport(LogisticsCompanyService logisticsCompanyService) {
        ServiceBean serviceBean = new ServiceBean();
        serviceBean.setProxy("javassist");
        serviceBean.setVersion(dubboExportVersion);
        serviceBean.setInterface(LogisticsCompanyService.class.getName());
        serviceBean.setRef(logisticsCompanyService);
        serviceBean.setTimeout(timeout);
        serviceBean.setRetries(retries);
        return serviceBean;
    }

    @Bean
    public ServiceBean tcTradeServiceExport(TcTradeService tcTradeService) {
        ServiceBean serviceBean = new ServiceBean();
        serviceBean.setProxy("javassist");
        serviceBean.setVersion(dubboExportVersion);
        serviceBean.setInterface(TcTradeService.class.getName());
        serviceBean.setRef(tcTradeService);
        serviceBean.setTimeout(timeout);
        serviceBean.setRetries(retries);
        return serviceBean;
    }

    @Bean
    public ServiceBean tcQueryServiceExport(TcQueryService tcQueryService) {
        ServiceBean serviceBean = new ServiceBean();
        serviceBean.setProxy("javassist");
        serviceBean.setVersion(dubboExportVersion);
        serviceBean.setInterface(TcQueryService.class.getName());
        serviceBean.setRef(tcQueryService);
        serviceBean.setTimeout(timeout);
        serviceBean.setRetries(retries);
        return serviceBean;
    }

    @Bean
    public ServiceBean tcServiceOrderServiceExport(TcServiceOrderService tcServiceOrderService) {
        ServiceBean serviceBean = new ServiceBean();
        serviceBean.setProxy("javassist");
        serviceBean.setVersion(dubboExportVersion);
        serviceBean.setInterface(TcServiceOrderService.class.getName());
        serviceBean.setRef(tcServiceOrderService);
        serviceBean.setTimeout(timeout);
        serviceBean.setRetries(retries);
        return serviceBean;
    }

    @Bean
    public ServiceBean tcLgServiceExport(TcLgService tcLgService) {
        ServiceBean serviceBean = new ServiceBean();
        serviceBean.setProxy("javassist");
        serviceBean.setVersion(dubboExportVersion);
        serviceBean.setInterface(TcLgService.class.getName());
        serviceBean.setRef(tcLgService);
        serviceBean.setTimeout(timeout);
        serviceBean.setRetries(retries);
        return serviceBean;
    }

    @Bean
    public ServiceBean hCodeServiceExport(HCodeService hCodeService) {
        ServiceBean serviceBean = new ServiceBean();
        serviceBean.setProxy("javassist");
        serviceBean.setVersion(dubboExportVersion);
        serviceBean.setInterface(HCodeService.class.getName());
        serviceBean.setRef(hCodeService);
        serviceBean.setTimeout(timeout);
        serviceBean.setRetries(retries);
        return serviceBean;
    }

    @Bean
    public ServiceBean creditRuleItemDiscountServiceExport(CreditRuleItemDiscountService creditRuleItemDiscountService) {
        ServiceBean serviceBean = new ServiceBean();
        serviceBean.setProxy("javassist");
        serviceBean.setVersion(dubboExportVersion);
        serviceBean.setInterface(CreditRuleItemDiscountService.class.getName());
        serviceBean.setRef(creditRuleItemDiscountService);
        serviceBean.setTimeout(timeout);
        serviceBean.setRetries(retries);
        return serviceBean;
    }

    @Bean
    public ServiceBean creditRuleItemServiceExport(CreditRuleItemService creditRuleItemService) {
        ServiceBean serviceBean = new ServiceBean();
        serviceBean.setProxy("javassist");
        serviceBean.setVersion(dubboExportVersion);
        serviceBean.setInterface(CreditRuleItemService.class.getName());
        serviceBean.setRef(creditRuleItemService);
        serviceBean.setTimeout(timeout);
        serviceBean.setRetries(retries);
        return serviceBean;
    }

    @Bean
    public ServiceBean creditRuleServiceExport(CreditRuleService creditRuleService) {
        ServiceBean serviceBean = new ServiceBean();
        serviceBean.setProxy("javassist");
        serviceBean.setVersion(dubboExportVersion);
        serviceBean.setInterface(CreditRuleService.class.getName());
        serviceBean.setRef(creditRuleService);
        serviceBean.setTimeout(timeout);
        serviceBean.setRetries(retries);
        return serviceBean;
    }

    @Bean
    public ServiceBean creditTradeQueryServiceExport(CreditTradeQueryService creditTradeQueryService) {
        ServiceBean serviceBean = new ServiceBean();
        serviceBean.setProxy("javassist");
        serviceBean.setVersion(dubboExportVersion);
        serviceBean.setInterface(CreditTradeQueryService.class.getName());
        serviceBean.setRef(creditTradeQueryService);
        serviceBean.setTimeout(timeout);
        serviceBean.setRetries(retries);
        return serviceBean;
    }

    @Bean
    public ServiceBean creditTradeServiceExport(CreditTradeService creditTradeService) {
        ServiceBean serviceBean = new ServiceBean();
        serviceBean.setProxy("javassist");
        serviceBean.setVersion(dubboExportVersion);
        serviceBean.setInterface(CreditTradeService.class.getName());
        serviceBean.setRef(creditTradeService);
        serviceBean.setTimeout(timeout);
        serviceBean.setRetries(retries);
        return serviceBean;
    }

    @Bean
    public ServiceBean creditUserImportServiceExport(CreditUserImportService creditUserImportService) {
        ServiceBean serviceBean = new ServiceBean();
        serviceBean.setProxy("javassist");
        serviceBean.setVersion(dubboExportVersion);
        serviceBean.setInterface(CreditUserImportService.class.getName());
        serviceBean.setRef(creditUserImportService);
        serviceBean.setTimeout(timeout);
        serviceBean.setRetries(retries);
        return serviceBean;
    }

    @Bean
    public ServiceBean tcExamineeServiceExport(TcExamineeService tcExamineeService) {
        ServiceBean serviceBean = new ServiceBean();
        serviceBean.setProxy("javassist");
        serviceBean.setVersion(dubboExportVersion);
        serviceBean.setInterface(TcExamineeService.class.getName());
        serviceBean.setRef(tcExamineeService);
        serviceBean.setTimeout(timeout);
        serviceBean.setRetries(retries);
        return serviceBean;
    }

    @Bean
    public ServiceBean tcServeExecuteServiceExport(TcServeExecuteService tcServeExecuteService) {
        ServiceBean serviceBean = new ServiceBean();
        serviceBean.setProxy("javassist");
        serviceBean.setVersion(dubboExportVersion);
        serviceBean.setInterface(TcServeExecuteService.class.getName());
        serviceBean.setRef(tcServeExecuteService);
        serviceBean.setTimeout(timeout);
        serviceBean.setRetries(retries);
        return serviceBean;
    }

    @Bean
    public ServiceBean tcReportServiceExport(TcReportService tcReportService) {
        ServiceBean serviceBean = new ServiceBean();
        serviceBean.setProxy("javassist");
        serviceBean.setVersion(dubboExportVersion);
        serviceBean.setInterface(TcReportService.class.getName());
        serviceBean.setRef(tcReportService);
        serviceBean.setTimeout(timeout);
        serviceBean.setRetries(retries);
        return serviceBean;
    }

    @Bean
    public ServiceBean tcSyncServiceExport(TcSyncService tcSyncService) {
        ServiceBean serviceBean = new ServiceBean();
        serviceBean.setProxy("javassist");
        serviceBean.setVersion(dubboExportVersion);
        serviceBean.setInterface(TcSyncService.class.getName());
        serviceBean.setRef(tcSyncService);
        serviceBean.setTimeout(timeout);
        serviceBean.setRetries(retries);
        return serviceBean;
    }

    @Bean
    public ServiceBean logisticsOrderServiceExport(LogisticsOrderService logisticsOrderService) {
        ServiceBean serviceBean = new ServiceBean();
        serviceBean.setProxy("javassist");
        serviceBean.setVersion(dubboExportVersion);
        serviceBean.setInterface(LogisticsOrderService.class.getName());
        serviceBean.setRef(logisticsOrderService);
        serviceBean.setTimeout(timeout);
        serviceBean.setRetries(retries);
        return serviceBean;
    }

    @Bean
    public ServiceBean tcConsultServiceExport(TcConsultService tcConsultService) {
        ServiceBean serviceBean = new ServiceBean();
        serviceBean.setProxy("javassist");
        serviceBean.setVersion(dubboExportVersion);
        serviceBean.setInterface(TcConsultService.class.getName());
        serviceBean.setRef(tcConsultService);
        serviceBean.setTimeout(timeout);
        serviceBean.setRetries(retries);
        return serviceBean;
    }

    @Bean
    public ServiceBean tcSyncMedicineServiceExport(TcSyncMedicineService tcSyncMedicineService) {
        ServiceBean serviceBean = new ServiceBean();
        serviceBean.setProxy("javassist");
        serviceBean.setVersion(dubboExportVersion);
        serviceBean.setInterface(TcSyncMedicineService.class.getName());
        serviceBean.setRef(tcSyncMedicineService);
        serviceBean.setTimeout(timeout);
        serviceBean.setRetries(retries);
        return serviceBean;
    }

    @Bean
    public ServiceBean tcClinicDoctorServiceExport(TcClinicDoctorService tcClinicDoctorService) {
        ServiceBean serviceBean = new ServiceBean();
        serviceBean.setProxy("javassist");
        serviceBean.setVersion(dubboExportVersion);
        serviceBean.setInterface(TcClinicDoctorService.class.getName());
        serviceBean.setRef(tcClinicDoctorService);
        serviceBean.setTimeout(timeout);
        serviceBean.setRetries(retries);
        return serviceBean;
    }

    @Bean
    public ServiceBean tcTimeoutServiceExport(TcTimeoutService tcTimeoutService) {
        ServiceBean serviceBean = new ServiceBean();
        serviceBean.setProxy("javassist");
        serviceBean.setVersion(dubboExportVersion);
        serviceBean.setInterface(TcTimeoutService.class.getName());
        serviceBean.setRef(tcTimeoutService);
        serviceBean.setTimeout(timeout);
        serviceBean.setRetries(retries);
        return serviceBean;
    }

    @Bean
    public ServiceBean tcUserServiceServiceExport(TcUserServiceService tcUserServiceService) {
        ServiceBean serviceBean = new ServiceBean();
        serviceBean.setProxy("javassist");
        serviceBean.setVersion(dubboExportVersion);
        serviceBean.setInterface(TcUserServiceService.class.getName());
        serviceBean.setRef(tcUserServiceService);
        serviceBean.setTimeout(timeout);
        serviceBean.setRetries(retries);
        return serviceBean;
    }

    @Bean
    public ServiceBean tcRefundServiceExport(TcRefundService tcRefundService) {
        ServiceBean serviceBean = new ServiceBean();
        serviceBean.setProxy("javassist");
        serviceBean.setVersion(dubboExportVersion);
        serviceBean.setInterface(TcRefundService.class.getName());
        serviceBean.setRef(tcRefundService);
        serviceBean.setTimeout(timeout);
        serviceBean.setRetries(retries);
        return serviceBean;
    }
}
