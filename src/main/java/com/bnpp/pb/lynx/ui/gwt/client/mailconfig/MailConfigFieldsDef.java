package com.bnpp.pb.lynx.ui.gwt.client.mailconfig;

import com.bnpp.pb.common.coreui.gwt.client.base.BaseFieldsDef;

public class MailConfigFieldsDef extends BaseFieldsDef {
    public static final String id = "id";
    public static final String appKey = "appKey";
    public static final String emailId = "emailId";
    public static final String toField = "toField";
    public static final String ccField = "ccField";
    public static final String comment = "comment";
    public static final String active = "active";
    public static final String createDate = "createDate";
    public static final String createdBy = "createdBy";
    public static final String lastModified = "lastModified";
    public static final String lastModifiedUser = "lastModifiedUser";
    public static final String version = "version";
    public static final String partitionKey = "partitionKey";

    public static final String[] gridFieldNames = {
        id, appKey, emailId, toField, ccField, comment, active,
        createDate, createdBy, lastModified, lastModifiedUser,
        version, partitionKey
    };

    public static final String[] formFieldNames = {
        id, appKey, emailId, toField, ccField, comment, active,
        version, partitionKey
    };

    public MailConfigFieldsDef() {
        setFieldNames(gridFieldNames, formFieldNames);
    }

    protected void setFieldNames(String[] gridFields, String[] formFields) {
        // This method is used by child classes to set field names
    }

    @Override
    public String getIdentifierField() {
        return id;
    }
} 