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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Cutomer}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Cutomer
 * @generated
 */
public class CutomerWrapper
	extends BaseModelWrapper<Cutomer>
	implements Cutomer, ModelWrapper<Cutomer> {

	public CutomerWrapper(Cutomer cutomer) {
		super(cutomer);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id_customer", getId_customer());
		attributes.put("name", getName());
		attributes.put("age", getAge());
		attributes.put("email", getEmail());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id_customer = (Long)attributes.get("id_customer");

		if (id_customer != null) {
			setId_customer(id_customer);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String age = (String)attributes.get("age");

		if (age != null) {
			setAge(age);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}
	}

	/**
	 * Returns the age of this cutomer.
	 *
	 * @return the age of this cutomer
	 */
	@Override
	public String getAge() {
		return model.getAge();
	}

	/**
	 * Returns the email of this cutomer.
	 *
	 * @return the email of this cutomer
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the id_customer of this cutomer.
	 *
	 * @return the id_customer of this cutomer
	 */
	@Override
	public long getId_customer() {
		return model.getId_customer();
	}

	/**
	 * Returns the name of this cutomer.
	 *
	 * @return the name of this cutomer
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this cutomer.
	 *
	 * @return the primary key of this cutomer
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
	 * Sets the age of this cutomer.
	 *
	 * @param age the age of this cutomer
	 */
	@Override
	public void setAge(String age) {
		model.setAge(age);
	}

	/**
	 * Sets the email of this cutomer.
	 *
	 * @param email the email of this cutomer
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the id_customer of this cutomer.
	 *
	 * @param id_customer the id_customer of this cutomer
	 */
	@Override
	public void setId_customer(long id_customer) {
		model.setId_customer(id_customer);
	}

	/**
	 * Sets the name of this cutomer.
	 *
	 * @param name the name of this cutomer
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this cutomer.
	 *
	 * @param primaryKey the primary key of this cutomer
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	protected CutomerWrapper wrap(Cutomer cutomer) {
		return new CutomerWrapper(cutomer);
	}

}