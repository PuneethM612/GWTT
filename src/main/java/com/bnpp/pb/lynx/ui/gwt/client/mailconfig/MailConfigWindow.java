package com.bnpp.pb.lynx.ui.gwt.client.mailconfig;

import com.bnpp.pb.common.coreui.gwt.client.enums.ToolbarFlag;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.grid.GridToolbar;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.grid.TableView;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.grid.TableWindow;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.grid.profile.AbstractBaseProfile;
import com.bnpp.pb.lynx.enums.app.AppIdsConstants;
import com.bnpp.pb.lynx.ui.gwt.client.LynxGridToolBar;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;
import com.sencha.gxt.widget.core.client.grid.ColumnModel;
import com.sencha.gxt.widget.core.client.grid.Grid;
import com.sencha.gxt.widget.core.client.grid.ColumnConfig;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.RootPanel;

public class MailConfigWindow extends TableWindow {
    private static MailConfigWindow instance;
    private static final MailConfigProperties properties = GWT.create(MailConfigProperties.class);
    private TableView tableView;
    
    public static final EnumSet<ToolbarFlag> defaultFlags = EnumSet.of(
        ToolbarFlag.REFRESH,
        ToolbarFlag.EXPORT,
        ToolbarFlag.EXPORT_EXCEL,
        ToolbarFlag.CRUD,
        ToolbarFlag.DELETE
    );

    public static MailConfigWindow getInstance() {
        if (instance == null) {
            instance = new MailConfigWindow();
        }
        return instance;
    }

    private MailConfigWindow() {
        super();
        tableView = createTableView();
    }

    @Override
    public GridToolbar createGridToolbar() {
        return new LynxGridToolBar(tableView);
    }

    @Override
    public EnumSet<ToolbarFlag> getToolbarFlags() {
        return defaultFlags;
    }

    @Override
    public AbstractBaseProfile createProfile() {
        return new MailConfigProfile(this);
    }

    @Override
    public TableView createTableView() {
        return new MailConfigTableView(true, this);
    }

    @Override
    public String getAppId() {
        return AppIdsConstants.APP_CONFIRMS_STATUS.getCode();
    }
} 