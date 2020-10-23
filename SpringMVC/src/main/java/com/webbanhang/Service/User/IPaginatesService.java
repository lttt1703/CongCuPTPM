package com.webbanhang.Service.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webbanhang.Dto.PaginatesDto;

@Service
public interface IPaginatesService {
	@Autowired
	public PaginatesDto GetInfoPaginates(int totalData, int limit, int currentPage);
}
