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
import com.sencha.gxt.widget.core.client.container.Viewport;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class LynxAppMailConfigWindow extends TableWindow {
    private static LynxAppMailConfigWindow instance;
    private Grid<LynxAppMailConfigModel> grid;
    private ListStore<LynxAppMailConfigModel> store;
    
    public static final EnumSet<ToolbarFlag> defaultFlags = EnumSet.of(
        ToolbarFlag.REFRESH,
        ToolbarFlag.EXPORT,
        ToolbarFlag.EXPORT_EXCEL,
        ToolbarFlag.CRUD,
        ToolbarFlag.DELETE
    );

    public static LynxAppMailConfigWindow getInstance() {
        if (instance == null) {
            instance = new LynxAppMailConfigWindow();
        }
        return instance;
    }

    private LynxAppMailConfigWindow() {
        super();
        initializeGrid();
    }

    private void initializeGrid() {
        // Create the store
        store = new ListStore<>(new ModelKeyProvider<LynxAppMailConfigModel>() {
            @Override
            public String getKey(LynxAppMailConfigModel item) {
                return item.getId();
            }
        });

        // Create column configurations
        List<ColumnConfig<LynxAppMailConfigModel, ?>> columns = new ArrayList<>();
        
        // Add columns with their configurations
        columns.add(new ColumnConfig<>(new LynxAppMailConfigProperties().id(), 70, "ID"));
        columns.add(new ColumnConfig<>(new LynxAppMailConfigProperties().appKey(), 120, "App Key"));
        columns.add(new ColumnConfig<>(new LynxAppMailConfigProperties().emailId(), 120, "Email ID"));
        columns.add(new ColumnConfig<>(new LynxAppMailConfigProperties().toField(), 200, "To"));
        columns.add(new ColumnConfig<>(new LynxAppMailConfigProperties().ccField(), 200, "CC"));
        columns.add(new ColumnConfig<>(new LynxAppMailConfigProperties().comment(), 200, "Comment"));
        columns.add(new ColumnConfig<>(new LynxAppMailConfigProperties().active(), 60, "Active"));
        columns.add(new ColumnConfig<>(new LynxAppMailConfigProperties().createDate(), 120, "Created Date"));
        columns.add(new ColumnConfig<>(new LynxAppMailConfigProperties().createdBy(), 100, "Created By"));
        columns.add(new ColumnConfig<>(new LynxAppMailConfigProperties().lastModified(), 120, "Last Modified"));
        columns.add(new ColumnConfig<>(new LynxAppMailConfigProperties().lastModifiedUser(), 100, "Modified By"));
        columns.add(new ColumnConfig<>(new LynxAppMailConfigProperties().version(), 70, "Version"));
        columns.add(new ColumnConfig<>(new LynxAppMailConfigProperties().partitionKey(), 100, "Partition Key"));

        // Create the column model
        ColumnModel<LynxAppMailConfigModel> columnModel = new ColumnModel<>(columns);

        // Create the grid
        grid = new Grid<>(store, columnModel);
        grid.setBorders(true);
        grid.setColumnReordering(true);
        grid.setAllowTextSelection(true);
        grid.setStripeRows(true);
        grid.setColumnLines(true);
        grid.setAutoExpandColumn(new LynxAppMailConfigProperties().comment());

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
        return new LynxAppMailConfigProfile(this);
    }

    @Override
    public TableView createTableView() {
        return new LynxAppMailConfigTableView(true, this);
    }

    @Override
    public String getAppId() {
        return AppIdsConstants.APP_CONFIRMS_STATUS.getCode();
    }
} 