package ca.uhn.hapi.fhir.docs;

/*-
 * #%L
 * HAPI FHIR - Docs
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

import ca.uhn.fhir.interceptor.api.Hook;
import ca.uhn.fhir.interceptor.api.Pointcut;
import ca.uhn.fhir.rest.api.server.RequestDetails;
import ca.uhn.fhir.rest.server.exceptions.BaseServerResponseException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//START SNIPPET: interceptor
public class RequestExceptionInterceptor {

	@Hook(Pointcut.SERVER_HANDLE_EXCEPTION)
	public boolean handleException(
		RequestDetails theRequestDetails,
		BaseServerResponseException theException,
		HttpServletRequest theServletRequest,
		HttpServletResponse theServletResponse) throws IOException {

		// HAPI's server exceptions know what the appropriate HTTP status code is
		theServletResponse.setStatus(theException.getStatusCode());

		// Provide a response ourself
		theServletResponse.setContentType("text/plain");
		theServletResponse.getWriter().append("Failed to process!");
		theServletResponse.getWriter().close();

		// Since we handled this response in the interceptor, we must return false
		// to stop processing immediately
		return false;
	}

}
//END SNIPPET: interceptor