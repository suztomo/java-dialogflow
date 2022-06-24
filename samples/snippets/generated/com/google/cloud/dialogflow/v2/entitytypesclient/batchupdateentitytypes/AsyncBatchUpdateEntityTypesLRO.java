/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.dialogflow.v2.samples;

// [START dialogflow_v2_generated_entitytypesclient_batchupdateentitytypes_lro_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.dialogflow.v2.AgentName;
import com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesRequest;
import com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse;
import com.google.cloud.dialogflow.v2.EntityTypesClient;
import com.google.protobuf.FieldMask;
import com.google.protobuf.Struct;

public class AsyncBatchUpdateEntityTypesLRO {

  public static void main(String[] args) throws Exception {
    asyncBatchUpdateEntityTypesLRO();
  }

  public static void asyncBatchUpdateEntityTypesLRO() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
      BatchUpdateEntityTypesRequest request =
          BatchUpdateEntityTypesRequest.newBuilder()
              .setParent(AgentName.ofProjectName("[PROJECT]").toString())
              .setLanguageCode("languageCode-2092349083")
              .setUpdateMask(FieldMask.newBuilder().build())
              .build();
      OperationFuture<BatchUpdateEntityTypesResponse, Struct> future =
          entityTypesClient.batchUpdateEntityTypesOperationCallable().futureCall(request);
      // Do something.
      BatchUpdateEntityTypesResponse response = future.get();
    }
  }
}
// [END dialogflow_v2_generated_entitytypesclient_batchupdateentitytypes_lro_async]
