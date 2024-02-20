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

import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.rain.service.DocumentService;
import org.primefaces.model.TreeNode;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;

@Named
@ViewScoped
public class TreeDemoView implements Serializable {

    private TreeNode root1;
    private TreeNode root2;
    private TreeNode root3;
    private TreeNode[] selectedNodes1;
    private TreeNode[] selectedNodes2;
    
    @Inject
    private DocumentService service;
    
    @PostConstruct
    public void init() {
        root1 = service.createCheckboxDocuments();
        root2 = service.createCheckboxDocuments();
        root3 = service.createDocuments();
    }

    public TreeNode getRoot1() {
        return root1;
    }

    public TreeNode getRoot2() {
        return root2;
    }

    public TreeNode getRoot3() {
        return root3;
    }

    public TreeNode[] getSelectedNodes1() {
        return selectedNodes1;
    }

    public void setSelectedNodes1(TreeNode[] selectedNodes1) {
        this.selectedNodes1 = selectedNodes1;
    }

    public TreeNode[] getSelectedNodes2() {
        return selectedNodes2;
    }

    public void setSelectedNodes2(TreeNode[] selectedNodes2) {
        this.selectedNodes2 = selectedNodes2;
    }
}