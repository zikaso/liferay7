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

package PersonaService.service.base;

import PersonaService.model.Persona;

import PersonaService.service.PersonaLocalService;
import PersonaService.service.persistence.PersonaPersistence;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the persona local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link PersonaService.service.impl.PersonaLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PersonaService.service.impl.PersonaLocalServiceImpl
 * @generated
 */
public abstract class PersonaLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService, PersonaLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>PersonaLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>PersonaService.service.PersonaLocalServiceUtil</code>.
	 */

	/**
	 * Adds the persona to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PersonaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param persona the persona
	 * @return the persona that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Persona addPersona(Persona persona) {
		persona.setNew(true);

		return personaPersistence.update(persona);
	}

	/**
	 * Creates a new persona with the primary key. Does not add the persona to the database.
	 *
	 * @param id_persona the primary key for the new persona
	 * @return the new persona
	 */
	@Override
	@Transactional(enabled = false)
	public Persona createPersona(long id_persona) {
		return personaPersistence.create(id_persona);
	}

	/**
	 * Deletes the persona with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PersonaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id_persona the primary key of the persona
	 * @return the persona that was removed
	 * @throws PortalException if a persona with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Persona deletePersona(long id_persona) throws PortalException {
		return personaPersistence.remove(id_persona);
	}

	/**
	 * Deletes the persona from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PersonaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param persona the persona
	 * @return the persona that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Persona deletePersona(Persona persona) {
		return personaPersistence.remove(persona);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			Persona.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return personaPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonaService.model.impl.PersonaModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return personaPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonaService.model.impl.PersonaModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return personaPersistence.findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return personaPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection) {

		return personaPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public Persona fetchPersona(long id_persona) {
		return personaPersistence.fetchByPrimaryKey(id_persona);
	}

	/**
	 * Returns the persona with the primary key.
	 *
	 * @param id_persona the primary key of the persona
	 * @return the persona
	 * @throws PortalException if a persona with the primary key could not be found
	 */
	@Override
	public Persona getPersona(long id_persona) throws PortalException {
		return personaPersistence.findByPrimaryKey(id_persona);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(personaLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Persona.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("id_persona");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			personaLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(Persona.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("id_persona");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(personaLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Persona.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("id_persona");
	}

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return personaPersistence.create(((Long)primaryKeyObj).longValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return personaLocalService.deletePersona((Persona)persistedModel);
	}

	public BasePersistence<Persona> getBasePersistence() {
		return personaPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return personaPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the personas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonaService.model.impl.PersonaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of personas
	 * @param end the upper bound of the range of personas (not inclusive)
	 * @return the range of personas
	 */
	@Override
	public List<Persona> getPersonas(int start, int end) {
		return personaPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of personas.
	 *
	 * @return the number of personas
	 */
	@Override
	public int getPersonasCount() {
		return personaPersistence.countAll();
	}

	/**
	 * Updates the persona in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PersonaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param persona the persona
	 * @return the persona that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Persona updatePersona(Persona persona) {
		return personaPersistence.update(persona);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			PersonaLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		personaLocalService = (PersonaLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return PersonaLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return Persona.class;
	}

	protected String getModelClassName() {
		return Persona.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = personaPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	protected PersonaLocalService personaLocalService;

	@Reference
	protected PersonaPersistence personaPersistence;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

}