/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache license, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the license for the specific language governing permissions and
 * limitations under the license.
 */
package org.apache.logging.log4j.core.config;

import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.xml.sax.InputSource;

import java.net.URI;

/**
 *
 */
@Plugin(name="XMLConfigurationFactory", type="ConfigurationFactory")
@Order(5)
public class XMLConfigurationFactory extends ConfigurationFactory {

    public static final String[] SUFFIXES = new String[] {".xml", "*"};

    public Configuration getConfiguration(InputSource source) {
        return new XMLConfiguration(source, configFile);
    }

    public String[] getSupportedTypes() {
        return SUFFIXES;
    }
}