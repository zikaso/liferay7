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

package PersonaService.model;

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
public class PersonaSoap implements Serializable {

	public static PersonaSoap toSoapModel(Persona model) {
		PersonaSoap soapModel = new PersonaSoap();

		soapModel.setId_persona(model.getId_persona());
		soapModel.setFristName(model.getFristName());
		soapModel.setLastName(model.getLastName());
		soapModel.setAge(model.getAge());

		return soapModel;
	}

	public static PersonaSoap[] toSoapModels(Persona[] models) {
		PersonaSoap[] soapModels = new PersonaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PersonaSoap[][] toSoapModels(Persona[][] models) {
		PersonaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PersonaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PersonaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PersonaSoap[] toSoapModels(List<Persona> models) {
		List<PersonaSoap> soapModels = new ArrayList<PersonaSoap>(
			models.size());

		for (Persona model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PersonaSoap[soapModels.size()]);
	}

	public PersonaSoap() {
	}

	public long getPrimaryKey() {
		return _id_persona;
	}

	public void setPrimaryKey(long pk) {
		setId_persona(pk);
	}

	public long getId_persona() {
		return _id_persona;
	}

	public void setId_persona(long id_persona) {
		_id_persona = id_persona;
	}

	public String getFristName() {
		return _fristName;
	}

	public void setFristName(String fristName) {
		_fristName = fristName;
	}

	public String getLastName() {
		return _lastName;
	}

	public void setLastName(String lastName) {
		_lastName = lastName;
	}

	public int getAge() {
		return _age;
	}

	public void setAge(int age) {
		_age = age;
	}

	private long _id_persona;
	private String _fristName;
	private String _lastName;
	private int _age;

}