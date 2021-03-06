/**
 * Copyright (C) 2015-2017 Łukasz Budnik <lukasz.budnik@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 */
package com.github.lukaszbudnik.gugis.test.helpers;

import com.github.lukaszbudnik.gugis.Composite;
import com.github.lukaszbudnik.gugis.Propagate;
import com.github.lukaszbudnik.gugis.Propagation;

import javax.inject.Singleton;

@Composite
@Singleton
public class ReportServiceComposite implements ReportService {

    @Propagate(propagation = Propagation.PRIMARY)
    @Override
    public int uploadReport(String report) {
        return 0;
    }

    @Propagate(propagation = Propagation.SECONDARY)
    @Override
    public String downloadReport(int id) {
        return null;
    }

}
