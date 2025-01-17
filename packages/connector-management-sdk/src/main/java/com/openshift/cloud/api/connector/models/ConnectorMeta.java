/*
 * Connector Service Fleet Manager
 * Connector Service Fleet Manager is a Rest API to manage connectors.
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.openshift.cloud.api.connector.models;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.openshift.cloud.api.connector.models.Channel;
import com.openshift.cloud.api.connector.models.ConnectorDesiredState;
import com.openshift.cloud.api.connector.models.ConnectorMetaAllOf;
import com.openshift.cloud.api.connector.models.ConnectorRequestMeta;
import com.openshift.cloud.api.connector.models.DeploymentLocation;
import com.openshift.cloud.api.connector.models.ObjectMeta;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ConnectorMeta
 */
@JsonPropertyOrder({
  ConnectorMeta.JSON_PROPERTY_OWNER,
  ConnectorMeta.JSON_PROPERTY_CREATED_AT,
  ConnectorMeta.JSON_PROPERTY_MODIFIED_AT,
  ConnectorMeta.JSON_PROPERTY_NAME,
  ConnectorMeta.JSON_PROPERTY_CONNECTOR_TYPE_ID,
  ConnectorMeta.JSON_PROPERTY_CHANNEL,
  ConnectorMeta.JSON_PROPERTY_DEPLOYMENT_LOCATION,
  ConnectorMeta.JSON_PROPERTY_DESIRED_STATE,
  ConnectorMeta.JSON_PROPERTY_RESOURCE_VERSION
})
@JsonTypeName("ConnectorMeta")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConnectorMeta {
  public static final String JSON_PROPERTY_OWNER = "owner";
  private String owner;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CONNECTOR_TYPE_ID = "connector_type_id";
  private String connectorTypeId;

  public static final String JSON_PROPERTY_CHANNEL = "channel";
  private Channel channel = Channel.STABLE;

  public static final String JSON_PROPERTY_DEPLOYMENT_LOCATION = "deployment_location";
  private DeploymentLocation deploymentLocation;

  public static final String JSON_PROPERTY_DESIRED_STATE = "desired_state";
  private ConnectorDesiredState desiredState;

  public static final String JSON_PROPERTY_RESOURCE_VERSION = "resource_version";
  private Long resourceVersion;

  public ConnectorMeta() { 
  }

  public ConnectorMeta owner(String owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOwner() {
    return owner;
  }


  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwner(String owner) {
    this.owner = owner;
  }


  public ConnectorMeta createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public ConnectorMeta modifiedAt(OffsetDateTime modifiedAt) {
    
    this.modifiedAt = modifiedAt;
    return this;
  }

   /**
   * Get modifiedAt
   * @return modifiedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }


  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }


  public ConnectorMeta name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public ConnectorMeta connectorTypeId(String connectorTypeId) {
    
    this.connectorTypeId = connectorTypeId;
    return this;
  }

   /**
   * Get connectorTypeId
   * @return connectorTypeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CONNECTOR_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getConnectorTypeId() {
    return connectorTypeId;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTOR_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConnectorTypeId(String connectorTypeId) {
    this.connectorTypeId = connectorTypeId;
  }


  public ConnectorMeta channel(Channel channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Channel getChannel() {
    return channel;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannel(Channel channel) {
    this.channel = channel;
  }


  public ConnectorMeta deploymentLocation(DeploymentLocation deploymentLocation) {
    
    this.deploymentLocation = deploymentLocation;
    return this;
  }

   /**
   * Get deploymentLocation
   * @return deploymentLocation
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_LOCATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DeploymentLocation getDeploymentLocation() {
    return deploymentLocation;
  }


  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_LOCATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDeploymentLocation(DeploymentLocation deploymentLocation) {
    this.deploymentLocation = deploymentLocation;
  }


  public ConnectorMeta desiredState(ConnectorDesiredState desiredState) {
    
    this.desiredState = desiredState;
    return this;
  }

   /**
   * Get desiredState
   * @return desiredState
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DESIRED_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ConnectorDesiredState getDesiredState() {
    return desiredState;
  }


  @JsonProperty(JSON_PROPERTY_DESIRED_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDesiredState(ConnectorDesiredState desiredState) {
    this.desiredState = desiredState;
  }


  public ConnectorMeta resourceVersion(Long resourceVersion) {
    
    this.resourceVersion = resourceVersion;
    return this;
  }

   /**
   * Get resourceVersion
   * @return resourceVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESOURCE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getResourceVersion() {
    return resourceVersion;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResourceVersion(Long resourceVersion) {
    this.resourceVersion = resourceVersion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectorMeta connectorMeta = (ConnectorMeta) o;
    return Objects.equals(this.owner, connectorMeta.owner) &&
        Objects.equals(this.createdAt, connectorMeta.createdAt) &&
        Objects.equals(this.modifiedAt, connectorMeta.modifiedAt) &&
        Objects.equals(this.name, connectorMeta.name) &&
        Objects.equals(this.connectorTypeId, connectorMeta.connectorTypeId) &&
        Objects.equals(this.channel, connectorMeta.channel) &&
        Objects.equals(this.deploymentLocation, connectorMeta.deploymentLocation) &&
        Objects.equals(this.desiredState, connectorMeta.desiredState) &&
        Objects.equals(this.resourceVersion, connectorMeta.resourceVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owner, createdAt, modifiedAt, name, connectorTypeId, channel, deploymentLocation, desiredState, resourceVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectorMeta {\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    connectorTypeId: ").append(toIndentedString(connectorTypeId)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    deploymentLocation: ").append(toIndentedString(deploymentLocation)).append("\n");
    sb.append("    desiredState: ").append(toIndentedString(desiredState)).append("\n");
    sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

