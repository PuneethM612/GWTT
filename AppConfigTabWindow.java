package com.bnpp.pb.lynx.ui.gwt.client.appconfig;

import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.tab.TabWindow;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.grid.TableWindow;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.grid.GridToolbar;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.form.ActionBar;
import com.google.gwt.user.client.ui.Widget;
import java.util.HashMap;
import java.util.Map;

/**
 * Tab window for App Configuration
 */
public class AppConfigTabWindow extends TabWindow {
    private static final String WINDOW_KEY = "com.bnpp.pb.lynx.ui.gwt.client.appconfig.AppConfigTabWindow";
    private Map<String, Widget> tabConfigDetails;

    public AppConfigTabWindow() {
        super();
        tabConfigDetails = new HashMap<>();
        init();
    }

    private void init() {
        tabConfigDetails.put("Application Configuration", AppConfigWindow.getInstance());
    }

    @Override
    public Map<String, Widget> getTabConfigDetails() {
        return tabConfigDetails;
    }

    @Override
    public String getWindowTitle() {
        return "Application Configuration";
    }

    @Override
    public String getWindowKey() {
        return WINDOW_KEY;
    }
} 