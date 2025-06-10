package com.bnpp.pb.lynx.ui.gwt.client.appconfig;

import com.bnpp.pb.common.coreui.gwt.client.enums.ToolbarFlag;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.grid.GridToolbar;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.grid.TableView;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.grid.TableWindow;
import com.bnpp.pb.lynx.enums.app.AppIdsConstants;
import com.bnpp.pb.lynx.ui.gwt.client.LynxGridToolBar;
import com.google.gwt.user.client.ui.IsWidget;

import java.util.EnumSet;

/**
 * Main window for App Config management
 */
public class AppConfigWindow extends TableWindow {
    private static AppConfigWindow instance;
    private static final EnumSet<ToolbarFlag> defaultFlags = EnumSet.of(
        ToolbarFlag.CREATE,
        ToolbarFlag.UPDATE,
        ToolbarFlag.DELETE,
        ToolbarFlag.REFRESH,
        ToolbarFlag.EXPORT_EXCEL
    );

    public static AppConfigWindow getInstance() {
        if (instance == null) {
            instance = new AppConfigWindow();
        }
        return instance;
    }

    private AppConfigWindow() {
        super();
        tableView = createTableView();
        tableView.createViewPanel();
        gridToolbar = createGridToolbar();
    }

    @Override
    public EnumSet<ToolbarFlag> getToolbarFlags() {
        return defaultFlags;
    }

    @Override
    public String getIcon() {
        return "settings";
    }

    @Override
    public TableView createTableView() {
        return new AppConfigTableView(this);
    }

    @Override
    public String getAppId() {
        return AppIdsConstants.APP_CONFIRMS_STATUS.getCode();
    }

    @Override
    public GridToolbar createGridToolbar() {
        return new LynxGridToolBar(tableView);
    }

    @Override
    protected IsWidget fillPanel() {
        this.tableView = this.getTableView();
        this.tableView.setAppId(this.getAppId());
        IsWidget grid = this.tableView.createViewPanel();
        this.setGridToolbar(this.createGridToolbar());
        return grid;
    }

    @Override
    public IsWidget createPanel() {
        return this.fillPanel();
    }
} 