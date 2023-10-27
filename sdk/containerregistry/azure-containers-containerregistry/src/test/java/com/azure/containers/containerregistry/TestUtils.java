// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry;

import com.azure.containers.containerregistry.models.ManifestMediaType;
import com.azure.containers.containerregistry.models.OciAnnotations;
import com.azure.containers.containerregistry.models.OciDescriptor;
import com.azure.containers.containerregistry.models.OciImageManifest;
import com.azure.core.credential.AccessToken;
import com.azure.core.credential.TokenCredential;
import com.azure.core.credential.TokenRequestContext;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.TestMode;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Configuration;
import com.azure.identity.AzureAuthorityHosts;
import com.azure.identity.ClientSecretCredentialBuilder;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.resourcemanager.containerregistry.ContainerRegistryManager;
import com.azure.resourcemanager.containerregistry.models.ImportImageParameters;
import com.azure.resourcemanager.containerregistry.models.ImportMode;
import com.azure.resourcemanager.containerregistry.models.ImportSource;
import reactor.core.publisher.Mono;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import static com.azure.containers.containerregistry.implementation.UtilsImpl.computeDigest;
import static com.azure.core.test.implementation.TestingHelpers.AZURE_TEST_MODE;

public class TestUtils {
    public static final BinaryData CONFIG_DATA = BinaryData.fromString("{}");
    public static final String CONFIG_DIGEST = computeDigest(CONFIG_DATA.toByteBuffer());
    public static final BinaryData LAYER_DATA = BinaryData.fromString("hello world");
    public static final String LAYER_DIGEST = computeDigest(LAYER_DATA.toByteBuffer());
    public static final OciImageManifest MANIFEST = createManifest();
    public static final String MANIFEST_DIGEST = "sha256:492bc88863bdf51159c4efe84e851c48d7034881159b56c4338003e50e801598";
    public static final String DISPLAY_NAME_WITH_ARGUMENTS = "{displayName} with [{arguments}]";
    private static final Configuration CONFIGURATION = Configuration.getGlobalConfiguration();
    public static final String ALPINE_REPOSITORY_NAME = "library/alpine";
    public static final String HELLO_WORLD_REPOSITORY_NAME = "library/hello-world";
    public static final String HELLO_WORLD_SEATTLE_REPOSITORY_NAME = "library/hello-seattle";
    public static final String LATEST_TAG_NAME = "latest";
    public static final String V1_TAG_NAME = "v1";
    public static final String V2_TAG_NAME = "v2";
    public static final String V4_TAG_NAME = "v4";
    public static final String V3_TAG_NAME = "v3";
    public static final String TAG_UNKNOWN = "unknowntag";
    public static final String DIGEST_UNKNOWN = "sha256:ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff";
    public static final int PAGESIZE_2 = 2;
    public static final int PAGESIZE_1 = 1;
    public static final String REGISTRY_NAME = CONFIGURATION.get("CONTAINERREGISTRY_REGISTRY_NAME");
    public static final String RESOURCE_GROUP = CONFIGURATION.get("CONTAINERREGISTRY_RESOURCE_GROUP");
    public static final String SUBSCRIPTION_ID = CONFIGURATION.get("CONTAINERREGISTRY_SUBSCRIPTION_ID");
    public static final String TENANT_ID = CONFIGURATION.get("CONTAINERREGISTRY_TENANT_ID");
    public static final String CLIENT_ID = CONFIGURATION.get("CONTAINERREGISTRY_CLIENT_ID");
    public static final String REGISTRY_URI = "registry.hub.docker.com";
    public static final String REGISTRY_ENDPOINT = CONFIGURATION.get("CONTAINERREGISTRY_ENDPOINT");
    public static final String ANONYMOUS_REGISTRY_ENDPOINT = CONFIGURATION.get("CONTAINERREGISTRY_ANONREGISTRY_ENDPOINT");
    public static final long SLEEP_TIME_IN_MILLISECONDS = 5000;
    public static final String ANONYMOUS_REGISTRY_NAME = CONFIGURATION.get("CONTAINERREGISTRY_ANONREGISTRY_NAME");
    public static final String REGISTRY_ENDPOINT_PLAYBACK = "https://REDACTED";
    public static final String REGISTRY_NAME_PLAYBACK = "REDACTED";
    public static final int HTTP_STATUS_CODE_202 = 202;
    public static final String CONTAINERREGISTRY_CLIENT_SECRET = CONFIGURATION.get("CONTAINERREGISTRY_CLIENT_SECRET");

    public static final ManifestMediaType OCI_INDEX_MEDIA_TYPE = ManifestMediaType.fromString("application/vnd.oci.image.index.v1+json");

    static class FakeCredentials implements TokenCredential {
        @Override
        public Mono<AccessToken> getToken(TokenRequestContext tokenRequestContext) {
            return Mono.just(new AccessToken("someFakeToken", OffsetDateTime.MAX));
        }
    }

    static <T extends Comparable<? super T>> boolean isSorted(Iterable<T> iterable) {
        Iterator<T> iter = iterable.iterator();
        if (!iter.hasNext()) {
            return true;
        }
        T t = iter.next();
        while (iter.hasNext()) {
            T t2 = iter.next();
            if (t.compareTo(t2) > 0) {
                return false;
            }
            t = t2;
        }
        return true;
    }

    static TokenCredential getCredentialsByEndpoint(TestMode testMode, String endpoint) {
        if (testMode == TestMode.PLAYBACK) {
            return new FakeCredentials();
        }

        String authority = getAuthority(endpoint);
        return getCredentialByAuthority(testMode, authority);
    }

    static TokenCredential getCredentialByAuthority(TestMode testMode, String authority) {
        if (testMode == TestMode.PLAYBACK) {
            return new FakeCredentials();
        }

        if (AzureAuthorityHosts.AZURE_PUBLIC_CLOUD.equals(authority)) {
            return new DefaultAzureCredentialBuilder().build();
        } else {
            return new ClientSecretCredentialBuilder()
                .tenantId(TENANT_ID)
                .clientId(CLIENT_ID)
                .clientSecret(CONTAINERREGISTRY_CLIENT_SECRET)
                .authorityHost(authority).build();
        }
    }

    static void importImage(TestMode mode, String repository, List<String> tags) {
        try {
            importImage(mode, REGISTRY_NAME, repository, tags, REGISTRY_ENDPOINT);
            Thread.sleep(SLEEP_TIME_IN_MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static String getAuthority(String endpoint) {
        if (endpoint == null) {
            return AzureAuthorityHosts.AZURE_PUBLIC_CLOUD;
        }

        if (endpoint.contains(".azurecr.io")) {
            return AzureAuthorityHosts.AZURE_PUBLIC_CLOUD;
        }

        if (endpoint.contains(".azurecr.cn")) {
            return AzureAuthorityHosts.AZURE_CHINA;
        }

        if (endpoint.contains(".azurecr.us")) {
            return AzureAuthorityHosts.AZURE_GOVERNMENT;
        }

        // by default we will assume that the authority is public
        return AzureAuthorityHosts.AZURE_PUBLIC_CLOUD;
    }

    static AzureProfile getAzureProfile(String authority) {
        switch (authority) {
            case AzureAuthorityHosts.AZURE_PUBLIC_CLOUD: return new AzureProfile(TENANT_ID, SUBSCRIPTION_ID, AzureEnvironment.AZURE);
            case AzureAuthorityHosts.AZURE_CHINA: return new AzureProfile(TENANT_ID, SUBSCRIPTION_ID, AzureEnvironment.AZURE_CHINA);
            case AzureAuthorityHosts.AZURE_GOVERNMENT: return new AzureProfile(TENANT_ID, SUBSCRIPTION_ID, AzureEnvironment.AZURE_US_GOVERNMENT);
            default: return null;
        }
    }

    static void importImage(TestMode mode, String registryName, String repository, List<String> tags, String endpoint) throws InterruptedException {
        if (mode == TestMode.PLAYBACK) {
            return;
        }

        String authority = getAuthority(endpoint);

        TokenCredential credential = getCredentialByAuthority(mode, authority);
        tags = tags.stream().map(tag -> String.format("%1$s:%2$s", repository, tag)).collect(Collectors.toList());
        AzureProfile profile = getAzureProfile(authority);

        ContainerRegistryManager manager = ContainerRegistryManager.authenticate(credential, profile);

        int index = 0;
        do {
            try {
                manager.serviceClient().getRegistries().importImage(
                    RESOURCE_GROUP,
                    registryName,
                    new ImportImageParameters()
                        .withMode(ImportMode.FORCE)
                        .withSource(new ImportSource().withSourceImage(repository)
                            .withRegistryUri(REGISTRY_URI))
                        .withTargetTags(tags));
                return;
            } catch (Exception ex) {
                Thread.sleep(SLEEP_TIME_IN_MILLISECONDS);
            }
        } while (++index < 3);
    }

    private static OciImageManifest createManifest() {
        OciImageManifest manifest = new OciImageManifest()
            .setSchemaVersion(2)
            .setConfiguration(new OciDescriptor()
                .setMediaType("application/vnd.acme.rocket.config.v1+json")
                .setDigest(CONFIG_DIGEST)
                .setSizeInBytes(171L));


        List<OciDescriptor> layers = new ArrayList<>();

        layers.add(new OciDescriptor()
            .setMediaType("application/vnd.oci.image.layer.v1.tar")
            .setSizeInBytes(28L)
            .setDigest(LAYER_DIGEST)
            .setAnnotations(new OciAnnotations()
                .setName("654b93f61054e4ce90ed203bb8d556a6200d5f906cf3eca0620738d6dc18cbed")));

        manifest.setLayers(layers);
        return manifest;
    }

    public static TestMode getTestMode() {
        final String azureTestMode = Configuration.getGlobalConfiguration().get(AZURE_TEST_MODE);

        return azureTestMode != null ? TestMode.valueOf(azureTestMode.toUpperCase(Locale.US)) : TestMode.PLAYBACK;
    }
}
