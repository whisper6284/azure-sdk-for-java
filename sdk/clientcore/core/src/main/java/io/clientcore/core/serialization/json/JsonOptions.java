// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package io.clientcore.core.serialization.json;

/**
 * Contains configuration options for creating a {@link JsonReader} or {@link JsonWriter}.
 *
 * @see io.clientcore.core.serialization.json
 */
public final class JsonOptions {

    private boolean isJsoncSupported;

    /**
     * Creates an instance of {@link JsonOptions}.
     */
    public JsonOptions() {
    }

    /**
     * Whether JSONC (JSON with comments) is supported.
     * By default, this is configured to false.
     *
     * @return Whether JSONC is supported.
     */
    public boolean isJsoncSupported() {
        return isJsoncSupported;
    }

    /**
     * Sets whether JSONC (JSON with comments) is supported.
     * By default, this is configured to false.
     *
     * @param jsoncSupported Whether JSONC is supported.
     * @return The updated JsonOptions object.
     */
    public JsonOptions setJsoncSupported(boolean jsoncSupported) {
        this.isJsoncSupported = jsoncSupported;
        return this;
    }

}
