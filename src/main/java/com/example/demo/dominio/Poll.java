package com.example.demo.dominio;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Poll {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String question;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private Set<Option> Options;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Set<Option> getOptions() {
		return Options;
	}

	public void setOptions(Set<Option> options) {
		Options = options;
	}

}
