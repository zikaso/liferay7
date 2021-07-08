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

package PersonaService.service.persistence;

import PersonaService.model.Persona;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the persona service. This utility wraps <code>PersonaService.service.persistence.impl.PersonaPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PersonaPersistence
 * @generated
 */
public class PersonaUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Persona persona) {
		getPersistence().clearCache(persona);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Persona> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Persona> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Persona> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Persona> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Persona> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Persona update(Persona persona) {
		return getPersistence().update(persona);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Persona update(
		Persona persona, ServiceContext serviceContext) {

		return getPersistence().update(persona, serviceContext);
	}

	/**
	 * Caches the persona in the entity cache if it is enabled.
	 *
	 * @param persona the persona
	 */
	public static void cacheResult(Persona persona) {
		getPersistence().cacheResult(persona);
	}

	/**
	 * Caches the personas in the entity cache if it is enabled.
	 *
	 * @param personas the personas
	 */
	public static void cacheResult(List<Persona> personas) {
		getPersistence().cacheResult(personas);
	}

	/**
	 * Creates a new persona with the primary key. Does not add the persona to the database.
	 *
	 * @param id_persona the primary key for the new persona
	 * @return the new persona
	 */
	public static Persona create(long id_persona) {
		return getPersistence().create(id_persona);
	}

	/**
	 * Removes the persona with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id_persona the primary key of the persona
	 * @return the persona that was removed
	 * @throws NoSuchPersonaException if a persona with the primary key could not be found
	 */
	public static Persona remove(long id_persona)
		throws PersonaService.exception.NoSuchPersonaException {

		return getPersistence().remove(id_persona);
	}

	public static Persona updateImpl(Persona persona) {
		return getPersistence().updateImpl(persona);
	}

	/**
	 * Returns the persona with the primary key or throws a <code>NoSuchPersonaException</code> if it could not be found.
	 *
	 * @param id_persona the primary key of the persona
	 * @return the persona
	 * @throws NoSuchPersonaException if a persona with the primary key could not be found
	 */
	public static Persona findByPrimaryKey(long id_persona)
		throws PersonaService.exception.NoSuchPersonaException {

		return getPersistence().findByPrimaryKey(id_persona);
	}

	/**
	 * Returns the persona with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id_persona the primary key of the persona
	 * @return the persona, or <code>null</code> if a persona with the primary key could not be found
	 */
	public static Persona fetchByPrimaryKey(long id_persona) {
		return getPersistence().fetchByPrimaryKey(id_persona);
	}

	/**
	 * Returns all the personas.
	 *
	 * @return the personas
	 */
	public static List<Persona> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the personas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of personas
	 * @param end the upper bound of the range of personas (not inclusive)
	 * @return the range of personas
	 */
	public static List<Persona> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the personas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of personas
	 * @param end the upper bound of the range of personas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of personas
	 */
	public static List<Persona> findAll(
		int start, int end, OrderByComparator<Persona> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the personas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of personas
	 * @param end the upper bound of the range of personas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of personas
	 */
	public static List<Persona> findAll(
		int start, int end, OrderByComparator<Persona> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the personas from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of personas.
	 *
	 * @return the number of personas
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PersonaPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<PersonaPersistence, PersonaPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(PersonaPersistence.class);

		ServiceTracker<PersonaPersistence, PersonaPersistence> serviceTracker =
			new ServiceTracker<PersonaPersistence, PersonaPersistence>(
				bundle.getBundleContext(), PersonaPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}