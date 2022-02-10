
package com.frwk.salesforce.integrator.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


import java.util.HashMap;
import java.util.Map;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Payload {
    @JsonProperty("before")
    private DataInfo before;
    @JsonProperty("after")
    private DataInfo after;
    @JsonProperty("source")
    private Source source;
    @JsonProperty("op")
    private String op;
    @JsonProperty("ts_ms")
    private Long tsMs;
    @JsonProperty("transaction")
    private Object transaction;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
