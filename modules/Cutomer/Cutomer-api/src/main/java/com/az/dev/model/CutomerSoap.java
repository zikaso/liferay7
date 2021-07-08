/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.az.dev.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class CutomerSoap implements Serializable {

	public static CutomerSoap toSoapModel(Cutomer model) {
		CutomerSoap soapModel = new CutomerSoap();

		soapModel.setId_customer(model.getId_customer());
		soapModel.setName(model.getName());
		soapModel.setAge(model.getAge());
		soapModel.setEmail(model.getEmail());

		return soapModel;
	}

	public static CutomerSoap[] toSoapModels(Cutomer[] models) {
		CutomerSoap[] soapModels = new CutomerSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CutomerSoap[][] toSoapModels(Cutomer[][] models) {
		CutomerSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CutomerSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CutomerSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CutomerSoap[] toSoapModels(List<Cutomer> models) {
		List<CutomerSoap> soapModels = new ArrayList<CutomerSoap>(
			models.size());

		for (Cutomer model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CutomerSoap[soapModels.size()]);
	}

	public CutomerSoap() {
	}

	public long getPrimaryKey() {
		return _id_customer;
	}

	public void setPrimaryKey(long pk) {
		setId_customer(pk);
	}

	public long getId_customer() {
		return _id_customer;
	}

	public void setId_customer(long id_customer) {
		_id_customer = id_customer;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getAge() {
		return _age;
	}

	public void setAge(String age) {
		_age = age;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	private long _id_customer;
	private String _name;
	private String _age;
	private String _email;

}