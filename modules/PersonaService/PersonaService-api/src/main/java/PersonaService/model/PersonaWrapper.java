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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Persona}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Persona
 * @generated
 */
public class PersonaWrapper
	extends BaseModelWrapper<Persona>
	implements ModelWrapper<Persona>, Persona {

	public PersonaWrapper(Persona persona) {
		super(persona);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id_persona", getId_persona());
		attributes.put("fristName", getFristName());
		attributes.put("lastName", getLastName());
		attributes.put("age", getAge());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id_persona = (Long)attributes.get("id_persona");

		if (id_persona != null) {
			setId_persona(id_persona);
		}

		String fristName = (String)attributes.get("fristName");

		if (fristName != null) {
			setFristName(fristName);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}

		Integer age = (Integer)attributes.get("age");

		if (age != null) {
			setAge(age);
		}
	}

	/**
	 * Returns the age of this persona.
	 *
	 * @return the age of this persona
	 */
	@Override
	public int getAge() {
		return model.getAge();
	}

	/**
	 * Returns the frist name of this persona.
	 *
	 * @return the frist name of this persona
	 */
	@Override
	public String getFristName() {
		return model.getFristName();
	}

	/**
	 * Returns the id_persona of this persona.
	 *
	 * @return the id_persona of this persona
	 */
	@Override
	public long getId_persona() {
		return model.getId_persona();
	}

	/**
	 * Returns the last name of this persona.
	 *
	 * @return the last name of this persona
	 */
	@Override
	public String getLastName() {
		return model.getLastName();
	}

	/**
	 * Returns the primary key of this persona.
	 *
	 * @return the primary key of this persona
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the age of this persona.
	 *
	 * @param age the age of this persona
	 */
	@Override
	public void setAge(int age) {
		model.setAge(age);
	}

	/**
	 * Sets the frist name of this persona.
	 *
	 * @param fristName the frist name of this persona
	 */
	@Override
	public void setFristName(String fristName) {
		model.setFristName(fristName);
	}

	/**
	 * Sets the id_persona of this persona.
	 *
	 * @param id_persona the id_persona of this persona
	 */
	@Override
	public void setId_persona(long id_persona) {
		model.setId_persona(id_persona);
	}

	/**
	 * Sets the last name of this persona.
	 *
	 * @param lastName the last name of this persona
	 */
	@Override
	public void setLastName(String lastName) {
		model.setLastName(lastName);
	}

	/**
	 * Sets the primary key of this persona.
	 *
	 * @param primaryKey the primary key of this persona
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	protected PersonaWrapper wrap(Persona persona) {
		return new PersonaWrapper(persona);
	}

}