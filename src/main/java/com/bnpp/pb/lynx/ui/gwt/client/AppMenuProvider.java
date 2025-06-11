package com.bnpp.pb.lynx.ui.gwt.client;

import java.util.Arrays;
import java.util.List;
import com.bnpp.pb.common.coreui.gwt.client.autobean.userpref.IAppMenuItem;
import com.bnpp.pb.common.coreui.gwt.client.autobean.userpref.impl.AppMenuItem;
import com.bnpp.pb.lynx.ui.gwt.client.mailconfig.MailConfigWindow;

public class AppMenuProvider {

    @Override
    public List<IAppMenuItem> createMenuItems() {
        return Arrays.asList(
            // ... existing menu items ...
            new AppMenuItem(
                AppIdsConstants.APP_CONFIRMS_STATUS.getCode(),
                "Application Configuration",
                "I",
                "Application Configuration",
                AppConfigWindow.getInstance().getClass().getName(),
                AppEntryPoint.JSNI_CALL_EVENT_ID,
                "settings",
                null
            ),
            new AppMenuItem(
                "MAIL_CONFIG",
                "Mail Configuration",
                "I",
                "Mail Configuration",
                MailConfigWindow.getInstance().getClass().getName(),
                AppEntryPoint.JSNI_CALL_EVENT_ID,
                "settings",
                null
            )
            // ... rest of existing menu items ...
        );
    }
} 