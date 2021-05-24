package training.spring.core.injection.collections.javaconfig;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
	
	@Bean
	public String[] namesArray(){
        return new String[]{"two", "three", "four"};
    } 
	
	@Bean
	public List<String> empNameList(){
		List<String> list = new ArrayList<String>();
		list.add("Ghian");
		list.add("Miraj");
		list.add("Fremon");
		list.add("Kishan");
		list.add("Kishan");
		return list;
    }
	
	@Bean
	public Set<Integer> empIdsset() {
		Set<Integer> empIdSet = new HashSet<Integer>();
		empIdSet.add(1001);
		empIdSet.add(1002);
		empIdSet.add(1003);
		empIdSet.add(1003);
		empIdSet.add(1004);
		empIdSet.add(1005);
		return empIdSet; 
	}
	
	@Bean
	public OrganizationInfo getOrgInfo() {
		return new OrganizationInfo();
	}
}
