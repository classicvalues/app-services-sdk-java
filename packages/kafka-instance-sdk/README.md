# kafka-instance-sdk

Kafka Admin REST API

- API version: 0.1.0

- Build date: 2021-06-11T11:25:50.899282543-04:00[America/New_York]

An API to provide REST endpoints for query Kafka for admin operations


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>cloud.redhat.com</groupId>
  <artifactId>kafka-instance-sdk</artifactId>
  <version>0.1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "cloud.redhat.com:kafka-instance-sdk:0.1.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/kafka-instance-sdk-0.1.0.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.openshift.cloud.api.kas.auth.invoker.*;
import com.openshift.cloud.api.kas.auth.invoker.auth.*;
import com.openshift.cloud.api.kas.auth.models.*;
import com.openshift.cloud.api.kas.auth.DefaultApi;

public class DefaultApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        DefaultApi apiInstance = new DefaultApi(defaultClient);
        NewTopicInput newTopicInput = new NewTopicInput(); // NewTopicInput | Topic to create.
        try {
            Topic result = apiInstance.createTopic(newTopicInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#createTopic");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**createTopic**](docs/DefaultApi.md#createTopic) | **POST** /topics | Creates a new topic
*DefaultApi* | [**deleteConsumerGroupById**](docs/DefaultApi.md#deleteConsumerGroupById) | **DELETE** /consumer-groups/{consumerGroupId} | Delete a consumer group.
*DefaultApi* | [**deleteTopic**](docs/DefaultApi.md#deleteTopic) | **DELETE** /topics/{topicName} | Deletes a  topic
*DefaultApi* | [**getConsumerGroupById**](docs/DefaultApi.md#getConsumerGroupById) | **GET** /consumer-groups/{consumerGroupId} | Get a single consumer group by its unique ID.
*DefaultApi* | [**getConsumerGroups**](docs/DefaultApi.md#getConsumerGroups) | **GET** /consumer-groups | List of consumer groups in the Kafka instance.
*DefaultApi* | [**getTopic**](docs/DefaultApi.md#getTopic) | **GET** /topics/{topicName} | Retrieves the topic with the specified name.
*DefaultApi* | [**getTopics**](docs/DefaultApi.md#getTopics) | **GET** /topics | List of topics
*DefaultApi* | [**updateTopic**](docs/DefaultApi.md#updateTopic) | **PATCH** /topics/{topicName} | Updates the topic with the specified name.


## Documentation for Models

 - [ConfigEntry](docs/ConfigEntry.md)
 - [Consumer](docs/Consumer.md)
 - [ConsumerGroup](docs/ConsumerGroup.md)
 - [ConsumerGroupList](docs/ConsumerGroupList.md)
 - [NewTopicInput](docs/NewTopicInput.md)
 - [Partition](docs/Partition.md)
 - [Topic](docs/Topic.md)
 - [TopicSettings](docs/TopicSettings.md)
 - [TopicsList](docs/TopicsList.md)
 - [UpdateTopicInput](docs/UpdateTopicInput.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


