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

package PersonaService.model.impl;

import PersonaService.model.Persona;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Persona in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PersonaCacheModel implements CacheModel<Persona>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PersonaCacheModel)) {
			return false;
		}

		PersonaCacheModel personaCacheModel = (PersonaCacheModel)object;

		if (id_persona == personaCacheModel.id_persona) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id_persona);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{id_persona=");
		sb.append(id_persona);
		sb.append(", fristName=");
		sb.append(fristName);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", age=");
		sb.append(age);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Persona toEntityModel() {
		PersonaImpl personaImpl = new PersonaImpl();

		personaImpl.setId_persona(id_persona);

		if (fristName == null) {
			personaImpl.setFristName("");
		}
		else {
			personaImpl.setFristName(fristName);
		}

		if (lastName == null) {
			personaImpl.setLastName("");
		}
		else {
			personaImpl.setLastName(lastName);
		}

		personaImpl.setAge(age);

		personaImpl.resetOriginalValues();

		return personaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id_persona = objectInput.readLong();
		fristName = objectInput.readUTF();
		lastName = objectInput.readUTF();

		age = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(id_persona);

		if (fristName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fristName);
		}

		if (lastName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lastName);
		}

		objectOutput.writeInt(age);
	}

	public long id_persona;
	public String fristName;
	public String lastName;
	public int age;

}