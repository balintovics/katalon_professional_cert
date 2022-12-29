<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>GET a list of video game publishers</name>
   <tag></tag>
   <elementGuidId>9f55f6df-1288-4378-9735-40771693bc7f</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>${GlobalVariable.hostHeader}</name>
      <type>Main</type>
      <value>${GlobalVariable.host}</value>
      <webElementGuid>7992de87-f0b3-41a7-bab9-3d300e0cdacc</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>${GlobalVariable.apiKeyHeader}</name>
      <type>Main</type>
      <value>${GlobalVariable.apiKey}</value>
      <webElementGuid>b85af2de-e88d-43e8-9559-b3227c4e3e95</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.5.5</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>${GlobalVariable.baseUrl}${GlobalVariable.publishersPath}/${publisherId}?key=${GlobalVariable.key}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <validationSteps>
      <id>d583234a-7a26-4151-972b-8338848984b0</id>
      <name>New Validation</name>
      <type>JSON_SCHEMA</type>
      <dataType>AUTO</dataType>
      <target>RESPONSE</target>
      <data>results</data>
      <activate>true</activate>
   </validationSteps>
   <variables>
      <defaultValue>'354'</defaultValue>
      <description></description>
      <id>fc67eda5-5ded-4575-820f-4be3ea5f4572</id>
      <masked>false</masked>
      <name>publisherId</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()


assertThat(response.getResponseText()).contains('results')

WS.verifyResponseStatusCode(response, 200)

assertThat(response.getStatusCode()).isEqualTo(200)

</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
