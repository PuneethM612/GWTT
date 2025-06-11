package com.bnpp.pb.lynx.ui.gwt.client.appconfig;

import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.grid.TableWindow;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.grid.profile.AbstractBaseProfile;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.grid.profile.Profile;

public class AppConfigProfile extends AbstractBaseProfile {
    
    public AppConfigProfile(TableWindow window, String profileName) {
        super(window, profileName);
    }

    @Override
    public void initProfiles() {
        // Initialize default profile settings
        setDefaultProfile();
    }

    @Override
    public String getBizObjectName() {
        return AppConfigWindow.BIZ_OBJECT;
    }

    private void setDefaultProfile() {
        // Set default column visibility and order
        for (String field : AppConfigFieldsDef.gridDefaultFieldNames) {
            addField(field);
        }
    }
} 