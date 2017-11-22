package com.iplay.configuration;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.iplay.entity.Project;

@Component
@ConfigurationProperties("iplay.fenkins")
public class FenkinsConfigurationPropertites {
	
	private List<Project> projects;

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
}
