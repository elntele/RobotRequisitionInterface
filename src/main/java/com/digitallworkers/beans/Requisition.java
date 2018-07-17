package com.digitallworkers.beans;

import org.springframework.stereotype.Component;

import org.camunda.bpm.client.ExternalTaskClient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class Requisition {
	 ExternalTaskClient client = ExternalTaskClient.create().baseUrl("http://localhost:8080/engine-rest")
		      .build();


}
