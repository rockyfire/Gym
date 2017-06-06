package com.gymsystem.daoImpl;

import java.util.List;

import com.gymsystem.dao.EquipmentRentDao;
import com.gymsystem.po.EquipmentRent;

public class EquipmentRentDaoImpl extends BaseDaoImpl<EquipmentRent> implements
		EquipmentRentDao {

	@Override
	public void addEquipmentRent(EquipmentRent rent) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(rent);
	}

	@Override
	public EquipmentRent getEquipmentByName(String equipmentName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EquipmentRent getEquipmentByNumber(String equipmentNumber) {
		String hql = "from EquipmentRent as e where e.equipmentNumber=?";
		List<EquipmentRent> equipmentRents = (List<EquipmentRent>) this.getHibernateTemplate().find(hql, equipmentNumber);
		if (equipmentRents != null && equipmentRents.size() > 0) {
			return equipmentRents.get(0);
		} else {
			return null;
		}
	}

}
