/**
 *  Copyright 2013 Wordnik, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

import com.wordnik.swagger.codegen.BasicJavaGenerator

object JavaComposeCodegen extends BasicJavaGenerator {
  def main(args: Array[String]) = generateClient(args)

  // location of templates
  override def templateDir = "src/main/resources/Java"

  // where to write generated code
  override def destinationDir = "compose/sdk/client/java"

  // package for api invoker, error files
  override def invokerPackage = Some("de.fhg.fokus.compose.client")

  // package for models
  override def modelPackage = Some("de.fhg.fokus.compose.client.model")

  // package for api classes
  override def apiPackage = Some("de.fhg.fokus.compose.client.api")

  additionalParams ++= Map(
    "artifactId" -> "compose", 
    "artifactVersion" -> "1.0.0",
    "groupId" -> "de.fhg.fokus")

  // supporting classes
  override def supportingFiles =
    List(
      ("apiInvoker.mustache", destinationDir + java.io.File.separator + invokerPackage.get.replace(".", java.io.File.separator) + java.io.File.separator, "ApiInvoker.java"),
      ("JsonUtil.mustache", destinationDir + java.io.File.separator + invokerPackage.get.replace(".", java.io.File.separator) + java.io.File.separator, "JsonUtil.java"),
      ("apiException.mustache", destinationDir + java.io.File.separator + invokerPackage.get.replace(".", java.io.File.separator) + java.io.File.separator, "ApiException.java"),
      ("pom.mustache", destinationDir, "pom.xml"))
}
