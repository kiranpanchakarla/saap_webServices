package com.ap.saap.repository;

import java.util.Date;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ap.saap.entity.Notification;

@Repository
public interface NotificationRepository extends CrudRepository<Notification,Integer>,JpaSpecificationExecutor<Notification> {
	
	//List<Notification> findByCategoryId(int CategoryId);
	List<Notification> findById(Long NotificationId);
	
	@Query("select n from Notification n where n.id =:NotificationId")
	Notification getNotificationById(@Param("NotificationId")long NotificationId);
	
	@Transactional
	@Query("select n from Notification n where n.categoryId =:categoryId order by n.id asc")
	List<Notification> findByCategoryId(@Param("categoryId") Integer categoryId);
	
	@Query("select n.title from Notification n where n.categoryId =:CategoryId")
	List<Notification> findByCategory(@Param("CategoryId")int CategoryId);
	

	@Transactional
	@Query("select n from Notification n where n.id =:notificationId")
	List<Notification> findByNotificationId(@Param("notificationId") Integer notificationId);
}
