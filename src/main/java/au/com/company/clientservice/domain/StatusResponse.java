package au.com.company.clientservice.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StatusResponse {
    private String msg;
}
