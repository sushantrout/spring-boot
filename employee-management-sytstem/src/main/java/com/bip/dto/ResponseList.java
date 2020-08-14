package com.bip.dto;

import java.util.ArrayList;
import java.util.List;

public class ResponseList<T> {
	private List<T> infoList = new ArrayList<>();

	public List<T> getInfoList() {
		return infoList;
	}

	public void setInfoList(List<T> infoList) {
		this.infoList = infoList;
	}
}
