package training.spring.core.injection.collections.xmlconfig;

import java.util.List;
import java.util.Set;

public class OrganizationInfo {
	private String[] namesArray = new String[2];
	private List<String> empNameList;
	private Set<Integer> empIdsset;
	
	public String[] getNamesArray() {
		return namesArray;
	}
	public void setNamesArray(String[] namesArray) {
		this.namesArray = namesArray;
	}
	public List<String> getEmpNameList() {
		return empNameList;
	}
	public void setEmpNameList(List<String> empNameList) {
		this.empNameList = empNameList;
	}
	public Set<Integer> getEmpIdsset() {
		return empIdsset;
	}
	public void setEmpIdsset(Set<Integer> empIdsset) {
		this.empIdsset = empIdsset;
	}
	
}
