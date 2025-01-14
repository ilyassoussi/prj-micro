package org.MrDigital.order_config.Config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("my-configuration")
@RefreshScope
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApplicationPropertiesConfiguration {
    private int limitDeOrder;
}
