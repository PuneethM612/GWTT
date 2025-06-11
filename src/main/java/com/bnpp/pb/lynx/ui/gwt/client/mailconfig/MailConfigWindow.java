package com.bnpp.pb.lynx.ui.gwt.client.mailconfig;

import com.bnpp.pb.common.coreui.gwt.client.enums.ToolbarFlag;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.grid.GridToolbar;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.grid.TableView;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.grid.TableWindow;
import com.bnpp.pb.common.coreui.gwt.client.gxt3.ui.grid.profile.AbstractBaseProfile;
import com.bnpp.pb.lynx.enums.app.AppIdsConstants;
import com.bnpp.pb.lynx.ui.gwt.client.LynxGridToolBar;
import java.util.EnumSet;

public class MailConfigWindow extends TableWindow {
    private static MailConfigWindow instance;
    
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