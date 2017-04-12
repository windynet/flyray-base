package me.flyray.pay.dao;

import java.util.List;
import java.util.Map;

import me.flyray.pay.model.PayChannelConfig;
import me.flyray.pay.model.PayChannelInterface;

/** 
* @author: bolei
* @date：2017年4月8日 下午10:42:02 
* @description：支付通道接口
*/

public interface PayChannelInterfaceDao {

	PayChannelInterface queryObject(Long id);
	
	List<PayChannelInterface> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(PayChannelInterface payChannelInterface);
	
	void update(PayChannelInterface payChannelInterface);
	
}