/*
 * ###
 * Service Web Archive
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
package com.photon.phresco.service.admin.actions.components;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.itextpdf.text.pdf.codec.Base64.OutputStream;
import com.photon.phresco.service.admin.actions.ServiceBaseAction;

public class Archetypes extends ServiceBaseAction { 
	
	private static final long serialVersionUID = 6801037145464060759L;
	private static final Logger S_LOGGER = Logger.getLogger(Archetypes.class);
	
	private String name = null;
	private String nameError = null;
	private String version = null;
	private String verError = null;
	private String apptype = null;
	private String appError = null;
	private String fileError = null;
	private boolean errorFound = false;
	
	private File applnArc;
	private String applnArcFileName;
	private String applnArcContentType;
	
	private File pluginArc;
	private String pluginArcFileName;
	private String pluginArcContentType;


	public String list() {
		S_LOGGER.debug("Entering Method Archetypes.list()");
		return COMP_ARCHETYPE_LIST;
	}
	
	public String add() {
		S_LOGGER.debug("Entering Method Archetypes.add()");
		return COMP_ARCHETYPE_ADD;
	}
	
	public String save() {
		S_LOGGER.debug("Entering Method Archetypes.save()");
		try {
			if (validateForm()) {
				setErrorFound(true);
				return SUCCESS;
			}
			InputStream inputStream = null;
			FileOutputStream outputStream = null;
//			boolean isMultipart = ServletFileUpload.isMultipartContent(getHttpRequest());
				inputStream = new FileInputStream(applnArc);
				/*outputStream = new FileOutputStream(new File("c:/temp/" + applnArcFileName));
				IOUtils.copy(inputStream, outputStream);*/
			
				if(pluginArc != null) {
					inputStream = new FileInputStream(pluginArc);
					outputStream = new FileOutputStream(new File("c:/temp/" + pluginArcFileName));
					IOUtils.copy(inputStream, outputStream);
				}
				addActionMessage(getText(ARCHETYPE_ADDED, Collections.singletonList(name)));
		} catch (Exception e) {
			addActionError(getText(ARCHETYPE_NOT_ADDED, Collections.singletonList(name)));
		} 

		return COMP_ARCHETYPE_LIST;
	}
	
	private boolean validateForm() {
		boolean success = false;
		if (StringUtils.isEmpty(name)) {
			setNameError(getText(KEY_I18N_ERR_NAME_EMPTY ));
			success = true;
		}
		
		if (StringUtils.isEmpty(version)) {
			setVerError(getText(KEY_I18N_ERR_VER_EMPTY));
			success = true;
		}
		
		if (StringUtils.isEmpty(apptype)) {
			setAppError(getText(KEY_I18N_ERR_APPTYPE_EMPTY));
			success = true;
		}
		
		if (StringUtils.isEmpty(applnArcFileName) || applnArc == null) {
			setFileError(getText(KEY_I18N_ERR_APPLNJAR_EMPTY));
			success = true;
		}
		return success;
	}
	public String cancel() {
		S_LOGGER.debug("Entering Method Archetypes.cancel()");
		return COMP_ARCHETYPE_CANCEL;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameError() {
		return nameError;
	}

	public void setNameError(String nameError) {
		this.nameError = nameError;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getVerError() {
		return verError;
	}

	public void setVerError(String verError) {
		this.verError = verError;
	}

	public String getApptype() {
		return apptype;
	}

	public void setApptype(String apptype) {
		this.apptype = apptype;
	}

	public String getAppError() {
		return appError;
	}

	public void setAppError(String appError) {
		this.appError = appError;
	}

	public String getFileError() {
		return fileError;
	}

	public void setFileError(String fileError) {
		this.fileError = fileError;
	} 
	
	public File getApplnArc() {
		return applnArc;
	}

	public void setApplnArc(File applnArc) {
		this.applnArc = applnArc;
	}

	public String getApplnArcFileName() {
		return applnArcFileName;
	}

	public void setApplnArcFileName(String applnArcFileName) {
		this.applnArcFileName = applnArcFileName;
	}
	
	public String getApplnArcContentType() {
		return applnArcContentType;
	}

	public void setApplnArcContentType(String applnArcContentType) {
		this.applnArcContentType = applnArcContentType;
	}

	public File getPluginArc() {
		return pluginArc;
	}

	public void setPluginArc(File pluginArc) {
		this.pluginArc = pluginArc;
	}

	public String getPluginArcFileName() {
		return pluginArcFileName;
	}

	public void setPluginArcFileName(String pluginArcFileName) {
		this.pluginArcFileName = pluginArcFileName;
	}

	public String getPluginArcContentType() {
		return pluginArcContentType;
	}

	public void setPluginArcContentType(String pluginArcContentType) {
		this.pluginArcContentType = pluginArcContentType;
	}

	public boolean isErrorFound() {
		return errorFound;
	}

	public void setErrorFound(boolean errorFound) {
		this.errorFound = errorFound;
	}
	
	
}
