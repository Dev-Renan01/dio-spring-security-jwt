package dio.dio_spring_security_jwt.security;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class JWTObject {


    private String subject; // Identifica o "dono" do token
    private Date issuedAt; // Data e hora em que o token foi gerado
    private Date expiration; // Data e hora em que o token expira
    private List<String> roles;// Lista de permissões ou papéis do usuário (ex: ROLE_USER, ROLE_ADMIN)

    public void setRoles(String... roles){
        this.roles = Arrays.asList(roles);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getIssuedAt() {
        return issuedAt;
    }

    public void setIssuedAt(Date issuedAt) {
        this.issuedAt = issuedAt;
    }

    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}
