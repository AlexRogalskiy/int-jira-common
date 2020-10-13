/**
 * int-jira-common
 *
 * Copyright (c) 2020 Synopsys, Inc.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.synopsys.integration.jira.common.model.response;

import com.synopsys.integration.jira.common.model.JiraResponseModel;

public class VersionResponseModel extends JiraResponseModel {
    private String self;
    private String id;
    private String description;
    private String name;
    private boolean archived;
    private boolean released;
    private String releaseDate;
    private boolean overdue;
    private String userReleaseDate;
    private String projectId;

    public VersionResponseModel() {
    }

    public VersionResponseModel(
        String self,
        String id,
        String description,
        String name,
        boolean archived,
        boolean released,
        String releaseDate,
        boolean overdue,
        String userReleaseDate,
        String projectId
    ) {
        this.self = self;
        this.id = id;
        this.description = description;
        this.name = name;
        this.archived = archived;
        this.released = released;
        this.releaseDate = releaseDate;
        this.overdue = overdue;
        this.userReleaseDate = userReleaseDate;
        this.projectId = projectId;
    }

    public String getSelf() {
        return self;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public boolean isArchived() {
        return archived;
    }

    public boolean isReleased() {
        return released;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public boolean isOverdue() {
        return overdue;
    }

    public String getUserReleaseDate() {
        return userReleaseDate;
    }

    public String getProjectId() {
        return projectId;
    }
}
