package de.fhg.fokus.compose.client.api

import de.fhg.fokus.compose.client.ApiInvoker
import de.fhg.fokus.compose.client.ApiException

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class ThingsApi {
  var basePath: String = "http://localhost:8080/api"
  var apiInvoker = ApiInvoker
  
  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  def getSubscriptions (soId: String, streamId: String) = {
    // create path and map variables
    val path = "/things/{soId}/streams/{streamId}/subscriptions".replaceAll("\\{format\\}","json").replaceAll("\\{" + "soId" + "\\}",apiInvoker.escape(soId))

    .replaceAll("\\{" + "streamId" + "\\}",apiInvoker.escape(streamId))

    
    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    // verify required params are set
    (List(soId, streamId).filter(_ != null)).size match {
       case 2 => // all required values set
       case _ => throw new Exception("missing required params")
    }
    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, None, headerParams.toMap, contentType) match {
        case s: String =>
          case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  def createSubscription (soId: String, streamId: String, body: String) = {
    // create path and map variables
    val path = "/things/{soId}/streams/{streamId}/subscriptions".replaceAll("\\{format\\}","json").replaceAll("\\{" + "soId" + "\\}",apiInvoker.escape(soId))

    .replaceAll("\\{" + "streamId" + "\\}",apiInvoker.escape(streamId))

    
    val contentType = {
      if(body != null && body.isInstanceOf[File] )
        "multipart/form-data"
      else "application/json"
      }

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    // verify required params are set
    (List(soId, streamId, body).filter(_ != null)).size match {
       case 3 => // all required values set
       case _ => throw new Exception("missing required params")
    }
    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, body, headerParams.toMap, contentType) match {
        case s: String =>
          case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  def getSO (soId: String) = {
    // create path and map variables
    val path = "/things/{soId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "soId" + "\\}",apiInvoker.escape(soId))

    
    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    // verify required params are set
    (List(soId).filter(_ != null)).size match {
       case 1 => // all required values set
       case _ => throw new Exception("missing required params")
    }
    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, None, headerParams.toMap, contentType) match {
        case s: String =>
          case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  def createSO (body: String) = {
    // create path and map variables
    val path = "/things".replaceAll("\\{format\\}","json")
    val contentType = {
      if(body != null && body.isInstanceOf[File] )
        "multipart/form-data"
      else "application/json"
      }

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    // verify required params are set
    (List(body).filter(_ != null)).size match {
       case 1 => // all required values set
       case _ => throw new Exception("missing required params")
    }
    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, body, headerParams.toMap, contentType) match {
        case s: String =>
          case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  def getAllSOs () = {
    // create path and map variables
    val path = "/things".replaceAll("\\{format\\}","json")
    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, None, headerParams.toMap, contentType) match {
        case s: String =>
          case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  def getLastUpdate (soId: String, streamId: String) = {
    // create path and map variables
    val path = "/things/{soId}/streams/{streamId}/lastUpdate".replaceAll("\\{format\\}","json").replaceAll("\\{" + "soId" + "\\}",apiInvoker.escape(soId))

    .replaceAll("\\{" + "streamId" + "\\}",apiInvoker.escape(streamId))

    
    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    // verify required params are set
    (List(soId, streamId).filter(_ != null)).size match {
       case 2 => // all required values set
       case _ => throw new Exception("missing required params")
    }
    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, None, headerParams.toMap, contentType) match {
        case s: String =>
          case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  def updateSOData (soId: String, streamId: String, body: String) = {
    // create path and map variables
    val path = "/things/{soId}/streams/{streamId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "soId" + "\\}",apiInvoker.escape(soId))

    .replaceAll("\\{" + "streamId" + "\\}",apiInvoker.escape(streamId))

    
    val contentType = {
      if(body != null && body.isInstanceOf[File] )
        "multipart/form-data"
      else "application/json"
      }

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    // verify required params are set
    (List(soId, streamId, body).filter(_ != null)).size match {
       case 3 => // all required values set
       case _ => throw new Exception("missing required params")
    }
    try {
      apiInvoker.invokeApi(basePath, path, "PUT", queryParams.toMap, body, headerParams.toMap, contentType) match {
        case s: String =>
          case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  def getSOData (soId: String, streamId: String) = {
    // create path and map variables
    val path = "/things/{soId}/streams/{streamId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "soId" + "\\}",apiInvoker.escape(soId))

    .replaceAll("\\{" + "streamId" + "\\}",apiInvoker.escape(streamId))

    
    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    // verify required params are set
    (List(soId, streamId).filter(_ != null)).size match {
       case 2 => // all required values set
       case _ => throw new Exception("missing required params")
    }
    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, None, headerParams.toMap, contentType) match {
        case s: String =>
          case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  def getStreams (soId: String) = {
    // create path and map variables
    val path = "/things/{soId}/streams".replaceAll("\\{format\\}","json").replaceAll("\\{" + "soId" + "\\}",apiInvoker.escape(soId))

    
    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    // verify required params are set
    (List(soId).filter(_ != null)).size match {
       case 1 => // all required values set
       case _ => throw new Exception("missing required params")
    }
    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, None, headerParams.toMap, contentType) match {
        case s: String =>
          case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  }

