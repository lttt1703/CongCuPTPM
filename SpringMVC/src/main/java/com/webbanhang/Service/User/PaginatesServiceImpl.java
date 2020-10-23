package com.webbanhang.Service.User;

import org.springframework.stereotype.Service;

import com.webbanhang.Dto.PaginatesDto;

@Service
public class PaginatesServiceImpl implements IPaginatesService{

	public PaginatesDto GetInfoPaginates(int totalData, int limit, int currentPage) {
		
		PaginatesDto paginate = new PaginatesDto();
		
		int totalPage = SetInfoTotalPage(totalData, limit);
		paginate.setTotalPage(totalPage);
		paginate.setLimit(limit);
		currentPage = SetInfoCurrenPage(currentPage, paginate.getTotalPage());
		paginate.setCurrentPage(currentPage);
		
		int start = FindStart(paginate.getCurrentPage(), limit);
		paginate.setStart(start);
		int end = FindEnd(paginate.getStart(), limit, totalData);
		paginate.setEnd(end);
		
		return paginate;
	}

	private int FindEnd(int start, int limit, int totalData) {
		return start + limit > totalData ? totalData : (start + limit - 1);
	}

	private int FindStart(int currentPage, int limit) {
		
		return ((currentPage - 1) * limit);
	}

	private int SetInfoCurrenPage(int currentPage, int totalPage) {
		if(currentPage < 1) {
			return 1;
		}else if(currentPage > totalPage) {
			return totalPage;
		}
		return currentPage;
	}

	private int SetInfoTotalPage(int totalData, int limit) {
		int totalPage =0;
		totalPage = totalData / limit;
		totalPage = totalPage * limit < totalData ? totalPage + 1 : totalPage;
		return totalPage;
	}

}
