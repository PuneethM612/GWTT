package com.bnpp.pb.lynx.ui.gwt.client.mailconfig;

import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.grid.profile.AbstractBaseProfile;
import java.util.HashMap;
import java.util.Map;

public class MailConfigProfile extends AbstractBaseProfile {
    private Map<String, Boolean> fieldVisibility = new HashMap<>();
    private MailConfigWindow window;
    
    public MailConfigProfile(MailConfigWindow window) {
        super(window);
        this.window = window;
        initProfiles();
    }

    public void initProfiles() {
        // Set default profile settings
        fieldVisibility.put("id", true);
        fieldVisibility.put("appKey", true);
        fieldVisibility.put("emailId", true);
        fieldVisibility.put("toField", true);
        fieldVisibility.put("ccField", true);
        fieldVisibility.put("comment", true);
        fieldVisibility.put("active", true);
        fieldVisibility.put("createDate", true);
        fieldVisibility.put("createdBy", true);
        fieldVisibility.put("lastModified", true);
        fieldVisibility.put("lastModifiedUser", true);
        fieldVisibility.put("version", true);
        fieldVisibility.put("partitionKey", true);
    }

    public boolean isFieldVisible(String fieldName) {
        return fieldVisibility.getOrDefault(fieldName, true);
    }

    public void setFieldVisibility(String fieldName, boolean visible) {
        fieldVisibility.put(fieldName, visible);
    }

    @Override
    public String getBizObjectName() {
        return MailConfigTableView.BIZ_OBJECT;
    }
} 