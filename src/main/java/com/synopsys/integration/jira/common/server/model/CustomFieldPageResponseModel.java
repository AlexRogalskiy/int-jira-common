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
package com.synopsys.integration.jira.common.server.model;

import java.util.List;

import com.synopsys.integration.jira.common.model.JiraPageResponseModel;

public class CustomFieldPageResponseModel extends JiraPageResponseModel {
    private Boolean isLast;
    private List<CustomFieldModel> values;

    public CustomFieldPageResponseModel(Boolean isLast, List<CustomFieldModel> values) {
        this.isLast = isLast;
        this.values = values;
    }

    public Boolean getLast() {
        return isLast;
    }

    public List<CustomFieldModel> getValues() {
        return values;
    }

}