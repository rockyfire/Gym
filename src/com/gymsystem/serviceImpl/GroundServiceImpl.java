package com.gymsystem.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gymsystem.dao.GroundDao;
import com.gymsystem.dao.GroundRentDao;
import com.gymsystem.dao.GroundRepairDao;
import com.gymsystem.po.Ground;
import com.gymsystem.po.GroundRent;
import com.gymsystem.po.GroundRepaire;
import com.gymsystem.service.GroundService;
import com.gymsystem.util.MyUtil;
import com.gymsystem.vo.GroundRentVo;
import com.gymsystem.vo.GroundRepairVo;
import com.gymsystem.vo.GroundVo;


@Service
public class GroundServiceImpl implements GroundService{

	
	@Resource(name="groundDaoImpl")
	private GroundDao groundDao;
	@Resource(name="groundRepairDaoImpl")
	private GroundRepairDao groundRepairDao;
	@Resource
	private GroundRentDao groundRentDao;
	
	
	
	
	
	@Override
	public boolean addGroundRepair(String groundNumber, GroundRepairVo groundRepairVo) {
		Ground ground = groundDao.getGroundByNumber(groundNumber);
			
		GroundRepaire groundRepaire = new GroundRepaire();
		groundRepaire.setRepairedDate(groundRepairVo.getRepairTime());
		groundRepaire.setRepairedDescript(groundRepairVo.getDescription());
		groundRepaire.setRepairedNumber(MyUtil.createUserNumber());
		groundRepaire.setRepairedPay(groundRepairVo.getRepairPay());
		ground.getGroundRepaires().add(groundRepaire);
		groundRepaire.setGround(ground);
		System.out.println(MyUtil.createUserNumber()+"____Number______");
		
		try {
			groundRepairDao.save(groundRepaire);
			groundDao.update(ground);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	@Override
	public List<GroundRepairVo> getGroundRepairByNumber(String groundNumber) {
		if (groundNumber==null) {
			return null;
		}
		Ground ground = groundDao.getGroundByNumber(groundNumber);
		List<GroundRepaire>groundRepaires = ground.getGroundRepaires();
		List<GroundRepairVo>groundRepairVos = new ArrayList<>();
		
		for(GroundRepaire groundRepaire:groundRepaires){
			if (groundRepaire==null) {
				System.out.println("维修表为空");
				return null;
			}
			GroundRepairVo groundRepairVo = new GroundRepairVo();
			groundRepairVo.setDescription(groundRepaire.getRepairedDescript());
			groundRepairVo.setGroundRepairNumber(groundRepaire.getRepairedNumber());
			groundRepairVo.setRepairPay(groundRepaire.getRepairedPay());
			groundRepairVo.setRepairTime(groundRepaire.getRepairedDate());
//			groundRepairVo.setWorkers(groundRepaire.getWorkManages().get(0).getWorkers().get(0).getWorkerNumber());
			groundRepairVos.add(groundRepairVo);
		}
		return groundRepairVos;
	}
	
	
	
	
	
	
	@Override
	public List<GroundVo> getGroundVos() {
		
		List<Ground>grounds = groundDao.query();
		List<GroundVo> groundVos = new ArrayList<>();
		for(Ground ground:grounds){
			GroundVo groundVo = new GroundVo();
			groundVo.setDescription(ground.getDescript());

			groundVo.setGroundLocation(ground.getLocation());
			groundVo.setRentRate(ground.getGroundRentRate());
			groundVo.setGroundName(ground.getGroundName());
			groundVo.setGroundNumber(ground.getGroundNumber());
			groundVo.setGroundType(ground.getType());
			groundVos.add(groundVo);
		}
		return groundVos;
	}

	
	@Override
	public GroundVo getGroundVoByNumber(String groundNumber) {

		Ground ground = groundDao.getGroundByNumber(groundNumber);
		GroundVo groundVo = new GroundVo();
		groundVo.setDescription(ground.getDescript());
		groundVo.setGroundLocation(ground.getLocation());
		groundVo.setRentRate(ground.getGroundRentRate());
		groundVo.setGroundName(ground.getGroundName());
		groundVo.setGroundNumber(ground.getGroundNumber());
		groundVo.setGroundType(ground.getType());
		return groundVo;
	}
	
	@Override
	public List<GroundVo> queryGoundVos() {
		return null;
	}

	@Override
	public boolean addGround(GroundVo groundVo) {
		if (groundVo==null) {
			return false;
		}
		Ground ground = new Ground();
		ground.setDescript(groundVo.getDescription());
		ground.setGroundName(groundVo.getGroundName());
		ground.setGroundNumber(MyUtil.createUserNumber());
		ground.setGroundRentRate(groundVo.getRentRate());
		ground.setLocation(groundVo.getGroundLocation());
		ground.setType(groundVo.getGroundType());
		
		try {
			groundDao.save(ground);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteGround(GroundVo groundVo) {
		if (groundVo==null) {
			return false;
		}
		Ground ground = groundDao.getGroundByNumber(groundVo.getGroundNumber());
		try {
			groundDao.delete(ground.getGround_id());
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateGround(GroundVo groundVo) {
		Ground ground  = groundDao.getGroundByNumber(groundVo.getGroundNumber());
		ground.setDescript(groundVo.getDescription());
		ground.setGroundName(ground.getGroundName());
		ground.setGroundNumber(MyUtil.createUserNumber());
		ground.setGroundRentRate(groundVo.getRentRate());
		ground.setLocation(groundVo.getGroundLocation());
		ground.setType(groundVo.getGroundType());
		try {
			groundDao.update(ground);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean addGroundRent(GroundRentVo groundRentVo) {
		Ground ground = groundDao.getGroundByNumber(groundRentVo.getGroundNumber());
		
		GroundRent groundRent = new GroundRent();
		groundRent.setUserage(groundRentVo.getDescription());
		groundRent.setRentStartTime(groundRentVo.getRentTime());
		groundRent.setRentEndTime(groundRentVo.getReturnTime());
		groundRent.setBroken(false);
		groundRent.setGround(ground);
		groundRent.setGroundRendNumber(MyUtil.createUserNumber());
		groundRent.setTradeCard(null);			//产生交易单
		groundRent.setUser(null); 				//设置租借人
		ground.getGroundRents().add(groundRent);
		try {
			groundRentDao.save(groundRent);
			groundDao.update(ground);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<GroundRentVo> getGroundRents() {
		
		List<GroundRent>groundRents = groundRentDao.query();
		List<GroundRentVo> groundRentVos = new ArrayList<>();
		for(GroundRent groundRent:groundRents){
			if (groundRent==null) {
				return null;
			}
			GroundRentVo groundRentVo = new GroundRentVo();
			groundRentVo.setDescription(groundRent.getUserage());
			groundRentVo.setGroundRentNumber(groundRent.getGroundRendNumber());
			groundRentVo.setGroundNumber(groundRent.getGround().getGroundNumber());
			groundRentVo.setLocation(groundRent.getGround().getLocation());
			groundRentVo.setRentRate(groundRent.getGround().getGroundRentRate());
			groundRentVo.setType(groundRent.getGround().getType());
			groundRentVo.setRentTime(groundRent.getRentStartTime());
			groundRentVo.setReturnTime(groundRent.getRentEndTime());
			groundRentVos.add(groundRentVo);
		}
		return groundRentVos;
	}

	@Override
	public boolean deleteGroundRent(GroundRentVo groundRentVo) {
		GroundRent groundRent = groundRentDao.getGroundRentByNumber(groundRentVo.getGroundNumber());
		try {
			groundRentDao.delete(groundRent.getGroundRend_id());
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean addGroundRepair(GroundRepairVo groundRepairVo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<GroundRepairVo> getGroundRepairs() {
		// TODO Auto-generated method stub
		return null;
	}

}
