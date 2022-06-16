package main.java.app.pojo;

public class AuthenticateMemberPojo {

    public String access_token;
    public int expires_in;
    public String token_type;
    public String refresh_token;
    public String scope;


    public String getAccessToken() {
        return access_token;
    }
    public void setAccessToken(String accessToken) {
        this.access_token = accessToken;
    }

    public int getExpireIn() {
        return expires_in;
    }
    public void setExpiresIn(int expiresIn) {
        this.expires_in = expiresIn;
    }

    public String getTokenType() {
        return token_type;
    }
    public void setATokenType(String tokenType) {
        this.token_type = tokenType;
    }

    public String getRefreshToken() {
        return refresh_token;
    }
    public void setRefreshToken(String refreshToken) {
        this.refresh_token = refreshToken;
    }

    public String getScope() {
        return scope;
    }
    public void setScope(String Scope) {
        this.scope = Scope;
    }





}
