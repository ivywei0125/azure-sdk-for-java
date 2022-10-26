// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.fluent.models.ContainerAppProperties;
import com.azure.resourcemanager.appcontainers.models.ActiveRevisionsMode;
import com.azure.resourcemanager.appcontainers.models.AppProtocol;
import com.azure.resourcemanager.appcontainers.models.Configuration;
import com.azure.resourcemanager.appcontainers.models.Container;
import com.azure.resourcemanager.appcontainers.models.Dapr;
import com.azure.resourcemanager.appcontainers.models.Ingress;
import com.azure.resourcemanager.appcontainers.models.IngressTransportMethod;
import com.azure.resourcemanager.appcontainers.models.InitContainer;
import com.azure.resourcemanager.appcontainers.models.LogLevel;
import com.azure.resourcemanager.appcontainers.models.RegistryCredentials;
import com.azure.resourcemanager.appcontainers.models.Scale;
import com.azure.resourcemanager.appcontainers.models.Secret;
import com.azure.resourcemanager.appcontainers.models.StorageType;
import com.azure.resourcemanager.appcontainers.models.Template;
import com.azure.resourcemanager.appcontainers.models.Volume;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ContainerAppPropertiesTests {
    @Test
    public void testDeserialize() {
        ContainerAppProperties model =
            BinaryData
                .fromString(
                    "{\"provisioningState\":\"Failed\",\"managedEnvironmentId\":\"i\",\"environmentId\":\"hxepcyvahfnlj\",\"workloadProfileType\":\"qxj\",\"latestRevisionName\":\"ujqgidok\",\"latestRevisionFqdn\":\"ljyoxgvcltb\",\"customDomainVerificationId\":\"ncghkje\",\"configuration\":{\"secrets\":[{\"name\":\"ijhtxf\",\"value\":\"xbf\"},{\"name\":\"xnehmpvec\",\"value\":\"odebfqkkrbmpu\"},{\"name\":\"riwflzlfb\",\"value\":\"puz\"}],\"activeRevisionsMode\":\"Single\",\"ingress\":{\"fqdn\":\"nqzahmgkbrpyyd\",\"external\":true,\"targetPort\":1877210635,\"exposedPort\":2043148337,\"transport\":\"http\",\"traffic\":[],\"customDomains\":[],\"allowInsecure\":true,\"ipSecurityRestrictions\":[]},\"registries\":[{\"server\":\"n\",\"username\":\"ynhijggme\",\"passwordSecretRef\":\"siarbutrcvpn\",\"identity\":\"zmhjrunmp\"}],\"dapr\":{\"enabled\":true,\"appId\":\"hrbnlankxmyskpbh\",\"appProtocol\":\"grpc\",\"appPort\":2131694851,\"httpReadBufferSize\":2016648328,\"httpMaxRequestSize\":83692384,\"logLevel\":\"info\",\"enableApiLogging\":false},\"maxInactiveRevisions\":1863766018},\"template\":{\"revisionSuffix\":\"lqidyby\",\"initContainers\":[{\"image\":\"clha\",\"name\":\"dbabp\",\"command\":[],\"args\":[],\"env\":[],\"volumeMounts\":[]}],\"containers\":[{\"probes\":[],\"image\":\"thsu\",\"name\":\"cmnyyazttb\",\"command\":[],\"args\":[],\"env\":[],\"volumeMounts\":[]},{\"probes\":[],\"image\":\"dckzywbiexz\",\"name\":\"yueaxibxujwb\",\"command\":[],\"args\":[],\"env\":[],\"volumeMounts\":[]},{\"probes\":[],\"image\":\"yoxa\",\"name\":\"dkzjancuxrh\",\"command\":[],\"args\":[],\"env\":[],\"volumeMounts\":[]},{\"probes\":[],\"image\":\"iwdjswztsdbpgn\",\"name\":\"txhp\",\"command\":[],\"args\":[],\"env\":[],\"volumeMounts\":[]}],\"scale\":{\"minReplicas\":262767805,\"maxReplicas\":1638223797,\"rules\":[]},\"volumes\":[{\"name\":\"tcty\",\"storageType\":\"AzureFile\",\"storageName\":\"bbovplwzbhvgyugu\"},{\"name\":\"vmkfssxqu\",\"storageType\":\"AzureFile\",\"storageName\":\"l\"},{\"name\":\"gsxnkjzkdeslpv\",\"storageType\":\"AzureFile\",\"storageName\":\"i\"},{\"name\":\"ghxpkdw\",\"storageType\":\"EmptyDir\",\"storageName\":\"uebbaumnyqup\"}]},\"outboundIpAddresses\":[\"ojnabckhsmtxpsie\",\"tfhvpesapskrdqmh\"],\"eventStreamEndpoint\":\"dhtldwkyz\"}")
                .toObject(ContainerAppProperties.class);
        Assertions.assertEquals("i", model.managedEnvironmentId());
        Assertions.assertEquals("hxepcyvahfnlj", model.environmentId());
        Assertions.assertEquals("qxj", model.workloadProfileType());
        Assertions.assertEquals("ijhtxf", model.configuration().secrets().get(0).name());
        Assertions.assertEquals("xbf", model.configuration().secrets().get(0).value());
        Assertions.assertEquals(ActiveRevisionsMode.SINGLE, model.configuration().activeRevisionsMode());
        Assertions.assertEquals(true, model.configuration().ingress().external());
        Assertions.assertEquals(1877210635, model.configuration().ingress().targetPort());
        Assertions.assertEquals(2043148337, model.configuration().ingress().exposedPort());
        Assertions.assertEquals(IngressTransportMethod.HTTP, model.configuration().ingress().transport());
        Assertions.assertEquals(true, model.configuration().ingress().allowInsecure());
        Assertions.assertEquals("n", model.configuration().registries().get(0).server());
        Assertions.assertEquals("ynhijggme", model.configuration().registries().get(0).username());
        Assertions.assertEquals("siarbutrcvpn", model.configuration().registries().get(0).passwordSecretRef());
        Assertions.assertEquals("zmhjrunmp", model.configuration().registries().get(0).identity());
        Assertions.assertEquals(true, model.configuration().dapr().enabled());
        Assertions.assertEquals("hrbnlankxmyskpbh", model.configuration().dapr().appId());
        Assertions.assertEquals(AppProtocol.GRPC, model.configuration().dapr().appProtocol());
        Assertions.assertEquals(2131694851, model.configuration().dapr().appPort());
        Assertions.assertEquals(2016648328, model.configuration().dapr().httpReadBufferSize());
        Assertions.assertEquals(83692384, model.configuration().dapr().httpMaxRequestSize());
        Assertions.assertEquals(LogLevel.INFO, model.configuration().dapr().logLevel());
        Assertions.assertEquals(false, model.configuration().dapr().enableApiLogging());
        Assertions.assertEquals(1863766018, model.configuration().maxInactiveRevisions());
        Assertions.assertEquals("lqidyby", model.template().revisionSuffix());
        Assertions.assertEquals("clha", model.template().initContainers().get(0).image());
        Assertions.assertEquals("dbabp", model.template().initContainers().get(0).name());
        Assertions.assertEquals("thsu", model.template().containers().get(0).image());
        Assertions.assertEquals("cmnyyazttb", model.template().containers().get(0).name());
        Assertions.assertEquals(262767805, model.template().scale().minReplicas());
        Assertions.assertEquals(1638223797, model.template().scale().maxReplicas());
        Assertions.assertEquals("tcty", model.template().volumes().get(0).name());
        Assertions.assertEquals(StorageType.AZURE_FILE, model.template().volumes().get(0).storageType());
        Assertions.assertEquals("bbovplwzbhvgyugu", model.template().volumes().get(0).storageName());
    }

    @Test
    public void testSerialize() {
        ContainerAppProperties model =
            new ContainerAppProperties()
                .withManagedEnvironmentId("i")
                .withEnvironmentId("hxepcyvahfnlj")
                .withWorkloadProfileType("qxj")
                .withConfiguration(
                    new Configuration()
                        .withSecrets(
                            Arrays
                                .asList(
                                    new Secret().withName("ijhtxf").withValue("xbf"),
                                    new Secret().withName("xnehmpvec").withValue("odebfqkkrbmpu"),
                                    new Secret().withName("riwflzlfb").withValue("puz")))
                        .withActiveRevisionsMode(ActiveRevisionsMode.SINGLE)
                        .withIngress(
                            new Ingress()
                                .withExternal(true)
                                .withTargetPort(1877210635)
                                .withExposedPort(2043148337)
                                .withTransport(IngressTransportMethod.HTTP)
                                .withTraffic(Arrays.asList())
                                .withCustomDomains(Arrays.asList())
                                .withAllowInsecure(true)
                                .withIpSecurityRestrictions(Arrays.asList()))
                        .withRegistries(
                            Arrays
                                .asList(
                                    new RegistryCredentials()
                                        .withServer("n")
                                        .withUsername("ynhijggme")
                                        .withPasswordSecretRef("siarbutrcvpn")
                                        .withIdentity("zmhjrunmp")))
                        .withDapr(
                            new Dapr()
                                .withEnabled(true)
                                .withAppId("hrbnlankxmyskpbh")
                                .withAppProtocol(AppProtocol.GRPC)
                                .withAppPort(2131694851)
                                .withHttpReadBufferSize(2016648328)
                                .withHttpMaxRequestSize(83692384)
                                .withLogLevel(LogLevel.INFO)
                                .withEnableApiLogging(false))
                        .withMaxInactiveRevisions(1863766018))
                .withTemplate(
                    new Template()
                        .withRevisionSuffix("lqidyby")
                        .withInitContainers(
                            Arrays
                                .asList(
                                    new InitContainer()
                                        .withImage("clha")
                                        .withName("dbabp")
                                        .withCommand(Arrays.asList())
                                        .withArgs(Arrays.asList())
                                        .withEnv(Arrays.asList())
                                        .withVolumeMounts(Arrays.asList())))
                        .withContainers(
                            Arrays
                                .asList(
                                    new Container()
                                        .withImage("thsu")
                                        .withName("cmnyyazttb")
                                        .withCommand(Arrays.asList())
                                        .withArgs(Arrays.asList())
                                        .withEnv(Arrays.asList())
                                        .withVolumeMounts(Arrays.asList())
                                        .withProbes(Arrays.asList()),
                                    new Container()
                                        .withImage("dckzywbiexz")
                                        .withName("yueaxibxujwb")
                                        .withCommand(Arrays.asList())
                                        .withArgs(Arrays.asList())
                                        .withEnv(Arrays.asList())
                                        .withVolumeMounts(Arrays.asList())
                                        .withProbes(Arrays.asList()),
                                    new Container()
                                        .withImage("yoxa")
                                        .withName("dkzjancuxrh")
                                        .withCommand(Arrays.asList())
                                        .withArgs(Arrays.asList())
                                        .withEnv(Arrays.asList())
                                        .withVolumeMounts(Arrays.asList())
                                        .withProbes(Arrays.asList()),
                                    new Container()
                                        .withImage("iwdjswztsdbpgn")
                                        .withName("txhp")
                                        .withCommand(Arrays.asList())
                                        .withArgs(Arrays.asList())
                                        .withEnv(Arrays.asList())
                                        .withVolumeMounts(Arrays.asList())
                                        .withProbes(Arrays.asList())))
                        .withScale(
                            new Scale()
                                .withMinReplicas(262767805)
                                .withMaxReplicas(1638223797)
                                .withRules(Arrays.asList()))
                        .withVolumes(
                            Arrays
                                .asList(
                                    new Volume()
                                        .withName("tcty")
                                        .withStorageType(StorageType.AZURE_FILE)
                                        .withStorageName("bbovplwzbhvgyugu"),
                                    new Volume()
                                        .withName("vmkfssxqu")
                                        .withStorageType(StorageType.AZURE_FILE)
                                        .withStorageName("l"),
                                    new Volume()
                                        .withName("gsxnkjzkdeslpv")
                                        .withStorageType(StorageType.AZURE_FILE)
                                        .withStorageName("i"),
                                    new Volume()
                                        .withName("ghxpkdw")
                                        .withStorageType(StorageType.EMPTY_DIR)
                                        .withStorageName("uebbaumnyqup"))));
        model = BinaryData.fromObject(model).toObject(ContainerAppProperties.class);
        Assertions.assertEquals("i", model.managedEnvironmentId());
        Assertions.assertEquals("hxepcyvahfnlj", model.environmentId());
        Assertions.assertEquals("qxj", model.workloadProfileType());
        Assertions.assertEquals("ijhtxf", model.configuration().secrets().get(0).name());
        Assertions.assertEquals("xbf", model.configuration().secrets().get(0).value());
        Assertions.assertEquals(ActiveRevisionsMode.SINGLE, model.configuration().activeRevisionsMode());
        Assertions.assertEquals(true, model.configuration().ingress().external());
        Assertions.assertEquals(1877210635, model.configuration().ingress().targetPort());
        Assertions.assertEquals(2043148337, model.configuration().ingress().exposedPort());
        Assertions.assertEquals(IngressTransportMethod.HTTP, model.configuration().ingress().transport());
        Assertions.assertEquals(true, model.configuration().ingress().allowInsecure());
        Assertions.assertEquals("n", model.configuration().registries().get(0).server());
        Assertions.assertEquals("ynhijggme", model.configuration().registries().get(0).username());
        Assertions.assertEquals("siarbutrcvpn", model.configuration().registries().get(0).passwordSecretRef());
        Assertions.assertEquals("zmhjrunmp", model.configuration().registries().get(0).identity());
        Assertions.assertEquals(true, model.configuration().dapr().enabled());
        Assertions.assertEquals("hrbnlankxmyskpbh", model.configuration().dapr().appId());
        Assertions.assertEquals(AppProtocol.GRPC, model.configuration().dapr().appProtocol());
        Assertions.assertEquals(2131694851, model.configuration().dapr().appPort());
        Assertions.assertEquals(2016648328, model.configuration().dapr().httpReadBufferSize());
        Assertions.assertEquals(83692384, model.configuration().dapr().httpMaxRequestSize());
        Assertions.assertEquals(LogLevel.INFO, model.configuration().dapr().logLevel());
        Assertions.assertEquals(false, model.configuration().dapr().enableApiLogging());
        Assertions.assertEquals(1863766018, model.configuration().maxInactiveRevisions());
        Assertions.assertEquals("lqidyby", model.template().revisionSuffix());
        Assertions.assertEquals("clha", model.template().initContainers().get(0).image());
        Assertions.assertEquals("dbabp", model.template().initContainers().get(0).name());
        Assertions.assertEquals("thsu", model.template().containers().get(0).image());
        Assertions.assertEquals("cmnyyazttb", model.template().containers().get(0).name());
        Assertions.assertEquals(262767805, model.template().scale().minReplicas());
        Assertions.assertEquals(1638223797, model.template().scale().maxReplicas());
        Assertions.assertEquals("tcty", model.template().volumes().get(0).name());
        Assertions.assertEquals(StorageType.AZURE_FILE, model.template().volumes().get(0).storageType());
        Assertions.assertEquals("bbovplwzbhvgyugu", model.template().volumes().get(0).storageName());
    }
}
