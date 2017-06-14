package com.gymsystem.service;

import java.util.List;

import com.gymsystem.vo.WorkerManageVo;
import com.gymsystem.vo.WorkerVo;

public interface WorkerService {

	public List<WorkerVo> getWorkers();
	
	public List<WorkerVo> queryWorkers();
	
	public boolean addWorker(WorkerVo workerVo);
	
	public boolean updateWorker(WorkerVo workerVo);
	
	public boolean deleteWorker(WorkerVo workerVo);
	
	public boolean addWorkerManagement(WorkerManageVo workerManageVo);
	
	public boolean updateWorkerManagement(WorkerManageVo workerManageVo);
	
	public boolean deleteWorkerManagement(WorkerManageVo workerManageVo);
}
