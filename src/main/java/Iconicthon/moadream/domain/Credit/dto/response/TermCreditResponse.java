package Iconicthon.moadream.domain.Credit.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public record TermCreditResponse(
        @JsonProperty("term_credit")
        Integer termCredit
) {
}