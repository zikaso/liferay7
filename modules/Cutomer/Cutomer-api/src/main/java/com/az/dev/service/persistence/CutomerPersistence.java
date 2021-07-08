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

import com.az.dev.exception.NoSuchCutomerException;
import com.az.dev.model.Cutomer;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the cutomer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CutomerUtil
 * @generated
 */
@ProviderType
public interface CutomerPersistence extends BasePersistence<Cutomer> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CutomerUtil} to access the cutomer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the cutomers where age = &#63;.
	 *
	 * @param age the age
	 * @return the matching cutomers
	 */
	public java.util.List<Cutomer> findBybyage(String age);

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
	public java.util.List<Cutomer> findBybyage(String age, int start, int end);

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
	public java.util.List<Cutomer> findBybyage(
		String age, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Cutomer>
			orderByComparator);

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
	public java.util.List<Cutomer> findBybyage(
		String age, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Cutomer>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cutomer in the ordered set where age = &#63;.
	 *
	 * @param age the age
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cutomer
	 * @throws NoSuchCutomerException if a matching cutomer could not be found
	 */
	public Cutomer findBybyage_First(
			String age,
			com.liferay.portal.kernel.util.OrderByComparator<Cutomer>
				orderByComparator)
		throws NoSuchCutomerException;

	/**
	 * Returns the first cutomer in the ordered set where age = &#63;.
	 *
	 * @param age the age
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cutomer, or <code>null</code> if a matching cutomer could not be found
	 */
	public Cutomer fetchBybyage_First(
		String age,
		com.liferay.portal.kernel.util.OrderByComparator<Cutomer>
			orderByComparator);

	/**
	 * Returns the last cutomer in the ordered set where age = &#63;.
	 *
	 * @param age the age
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cutomer
	 * @throws NoSuchCutomerException if a matching cutomer could not be found
	 */
	public Cutomer findBybyage_Last(
			String age,
			com.liferay.portal.kernel.util.OrderByComparator<Cutomer>
				orderByComparator)
		throws NoSuchCutomerException;

	/**
	 * Returns the last cutomer in the ordered set where age = &#63;.
	 *
	 * @param age the age
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cutomer, or <code>null</code> if a matching cutomer could not be found
	 */
	public Cutomer fetchBybyage_Last(
		String age,
		com.liferay.portal.kernel.util.OrderByComparator<Cutomer>
			orderByComparator);

	/**
	 * Returns the cutomers before and after the current cutomer in the ordered set where age = &#63;.
	 *
	 * @param id_customer the primary key of the current cutomer
	 * @param age the age
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cutomer
	 * @throws NoSuchCutomerException if a cutomer with the primary key could not be found
	 */
	public Cutomer[] findBybyage_PrevAndNext(
			long id_customer, String age,
			com.liferay.portal.kernel.util.OrderByComparator<Cutomer>
				orderByComparator)
		throws NoSuchCutomerException;

	/**
	 * Removes all the cutomers where age = &#63; from the database.
	 *
	 * @param age the age
	 */
	public void removeBybyage(String age);

	/**
	 * Returns the number of cutomers where age = &#63;.
	 *
	 * @param age the age
	 * @return the number of matching cutomers
	 */
	public int countBybyage(String age);

	/**
	 * Caches the cutomer in the entity cache if it is enabled.
	 *
	 * @param cutomer the cutomer
	 */
	public void cacheResult(Cutomer cutomer);

	/**
	 * Caches the cutomers in the entity cache if it is enabled.
	 *
	 * @param cutomers the cutomers
	 */
	public void cacheResult(java.util.List<Cutomer> cutomers);

	/**
	 * Creates a new cutomer with the primary key. Does not add the cutomer to the database.
	 *
	 * @param id_customer the primary key for the new cutomer
	 * @return the new cutomer
	 */
	public Cutomer create(long id_customer);

	/**
	 * Removes the cutomer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id_customer the primary key of the cutomer
	 * @return the cutomer that was removed
	 * @throws NoSuchCutomerException if a cutomer with the primary key could not be found
	 */
	public Cutomer remove(long id_customer) throws NoSuchCutomerException;

	public Cutomer updateImpl(Cutomer cutomer);

	/**
	 * Returns the cutomer with the primary key or throws a <code>NoSuchCutomerException</code> if it could not be found.
	 *
	 * @param id_customer the primary key of the cutomer
	 * @return the cutomer
	 * @throws NoSuchCutomerException if a cutomer with the primary key could not be found
	 */
	public Cutomer findByPrimaryKey(long id_customer)
		throws NoSuchCutomerException;

	/**
	 * Returns the cutomer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id_customer the primary key of the cutomer
	 * @return the cutomer, or <code>null</code> if a cutomer with the primary key could not be found
	 */
	public Cutomer fetchByPrimaryKey(long id_customer);

	/**
	 * Returns all the cutomers.
	 *
	 * @return the cutomers
	 */
	public java.util.List<Cutomer> findAll();

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
	public java.util.List<Cutomer> findAll(int start, int end);

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
	public java.util.List<Cutomer> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Cutomer>
			orderByComparator);

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
	public java.util.List<Cutomer> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Cutomer>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the cutomers from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of cutomers.
	 *
	 * @return the number of cutomers
	 */
	public int countAll();

}