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

package com.az.dev.model.impl;

import com.az.dev.model.Cutomer;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Cutomer in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CutomerCacheModel implements CacheModel<Cutomer>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CutomerCacheModel)) {
			return false;
		}

		CutomerCacheModel cutomerCacheModel = (CutomerCacheModel)object;

		if (id_customer == cutomerCacheModel.id_customer) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id_customer);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{id_customer=");
		sb.append(id_customer);
		sb.append(", name=");
		sb.append(name);
		sb.append(", age=");
		sb.append(age);
		sb.append(", email=");
		sb.append(email);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Cutomer toEntityModel() {
		CutomerImpl cutomerImpl = new CutomerImpl();

		cutomerImpl.setId_customer(id_customer);

		if (name == null) {
			cutomerImpl.setName("");
		}
		else {
			cutomerImpl.setName(name);
		}

		if (age == null) {
			cutomerImpl.setAge("");
		}
		else {
			cutomerImpl.setAge(age);
		}

		if (email == null) {
			cutomerImpl.setEmail("");
		}
		else {
			cutomerImpl.setEmail(email);
		}

		cutomerImpl.resetOriginalValues();

		return cutomerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id_customer = objectInput.readLong();
		name = objectInput.readUTF();
		age = objectInput.readUTF();
		email = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(id_customer);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (age == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(age);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}
	}

	public long id_customer;
	public String name;
	public String age;
	public String email;

}