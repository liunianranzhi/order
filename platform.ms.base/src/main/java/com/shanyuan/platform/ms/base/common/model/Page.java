package com.shanyuan.platform.ms.base.common.model;

/**
 * @author 曹勇军
 *
 */
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Page{

	private int pageNo;
	@JsonIgnore
	private int startNo;
	@JsonIgnore
	private int endNo;
	@JsonIgnore
	private int pageSize;
	@JsonIgnore
	private int pageNumberSize;
	private int totalRecords;
	@JsonIgnore
	private int totalPageNumber;
	@JsonIgnore
	private int startPageNo;
	@JsonIgnore
	private int lastPageNo;

	public Page() {
		pageNo = 1;
		pageSize = 10;
		pageNumberSize = 10;
	}

	/**
	 * @return the pageNo
	 */
	public int getPageNo() {
		return pageNo;
	}

	/**
	 * @param pageNo the pageNo to set
	 */
	public void setPageNo(int pageNo) {
		if(pageNo == 0){
			pageNo = 1;
		}
		this.pageNo = pageNo;
	}
	
	public void setPageNo(Integer pageNo) {
		if(pageNo == null){
			pageNo = 1;
		}
		this.pageNo = pageNo;
	}

	/**
	 * @return the startNo
	 */
	public int getStartNo() {
		startNo = (pageNo - 1) * pageSize;
		return startNo;
	}

	/**
	 * @param startNo the startNo to set
	 */
	public void setStartNo(int startNo) {
		this.startNo = startNo;
	}

	/**
	 * @return the endNo
	 */
	public int getEndNo() {
		endNo = getStartNo() + pageSize;
		int _maxEndNo = totalRecords;
		if (_maxEndNo < endNo) {
			endNo = _maxEndNo;
		}
		return endNo;
	}

	/**
	 * @param endNo the endNo to set
	 */
	public void setEndNo(int endNo) {
		this.endNo = endNo;
	}

	/**
	 * @return the pageSize
	 */
	public int getPageSize() {
		return pageSize;
	}

	/**
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * @return the pageNumerSize
	 */
	public int getPageNumberSize() {
		return pageNumberSize;
	}

	/**
	 * @param pageNumerSize the pageNumerSize to set
	 */
	public void setPageNumberSize(int pageNumberSize) {
		this.pageNumberSize = pageNumberSize;
	}

	/**
	 * @return the totalRecords
	 */
	public int getTotalRecords() {
		return totalRecords;
	}

	/**
	 * @param totalRecords the totalRecords to set
	 */
	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}

	/**
	 * @return the totalPageNumber
	 */
	public int getTotalPageNumber() {
		totalPageNumber = (totalRecords % pageSize == 0) ? (totalRecords / pageSize) : (totalRecords / pageSize + 1);
		return totalPageNumber;
	}

	/**
	 * @param totalPageNumber the totalPageNumber to set
	 */
	public void setTotalPageNumber(int totalPageNumber) {
		this.totalPageNumber = totalPageNumber;
	}

	/**
	 * @return the startPageNo
	 */
	public int getStartPageNo() {
		return startPageNo;
	}

	/**
	 * @return the lastPageNo
	 */
	public int getLastPageNo() {
		return lastPageNo;
	}

	
}

