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

public class MailConfigWindow extends TableWindow {
    private static MailConfigWindow instance;
    private Grid<MailConfigModel> grid;
    private ListStore<MailConfigModel> store;
    
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
        columns.add(new ColumnConfig<>(new MailConfigProperties().id(), 70, "ID"));
        columns.add(new ColumnConfig<>(new MailConfigProperties().appKey(), 120, "App Key"));
        columns.add(new ColumnConfig<>(new MailConfigProperties().emailId(), 120, "Email ID"));
        columns.add(new ColumnConfig<>(new MailConfigProperties().toField(), 200, "To"));
        columns.add(new ColumnConfig<>(new MailConfigProperties().ccField(), 200, "CC"));
        columns.add(new ColumnConfig<>(new MailConfigProperties().comment(), 200, "Comment"));
        columns.add(new ColumnConfig<>(new MailConfigProperties().active(), 60, "Active"));
        columns.add(new ColumnConfig<>(new MailConfigProperties().createDate(), 120, "Created Date"));
        columns.add(new ColumnConfig<>(new MailConfigProperties().createdBy(), 100, "Created By"));
        columns.add(new ColumnConfig<>(new MailConfigProperties().lastModified(), 120, "Last Modified"));
        columns.add(new ColumnConfig<>(new MailConfigProperties().lastModifiedUser(), 100, "Modified By"));
        columns.add(new ColumnConfig<>(new MailConfigProperties().version(), 70, "Version"));
        columns.add(new ColumnConfig<>(new MailConfigProperties().partitionKey(), 100, "Partition Key"));

        // Create the column model
        ColumnModel<MailConfigModel> columnModel = new ColumnModel<>(columns);

        // Create the grid
        grid = new Grid<>(store, columnModel);
        grid.setBorders(true);
        grid.setColumnReordering(true);
        grid.setAllowTextSelection(true);
        grid.setStripeRows(true);
        grid.setColumnLines(true);
        grid.setAutoExpandColumn(new MailConfigProperties().comment());

        // Add the grid to the window
        VerticalLayoutContainer container = new VerticalLayoutContainer();
        container.add(grid, new VerticalLayoutContainer.VerticalLayoutData(1, 1));
        add(container);
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