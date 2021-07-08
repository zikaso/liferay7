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

package com.az.dev.service.persistence;

import com.az.dev.model.Cutomer;

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
 * The persistence utility for the cutomer service. This utility wraps <code>com.az.dev.service.persistence.impl.CutomerPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CutomerPersistence
 * @generated
 */
public class CutomerUtil {

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
	public static void clearCache(Cutomer cutomer) {
		getPersistence().clearCache(cutomer);
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
	public static Map<Serializable, Cutomer> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Cutomer> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Cutomer> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Cutomer> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Cutomer> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Cutomer update(Cutomer cutomer) {
		return getPersistence().update(cutomer);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Cutomer update(
		Cutomer cutomer, ServiceContext serviceContext) {

		return getPersistence().update(cutomer, serviceContext);
	}

	/**
	 * Returns all the cutomers where age = &#63;.
	 *
	 * @param age the age
	 * @return the matching cutomers
	 */
	public static List<Cutomer> findBybyage(String age) {
		return getPersistence().findBybyage(age);
	}

	/**
	 * Returns a range of all the cutomers where age = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CutomerModelImpl</code>.
	 * </p>
	 *
	 * @param age the age
	 * @param start the lower bound of the range of cutomers
	 * @param end the upper bound of the range of cutomers (not inclusive)
	 * @return the range of matching cutomers
	 */
	public static List<Cutomer> findBybyage(String age, int start, int end) {
		return getPersistence().findBybyage(age, start, end);
	}

	/**
	 * Returns an ordered range of all the cutomers where age = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CutomerModelImpl</code>.
	 * </p>
	 *
	 * @param age the age
	 * @param start the lower bound of the range of cutomers
	 * @param end the upper bound of the range of cutomers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cutomers
	 */
	public static List<Cutomer> findBybyage(
		String age, int start, int end,
		OrderByComparator<Cutomer> orderByComparator) {

		return getPersistence().findBybyage(age, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cutomers where age = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CutomerModelImpl</code>.
	 * </p>
	 *
	 * @param age the age
	 * @param start the lower bound of the range of cutomers
	 * @param end the upper bound of the range of cutomers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cutomers
	 */
	public static List<Cutomer> findBybyage(
		String age, int start, int end,
		OrderByComparator<Cutomer> orderByComparator, boolean useFinderCache) {

		return getPersistence().findBybyage(
			age, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cutomer in the ordered set where age = &#63;.
	 *
	 * @param age the age
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cutomer
	 * @throws NoSuchCutomerException if a matching cutomer could not be found
	 */
	public static Cutomer findBybyage_First(
			String age, OrderByComparator<Cutomer> orderByComparator)
		throws com.az.dev.exception.NoSuchCutomerException {

		return getPersistence().findBybyage_First(age, orderByComparator);
	}

	/**
	 * Returns the first cutomer in the ordered set where age = &#63;.
	 *
	 * @param age the age
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cutomer, or <code>null</code> if a matching cutomer could not be found
	 */
	public static Cutomer fetchBybyage_First(
		String age, OrderByComparator<Cutomer> orderByComparator) {

		return getPersistence().fetchBybyage_First(age, orderByComparator);
	}

	/**
	 * Returns the last cutomer in the ordered set where age = &#63;.
	 *
	 * @param age the age
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cutomer
	 * @throws NoSuchCutomerException if a matching cutomer could not be found
	 */
	public static Cutomer findBybyage_Last(
			String age, OrderByComparator<Cutomer> orderByComparator)
		throws com.az.dev.exception.NoSuchCutomerException {

		return getPersistence().findBybyage_Last(age, orderByComparator);
	}

	/**
	 * Returns the last cutomer in the ordered set where age = &#63;.
	 *
	 * @param age the age
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cutomer, or <code>null</code> if a matching cutomer could not be found
	 */
	public static Cutomer fetchBybyage_Last(
		String age, OrderByComparator<Cutomer> orderByComparator) {

		return getPersistence().fetchBybyage_Last(age, orderByComparator);
	}

	/**
	 * Returns the cutomers before and after the current cutomer in the ordered set where age = &#63;.
	 *
	 * @param id_customer the primary key of the current cutomer
	 * @param age the age
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cutomer
	 * @throws NoSuchCutomerException if a cutomer with the primary key could not be found
	 */
	public static Cutomer[] findBybyage_PrevAndNext(
			long id_customer, String age,
			OrderByComparator<Cutomer> orderByComparator)
		throws com.az.dev.exception.NoSuchCutomerException {

		return getPersistence().findBybyage_PrevAndNext(
			id_customer, age, orderByComparator);
	}

	/**
	 * Removes all the cutomers where age = &#63; from the database.
	 *
	 * @param age the age
	 */
	public static void removeBybyage(String age) {
		getPersistence().removeBybyage(age);
	}

	/**
	 * Returns the number of cutomers where age = &#63;.
	 *
	 * @param age the age
	 * @return the number of matching cutomers
	 */
	public static int countBybyage(String age) {
		return getPersistence().countBybyage(age);
	}

	/**
	 * Caches the cutomer in the entity cache if it is enabled.
	 *
	 * @param cutomer the cutomer
	 */
	public static void cacheResult(Cutomer cutomer) {
		getPersistence().cacheResult(cutomer);
	}

	/**
	 * Caches the cutomers in the entity cache if it is enabled.
	 *
	 * @param cutomers the cutomers
	 */
	public static void cacheResult(List<Cutomer> cutomers) {
		getPersistence().cacheResult(cutomers);
	}

	/**
	 * Creates a new cutomer with the primary key. Does not add the cutomer to the database.
	 *
	 * @param id_customer the primary key for the new cutomer
	 * @return the new cutomer
	 */
	public static Cutomer create(long id_customer) {
		return getPersistence().create(id_customer);
	}

	/**
	 * Removes the cutomer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id_customer the primary key of the cutomer
	 * @return the cutomer that was removed
	 * @throws NoSuchCutomerException if a cutomer with the primary key could not be found
	 */
	public static Cutomer remove(long id_customer)
		throws com.az.dev.exception.NoSuchCutomerException {

		return getPersistence().remove(id_customer);
	}

	public static Cutomer updateImpl(Cutomer cutomer) {
		return getPersistence().updateImpl(cutomer);
	}

	/**
	 * Returns the cutomer with the primary key or throws a <code>NoSuchCutomerException</code> if it could not be found.
	 *
	 * @param id_customer the primary key of the cutomer
	 * @return the cutomer
	 * @throws NoSuchCutomerException if a cutomer with the primary key could not be found
	 */
	public static Cutomer findByPrimaryKey(long id_customer)
		throws com.az.dev.exception.NoSuchCutomerException {

		return getPersistence().findByPrimaryKey(id_customer);
	}

	/**
	 * Returns the cutomer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id_customer the primary key of the cutomer
	 * @return the cutomer, or <code>null</code> if a cutomer with the primary key could not be found
	 */
	public static Cutomer fetchByPrimaryKey(long id_customer) {
		return getPersistence().fetchByPrimaryKey(id_customer);
	}

	/**
	 * Returns all the cutomers.
	 *
	 * @return the cutomers
	 */
	public static List<Cutomer> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the cutomers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CutomerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cutomers
	 * @param end the upper bound of the range of cutomers (not inclusive)
	 * @return the range of cutomers
	 */
	public static List<Cutomer> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the cutomers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CutomerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cutomers
	 * @param end the upper bound of the range of cutomers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cutomers
	 */
	public static List<Cutomer> findAll(
		int start, int end, OrderByComparator<Cutomer> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cutomers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CutomerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cutomers
	 * @param end the upper bound of the range of cutomers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cutomers
	 */
	public static List<Cutomer> findAll(
		int start, int end, OrderByComparator<Cutomer> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the cutomers from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of cutomers.
	 *
	 * @return the number of cutomers
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CutomerPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CutomerPersistence, CutomerPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(CutomerPersistence.class);

		ServiceTracker<CutomerPersistence, CutomerPersistence> serviceTracker =
			new ServiceTracker<CutomerPersistence, CutomerPersistence>(
				bundle.getBundleContext(), CutomerPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}