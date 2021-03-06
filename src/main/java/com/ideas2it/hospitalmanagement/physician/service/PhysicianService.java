package com.ideas2it.hospitalmanagement.physician.service;

import java.util.List;

import com.ideas2it.hospitalmanagement.exception.ApplicationException;
import com.ideas2it.hospitalmanagement.physician.service.impl.PhysicianServiceImpl;
import com.ideas2it.hospitalmanagement.physician.model.Physician;

public interface PhysicianService {

	/**
	 * <p>
	 * This Method is used to add a new physician using the details provided by
	 * the user. Returns true if the entry is added successfully, else returns
	 * false.
	 * </p>
	 *
	 * @param physician an Physician object containing all the details of the
	 *                 physician to be added.
	 *
	 * @return Boolean a boolean indicating the id of Physician that is added.
	 *
	 * @throws ApplicationException A Custom Exception created for catching
	 *                              exceptions that occur while adding an
	 *                              physician.
	 */
	public Boolean addPhysician(Physician physician) throws ApplicationException;

	/**
	 * <p>
	 *  This Method is used to modify the details of an existing physician with
	 *  updated details provided by the user. Returns true if the physician 
	 *  information is updated, else returns false if the operation fails.
	 * </p>
	 *
	 * @param newPhysician an Physician object is passed with the id of the old
	 *                    Physician which is used as a reference.
	 *
	 * @return boolean a boolean value is returned whether the operation to
	 *                 modify is successful or not.
	 *
	 * @throws ApplicationException A Custom Exception created for catching
	 *                              exceptions that occur while modifying an
	 *                              physician.
	 */
	public boolean modifyPhysician(Physician newPhysician)
			throws ApplicationException;

	/**
	 * <p>
	 *  This Method is used to re-activate an physician who has been deleted.
	 *  Returns true if the operation is successful.
	 * </p>
	 *
	 * @param id an integer indicating the id of the physician to be reinstated.
	 *
	 * @return boolean a boolean value is returned whether the operation to
	 *                 modify is successful or not.
	 *
	 * @throws ApplicationException A Custom Exception created for catching
	 *                              exceptions that occur while modifying an
	 *                              physician.
	 */
	public boolean restorePhysician(int id) throws ApplicationException;

	/**
	 * <p>
	 * This Method is used to delete an physician entry. Returns true if the 
	 * entry is removed, else returns false if the entry is not found.
	 * </p>
	 *
	 * @param id an Integer containing the id of the Physician object which is
	 *           to be deleted.
	 *
	 * @return boolean a boolean value is returned whether the removal of the
	 *                 physician is successful or not.
	 *
	 * @throws ApplicationException A Custom Exception created for catching
	 *                              exceptions that occur while deleting an
	 *                              physician.
	 */
	public boolean deletePhysician(Integer id) throws ApplicationException;

	/**
	 * <p>
	 * This Method is used to search an Physician Entry and return the Physician
	 * object. It returns null if no match is found.
	 * </p>
	 *
	 * @param id an Integer indicating the id of the physician that is
	 *           to be searched an returned.
	 *
	 * @return physician an Physician object is returned if a valid match is
	 *                  found, else returns null.
	 *
	 * @throws ApplicationException A Custom Exception created for catching
	 *                              exceptions that occur while retrieving an
	 *                              physician.
	 */
	public Physician retrievePhysicianById(Integer id) throws ApplicationException;

	/**
	 * <p>
	 *  This Method is used to obtain all the physician details using an
	 *  list. Returns an empty list if no physicians are added.
	 * </p>
	 *
	 * @return physicians a list consisting of all the physicians that are
	 *                   added.
	 *
	 * @throws ApplicationException A Custom Exception created for catching
	 *                              exceptions that occur while retrieving all
	 *                              physicians.
	 */
	public List<Physician> retrieveAllPhysicians() throws ApplicationException;

	/**
	 * <p>
	 * This Method is used to retrieve an list of all selected physicians.
	 * </p>
	 *
	 * @return ids an Array of integers containing the id of physicians that are
	 *             to be retrieved.
	 *
	 * @throws ApplicationException An exception created for catching exceptions
	 *                              that occur while displaying all physicians.
	 */
	public List<Physician> retrievePhysiciansByIds(Integer[] ids) throws ApplicationException;

}
