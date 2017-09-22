package com.cn.hnust.controller;

public class vation {

	public static void main(String[] args) {
	//	String singtrue="07734e84e1a169e3cf9303ff387d8768bab1af0e9b958bcf13be65d021d3b011f093cfb3e8199bc641f817153f04fc4001be8719a0b6dc7105159c6310352760cccf861ff892dcab1b3264d743d7581ba26f1ae00ffe06f6c51525ad9930c2774be6e17fdd442746167718ed339711177647c173b1ee16509e485e887027a489";
		String plains="TransId=IPER~~Mer_Id=600003~~Mer_IdName=ftcs~~"
				+ "OrderNo=201710070021~~Amount=0.01~~OrderDateTime=20171007000000~~"
				+ "CurrencyType=001~~CustomerName=test~~ProductInfo=test~~"
				+ "CustomerEMail=test@hotmail.com~~MerURL=qypaas.net.cn/org.zsl.hnust~~"
				+ "MsgExt=test";
		String Signature	= com.csii.payment.client.core.MerchantSignVerify.merchantSignData_ABA(plains);
		boolean sss=com.csii.payment.client.core.MerchantSignVerify.merchantVerifyPayGate_ABA (Signature,plains);
		System.out.println("签名："+Signature);
		System.out.println("校验:"+sss);
	}

}
