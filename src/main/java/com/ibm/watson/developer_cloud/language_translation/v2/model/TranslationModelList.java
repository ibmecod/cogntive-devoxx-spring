/**
 * Copyright 2015 IBM Corp. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.ibm.watson.developer_cloud.language_translation.v2.model;

import java.util.List;

import com.ibm.watson.developer_cloud.language_translation.v2.LanguageTranslation;
import com.ibm.watson.developer_cloud.service.model.GenericModel;


/**
 * {@link TranslationModel} list used by the {@link LanguageTranslation} service.
 */
public class TranslationModelList extends GenericModel {

  private List<TranslationModel> models;

  /**
   * Gets the models.
   * 
   * @return the models
   */
  public List<TranslationModel> getModels() {
    return models;
  }

  /**
   * Sets the models.
   * 
   * @param models the models to set
   */
  public void setModels(List<TranslationModel> models) {
    this.models = models;
  }

}
