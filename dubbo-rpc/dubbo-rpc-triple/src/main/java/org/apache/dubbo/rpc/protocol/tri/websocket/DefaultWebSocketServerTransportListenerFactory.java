/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.dubbo.rpc.protocol.tri.websocket;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.remoting.http12.h2.H2StreamChannel;
import org.apache.dubbo.remoting.websocket.WebSocketServerTransportListenerFactory;
import org.apache.dubbo.remoting.websocket.WebSocketTransportListener;
import org.apache.dubbo.rpc.model.FrameworkModel;

public class DefaultWebSocketServerTransportListenerFactory implements WebSocketServerTransportListenerFactory {

    public static final WebSocketServerTransportListenerFactory INSTANCE =
            new DefaultWebSocketServerTransportListenerFactory();

    @Override
    public WebSocketTransportListener newInstance(
            H2StreamChannel streamChannel, URL url, FrameworkModel frameworkModel) {
        return new DefaultWebSocketServerTransportListener(streamChannel, url, frameworkModel);
    }
}