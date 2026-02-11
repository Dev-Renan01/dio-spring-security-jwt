package dio.dio_spring_security_jwt.security;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "security.config")// Indica que esta classe irá mapear propriedades de configuração
                                                    // que começam com "security.config"
public class SecurityConfig  {

    public static String PREFIX;// Prefixo usado no header Authorization do JWT (ex: "Bearer")
    public static String KEY;// Chave secreta utilizada para assinar e validar o token JWT
    public static Long EXPIRATION;// Tempo de expiração do token JWT (normalmente em milissegundos)

    public static void setPREFIX(String prefix) {
         PREFIX = prefix;
    }

    public static void setKEY(String key) {
        KEY = key;
    }

    public static void setEXPIRATION(Long expiration) {
         EXPIRATION = expiration;
    }
}
