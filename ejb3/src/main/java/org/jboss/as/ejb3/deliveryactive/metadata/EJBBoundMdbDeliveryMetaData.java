/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2012, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jboss.as.ejb3.deliveryactive.metadata;

import org.jboss.metadata.ejb.parser.jboss.ejb3.AbstractEJBBoundMetaData;

/**
 * Metadata for delivery active property of message-driven beans
 *
 * @author <a href="http://jmesnil.net/">Jeff Mesnil</a> (c) 2013 Red Hat inc
 * @author Flavia Rainone.
 */
public class EJBBoundMdbDeliveryMetaData extends AbstractEJBBoundMetaData {

    private boolean deliveryActive;
    private String[] deliveryGroups;

    public boolean isDeliveryActive() {
        return deliveryActive;
    }

    public void setDeliveryActive(boolean deliveryActive) {
        this.deliveryActive = deliveryActive;
    }

    public String[] getDeliveryGroups() {
        return deliveryGroups;
    }

    public void setDeliveryGroups(String... deliveryGroups) {
        this.deliveryGroups = deliveryGroups;
    }
}
