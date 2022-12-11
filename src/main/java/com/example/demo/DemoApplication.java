package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.view.HelloVIew;

import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;

@SpringBootApplication
public class DemoApplication extends AbstractJavaFxApplicationSupport{

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
		launch(DemoApplication.class, HelloVIew.class,args);
	}

}
