package com.example.alandademo;

import java.io.File;
import lombok.AllArgsConstructor;
import org.camunda.community.rest.client.api.DeploymentApi;
import org.camunda.community.rest.client.invoker.ApiException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AlandademoApplicationController {

  private DeploymentApi deploymentApi;

  @GetMapping("/")
  public String index() {
    return "Greetings from Spring Boot!";
  }

  @GetMapping("/deploy")
  public String deploy() throws ApiException {
    deploymentApi.createDeployment(
        null,
        null,
        true,
        true,
        "test_deployment",
        null,
        new File(AlandademoApplicationController.class.getClassLoader().getResource("testdiagram.bpmn").getFile())
    );
    return "Deployed successfully";
  }


}