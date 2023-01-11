package ca.uhn.fhir.jpa.bulk.imprt.model;

/*-
 * #%L
 * HAPI FHIR Storage api
 * %%
 * Copyright (C) 2014 - 2022 Smile CDR, Inc.
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import ca.uhn.fhir.model.api.IModelJson;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BulkImportJobFileJson implements IModelJson {

	@JsonProperty("tenantName")
	private String myTenantName;
	@JsonProperty("contents")
	private String myContents;
	@JsonProperty("description")
	private String myDescription;

	public String getDescription() {
		return myDescription;
	}

	public void setDescription(String theDescription) {
		myDescription = theDescription;
	}

	public String getTenantName() {
		return myTenantName;
	}

	public BulkImportJobFileJson setTenantName(String theTenantName) {
		myTenantName = theTenantName;
		return this;
	}

	public String getContents() {
		return myContents;
	}

	public BulkImportJobFileJson setContents(String theContents) {
		myContents = theContents;
		return this;
	}

}
