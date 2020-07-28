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
package com.synopsys.integration.jira.common.rest.oauth.http;

import com.google.api.client.auth.oauth.OAuthParameters;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JiraHttpServiceFactory {
    // Test comment
    public static final String JIRA_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSX";

    public JiraHttpService createJiraHttpService(String jiraUrl, OAuthParameters oAuthParameters) {
        return new JiraHttpService(jiraUrl, createHttpRequestFactory(oAuthParameters), createDefaultGson());
    }

    private HttpRequestFactory createHttpRequestFactory(OAuthParameters oAuthParameters) {
        return new NetHttpTransport().createRequestFactory(oAuthParameters);
    }

    private Gson createDefaultGson() {
        return new GsonBuilder()
                   .setDateFormat(JiraHttpServiceFactory.JIRA_DATE_FORMAT)
                   .create();
    }

}

