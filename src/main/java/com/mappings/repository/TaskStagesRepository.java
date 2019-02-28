package com.mappings.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mappings.models.TaskStages;

@Repository
public interface TaskStagesRepository extends JpaRepository<TaskStages,String> {

	@Query("select ts.stagesId from TaskStages ts where ts.taskId=:taskId")
	List<String> findAllByTaskId(@Param("taskId")String taskId);

}
