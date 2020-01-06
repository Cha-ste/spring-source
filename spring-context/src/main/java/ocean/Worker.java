package ocean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class Worker implements BeanFactoryPostProcessor {
	private String workId;
	private String name;
	private String telephone;
	private String email;
	private String address;
	private String department;

	@Override
	public String toString() {
		return "Worker{" +
				"workId='" + workId + '\'' +
				", name='" + name + '\'' +
				", telephone='" + telephone + '\'' +
				", email='" + email + '\'' +
				", address='" + address + '\'' +
				", department='" + department + '\'' +
				'}';
	}

	public String getWorkId() {
		return workId;
	}

	public void setWorkId(String workId) {
		this.workId = workId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("====》我实现了 BeanFactoryPostProcessor 方法，此处打印一下《====");
	}
}
