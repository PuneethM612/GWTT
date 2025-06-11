package com.bnpp.pb.lynx.ui.gwt.client.appconfig;

import com.bnpp.pb.common.coreui.gwt.client.gxt3.base.BaseFieldsDef;

public class AppConfigFieldsDef extends BaseFieldsDef {
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

    public static final String[] gridDefaultFieldNames = {
        id, appKey, emailId, toField, ccField, comment, active,
        createDate, createdBy, lastModified, lastModifiedUser,
        version, partitionKey
    };

    public static final String[] formFieldNames = {
        id, appKey, emailId, toField, ccField, comment, active,
        version, partitionKey
    };

    public String[] getFieldNames() {
        return gridDefaultFieldNames;
    }
} 