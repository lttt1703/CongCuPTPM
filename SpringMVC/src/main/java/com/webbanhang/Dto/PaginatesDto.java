package com.webbanhang.Dto;

public class PaginatesDto {
	
	private int currentPage, limit, start, end, total;

	public PaginatesDto() {
		super();
	}

	public PaginatesDto(int currentPage, int limit, int start, int end, int total) {
		super();
		this.currentPage = currentPage;
		this.limit = limit;
		this.start = start;
		this.end = end;
		this.total = total;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

}
