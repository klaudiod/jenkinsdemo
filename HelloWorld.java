/*
 * $Id: HelloWorld.java 739661 2009-02-01 00:06:00Z davenewton $
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.training.struts.web.ui;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

/**
 * <code>Set welcome message.</code>
 */A
public class HelloWorld extends ActionSupport {
	public HelloWorld() {

		leftModuleList = new ArrayList<Module>();
		leftModuleList.add(new Module("M1", "Software Engineering"));
		leftModuleList.add(new Module("M2", "Object Oriented Design"));
		leftModuleList.add(new Module("M3", "Secure Language"));

		rightModuleList = new ArrayList<Module>();
		leftList = new ArrayList<String>();
		rightList = new ArrayList<String>();
	}

	public String registerModule() throws Exception {
		return SUCCESS;
	}

	public String execute() throws Exception {
		return SUCCESS;
	}

	private List<Module> leftModuleList;
	private List<Module> rightModuleList;
	private List<String> leftList;
	private List<String> rightList;

	public List<Module> getLeftModuleList() {
		return leftModuleList;
	}

	public void setLeftModuleList(List<Module> leftModuleList) {
		this.leftModuleList = leftModuleList;
	}

	public List<Module> getRightModuleList() {
		return rightModuleList;
	}

	public void setRightModuleList(List<Module> rightModuleList) {
		this.rightModuleList = rightModuleList;
	}

	public List<String> getLeftList() {
		return leftList;
	}

	public void setLeftList(List<String> leftList) {
		this.leftList = leftList;
	}

	public List<String> getRightList() {
		return rightList;
	}

	public void setRightList(List<String> rightList) {
		this.rightList = rightList;
	}
}
