/*******************************************************************************
 * This file is part of OpenNMS(R).
 * <p>
 * Copyright (C) 2015 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2015 The OpenNMS Group, Inc.
 * <p>
 * OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
 * <p>
 * OpenNMS(R) is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 * <p>
 * OpenNMS(R) is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * <p>
 * You should have received a copy of the GNU Affero General Public License
 * along with OpenNMS(R).  If not, see:
 * http://www.gnu.org/licenses/
 * <p>
 * For more information contact:
 * OpenNMS(R) Licensing <license@opennms.org>
 * http://www.opennms.org/
 * http://www.opennms.com/
 *******************************************************************************/

package org.opennms.netmgt.bsm.vaadin.adminpage;

import com.google.common.base.Throwables;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.vaadin.data.Property;
import com.vaadin.data.Validator;
import com.vaadin.data.util.BeanContainer;
import com.vaadin.data.util.IndexedContainer;
import com.vaadin.data.util.ObjectProperty;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.ListSelect;
import com.vaadin.ui.NativeSelect;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import org.opennms.netmgt.bsm.service.model.BusinessService;
import org.opennms.netmgt.bsm.service.model.Status;
import org.opennms.netmgt.bsm.service.model.edge.Edge;
import org.opennms.netmgt.bsm.service.model.functions.map.Decrease;
import org.opennms.netmgt.bsm.service.model.functions.map.Identity;
import org.opennms.netmgt.bsm.service.model.functions.map.Ignore;
import org.opennms.netmgt.bsm.service.model.functions.map.Increase;
import org.opennms.netmgt.bsm.service.model.functions.map.SetTo;
import org.opennms.netmgt.bsm.service.model.functions.reduce.MostCritical;
import org.opennms.netmgt.bsm.service.model.mapreduce.MapFunction;
import org.opennms.netmgt.vaadin.core.TransactionAwareUI;
import org.opennms.netmgt.vaadin.core.UIHelper;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Modal dialog window used to edit the properties of a Business Service Edge definition.
 *
 * @author Dustin Frisch <dustin@opennms.com>
 * @author Christian Pape <christian@opennms.org>
 */
public class BusinessServiceEdgeEditWindow extends Window {
    /**
     * the parent main layout
     */
    private BusinessServiceEditWindow m_businessServiceEditWindow;

    private final NativeSelect m_typeSelect;

    private final ListSelect m_childServiceComponent;
    private final ListSelect m_ipServiceComponent;
    private final TextField m_reductionKeyComponent;

    private final NativeSelect m_mapFunctionSelect;

    private final NativeSelect m_mapFunctionSeveritySelect;

    private final TextField m_weightField;

    /**
     * Constructor
     *
     * @param businessService           the Business Service DTO instance to be configured
     * @param businessServiceEditWindow the parent main layout
     */
    public BusinessServiceEdgeEditWindow(final BusinessService businessService,
                                         final BusinessServiceEditWindow businessServiceEditWindow) {
        super("Business Service Edge Edit");

        this.m_businessServiceEditWindow = businessServiceEditWindow;

        // Basic window setup
        setModal(true);
        setClosable(true);
        setResizable(false);
        setWidth(50, Unit.PERCENTAGE);
        setHeight(85, Unit.PERCENTAGE);

        final VerticalLayout rootLayout = new VerticalLayout();
        rootLayout.setSpacing(true);
        rootLayout.setMargin(false);
        rootLayout.setSizeFull();

        // Construct the main layout
        final FormLayout formLayout = new FormLayout();
        formLayout.setSpacing(true);
        formLayout.setMargin(true);
        formLayout.setSizeFull();

        // Add type selector
        m_typeSelect = new NativeSelect("Type");
        m_typeSelect.setMultiSelect(false);
        m_typeSelect.setNewItemsAllowed(false);
        m_typeSelect.setNullSelectionAllowed(false);
        m_typeSelect.setRequired(true);
        m_typeSelect.addItem(Edge.Type.CHILD_SERVICE);
        m_typeSelect.setItemCaption(Edge.Type.CHILD_SERVICE, "Child Service");
        m_typeSelect.addItem(Edge.Type.IP_SERVICE);
        m_typeSelect.setItemCaption(Edge.Type.IP_SERVICE, "IP Service");
        m_typeSelect.addItem(Edge.Type.REDUCTION_KEY);
        m_typeSelect.setItemCaption(Edge.Type.REDUCTION_KEY, "Reduction Key");
        m_typeSelect.setWidth(98.0f, Unit.PERCENTAGE);
        formLayout.addComponent(m_typeSelect);

        m_childServiceComponent = new ListSelect("Child Service");
        m_childServiceComponent.setWidth(100.0f, Unit.PERCENTAGE);
        m_childServiceComponent.setRows(20);
        m_childServiceComponent.setVisible(false);
        formLayout.addComponent(m_childServiceComponent);

        m_ipServiceComponent = new ListSelect("IP Service");
        m_ipServiceComponent.setWidth(100.0f, Unit.PERCENTAGE);
        m_ipServiceComponent.setRows(20);
        m_ipServiceComponent.setVisible(false);
        formLayout.addComponent(m_ipServiceComponent);

        m_reductionKeyComponent = new TextField("Reduction Key");
        m_reductionKeyComponent.setWidth(100.0f, Unit.PERCENTAGE);
        m_reductionKeyComponent.setVisible(false);
        formLayout.addComponent(m_reductionKeyComponent);

        m_typeSelect.addValueChangeListener(event -> {
            m_childServiceComponent.setVisible(m_typeSelect.getValue() == Edge.Type.CHILD_SERVICE);
            m_ipServiceComponent.setVisible(m_typeSelect.getValue() == Edge.Type.IP_SERVICE);
            m_reductionKeyComponent.setVisible(m_typeSelect.getValue() == Edge.Type.REDUCTION_KEY);
        });

        // Add map function selector
        m_mapFunctionSelect = new NativeSelect("Map Function",
                                               ImmutableList.builder()
                                                            .add(Decrease.class)
                                                            .add(Identity.class)
                                                            .add(Ignore.class)
                                                            .add(Increase.class)
                                                            .add(SetTo.class)
                                                            .build());
        m_mapFunctionSelect.setNullSelectionAllowed(false);
        m_mapFunctionSelect.setMultiSelect(false);
        m_mapFunctionSelect.setNewItemsAllowed(false);
        m_mapFunctionSelect.setRequired(true);
        m_mapFunctionSelect.setWidth(98.0f, Unit.PERCENTAGE);
        m_mapFunctionSelect.getItemIds().forEach(itemId -> m_mapFunctionSelect.setItemCaption(itemId, ((Class<?>) itemId).getSimpleName()));
        formLayout.addComponent(m_mapFunctionSelect);

        m_mapFunctionSeveritySelect = new NativeSelect("Severity");
        m_mapFunctionSeveritySelect.setMultiSelect(false);
        m_mapFunctionSeveritySelect.setNewItemsAllowed(false);
        m_mapFunctionSeveritySelect.setNullSelectionAllowed(false);
        m_mapFunctionSeveritySelect.setRequired(true);
        m_mapFunctionSeveritySelect.addItem(Status.CRITICAL);
        m_mapFunctionSeveritySelect.setItemCaption(Status.CRITICAL, "Critical");
        m_mapFunctionSeveritySelect.addItem(Status.MAJOR);
        m_mapFunctionSeveritySelect.setItemCaption(Status.MAJOR, "Major");
        m_mapFunctionSeveritySelect.addItem(Status.MINOR);
        m_mapFunctionSeveritySelect.setItemCaption(Status.MINOR, "Minor");
        m_mapFunctionSeveritySelect.addItem(Status.WARNING);
        m_mapFunctionSeveritySelect.setItemCaption(Status.WARNING, "Warning");
        m_mapFunctionSeveritySelect.addItem(Status.NORMAL);
        m_mapFunctionSeveritySelect.setItemCaption(Status.NORMAL, "Normal");
        m_mapFunctionSeveritySelect.addItem(Status.INDETERMINATE);
        m_mapFunctionSeveritySelect.setItemCaption(Status.INDETERMINATE, "Indeterminate");
        m_mapFunctionSeveritySelect.setWidth(98.0f, Unit.PERCENTAGE);
        m_mapFunctionSeveritySelect.setEnabled(false);
        formLayout.addComponent(m_mapFunctionSeveritySelect);

        m_mapFunctionSelect.addValueChangeListener(event -> {
            m_mapFunctionSeveritySelect.setEnabled(SetTo.class.equals(m_mapFunctionSelect.getValue()));
        });

        // Add weight field
        m_weightField = new TextField("Weight");
        m_weightField.setRequired(true);
        m_weightField.setWidth(100.0f, Unit.PERCENTAGE);
        m_weightField.addValidator(value -> {
            try {
                Float.parseFloat((String) value);
            } catch (final NumberFormatException e) {
                throw new Validator.InvalidValueException("Weight must be a number");
            }
        });
        formLayout.addComponent(m_weightField);

        rootLayout.addComponent(formLayout);

        // Add the button row
        final HorizontalLayout buttonLayout = new HorizontalLayout();
        buttonLayout.setSpacing(true);
        buttonLayout.setMargin(true);

        // Add save button
        final Button saveButton = new Button("Save");
        saveButton.setId("saveButton");
        saveButton.addClickListener(UIHelper.getCurrent(TransactionAwareUI.class).wrapInTransactionProxy((Button.ClickListener) event -> {
            final MapFunction mapFunction;
            try {
                mapFunction = ((Class<? extends MapFunction>) m_mapFunctionSelect.getValue()).newInstance();
            } catch (final InstantiationException | IllegalAccessException e) {
                throw Throwables.propagate(e);
            }

            if (mapFunction instanceof SetTo) {
                ((SetTo) mapFunction).setStatus(null);
            }

            switch ((Edge.Type) m_typeSelect.getValue()) {
                case CHILD_SERVICE:
                    businessService.addChildEdge(null,
                                                 mapFunction);
                    break;

                case IP_SERVICE:
                    businessService.addIpServiceEdge(null,
                                                     mapFunction);
                    break;

                case REDUCTION_KEY:
                    businessService.addReductionKeyEdge(m_reductionKeyComponent.getValue(),
                                                        mapFunction);
                    break;
            }

            close();
        }));
        buttonLayout.addComponent(saveButton);

        // Add the cancel button
        final Button cancelButton = new Button("Cancel");
        cancelButton.setId("cancelButton");
        cancelButton.addClickListener((Button.ClickListener) event -> close());
        buttonLayout.addComponent(cancelButton);

        rootLayout.addComponent(buttonLayout);
        rootLayout.setComponentAlignment(buttonLayout, Alignment.BOTTOM_RIGHT);

        // Set the window content
        setContent(rootLayout);
    }
}
