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

public class MailConfigWindow extends TableWindow {
    private static MailConfigWindow instance;
    private Grid<MailConfigModel> grid;
    private ListStore<MailConfigModel> store;
    private static final MailConfigProperties properties = GWT.create(MailConfigProperties.class);
    
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
        initializeGrid();
    }

    private void initializeGrid() {
        // Create the store
        store = new ListStore<>(new ModelKeyProvider<MailConfigModel>() {
            @Override
            public String getKey(MailConfigModel item) {
                return item.getId();
            }
        });

        // Create column configurations
        List<ColumnConfig<MailConfigModel, ?>> columns = new ArrayList<>();
        
        // Add columns with their configurations
        columns.add(new ColumnConfig<>(properties.id(), 70, "ID"));
        columns.add(new ColumnConfig<>(properties.appKey(), 120, "App Key"));
        columns.add(new ColumnConfig<>(properties.emailId(), 120, "Email ID"));
        columns.add(new ColumnConfig<>(properties.toField(), 200, "To"));
        columns.add(new ColumnConfig<>(properties.ccField(), 200, "CC"));
        columns.add(new ColumnConfig<>(properties.comment(), 200, "Comment"));
        columns.add(new ColumnConfig<>(properties.active(), 60, "Active"));
        columns.add(new ColumnConfig<>(properties.createDate(), 120, "Created Date"));
        columns.add(new ColumnConfig<>(properties.createdBy(), 100, "Created By"));
        columns.add(new ColumnConfig<>(properties.lastModified(), 120, "Last Modified"));
        columns.add(new ColumnConfig<>(properties.lastModifiedUser(), 100, "Modified By"));
        columns.add(new ColumnConfig<>(properties.version(), 70, "Version"));
        columns.add(new ColumnConfig<>(properties.partitionKey(), 100, "Partition Key"));

        // Create the column model
        ColumnModel<MailConfigModel> columnModel = new ColumnModel<>(columns);

        // Create the grid
        grid = new Grid<>(store, columnModel);
        grid.setBorders(true);
        grid.setColumnReordering(true);
        grid.setAllowTextSelection(true);

        // Set the grid as the layout widget of the window
        setLayoutWidget(grid);
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