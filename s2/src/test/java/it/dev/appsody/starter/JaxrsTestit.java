/*******************************************************************************
Copyright (c) 2020 IBM Corporation and others

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*******************************************************************************/
package it.dev.appsody.starter;


import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;
import org.microshed.testing.jaxrs.RESTClient;
import org.microshed.testing.jupiter.MicroShedTest;
import org.microshed.testing.testcontainers.ApplicationContainer;
import org.testcontainers.junit.jupiter.Container;
import dev.appsody.starter.StarterResource;

@MicroShedTest
public class JaxrsTestit {
	
	@Container
    public static ApplicationContainer app = new ApplicationContainer()
                    .withAppContextRoot("/")
                    .withReadinessPath("/health/ready")
                    .withEnv("DEFAULT_HTTP_PORT", "9080")
	                .withEnv("DEFAULT_HTTPS_PORT", "9443");
                    
	
	@RESTClient 
	public static StarterResource appService;
	
	
	@Test
	public void testAppResponse() {
		   assertEquals("Hello! Welcome to Openliberty", appService.getRequest());
	}
	               
}
