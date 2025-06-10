package com.bnpp.pb.lynx.ui.gwt.client.appconfig;

import com.bnpp.pb.common.coreui.gwt.client.base.BaseFieldsDef;

/**
 * Field definitions for the App Config window
 */
public class AppConfigDef extends BaseFieldsDef {
    public static final String id = "id";
    public static final String appId = "app_id";
    public static final String propType = "prop_type";
    public static final String propName = "prop_name";
    public static final String propValue = "prop_value";
    public static final String active = "active";
    public static final String isActive = "is_active";
    public static final String createDate = "create_date";
    public static final String createdBy = "created_by";
    public static final String lastModified = "last_modified";
    public static final String lastModifiedUserId = "last_modified_user_id";
    public static final String version = "version";
    public static final String partitionKey = "partition_key";

    public static String[] gridFieldNames = new String[] {
        id, appId, propType, propName, propValue, active, isActive,
        createDate, createdBy, lastModified, lastModifiedUserId, version, partitionKey
    };

    public static String[] formFieldNames = new String[] {
        id, appId, propType, propName, propValue, active, isActive,
        createDate, createdBy, lastModified, lastModifiedUserId, version, partitionKey
    };

    public AppConfigDef() {
        setFieldNames(gridFieldNames, formFieldNames);
    }

    @Override
    public String getIdentifierField() {
        return id;
    }
} 