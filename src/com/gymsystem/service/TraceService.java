package com.gymsystem.service;

import java.util.List;

import com.gymsystem.vo.TraceVo;

public interface TraceService {

	public List<TraceVo> getTraces();
	
	public List<TraceVo> queryTrace(TraceVo traceVo);
	
	
}
