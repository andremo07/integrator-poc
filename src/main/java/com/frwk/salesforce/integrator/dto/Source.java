
package com.frwk.salesforce.integrator.dto;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Source {
    @JsonProperty("version")
    private String version;
    @JsonProperty("connector")
    private String connector;
    @JsonProperty("name")
    private String name;
    @JsonProperty("ts_ms")
    private Long tsMs;
    @JsonProperty("snapshot")
    private String snapshot;
    @JsonProperty("db")
    private String db;
    @JsonProperty("sequence")
    private Object sequence;
    @JsonProperty("schema")
    private String schema;
    @JsonProperty("table")
    private String table;
    @JsonProperty("change_lsn")
    private String changeLsn;
    @JsonProperty("commit_lsn")
    private String commitLsn;
    @JsonProperty("event_serial_no")
    private Integer eventSerialNo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
