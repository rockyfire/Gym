package com.gymsystem.daoImpl;

import java.util.List;

import org.apache.struts2.components.Select;

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
	public EquipmentRent getEquipmentByNumber(Integer equipmentRent_id) {
		String hql = "from EquipmentRent as e where e.equipmentRent_id=?";
		List<EquipmentRent> equipmentRents = (List<EquipmentRent>) this.getHibernateTemplate().find(hql, equipmentRent_id);
		if (equipmentRents != null && equipmentRents.size() > 0) {
			return equipmentRents.get(0);
		} else {
			return null;
		}
	}

	@Override
	public List<EquipmentRent> getEquipmentByUser(String username) {
		// TODO Auto-generated method stub
		String hql;
		List<EquipmentRent> equipmentRents;
		if (username.equals("all")) {
			hql = "from EquipmentRent as e where e.usage = 1";
			equipmentRents = (List<EquipmentRent>) this.getHibernateTemplate().find(hql);
		}else{
			hql = "from EquipmentRent as e where e.user.username=? and e.usage  != 1";
			equipmentRents = (List<EquipmentRent>) this.getHibernateTemplate().find(hql, username);
		}	
		if (equipmentRents != null && equipmentRents.size() > 0) {
			return equipmentRents;
		} else {
			return null;
		}
	}

}
