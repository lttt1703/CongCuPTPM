package com.webbanhang.Service.User;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webbanhang.Dao.BillsDao;
import com.webbanhang.Dto.CartDto;
import com.webbanhang.Entity.BillDetail;
import com.webbanhang.Entity.Bills;

@Service
public class BillsServiceImpl implements IBillsService{
	
	@Autowired
	private BillsDao billsDao;

	public int AddBill(Bills bill) {
		return billsDao.AddBill(bill);
	}

	public void AddBillDetail(HashMap<Integer, CartDto> carts) {
		
		int idBill = billsDao.GetIDLastBill();
		
		for(Map.Entry<Integer, CartDto> itemCart : carts.entrySet()) {
			BillDetail billDetail = new BillDetail();
			billDetail.setId_bill(idBill);
			billDetail.setId_product(itemCart.getValue().getProduct().getId());
			billDetail.setQuanty(itemCart.getValue().getQuanty());
			billDetail.setTotal(itemCart.getValue().getTotal());
			billsDao.AddBillDetail(billDetail);
		}
		
	}

}
