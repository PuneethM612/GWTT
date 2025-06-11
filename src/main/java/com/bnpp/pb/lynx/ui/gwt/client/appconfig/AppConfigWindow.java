package com.bnpp.pb.lynx.ui.gwt.client.appconfig;

import com.bnpp.pb.common.coreui.gwt.client.enums.ToolbarFlag;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.grid.GridToolbar;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.grid.TableView;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.grid.TableWindow;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.grid.profile.AbstractBaseProfile;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.util.GridPanel;
import com.bnpp.pb.lynx.enums.app.AppIdsConstants;
import com.bnpp.pb.lynx.ui.gwt.client.AbstractLynxTabWindow;
import com.bnpp.pb.lynx.ui.gwt.client.LynxGridToolBar;
import com.google.gwt.user.client.ui.IsWidget;
import com.sencha.gxt.widget.core.client.container.Container;

import java.util.EnumSet;
import java.util.LinkedHashMap;

public class AppConfigWindow extends AbstractLynxTabWindow {
    public static final String BIZ_OBJECT = "appConfigBO";
    private static AppConfigWindow instance;
    
    public static final EnumSet<ToolbarFlag> defaultFlags = EnumSet.of(
        ToolbarFlag.REFRESH,
        ToolbarFlag.EXPORT,
        ToolbarFlag.EXPORT_EXCEL,
        ToolbarFlag.CRUD,
        ToolbarFlag.DELETE,
        ToolbarFlag.SHOW_PROFILE
    );

    public static AppConfigWindow getInstance() {
        if (instance == null) {
            instance = new AppConfigWindow();
        }
        return instance;
    }

    @Override
    public String getAppId() {
        return AppIdsConstants.APP_CONFIRMS_STATUS.getCode();
    }

    @Override
    public LinkedHashMap<String, TableWindow> getTabConfigDetails() {
        LinkedHashMap<String, TableWindow> config = new LinkedHashMap<>();
        config.put("Application Configuration", this);
        return config;
    }

    @Override
    public Container createPanel() {
        return super.createPanel();
    }

    @Override
    public TableView createTableView() {
        return new AppConfigTableView(true, this);
    }

    @Override
    public AbstractBaseProfile createProfile() {
        return new AppConfigProfile(this);
    }

    @Override
    public GridToolbar createGridToolbar() {
        return new LynxGridToolBar(tableView);
    }

    @Override
    public EnumSet<ToolbarFlag> getToolbarFlags() {
        getGridToolbar().setExportOnTop(false);
        return defaultFlags;
    }
} 