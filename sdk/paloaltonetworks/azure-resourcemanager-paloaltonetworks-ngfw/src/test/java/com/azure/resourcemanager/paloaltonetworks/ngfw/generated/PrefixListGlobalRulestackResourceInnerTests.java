// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.PrefixListGlobalRulestackResourceInner;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PrefixListGlobalRulestackResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrefixListGlobalRulestackResourceInner model = BinaryData.fromString(
            "{\"properties\":{\"description\":\"quxvypomgkop\",\"prefixList\":[\"hojvpajqgxysmocm\",\"qfqvmkc\"],\"etag\":\"zapvhelx\",\"auditComment\":\"glyatddckcbcuej\",\"provisioningState\":\"NotSpecified\"},\"id\":\"ciqibrhosx\",\"name\":\"dqrhzoymib\",\"type\":\"rq\"}")
            .toObject(PrefixListGlobalRulestackResourceInner.class);
        Assertions.assertEquals("quxvypomgkop", model.description());
        Assertions.assertEquals("hojvpajqgxysmocm", model.prefixList().get(0));
        Assertions.assertEquals("zapvhelx", model.etag());
        Assertions.assertEquals("glyatddckcbcuej", model.auditComment());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrefixListGlobalRulestackResourceInner model
            = new PrefixListGlobalRulestackResourceInner().withDescription("quxvypomgkop")
                .withPrefixList(Arrays.asList("hojvpajqgxysmocm", "qfqvmkc"))
                .withEtag("zapvhelx")
                .withAuditComment("glyatddckcbcuej");
        model = BinaryData.fromObject(model).toObject(PrefixListGlobalRulestackResourceInner.class);
        Assertions.assertEquals("quxvypomgkop", model.description());
        Assertions.assertEquals("hojvpajqgxysmocm", model.prefixList().get(0));
        Assertions.assertEquals("zapvhelx", model.etag());
        Assertions.assertEquals("glyatddckcbcuej", model.auditComment());
    }
}
