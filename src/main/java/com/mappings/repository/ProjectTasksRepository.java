package com.mappings.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mappings.models.ProjectTasks;

@Repository
public interface ProjectTasksRepository extends JpaRepository<ProjectTasks,String> {

	@Query("select pts.tasksId from ProjectTasks pts where pts.projectId=:projectId")
	List<String> findAllWithId(@Param("projectId") String projectId);

}
