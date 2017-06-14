package com.gymsystem.daoImpl;

import java.util.List;

import com.gymsystem.dao.EquipmentRepaireDao;
import com.gymsystem.po.EquipmentRepair;

public class EquipmentRepaireDaoImpl extends BaseDaoImpl<EquipmentRepair> implements EquipmentRepaireDao{

	@Override
	public EquipmentRepair getEquipmentByNumber(String number) {
		String hql = "from EquipmentRepair as e where e.equipmentRepairNumber=?";
		List<EquipmentRepair> equipmentRepairs = (List<EquipmentRepair>) this.getHibernateTemplate().find(hql, number);
		if (equipmentRepairs!=null&&equipmentRepairs.size()>0) {
			return equipmentRepairs.get(0);
		}else {
			return null;
		}
	}

	@Override
	public void addEquipmentRepair(EquipmentRepair repair) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(repair);
	}

	@Override
	public EquipmentRepair getEquipmentByName(String equipmentName) {
		// TODO Auto-generated method stub
		return null;
	}
}
