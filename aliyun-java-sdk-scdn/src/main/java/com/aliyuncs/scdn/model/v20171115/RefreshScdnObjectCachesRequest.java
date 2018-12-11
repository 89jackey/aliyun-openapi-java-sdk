/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.scdn.model.v20171115;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class RefreshScdnObjectCachesRequest extends RpcAcsRequest<RefreshScdnObjectCachesResponse> {
	
	public RefreshScdnObjectCachesRequest() {
		super("scdn", "2017-11-15", "RefreshScdnObjectCaches", "scdn");
	}

	private String securityToken;

	private String objectPath;

	private Long ownerId;

	private String objectType;

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getObjectPath() {
		return this.objectPath;
	}

	public void setObjectPath(String objectPath) {
		this.objectPath = objectPath;
		if(objectPath != null){
			putQueryParameter("ObjectPath", objectPath);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getObjectType() {
		return this.objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
		if(objectType != null){
			putQueryParameter("ObjectType", objectType);
		}
	}

	@Override
	public Class<RefreshScdnObjectCachesResponse> getResponseClass() {
		return RefreshScdnObjectCachesResponse.class;
	}

}
