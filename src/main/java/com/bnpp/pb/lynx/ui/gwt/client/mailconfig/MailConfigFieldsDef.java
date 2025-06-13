package com.bnpp.pb.lynx.ui.gwt.client.mailconfig;

import com.bnpp.pb.common.coreui.gwt.client.base.BaseFieldsDef;
import com.bnpp.pb.common.coreui.gwt.client.base.FieldDef;

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

    public static String[] gridFieldNames = new String[] {
        id, appKey, emailId, toField, ccField, comment, active, 
        createDate, createdBy, lastModified, lastModifiedUser, 
        version, partitionKey
    };

    public static String[] formFieldNames = new String[] {
        id, appKey, emailId, toField, ccField, comment, active,
        createDate, createdBy, lastModified, lastModifiedUser,
        version, partitionKey
    };

    public MailConfigFieldsDef() {
        setFieldNames(gridFieldNames, formFieldNames);
    }

    protected void setFieldNames(String[] gridFields, String[] formFields) {
        // This method is used by child classes to set field names
    }

    @Override
    public FieldDef getIdentifierField() {
        return createFieldDef(id);
    }

    @Override
    public FieldDef[] createFieldsDef() {
        FieldDef[] fieldDefs = new FieldDef[gridFieldNames.length];
        for (int i = 0; i < gridFieldNames.length; i++) {
            fieldDefs[i] = createFieldDef(gridFieldNames[i]);
        }
        return fieldDefs;
    }
} 