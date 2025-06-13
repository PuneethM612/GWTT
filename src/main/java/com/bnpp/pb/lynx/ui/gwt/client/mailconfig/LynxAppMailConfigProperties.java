package com.bnpp.pb.lynx.ui.gwt.client.mailconfig;

import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.shared.PropertyAccess;
import java.util.Date;

public interface LynxAppMailConfigProperties extends PropertyAccess<LynxAppMailConfigModel> {
    ValueProvider<LynxAppMailConfigModel, String> id();
    ValueProvider<LynxAppMailConfigModel, String> appKey();
    ValueProvider<LynxAppMailConfigModel, String> emailId();
    ValueProvider<LynxAppMailConfigModel, String> toField();
    ValueProvider<LynxAppMailConfigModel, String> ccField();
    ValueProvider<LynxAppMailConfigModel, String> comment();
    ValueProvider<LynxAppMailConfigModel, String> active();
    ValueProvider<LynxAppMailConfigModel, Date> createDate();
    ValueProvider<LynxAppMailConfigModel, String> createdBy();
    ValueProvider<LynxAppMailConfigModel, Date> lastModified();
    ValueProvider<LynxAppMailConfigModel, String> lastModifiedUser();
    ValueProvider<LynxAppMailConfigModel, Integer> version();
    ValueProvider<LynxAppMailConfigModel, String> partitionKey();
} 