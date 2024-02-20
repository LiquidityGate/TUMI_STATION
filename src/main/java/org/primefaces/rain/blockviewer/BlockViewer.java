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
package org.primefaces.rain.blockviewer;

import javax.faces.component.FacesComponent;
import javax.faces.component.UINamingContainer;
import java.io.Serializable;

@FacesComponent(value="BlockViewer")
public class BlockViewer extends UINamingContainer implements Serializable {

    @Override
    public String getFamily() { return "javax.faces.NamingContainer"; }

    private enum PropertyKeys {
        CODEMODE
    }

    public void change2PreviewMode() {
        setCodeMode(false);
    }

    public void change2CodeMode() {
        setCodeMode(true);
    }

    public void setCodeMode(boolean expanded) {
        getStateHelper().put(PropertyKeys.CODEMODE, expanded);
    }

    public boolean isCodeMode() {
        return (boolean) getStateHelper().eval(PropertyKeys.CODEMODE, false);
    }

}
