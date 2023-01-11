package ca.uhn.fhir.model.dstu2.composite;

import ca.uhn.fhir.model.api.annotation.DatatypeDef;
import ca.uhn.fhir.model.api.annotation.SimpleSetter;

/*
 * #%L
 * HAPI FHIR Structures - DSTU2 (FHIR v1.0.0)
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

@DatatypeDef(name="Money", profileOf=QuantityDt.class) 
public class MoneyDt extends QuantityDt {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor
     */
    public MoneyDt() {
        // nothing
    }

    /**
     * Constructor
     */
    @SimpleSetter
    public MoneyDt(@SimpleSetter.Parameter(name = "theValue") double theValue) {
        setValue(theValue);
    }

    /**
     * Constructor
     */
    @SimpleSetter
    public MoneyDt(@SimpleSetter.Parameter(name = "theValue") long theValue) {
        setValue(theValue);
    }

}