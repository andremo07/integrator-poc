
package com.frwk.salesforce.integrator.dto;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class After {
    @JsonProperty("MARC_CD_MARCA")
    private Integer marcCdMarca;
    @JsonProperty("MARC_TX_DESCRICAO")
    private String marcTxDescricao;
    @JsonProperty("XXXX_CD_USUALT")
    private Integer xxxxCdUsualt;
    @JsonProperty("XXXX_DH_ALT")
    private Long xxxxDhAlt;
    @JsonProperty("XXXX_CT_LOCK")
    private Integer xxxxCtLock;
    @JsonProperty("MARC_NM_WEB")
    private Object marcNmWeb;
    @JsonProperty("MARC_DS_DETALHADA")
    private Object marcDsDetalhada;
    @JsonProperty("MARC_FL_SITWEB")
    private String marcFlSitweb;
    @JsonProperty("MARC_TX_MOTIVOSIT")
    private Object marcTxMotivosit;
    @JsonProperty("MARC_DH_ULTATLZSITE")
    private Object marcDhUltatlzsite;
    @JsonProperty("MARC_FL_SITAPP")
    private String marcFlSitapp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}