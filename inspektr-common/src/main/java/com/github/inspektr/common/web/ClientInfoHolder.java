/**
 * Licensed to Inspektr under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Inspektr licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a
 * copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.github.inspektr.common.web;

/**
 * Makes the ClientInfo available to the thread.
 * 
 * @author Scott Battaglia
 * @version $Revision$ $Date$
 * @since 1.0
 *
 */
public final class ClientInfoHolder {
	
	private static final ThreadLocal<ClientInfo> clientInfoHolder = new ThreadLocal<ClientInfo>();
	
	public static void setClientInfo(final ClientInfo clientInfo) {
		clientInfoHolder.set(clientInfo);
	}
	
	public static ClientInfo getClientInfo() {
		return clientInfoHolder.get();
	}
	
	public static void clear() {
		clientInfoHolder.remove();
	}
}
