package com.gymsystem.serviceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gymsystem.dao.EquipmentDao;
import com.gymsystem.dao.EquipmentRentDao;
import com.gymsystem.po.Equipment;
import com.gymsystem.po.EquipmentRent;
import com.gymsystem.service.EquipmentService;
import com.gymsystem.util.MyUtil;
import com.gymsystem.vo.EquipmentRentVo;
import com.gymsystem.vo.EquipmentRepairVo;
import com.gymsystem.vo.EquipmentVo;

@Service("equipmentServieImpl")
public class EquipmentServiceImpl implements EquipmentService {

	@Resource
	EquipmentRentDao equipmentRentDao;
	@Resource
	EquipmentDao equipmentDao;

	@Override
	public List<EquipmentVo> getEquipments() {
		// TODO Auto-generated method stub
		List<Equipment> equipment=equipmentDao.query();
		List<EquipmentVo> equipmentVoList=new ArrayList<>();
		for(Equipment equipments:equipment){
			EquipmentVo equipmentVo=new EquipmentVo(
					equipments.getEquipmentNumber(),
					equipments.getName(),
					equipments.getLocation(),
					Long.parseLong(equipments.getRate()),
					equipments.getNumber(),
					equipments.isCanUse()
					);
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
		Date buyTime = MyUtil.strToDate(equipmentVo.getBuyTime());
		
		Equipment equipment = new Equipment(equipmentNumber,
							equipmentVo.getEquipmentName(), 
							equipmentVo.getEquipmentType(),
							equipmentVo.getEquipmentLocation(), 
							equipmentVo.getRentRate()+ "",
							buyTime, 
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<EquipmentVo> queryEquipment(EquipmentVo equipmentVo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addEquipmentRepair(EquipmentRepairVo equipmentRepairVo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<EquipmentRepairVo> getEquipmentRepairVos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addEquipmentRent(EquipmentRentVo equipmentVo) {
		// TODO Auto-generated method stub
		EquipmentRent rent = new EquipmentRent();
		System.out.println("---------$$$$$$$$$$-----------"
				+ equipmentVo.getEquipmentName());
		Equipment equipment = new Equipment();

		equipment.setName(equipmentVo.getEquipmentName());
		rent.setEquipment(equipment);

		System.out.println("--------------------"
				+ rent.getEquipment().getName());
		equipmentRentDao.addEquipmentRent(rent);
		return true;
	}

	@Override
	public List<EquipmentRentVo> getEquipmentRents() {
		// TODO Auto-generated method stub
		return null;
	}

	public EquipmentRentDao getEquipmentRentDao() {
		return equipmentRentDao;
	}

	public void setEquipmentRentDao(EquipmentRentDao equipmentRentDao) {
		this.equipmentRentDao = equipmentRentDao;
	}

}
