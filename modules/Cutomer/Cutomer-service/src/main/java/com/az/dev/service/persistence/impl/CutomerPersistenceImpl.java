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

package com.az.dev.service.persistence.impl;

import com.az.dev.exception.NoSuchCutomerException;
import com.az.dev.model.Cutomer;
import com.az.dev.model.impl.CutomerImpl;
import com.az.dev.model.impl.CutomerModelImpl;
import com.az.dev.service.persistence.CutomerPersistence;
import com.az.dev.service.persistence.impl.constants.FOOPersistenceConstants;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.MapUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.sql.DataSource;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the cutomer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CutomerPersistence.class)
public class CutomerPersistenceImpl
	extends BasePersistenceImpl<Cutomer> implements CutomerPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CutomerUtil</code> to access the cutomer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CutomerImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBybyage;
	private FinderPath _finderPathWithoutPaginationFindBybyage;
	private FinderPath _finderPathCountBybyage;

	/**
	 * Returns all the cutomers where age = &#63;.
	 *
	 * @param age the age
	 * @return the matching cutomers
	 */
	@Override
	public List<Cutomer> findBybyage(String age) {
		return findBybyage(age, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Cutomer> findBybyage(String age, int start, int end) {
		return findBybyage(age, start, end, null);
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
	@Override
	public List<Cutomer> findBybyage(
		String age, int start, int end,
		OrderByComparator<Cutomer> orderByComparator) {

		return findBybyage(age, start, end, orderByComparator, true);
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
	@Override
	public List<Cutomer> findBybyage(
		String age, int start, int end,
		OrderByComparator<Cutomer> orderByComparator, boolean useFinderCache) {

		age = Objects.toString(age, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBybyage;
				finderArgs = new Object[] {age};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBybyage;
			finderArgs = new Object[] {age, start, end, orderByComparator};
		}

		List<Cutomer> list = null;

		if (useFinderCache) {
			list = (List<Cutomer>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Cutomer cutomer : list) {
					if (!age.equals(cutomer.getAge())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_CUTOMER_WHERE);

			boolean bindAge = false;

			if (age.isEmpty()) {
				sb.append(_FINDER_COLUMN_BYAGE_AGE_3);
			}
			else {
				bindAge = true;

				sb.append(_FINDER_COLUMN_BYAGE_AGE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CutomerModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindAge) {
					queryPos.add(age);
				}

				list = (List<Cutomer>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first cutomer in the ordered set where age = &#63;.
	 *
	 * @param age the age
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cutomer
	 * @throws NoSuchCutomerException if a matching cutomer could not be found
	 */
	@Override
	public Cutomer findBybyage_First(
			String age, OrderByComparator<Cutomer> orderByComparator)
		throws NoSuchCutomerException {

		Cutomer cutomer = fetchBybyage_First(age, orderByComparator);

		if (cutomer != null) {
			return cutomer;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("age=");
		sb.append(age);

		sb.append("}");

		throw new NoSuchCutomerException(sb.toString());
	}

	/**
	 * Returns the first cutomer in the ordered set where age = &#63;.
	 *
	 * @param age the age
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cutomer, or <code>null</code> if a matching cutomer could not be found
	 */
	@Override
	public Cutomer fetchBybyage_First(
		String age, OrderByComparator<Cutomer> orderByComparator) {

		List<Cutomer> list = findBybyage(age, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cutomer in the ordered set where age = &#63;.
	 *
	 * @param age the age
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cutomer
	 * @throws NoSuchCutomerException if a matching cutomer could not be found
	 */
	@Override
	public Cutomer findBybyage_Last(
			String age, OrderByComparator<Cutomer> orderByComparator)
		throws NoSuchCutomerException {

		Cutomer cutomer = fetchBybyage_Last(age, orderByComparator);

		if (cutomer != null) {
			return cutomer;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("age=");
		sb.append(age);

		sb.append("}");

		throw new NoSuchCutomerException(sb.toString());
	}

	/**
	 * Returns the last cutomer in the ordered set where age = &#63;.
	 *
	 * @param age the age
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cutomer, or <code>null</code> if a matching cutomer could not be found
	 */
	@Override
	public Cutomer fetchBybyage_Last(
		String age, OrderByComparator<Cutomer> orderByComparator) {

		int count = countBybyage(age);

		if (count == 0) {
			return null;
		}

		List<Cutomer> list = findBybyage(
			age, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Cutomer[] findBybyage_PrevAndNext(
			long id_customer, String age,
			OrderByComparator<Cutomer> orderByComparator)
		throws NoSuchCutomerException {

		age = Objects.toString(age, "");

		Cutomer cutomer = findByPrimaryKey(id_customer);

		Session session = null;

		try {
			session = openSession();

			Cutomer[] array = new CutomerImpl[3];

			array[0] = getBybyage_PrevAndNext(
				session, cutomer, age, orderByComparator, true);

			array[1] = cutomer;

			array[2] = getBybyage_PrevAndNext(
				session, cutomer, age, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Cutomer getBybyage_PrevAndNext(
		Session session, Cutomer cutomer, String age,
		OrderByComparator<Cutomer> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_CUTOMER_WHERE);

		boolean bindAge = false;

		if (age.isEmpty()) {
			sb.append(_FINDER_COLUMN_BYAGE_AGE_3);
		}
		else {
			bindAge = true;

			sb.append(_FINDER_COLUMN_BYAGE_AGE_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(CutomerModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindAge) {
			queryPos.add(age);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(cutomer)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Cutomer> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cutomers where age = &#63; from the database.
	 *
	 * @param age the age
	 */
	@Override
	public void removeBybyage(String age) {
		for (Cutomer cutomer :
				findBybyage(age, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(cutomer);
		}
	}

	/**
	 * Returns the number of cutomers where age = &#63;.
	 *
	 * @param age the age
	 * @return the number of matching cutomers
	 */
	@Override
	public int countBybyage(String age) {
		age = Objects.toString(age, "");

		FinderPath finderPath = _finderPathCountBybyage;

		Object[] finderArgs = new Object[] {age};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CUTOMER_WHERE);

			boolean bindAge = false;

			if (age.isEmpty()) {
				sb.append(_FINDER_COLUMN_BYAGE_AGE_3);
			}
			else {
				bindAge = true;

				sb.append(_FINDER_COLUMN_BYAGE_AGE_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindAge) {
					queryPos.add(age);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_BYAGE_AGE_2 = "cutomer.age = ?";

	private static final String _FINDER_COLUMN_BYAGE_AGE_3 =
		"(cutomer.age IS NULL OR cutomer.age = '')";

	public CutomerPersistenceImpl() {
		setModelClass(Cutomer.class);

		setModelImplClass(CutomerImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the cutomer in the entity cache if it is enabled.
	 *
	 * @param cutomer the cutomer
	 */
	@Override
	public void cacheResult(Cutomer cutomer) {
		entityCache.putResult(
			CutomerImpl.class, cutomer.getPrimaryKey(), cutomer);
	}

	/**
	 * Caches the cutomers in the entity cache if it is enabled.
	 *
	 * @param cutomers the cutomers
	 */
	@Override
	public void cacheResult(List<Cutomer> cutomers) {
		for (Cutomer cutomer : cutomers) {
			if (entityCache.getResult(
					CutomerImpl.class, cutomer.getPrimaryKey()) == null) {

				cacheResult(cutomer);
			}
		}
	}

	/**
	 * Clears the cache for all cutomers.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CutomerImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the cutomer.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Cutomer cutomer) {
		entityCache.removeResult(CutomerImpl.class, cutomer);
	}

	@Override
	public void clearCache(List<Cutomer> cutomers) {
		for (Cutomer cutomer : cutomers) {
			entityCache.removeResult(CutomerImpl.class, cutomer);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(CutomerImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new cutomer with the primary key. Does not add the cutomer to the database.
	 *
	 * @param id_customer the primary key for the new cutomer
	 * @return the new cutomer
	 */
	@Override
	public Cutomer create(long id_customer) {
		Cutomer cutomer = new CutomerImpl();

		cutomer.setNew(true);
		cutomer.setPrimaryKey(id_customer);

		return cutomer;
	}

	/**
	 * Removes the cutomer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id_customer the primary key of the cutomer
	 * @return the cutomer that was removed
	 * @throws NoSuchCutomerException if a cutomer with the primary key could not be found
	 */
	@Override
	public Cutomer remove(long id_customer) throws NoSuchCutomerException {
		return remove((Serializable)id_customer);
	}

	/**
	 * Removes the cutomer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cutomer
	 * @return the cutomer that was removed
	 * @throws NoSuchCutomerException if a cutomer with the primary key could not be found
	 */
	@Override
	public Cutomer remove(Serializable primaryKey)
		throws NoSuchCutomerException {

		Session session = null;

		try {
			session = openSession();

			Cutomer cutomer = (Cutomer)session.get(
				CutomerImpl.class, primaryKey);

			if (cutomer == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCutomerException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(cutomer);
		}
		catch (NoSuchCutomerException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Cutomer removeImpl(Cutomer cutomer) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cutomer)) {
				cutomer = (Cutomer)session.get(
					CutomerImpl.class, cutomer.getPrimaryKeyObj());
			}

			if (cutomer != null) {
				session.delete(cutomer);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (cutomer != null) {
			clearCache(cutomer);
		}

		return cutomer;
	}

	@Override
	public Cutomer updateImpl(Cutomer cutomer) {
		boolean isNew = cutomer.isNew();

		if (!(cutomer instanceof CutomerModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(cutomer.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(cutomer);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in cutomer proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Cutomer implementation " +
					cutomer.getClass());
		}

		CutomerModelImpl cutomerModelImpl = (CutomerModelImpl)cutomer;

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(cutomer);
			}
			else {
				cutomer = (Cutomer)session.merge(cutomer);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(CutomerImpl.class, cutomerModelImpl, false, true);

		if (isNew) {
			cutomer.setNew(false);
		}

		cutomer.resetOriginalValues();

		return cutomer;
	}

	/**
	 * Returns the cutomer with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cutomer
	 * @return the cutomer
	 * @throws NoSuchCutomerException if a cutomer with the primary key could not be found
	 */
	@Override
	public Cutomer findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCutomerException {

		Cutomer cutomer = fetchByPrimaryKey(primaryKey);

		if (cutomer == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCutomerException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return cutomer;
	}

	/**
	 * Returns the cutomer with the primary key or throws a <code>NoSuchCutomerException</code> if it could not be found.
	 *
	 * @param id_customer the primary key of the cutomer
	 * @return the cutomer
	 * @throws NoSuchCutomerException if a cutomer with the primary key could not be found
	 */
	@Override
	public Cutomer findByPrimaryKey(long id_customer)
		throws NoSuchCutomerException {

		return findByPrimaryKey((Serializable)id_customer);
	}

	/**
	 * Returns the cutomer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id_customer the primary key of the cutomer
	 * @return the cutomer, or <code>null</code> if a cutomer with the primary key could not be found
	 */
	@Override
	public Cutomer fetchByPrimaryKey(long id_customer) {
		return fetchByPrimaryKey((Serializable)id_customer);
	}

	/**
	 * Returns all the cutomers.
	 *
	 * @return the cutomers
	 */
	@Override
	public List<Cutomer> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Cutomer> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Cutomer> findAll(
		int start, int end, OrderByComparator<Cutomer> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Cutomer> findAll(
		int start, int end, OrderByComparator<Cutomer> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<Cutomer> list = null;

		if (useFinderCache) {
			list = (List<Cutomer>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CUTOMER);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CUTOMER;

				sql = sql.concat(CutomerModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Cutomer>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the cutomers from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Cutomer cutomer : findAll()) {
			remove(cutomer);
		}
	}

	/**
	 * Returns the number of cutomers.
	 *
	 * @return the number of cutomers
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_CUTOMER);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "id_customer";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CUTOMER;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CutomerModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the cutomer persistence.
	 */
	@Activate
	public void activate(BundleContext bundleContext) {
		_bundleContext = bundleContext;

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class, new CutomerModelArgumentsResolver(),
			MapUtil.singletonDictionary(
				"model.class.name", Cutomer.class.getName()));

		_finderPathWithPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindBybyage = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBybyage",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"age"}, true);

		_finderPathWithoutPaginationFindBybyage = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBybyage",
			new String[] {String.class.getName()}, new String[] {"age"}, true);

		_finderPathCountBybyage = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBybyage",
			new String[] {String.class.getName()}, new String[] {"age"}, false);
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(CutomerImpl.class.getName());

		_argumentsResolverServiceRegistration.unregister();

		for (ServiceRegistration<FinderPath> serviceRegistration :
				_serviceRegistrations) {

			serviceRegistration.unregister();
		}
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private BundleContext _bundleContext;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_CUTOMER =
		"SELECT cutomer FROM Cutomer cutomer";

	private static final String _SQL_SELECT_CUTOMER_WHERE =
		"SELECT cutomer FROM Cutomer cutomer WHERE ";

	private static final String _SQL_COUNT_CUTOMER =
		"SELECT COUNT(cutomer) FROM Cutomer cutomer";

	private static final String _SQL_COUNT_CUTOMER_WHERE =
		"SELECT COUNT(cutomer) FROM Cutomer cutomer WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "cutomer.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Cutomer exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Cutomer exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CutomerPersistenceImpl.class);

	private FinderPath _createFinderPath(
		String cacheName, String methodName, String[] params,
		String[] columnNames, boolean baseModelResult) {

		FinderPath finderPath = new FinderPath(
			cacheName, methodName, params, columnNames, baseModelResult);

		if (!cacheName.equals(FINDER_CLASS_NAME_LIST_WITH_PAGINATION)) {
			_serviceRegistrations.add(
				_bundleContext.registerService(
					FinderPath.class, finderPath,
					MapUtil.singletonDictionary("cache.name", cacheName)));
		}

		return finderPath;
	}

	private Set<ServiceRegistration<FinderPath>> _serviceRegistrations =
		new HashSet<>();
	private ServiceRegistration<ArgumentsResolver>
		_argumentsResolverServiceRegistration;

	private static class CutomerModelArgumentsResolver
		implements ArgumentsResolver {

		@Override
		public Object[] getArguments(
			FinderPath finderPath, BaseModel<?> baseModel, boolean checkColumn,
			boolean original) {

			String[] columnNames = finderPath.getColumnNames();

			if ((columnNames == null) || (columnNames.length == 0)) {
				if (baseModel.isNew()) {
					return FINDER_ARGS_EMPTY;
				}

				return null;
			}

			CutomerModelImpl cutomerModelImpl = (CutomerModelImpl)baseModel;

			long columnBitmask = cutomerModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(cutomerModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						cutomerModelImpl.getColumnBitmask(columnName);
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(cutomerModelImpl, columnNames, original);
			}

			return null;
		}

		private Object[] _getValue(
			CutomerModelImpl cutomerModelImpl, String[] columnNames,
			boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] = cutomerModelImpl.getColumnOriginalValue(
						columnName);
				}
				else {
					arguments[i] = cutomerModelImpl.getColumnValue(columnName);
				}
			}

			return arguments;
		}

		private static Map<FinderPath, Long> _finderPathColumnBitmasksCache =
			new ConcurrentHashMap<>();

	}

}