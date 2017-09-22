package com.cn.hnust.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller     //  控制器标识
@RequestMapping("/pages/*")	
public class Test {
	@RequestMapping("pay") 
	public ModelAndView pay() {
//		 Map<String,Object> amp = new HashMap<String,Object>();
//		 StringBuffer plain=new StringBuffer();
         /*String plains="TransId=IPER~~Mer_Id=600003~~Mer_IdName=ftcs~~OrderNo=201711295962065~~Amount=0.01~~"+
		 "OrderDateTime=20130711~~CurrencyType=156~~CustomerName=zhangsan~~ProductInfo=食品~~CustomerEMail=136861916@qq.com~~"+
        		 "MerURL=qypaas.net.cn/org.zsl.hnust~~MsgExt=测试";*/
         
        String plains="TransId=IPER~~Mer_Id=600003~~OrderNo=201710070021~~Amount=0.01~~OrderDateTime=20171007000000~~CurrencyType=001~~CustomerName=test~~ProductInfo=test~~CustomerEMail=test@hotmail.com~~MerURL=qypaas.net.cn/org.zsl.hnust~~MsgExt=test";
        String Signature= com.csii.payment.client.core.MerchantSignVerify.merchantSignData_ABA(plains);
         
        ModelAndView mav = new ModelAndView();
 		mav.setViewName("/pay.jsp"); 
 		mav.addObject("plains", plains);  
 		mav.addObject("Signature", Signature);
 		return mav;
		
	}
}
