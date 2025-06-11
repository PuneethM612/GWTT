package com.bnpp.pb.lynx.ui.gwt.client.appconfig;

import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.grid.TableWindow;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.grid.profile.AbstractBaseProfile;
import java.util.HashMap;
import java.util.Map;

public class AppConfigProfile extends AbstractBaseProfile {
    private Map<String, Boolean> fieldVisibility = new HashMap<>();
    private TableWindow window;
    
    public AppConfigProfile(TableWindow window) {
        super(window);
        this.window = window;
        initProfiles();
    }

    public void initProfiles() {
        // Set default profile settings
        for (String field : AppConfigFieldsDef.gridDefaultFieldNames) {
            fieldVisibility.put(field, true);
        }
    }

    public boolean isFieldVisible(String fieldName) {
        return fieldVisibility.getOrDefault(fieldName, true);
    }

    public void setFieldVisibility(String fieldName, boolean visible) {
        fieldVisibility.put(fieldName, visible);
    }

    public String getBizObjectName() {
        return AppConfigWindow.BIZ_OBJECT;
    }
} 
} 