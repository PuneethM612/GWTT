package com.bnpp.pb.lynx.ui.gwt.client.mailconfig;

import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.shared.PropertyAccess;
import java.util.Date;

public interface MailConfigProperties extends PropertyAccess<MailConfigModel> {
    ValueProvider<MailConfigModel, String> id();
    ValueProvider<MailConfigModel, String> appKey();
    ValueProvider<MailConfigModel, String> emailId();
    ValueProvider<MailConfigModel, String> toField();
    ValueProvider<MailConfigModel, String> ccField();
    ValueProvider<MailConfigModel, String> comment();
    ValueProvider<MailConfigModel, String> active();
    ValueProvider<MailConfigModel, Date> createDate();
    ValueProvider<MailConfigModel, String> createdBy();
    ValueProvider<MailConfigModel, Date> lastModified();
    ValueProvider<MailConfigModel, String> lastModifiedUser();
    ValueProvider<MailConfigModel, Integer> version();
    ValueProvider<MailConfigModel, String> partitionKey();
} 