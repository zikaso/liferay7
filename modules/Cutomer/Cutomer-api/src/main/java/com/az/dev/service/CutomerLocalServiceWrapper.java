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

package com.az.dev.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CutomerLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CutomerLocalService
 * @generated
 */
public class CutomerLocalServiceWrapper
	implements CutomerLocalService, ServiceWrapper<CutomerLocalService> {

	public CutomerLocalServiceWrapper(CutomerLocalService cutomerLocalService) {
		_cutomerLocalService = cutomerLocalService;
	}

	/**
	 * Adds the cutomer to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CutomerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cutomer the cutomer
	 * @return the cutomer that was added
	 */
	@Override
	public com.az.dev.model.Cutomer addCutomer(
		com.az.dev.model.Cutomer cutomer) {

		return _cutomerLocalService.addCutomer(cutomer);
	}

	/**
	 * Creates a new cutomer with the primary key. Does not add the cutomer to the database.
	 *
	 * @param id_customer the primary key for the new cutomer
	 * @return the new cutomer
	 */
	@Override
	public com.az.dev.model.Cutomer createCutomer(long id_customer) {
		return _cutomerLocalService.createCutomer(id_customer);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cutomerLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the cutomer from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CutomerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cutomer the cutomer
	 * @return the cutomer that was removed
	 */
	@Override
	public com.az.dev.model.Cutomer deleteCutomer(
		com.az.dev.model.Cutomer cutomer) {

		return _cutomerLocalService.deleteCutomer(cutomer);
	}

	/**
	 * Deletes the cutomer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CutomerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id_customer the primary key of the cutomer
	 * @return the cutomer that was removed
	 * @throws PortalException if a cutomer with the primary key could not be found
	 */
	@Override
	public com.az.dev.model.Cutomer deleteCutomer(long id_customer)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cutomerLocalService.deleteCutomer(id_customer);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cutomerLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cutomerLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _cutomerLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.az.dev.model.impl.CutomerModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _cutomerLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.az.dev.model.impl.CutomerModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _cutomerLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _cutomerLocalService.dynamicQueryCount(dynamicQuery);
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
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _cutomerLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.az.dev.model.Cutomer fetchCutomer(long id_customer) {
		return _cutomerLocalService.fetchCutomer(id_customer);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _cutomerLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the cutomer with the primary key.
	 *
	 * @param id_customer the primary key of the cutomer
	 * @return the cutomer
	 * @throws PortalException if a cutomer with the primary key could not be found
	 */
	@Override
	public com.az.dev.model.Cutomer getCutomer(long id_customer)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cutomerLocalService.getCutomer(id_customer);
	}

	/**
	 * Returns a range of all the cutomers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.az.dev.model.impl.CutomerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cutomers
	 * @param end the upper bound of the range of cutomers (not inclusive)
	 * @return the range of cutomers
	 */
	@Override
	public java.util.List<com.az.dev.model.Cutomer> getCutomers(
		int start, int end) {

		return _cutomerLocalService.getCutomers(start, end);
	}

	/**
	 * Returns the number of cutomers.
	 *
	 * @return the number of cutomers
	 */
	@Override
	public int getCutomersCount() {
		return _cutomerLocalService.getCutomersCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _cutomerLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cutomerLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cutomerLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the cutomer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CutomerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cutomer the cutomer
	 * @return the cutomer that was updated
	 */
	@Override
	public com.az.dev.model.Cutomer updateCutomer(
		com.az.dev.model.Cutomer cutomer) {

		return _cutomerLocalService.updateCutomer(cutomer);
	}

	@Override
	public CutomerLocalService getWrappedService() {
		return _cutomerLocalService;
	}

	@Override
	public void setWrappedService(CutomerLocalService cutomerLocalService) {
		_cutomerLocalService = cutomerLocalService;
	}

	private CutomerLocalService _cutomerLocalService;

}