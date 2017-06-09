package com.gymsystem.serviceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gymsystem.dao.EquipmentDao;
import com.gymsystem.dao.EquipmentRentDao;
import com.gymsystem.dao.EquipmentRepaireDao;
import com.gymsystem.dao.UserDao;
import com.gymsystem.po.Equipment;
import com.gymsystem.po.EquipmentRent;
import com.gymsystem.po.EquipmentRepair;
import com.gymsystem.po.User;
import com.gymsystem.service.EquipmentService;
import com.gymsystem.util.MyUtil;
import com.gymsystem.vo.EquipmentRentVo;
import com.gymsystem.vo.EquipmentRepairVo;
import com.gymsystem.vo.EquipmentVo;

@Service("equipmentServieImpl")
public class EquipmentServiceImpl implements EquipmentService {
	@Resource
	EquipmentRepaireDao equipmentRepairDao;
	@Resource
	EquipmentRentDao equipmentRentDao;
	@Resource
	EquipmentDao equipmentDao;
	@Resource
	UserDao userDao;
	/*
	 * @Resource WorkerDao workerDao;
	 */

	private int idleNumber;

	@Override
	public List<EquipmentVo> getEquipments() {
		// TODO Auto-generated method stub
		List<Equipment> equipment = equipmentDao.query();
		List<EquipmentVo> equipmentVoList = new ArrayList<>();
		for (Equipment equipments : equipment) {
			EquipmentVo equipmentVo = new EquipmentVo(
					equipments.getEquipmentNumber(), 
					equipments.getName(),
					equipments.getLocation(), 
					equipments.getRate(), 
					equipments.getAccountNumber(),
					equipments.getNumber(), 
					equipments.getRentedNumber(),
					equipments.getRepairNumber(), 
					equipments.isCanUse());
			equipmentVoList.add(equipmentVo);
		}
		return equipmentVoList;
	}

	@Override
	public boolean addEquipment(EquipmentVo equipmentVo) {
		// TODO Auto-generated method stub
		// 类型转换
		String equipmentNumber = MyUtil.createUserNumber();
		equipmentVo.setEquipmentNumber(equipmentNumber);
		Date buyTime = equipmentVo.getBuyTime();

		Equipment equipment = new Equipment(equipmentNumber,
				equipmentVo.getEquipmentName(), 
				equipmentVo.getEquipmentType(),
				equipmentVo.getEquipmentLocation(), 
				equipmentVo.getRentRate(), 
				buyTime, 
				equipmentVo.getEquipmentAccount(),
				equipmentVo.getEquipmentAccount(), 
				true);
		equipmentDao.addEquipment(equipment);
		return true;
	}

	@Override
	public boolean updateEquipment(EquipmentVo equipmentVo) {
		// TODO Auto-generated method stub

		return false;
	}

	@Override
	public boolean deleteEquipment(EquipmentVo equipmentVo) {
		Equipment equipment = equipmentDao.getEquipmentByNumber(equipmentVo.getEquipmentNumber());
		equipmentDao.delete(equipment.getEquipment_id());
		return true;
	}

	@Override
	public List<EquipmentVo> queryEquipment(EquipmentVo equipmentVo) {
		// TODO Auto-generated method stub
		Equipment equipment = new Equipment(
				equipmentVo.getEquipmentName(),
				equipmentVo.getEquipmentType());
		List<Equipment> equipmentlist = equipmentDao.queryEquipments(equipment);

		List<EquipmentVo> equipmentVolist = new ArrayList<EquipmentVo>();
		for (Equipment equipments : equipmentlist) {
			EquipmentVo equipmentVos = new EquipmentVo(
					equipments.getEquipmentNumber(), 
					equipments.getName(),
					equipments.getLocation(), 
					equipments.getRate(), 
					equipments.getAccountNumber(),
					equipments.getNumber(), 
					equipments.getRentedNumber(),
					equipments.getRepairNumber(), 
					equipments.isCanUse());
			equipmentVolist.add(equipmentVos);
		}
		return equipmentVolist;
	}

	@Override
	public List<EquipmentVo> ajaxqueryEquipment(String name) {
		// TODO Auto-generated method stub
		List<EquipmentVo> equipmentVos=new ArrayList<EquipmentVo>();
		Equipment equipment = equipmentDao.getEquipmentByName(name).get(0);	
		EquipmentVo equipmentVo = new EquipmentVo();
		equipmentVo.setIdleNumber(equipment.getNumber());
		equipmentVo.setRentRate(equipment.getRate());
		equipmentVos.add(equipmentVo);
		return equipmentVos;
	}

	@Override
	public boolean addEquipmentRepair(EquipmentRepairVo equipmentRepairVo) {
		// TODO Auto-generated method stub

		EquipmentRepair equipmentRepair = new EquipmentRepair(
				equipmentRepairVo.getEquipmentTime(),
				equipmentRepairVo.getEquipmentNumber(),
				equipmentRepairVo.getDescription());
		// 通过名字的查找实现关联
		/*
		 * Worker
		 * worker=workerDao.getUserByName(equipmentRepairVo.getWorkers());
		 * equipmentRepair.setWorkManages();
		 */

		Equipment equipment = equipmentDao.getEquipmentByName(
				equipmentRepairVo.getEquipmentName()).get(0);
		/* for (Equipment equipment:equipmentlist){ */
		// 变更器材数量
		int totalRepairNumber = equipment.getRepairNumber()+ equipmentRepairVo.getEquipmentNumber();
		int totalNoIdleNumber = totalRepairNumber + equipment.getRentedNumber();
		idleNumber = equipment.getAccountNumber() - totalNoIdleNumber;
		if (totalNoIdleNumber <= equipment.getAccountNumber()) {
			equipment.setNumber(idleNumber);
			equipment.setRepairNumber(totalRepairNumber);
		}
		equipmentDao.update(equipment);
		equipmentRepair.setEquipment(equipment);

		equipmentRepairDao.addEquipmentRepair(equipmentRepair);
		return true;
	}

	@Override
	public List<EquipmentRepairVo> getEquipmentRepairs() {
		// TODO Auto-generated method stub
		// 租借的详细信息
		List<EquipmentRepair> rentlist = equipmentRepairDao.query();
		List<EquipmentRepairVo> rentVoList = new ArrayList<>();
		for (EquipmentRepair equipments : rentlist) {
			EquipmentRepairVo rentVo = new EquipmentRepairVo(
					equipments.getEquipmentRepair_Id() + "", 
					equipments.getEquipment().getName(),
					equipments.getRepairTime(),
					11,// equipments.getTradeCard().getAccount();
					"Candy", // equipments.getWorkManages()
					equipments.getEquipmentRepairNumber(),
					equipments.getRepairContent());
			rentVoList.add(rentVo);
		}
		return rentVoList;
	}

	@Override
	public boolean addEquipmentRent(EquipmentRentVo equipmentRentVo) {
		// TODO Auto-generated method stub
		EquipmentRent equipmentRent = new EquipmentRent(
				equipmentRentVo.getRentNumber(),
				equipmentRentVo.getRentTime(),
				equipmentRentVo.getReturnTime(),
				equipmentRentVo.getTotalRent());
		// 通过名字的查找实现关联
		User user = userDao.getUserByName(equipmentRentVo.getLeaseHolder());
		equipmentRent.setUser(user);

		Equipment equipment = equipmentDao.getEquipmentByName(
				equipmentRentVo.getEquipmentName()).get(0);

		// 变更器材数量
		int totalRentNumber = equipment.getRentedNumber()+ equipmentRentVo.getRentNumber();
		int totalNoIdleNumber = totalRentNumber + equipment.getRepairNumber();
		idleNumber = equipment.getAccountNumber() - totalNoIdleNumber;
		if (totalNoIdleNumber <= equipment.getAccountNumber()) {
			equipment.setNumber(idleNumber);
			equipment.setRentedNumber(totalRentNumber);
		}

		equipmentDao.update(equipment);
		equipmentRent.setEquipment(equipment);
		equipmentRent.setUsage("0"); //正在使用的状态 || 可以归还的状态

		equipmentRentDao.addEquipmentRent(equipmentRent);
		return true;
	}

	@Override
	public List<EquipmentRentVo> getEquipmentRents() {
		// TODO Auto-generated method stub
		// 租借的详细信息
		List<EquipmentRent> rentlist = equipmentRentDao.query();
		List<EquipmentRentVo> rentVoList = new ArrayList<>();
		for (EquipmentRent equipments : rentlist) {
			EquipmentRentVo rentVo = new EquipmentRentVo(
					equipments.getEquipmentRent_id() + "",
					equipments.getEquipment().getName(),
					equipments.getAccount(),
					equipments.getUser().getUsername(),
					equipments.getRentTime(),
					equipments.getReturnTime(),
					equipments.getRentRate());
			rentVoList.add(rentVo);
		}

		return rentVoList;
	}
	
	
	@Override
	public List<EquipmentRentVo> getEquipmentRent_detail(String username) {
		// TODO Auto-generated method stub
		List<EquipmentRentVo> equipmentRentVos=new ArrayList<EquipmentRentVo>();
		List<EquipmentRent> equipments=equipmentRentDao.getEquipmentByUser(username);
		for (EquipmentRent equipmentRent : equipments) {
			EquipmentRentVo equipmentRentVo=new EquipmentRentVo(
					equipmentRent.getEquipmentRent_id()+"",
					equipmentRent.getEquipment().getName(),
					equipmentRent.getAccount(),
					equipmentRent.getRentTime(),
					equipmentRent.getReturnTime(),
					equipmentRent.getRentRate()
					);
			equipmentRentVo.setCheckout(equipmentRent.getUsage());
			equipmentRentVos.add(equipmentRentVo);
		}
		return equipmentRentVos;
	}
	
	//器材归还上报
	@Override
	public boolean setEquipmentRentUsage(EquipmentRentVo equipmentRentVo,String usage) {
		// TODO Auto-generated method stub
		EquipmentRent equipmentRent=(EquipmentRent)equipmentRentDao.getEquipmentByNumber(Integer.parseInt(equipmentRentVo.getEquipmentRentNumber()));
		equipmentRent.setUsage(usage); //改变状态
		
		String equipmentName=equipmentRent.getEquipment().getName();
		System.out.print(equipmentName+"*******************");
		if(usage.equals("1")){
			equipmentRent.setReason(equipmentRentVo.getReason());
			equipmentRent.setConnection(equipmentRentVo.getConnection());
		}
		if (usage.equals("2")) {
			Equipment equipment=equipmentDao.getEquipmentByName(equipmentName).get(0);
			// 归还器材数量
			int rentedNumber=equipment.getRentedNumber()- equipmentRent.getAccount();
			int totalNoIdleNumber = rentedNumber + equipment.getRepairNumber();
			idleNumber = equipment.getAccountNumber() - totalNoIdleNumber;
			if (totalNoIdleNumber <= equipment.getAccountNumber()) {
				equipment.setNumber(idleNumber);
				equipment.setRentedNumber(rentedNumber);
			}
			equipmentDao.update(equipment);
			equipmentRent.setEquipment(equipment);
		}
		equipmentRentDao.update(equipmentRent);
		return true;
	}
	
	@Override
	public List<EquipmentRentVo> getDetailReturns() {
		// TODO Auto-generated method stub
		List<EquipmentRentVo> equipmentRentVos=new ArrayList<EquipmentRentVo>();
		List<EquipmentRent> equipments=equipmentRentDao.getEquipmentByUser("all");
		for (EquipmentRent equipmentRent : equipments) {
			EquipmentRentVo equipmentRentVo=new EquipmentRentVo(
					equipmentRent.getEquipmentRent_id()+"",
					equipmentRent.getEquipment().getName(),
					equipmentRent.getAccount(),
					equipmentRent.getUser().getUsername(),
					equipmentRent.getRentTime(),
					equipmentRent.getReturnTime(),
					equipmentRent.getRentRate(),
					equipmentRent.getReason(),
					equipmentRent.getConnection()
					);
			equipmentRentVos.add(equipmentRentVo);
		}
		return equipmentRentVos;
	}

	@Override
	public boolean checkReturn() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	public EquipmentDao getEquipmentDao() {
		return equipmentDao;
	}

	public void setEquipmentDao(EquipmentDao equipmentDao) {
		this.equipmentDao = equipmentDao;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public EquipmentRentDao getEquipmentRentDao() {
		return equipmentRentDao;
	}

	public void setEquipmentRentDao(EquipmentRentDao equipmentRentDao) {
		this.equipmentRentDao = equipmentRentDao;
	}

	public EquipmentRepaireDao getEquipmentRepairDao() {
		return equipmentRepairDao;
	}

	public void setEquipmentRepairDao(EquipmentRepaireDao equipmentRepairDao) {
		this.equipmentRepairDao = equipmentRepairDao;
	}

}
