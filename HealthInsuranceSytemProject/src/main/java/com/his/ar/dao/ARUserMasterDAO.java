package com.his.ar.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.his.ar.entity.ARUserMaster;


/**
 * @author nit
 *	The implementation class of this project will provide default 
 *  implementation give some predefined persistence logic to us. 
 */
@Repository("arUserMaster")
public interface ARUserMasterDAO extends JpaRepository<ARUserMaster, Serializable> {

}
