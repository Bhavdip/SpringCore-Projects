package training.spring.core.injection.collections.javaconfig;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

public class OrganizationInfo {
	private String[] namesArray = new String[2];
	private List<String> empNameList;
	private Set<Integer> empIdsset;
	
	public String[] getNamesArray() {
		return namesArray;
	}
	
	@Autowired
	public void setNamesArray(String[] namesArray) {
		this.namesArray = namesArray;
	}
	public List<String> getEmpNameList() {
		return empNameList;
	}
	
	@Autowired
	public void setEmpNameList(List<String> empNameList) {
		this.empNameList = empNameList;
	}
	public Set<Integer> getEmpIdsset() {
		return empIdsset;
	}
	
	@Autowired
	public void setEmpIdsset(Set<Integer> empIdsset) {
		this.empIdsset = empIdsset;
	}
	
}
