package com.bnpp.pb.lynx.ui.gwt.client;

import java.util.Arrays;
import java.util.List;

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
            )
            // ... rest of existing menu items ...
        );
    }
} 