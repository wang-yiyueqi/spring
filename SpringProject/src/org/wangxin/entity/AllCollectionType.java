package org.wangxin.entity;

import java.util.*;

public class AllCollectionType {
	
	private List<String> list;
	private String[] string;
	private Set<String> set;
	private Map<String,String> map;
	private Properties pros;
	
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	
	public String[] getString() {
		return string;
	}
	public void setString(String[] string) {
		this.string = string;
	}
	
	public Set<String> getSet() {
		return set;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
	
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	
	public Properties getPros() {
		return pros;
	}
	public void setPros(Properties pros) {
		this.pros = pros;
	}
	
	@Override
	public String toString() {
		String tostring = "";
		for(String s : string) {
			tostring += s;
		}
		return list + "\nstring=" + tostring + "\nset=" + set + "\nmap="
				+ map + "\npros=" + pros;
	}
	
	
}
