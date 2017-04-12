package me.flyray.pay.service.manager;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.flyray.pay.api.PaySerialService;
import me.flyray.pay.dao.PaySerialDao;
import me.flyray.pay.model.PaySerial;

/** 
* @author: bolei
* @date：2017年4月8日 下午10:53:03 
* @description：支付流水
*/

@Service("paySerialService")
public class PaySerialServiceImpl implements PaySerialService{

	@Autowired
	private PaySerialDao paySerialDao;
	
	@Override
	public List<PaySerial> queryList(Map<String, Object> map) {
		return paySerialDao.queryList(map);
	}

	@Override
	public int queryTotal(Map<String, Object> map) {
		return paySerialDao.queryTotal(map);
	}

	@Override
	public void save(PaySerial paySerial) {
		paySerialDao.save(paySerial);
	}

	@Override
	public void update(PaySerial paySerial) {
		paySerialDao.update(paySerial);
	}

	@Override
	public void deleteBatch(Long[] ids) {
		// TODO Auto-generated method stub
		
	}

}