package lk.ijse.user_service.dto;

public class AuthDTO {
    private String email;
    private String token;
    private String role;

    public AuthDTO() {
    }

    public AuthDTO(String email, String token, String role) {
        this.email = email;
        this.token = token;
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
