<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>GET a list of video game creators</name>
   <tag></tag>
   <elementGuidId>e25ce6f2-cc62-4097-b83f-7c44a417b3a1</elementGuidId>
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
   <restUrl>${GlobalVariable.rawgUrl}${GlobalVariable.creatorsPath}?key=${GlobalVariable.key}&amp;page=${page}</restUrl>
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
      <defaultValue>1</defaultValue>
      <description></description>
      <id>c19543f0-4964-43db-8ed3-312ffd44cc0e</id>
      <masked>false</masked>
      <name>page</name>
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

return response</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
