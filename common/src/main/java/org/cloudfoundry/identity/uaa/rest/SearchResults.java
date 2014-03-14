/*******************************************************************************
 *     Cloud Foundry 
 *     Copyright (c) [2009-2014] Pivotal Software, Inc. All Rights Reserved.
 *
 *     This product is licensed to you under the Apache License, Version 2.0 (the "License").
 *     You may not use this product except in compliance with the License.
 *
 *     This product includes a number of subcomponents with
 *     separate copyright notices and license terms. Your use of these
 *     subcomponents is subject to the terms and conditions of the
 *     subcomponent's license, as noted in the LICENSE file.
 *******************************************************************************/
package org.cloudfoundry.identity.uaa.rest;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Dave Syer
 * 
 */
public class SearchResults<T> {

    private final Collection<T> resources;
    private final int startIndex;
    private final int itemsPerPage;
    private final int totalResults;
    private final Collection<String> schemas;

    public SearchResults(Collection<String> schemas, Collection<T> resources, int startIndex, int itemsPerPage,
                    int totalResults) {
        this.schemas = new ArrayList<String>(schemas);
        this.resources = new ArrayList<T>(resources);
        this.startIndex = startIndex;
        this.itemsPerPage = itemsPerPage;
        this.totalResults = totalResults;
    }

    public Collection<String> getSchemas() {
        return schemas;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public int getItemsPerPage() {
        return itemsPerPage;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public Collection<T> getResources() {
        return resources;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("SearchResults[schemas:");
        builder.append(getSchemas());
        builder.append("; count:");
        builder.append(getTotalResults());
        builder.append("; size:");
        builder.append(getResources().size());
        builder.append("; index:");
        builder.append(getStartIndex());
        builder.append("; resources:");
        builder.append(getResources());
        builder.append("; id:");
        builder.append(System.identityHashCode(this));
        builder.append(";]");
        return builder.toString();
    }

}
