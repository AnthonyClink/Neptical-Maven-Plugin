package com.clinkworks.neptical.maven;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

import com.clinkworks.neptical.Data;
import com.clinkworks.neptical.DataRegistry;

@Mojo( name = "data")
public class DataMojo extends AbstractMojo{

	public void execute() throws MojoExecutionException, MojoFailureException {
		Data data = DataRegistry.loadData();
		System.out.println("\n\n\n ----- DATA MODULE EXECUTING ------ \n\n\n");
	}

}
