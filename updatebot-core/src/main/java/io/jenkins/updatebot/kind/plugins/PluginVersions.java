/*
 * Copyright 2016 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */
package io.jenkins.updatebot.kind.plugins;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.jenkins.updatebot.model.DtoSupport;
import io.jenkins.updatebot.model.GitRepositoryConfig;
import io.jenkins.updatebot.model.GithubOrganisation;
import io.fabric8.utils.Objects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PluginVersions extends DtoSupport {
    private Map<String, PluginVersion> plugins = new HashMap<>();

    @Override
    public String toString() {
        return "PluginVersions{" +
                "plugins=" + plugins +
                '}';
    }

    public String getVersion(String artifactId) {
        if (plugins != null) {
            PluginVersion plugin = plugins.get(artifactId);
            if (plugin != null) {
                return plugin.getVersion();
            }
        }
        return null;
    }

    public Map<String, PluginVersion> getPlugins() {
        return plugins;
    }

    public void setPlugins(Map<String, PluginVersion> plugins) {
        this.plugins = plugins;
    }
}
