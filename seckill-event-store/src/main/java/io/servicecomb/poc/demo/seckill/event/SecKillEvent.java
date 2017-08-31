/*
 *   Copyright 2017 Huawei Technologies Co., Ltd
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package io.servicecomb.poc.demo.seckill.event;

import io.servicecomb.poc.demo.seckill.entities.SecKillEventEntity;
import io.servicecomb.poc.demo.seckill.json.ToJsonFormat;

public abstract class SecKillEvent {

  protected String promotionId;
  protected String type;

  public String getPromotionId() {
    return promotionId;
  }

  public String getType() {
    return type;
  }

  public String json(ToJsonFormat toJsonFormat) {
    return "{}";
  }

  public SecKillEventEntity toEntity(ToJsonFormat toJsonFormat) {
    return new SecKillEventEntity(type, promotionId, this.json(toJsonFormat));
  }
}