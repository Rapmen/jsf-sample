package com.accentrix.sample1;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Sample1RequestBean {

	@ManagedProperty(value = "#{sample1View}")
	private Sample1View sample1View;

	@PostConstruct
	private void init() {
		System.out.println("Sample1RequestBean init======");
	}

	public void onSubmit() {
		System.out.println(sample1View.getText());
	}

	public Sample1View getSample1View() {
		return sample1View;
	}

	public void setSample1View(Sample1View sample1View) {
		this.sample1View = sample1View;
	}

}
