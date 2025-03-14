// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.applicationinsights.fluent.models.WorkbookTemplateInner;
import java.io.IOException;
import java.util.List;

/**
 * WorkbookTemplate list result.
 */
@Fluent
public final class WorkbookTemplatesListResult implements JsonSerializable<WorkbookTemplatesListResult> {
    /*
     * An array of workbook templates.
     */
    private List<WorkbookTemplateInner> value;

    /**
     * Creates an instance of WorkbookTemplatesListResult class.
     */
    public WorkbookTemplatesListResult() {
    }

    /**
     * Get the value property: An array of workbook templates.
     * 
     * @return the value value.
     */
    public List<WorkbookTemplateInner> value() {
        return this.value;
    }

    /**
     * Set the value property: An array of workbook templates.
     * 
     * @param value the value value to set.
     * @return the WorkbookTemplatesListResult object itself.
     */
    public WorkbookTemplatesListResult withValue(List<WorkbookTemplateInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WorkbookTemplatesListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WorkbookTemplatesListResult if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the WorkbookTemplatesListResult.
     */
    public static WorkbookTemplatesListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WorkbookTemplatesListResult deserializedWorkbookTemplatesListResult = new WorkbookTemplatesListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<WorkbookTemplateInner> value
                        = reader.readArray(reader1 -> WorkbookTemplateInner.fromJson(reader1));
                    deserializedWorkbookTemplatesListResult.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWorkbookTemplatesListResult;
        });
    }
}
