/*
 * ###
 * Phresco Service Implemenation
 * 
 * Copyright (C) 1999 - 2012 Photon Infotech Inc.
 * 
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
 * ###
 */
package com.photon.phresco.service.data.impl;

import java.util.List;

import com.photon.phresco.commons.model.Customer;
import com.photon.phresco.exception.PhrescoException;
import com.photon.phresco.model.AppType;
import com.photon.phresco.model.ProjectInfo;
import com.photon.phresco.model.Settings;
import com.photon.phresco.model.Technology;
import com.photon.phresco.service.api.DBManager;
//import com.photon.phresco.service.data.api.AdminManager;
import com.photon.phresco.service.data.api.ComponentManager;
import com.photon.phresco.service.impl.DBManagerImpl;
import com.photon.phresco.service.model.Modules;

public class ComponentManagerImpl implements ComponentManager {

	DBManager dbManager = null;

	public ComponentManagerImpl() {
		dbManager = new DBManagerImpl();
	}

	public List<AppType> findAppTypes() throws PhrescoException {
		return null;
				//dbManager.findCustomers();
	}

	public Customer getAppType(String id) throws PhrescoException {
		// TODO Auto-generated method stub
		return null;
	}



	public List updateAppType(List customers) throws PhrescoException {
		//TODO: check if these customers already exist
		return dbManager.save(customers);
	}

	public void deleteAppType(String id) throws PhrescoException {
		// TODO Auto-generated method stub
	}

	public void createAppTypes(List<AppType> appTypes) {
		// TODO Auto-generated method stub

	}

	public List<AppType> updateAppTypes(List<AppType> appTypes) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Settings> findSettings() {
		// TODO Auto-generated method stub
		return null;
	}

	public void createCustomers(List<Settings> settings) {
		// TODO Auto-generated method stub

	}

	public void createConfigTemplates(List<Settings> settings) {
		// TODO Auto-generated method stub

	}

	public List<Settings> updateCustomers(List<Settings> settings) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Modules> findModules() {
		// TODO Auto-generated method stub
		return null;
	}

	public void createModules(List<Modules> modules) {
		// TODO Auto-generated method stub

	}

	public List<Modules> updateModules(List<Modules> modules) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ProjectInfo> findPilots() {
		// TODO Auto-generated method stub
		return null;
	}

	public void createPilots(List<ProjectInfo> projectInfos) {
		// TODO Auto-generated method stub

	}

	public List<ProjectInfo> updatePilots(List<ProjectInfo> projectInfos) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Technology> findTechnologies() {
		// TODO Auto-generated method stub
		return null;
	}

	public void createTechnologies(List<Technology> technologies) {
		// TODO Auto-generated method stub

	}

	public List<Technology> updateTechnologies(List<Technology> technologies) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Settings> updateConfigTemplates(List<Settings> settings) {
		// TODO Auto-generated method stub
		return null;
	}

}