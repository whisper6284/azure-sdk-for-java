// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Indicates whether the Defender plan is enabled on the selected scope. Microsoft Defender for Cloud is provided in two
 * pricing tiers: free and standard. The standard tier offers advanced security capabilities, while the free tier offers
 * basic security features.
 */
public final class PricingTier extends ExpandableStringEnum<PricingTier> {
    /**
     * Static value Free for PricingTier.
     */
    public static final PricingTier FREE = fromString("Free");

    /**
     * Static value Standard for PricingTier.
     */
    public static final PricingTier STANDARD = fromString("Standard");

    /**
     * Creates a new instance of PricingTier value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PricingTier() {
    }

    /**
     * Creates or finds a PricingTier from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PricingTier.
     */
    public static PricingTier fromString(String name) {
        return fromString(name, PricingTier.class);
    }

    /**
     * Gets known PricingTier values.
     * 
     * @return known PricingTier values.
     */
    public static Collection<PricingTier> values() {
        return values(PricingTier.class);
    }
}
