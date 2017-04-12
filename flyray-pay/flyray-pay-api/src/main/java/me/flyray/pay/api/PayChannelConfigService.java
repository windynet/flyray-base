package me.flyray.pay.api;

import java.util.List;
import java.util.Map;

import me.flyray.pay.model.PayChannelConfig;

/** 
* @author: bolei
* @date：2017年3月18日 下午11:19:37 
* @description： 支付通道配置
*/

public interface PayChannelConfigService {

	PayChannelConfig queryObject(Long id);
	
	List<PayChannelConfig> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(PayChannelConfig payChannelConfig);
	
	void update(PayChannelConfig payChannelConfig);
	
	void deleteBatch(Long[] ids);
}