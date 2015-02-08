/*
	Radiobeacon - Openbmap Unified Network Location Provider
    Copyright (C) 2013  wish7

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation, either version 3 of the
    License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
package org.openbmap.unifiedNlp;

/**
 * Stores settings keys and default values.
 * See preferences.xml for layout, strings-preferences.xml for text.
 */
public final class Preferences {
	// Property names
	public static final String KEY_GPS_OSSETTINGS = "gps.ossettings";
	public static final String KEY_GPS_LOGGING_INTERVAL = "gps.interval";
	public static final String KEY_GPS_SAVE_COMPLETE_TRACK = "gps.save_track";
	public static final String KEY_DATA_FOLDER = "data.dir";
	public static final String KEY_OPERATION_MODE = "mode";
	/**
	 * Wifi catalog download button
	 */
	public static final String KEY_DOWNLOAD_WIFI_CATALOG = "data.download_wifi_catalog";
	
	/**
	 * Selected wifi catalog file
	 */
	public static final String KEY_WIFI_CATALOG_FILE = "data.ref_database";
	
	/**
	 * Openbmap user name
	 */
	//public static final String KEY_CREDENTIALS_USER = "credentials.user";
	
	/**
	 * Openbmap password
	 */
	//public static final String KEY_CREDENTIALS_PASSWORD = "credentials.password";
	
	/*
	 * Default values following ..
	 */
	
	public static final String VAL_OPERATION_MODE = "offline";
	
	/**
	 * Root folder for all additional data
	 */
	public static final String VAL_DATA_FOLDER = "/org.openbmap.unifiednlp";
	
	/**
	 * Default reference database filename
	 */
	public static final String VAL_WIFI_CATALOG_FILE = "openbmap.sqlite";
	
	/**
	 * Reference database not set 
	 */
	public static final String VAL_WIFI_CATALOG_NONE = "none";
	
	/**
	 * File extension for wifi catalog
	 */
	public static final String WIFI_CATALOG_FILE_EXTENSION = ".sqlite";
	
	/**
	 * URL, where wifi catalog with openbmap's preprocessed wifi positions can be downloaded
	 */
	public static final String	WIFI_CATALOG_DOWNLOAD_URL = "http://www.radiocells.org/static/openbmap.sqlite";
	
	/**
	 * Filename catalog database
	 */
	public static final String	WIFI_CATALOG_FILE = "openbmap.sqlite";
	
	/**
	 * Private dummy constructor
	 */
	private Preferences() {
	
	}
}