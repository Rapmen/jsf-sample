package com.accentrix.sample1;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class Sample1View implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String text;
	
	@PostConstruct
	private void init(){
		System.out.println("Sample1View init=======");
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
