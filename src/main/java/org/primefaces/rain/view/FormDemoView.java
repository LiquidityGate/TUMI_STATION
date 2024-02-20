/*
   Copyright 2009-2022 PrimeTek.

   Licensed under PrimeFaces Commercial License, Version 1.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

   Licensed under PrimeFaces Commercial License, Version 1.0 (the "License");

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package org.primefaces.rain.view;

import javax.inject.Named;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;

@Named
@RequestScoped
public class FormDemoView {

    public List<String> completeText(String query) {
		List<String> results = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			results.add(query + i);
		}
		
		return results;
    }

}