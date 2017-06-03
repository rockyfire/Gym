package com.gymsystem.daoImpl;

import java.util.List;
import java.util.Map;

import com.gymsystem.dao.EquipmentDao;
import com.gymsystem.po.Equipment;

public class EquipmentDaoImpl extends BaseDaoImpl<Equipment> implements EquipmentDao {

	
	@Override
	public void addEquipment(Equipment equipment) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(equipment);
	}
	
	
	@Override
	public List<Equipment> getEquipments(Map<String, String> queryCondition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Equipment getEquipmentByNumber(String equipment) {
		String hql = "from Equipment as e where e.equipmentNumber=?";
		List<Equipment> equipments = (List<Equipment>) this.getHibernateTemplate().find(hql, equipment);
		if (equipments!=null&&equipments.size()>0) {
			return equipments.get(0);
		}else {
			return null;
		}
	}

	@Override
	public List<Equipment> getEquipmentByType(String equipmentType) {
		String hql = "from Equipment as e where e.type=?";
		List<Equipment> equipments = (List<Equipment>) this.getHibernateTemplate().find(hql, equipmentType);
		if (equipments!=null&&equipments.size()>0) {
			return equipments;
		}else {
			return null;
		}
	}

	@Override
	public List<Equipment> getEquipmentByName(String equipmentName) {
		String hql = "from Equipment as e where e.name=?";
		List<Equipment> equipments = (List<Equipment>) this.getHibernateTemplate().find(hql, equipmentName);
		if (equipments!=null&&equipments.size()>0) {
			return equipments;
		}else {
			return null;
		}
	}

	@Override
	public List<Equipment> getUsableEquipments() {
		String hql = "from Equipment as e where e.canUse=?";
		List<Equipment> equipments = (List<Equipment>) this.getHibernateTemplate().find(hql, true);
		if (equipments!=null&&equipments.size()>0) {
			return equipments;
		}else {
			return null;
		}
	}

	

	
}
