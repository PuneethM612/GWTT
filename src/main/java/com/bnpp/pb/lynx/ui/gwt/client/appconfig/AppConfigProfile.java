package com.bnpp.pb.lynx.ui.gwt.client.appconfig;

import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.grid.TableWindow;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.grid.profile.AbstractBaseProfile;

public class AppConfigProfile extends AbstractBaseProfile {
    
    public AppConfigProfile(TableWindow window) {
        super(window);
        initProfiles();
    }

    @Override
    public void initProfiles() {
        // Set default profile settings
        for (String field : AppConfigFieldsDef.gridDefaultFieldNames) {
            setVisible(field, true);
        }
    }

    @Override
    public String getBizObjectName() {
        return AppConfigWindow.BIZ_OBJECT;
    }
} 