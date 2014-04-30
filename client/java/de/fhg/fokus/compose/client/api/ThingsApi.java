package de.fhg.fokus.compose.client.api;

import de.fhg.fokus.compose.client.ApiException;
import de.fhg.fokus.compose.client.ApiInvoker;
import java.util.*;

public class ThingsApi {
  String basePath = "http://localhost:8080/api";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }
  
  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }
  
  public String getBasePath() {
    return basePath;
  }

  public void getSubscriptions (String soId, String streamId) throws ApiException {
    // verify required params are set
    if(soId == null || streamId == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/things/{soId}/streams/{streamId}/subscriptions".replaceAll("\\{format\\}","json").replaceAll("\\{" + "soId" + "\\}", apiInvoker.escapeString(soId.toString())).replaceAll("\\{" + "streamId" + "\\}", apiInvoker.escapeString(streamId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, formParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return ;
      }
      else {
        throw ex;
      }
    }
  }
  public void createSubscription (String soId, String streamId, String body) throws ApiException {
    // verify required params are set
    if(soId == null || streamId == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/things/{soId}/streams/{streamId}/subscriptions".replaceAll("\\{format\\}","json").replaceAll("\\{" + "soId" + "\\}", apiInvoker.escapeString(soId.toString())).replaceAll("\\{" + "streamId" + "\\}", apiInvoker.escapeString(streamId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, body, headerParams, formParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return ;
      }
      else {
        throw ex;
      }
    }
  }
  public void getSO (String soId) throws ApiException {
    // verify required params are set
    if(soId == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/things/{soId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "soId" + "\\}", apiInvoker.escapeString(soId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, formParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return ;
      }
      else {
        throw ex;
      }
    }
  }
  public void createSO (String body) throws ApiException {
    // verify required params are set
    if(body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/things".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, body, headerParams, formParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return ;
      }
      else {
        throw ex;
      }
    }
  }
  public void getAllSOs () throws ApiException {
    // create path and map variables
    String path = "/things".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, formParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return ;
      }
      else {
        throw ex;
      }
    }
  }
  public void getLastUpdate (String soId, String streamId) throws ApiException {
    // verify required params are set
    if(soId == null || streamId == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/things/{soId}/streams/{streamId}/lastUpdate".replaceAll("\\{format\\}","json").replaceAll("\\{" + "soId" + "\\}", apiInvoker.escapeString(soId.toString())).replaceAll("\\{" + "streamId" + "\\}", apiInvoker.escapeString(streamId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, formParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return ;
      }
      else {
        throw ex;
      }
    }
  }
  public void updateSOData (String soId, String streamId, String body) throws ApiException {
    // verify required params are set
    if(soId == null || streamId == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/things/{soId}/streams/{streamId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "soId" + "\\}", apiInvoker.escapeString(soId.toString())).replaceAll("\\{" + "streamId" + "\\}", apiInvoker.escapeString(streamId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, body, headerParams, formParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return ;
      }
      else {
        throw ex;
      }
    }
  }
  public void getSOData (String soId, String streamId) throws ApiException {
    // verify required params are set
    if(soId == null || streamId == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/things/{soId}/streams/{streamId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "soId" + "\\}", apiInvoker.escapeString(soId.toString())).replaceAll("\\{" + "streamId" + "\\}", apiInvoker.escapeString(streamId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, formParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return ;
      }
      else {
        throw ex;
      }
    }
  }
  public void getStreams (String soId) throws ApiException {
    // verify required params are set
    if(soId == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/things/{soId}/streams".replaceAll("\\{format\\}","json").replaceAll("\\{" + "soId" + "\\}", apiInvoker.escapeString(soId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, formParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return ;
      }
      else {
        throw ex;
      }
    }
  }
  }

