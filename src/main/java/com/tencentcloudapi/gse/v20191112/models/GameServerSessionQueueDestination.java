/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GameServerSessionQueueDestination extends AbstractModel{

    /**
    * 服务部署组目的的资源描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DestinationArn")
    @Expose
    private String DestinationArn;

    /**
     * Get 服务部署组目的的资源描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DestinationArn 服务部署组目的的资源描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDestinationArn() {
        return this.DestinationArn;
    }

    /**
     * Set 服务部署组目的的资源描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param DestinationArn 服务部署组目的的资源描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDestinationArn(String DestinationArn) {
        this.DestinationArn = DestinationArn;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DestinationArn", this.DestinationArn);

    }
}

