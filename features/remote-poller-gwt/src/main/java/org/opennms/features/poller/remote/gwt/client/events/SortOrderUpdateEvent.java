/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2010-2014 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2014 The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * OpenNMS(R) is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with OpenNMS(R).  If not, see:
 *      http://www.gnu.org/licenses/
 *
 * For more information contact:
 *     OpenNMS(R) Licensing <license@opennms.org>
 *     http://www.opennms.org/
 *     http://www.opennms.com/
 *******************************************************************************/

package org.opennms.features.poller.remote.gwt.client.events;

import com.google.gwt.event.shared.GwtEvent;

/**
 * <p>SortOrderUpdateEvent class.</p>
 *
 * @author ranger
 * @version $Id: $
 * @since 1.8.1
 */
public class SortOrderUpdateEvent extends GwtEvent<SortOrderUpdateHandler> {
    
    /** Constant <code>TYPE</code> */
    public static Type<SortOrderUpdateHandler> TYPE = new Type<>();
    private String m_sortOrder;
    
    /**
     * <p>Constructor for SortOrderUpdateEvent.</p>
     *
     * @param sortOrder a {@link java.lang.String} object.
     */
    public SortOrderUpdateEvent(String sortOrder) {
        setSortOrder(sortOrder);
    }
    
    /** {@inheritDoc} */
    @Override
    protected void dispatch(SortOrderUpdateHandler handler) {
        handler.onSortOrderUpdated(this);
        
    }

    /** {@inheritDoc} */
    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<SortOrderUpdateHandler> getAssociatedType() {
        return TYPE;
    }

    /**
     * <p>setSortOrder</p>
     *
     * @param sortOrder a {@link java.lang.String} object.
     */
    public void setSortOrder(String sortOrder) {
        m_sortOrder = sortOrder;
    }

    /**
     * <p>getSortOrder</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getSortOrder() {
        return m_sortOrder;
    }

}