package dio.dio.spring.security.jwt.security;

import io.jsonwebtoken.*;

import java.util.List;

public class JWTCreator {
    public static final String HEADER_AUTORIZATION = "Authorization";
    public static final String ROLES_AUTHORITIES = "authorities";

    public static String create(String prefix, String key, JWTObject jetObject) {
        String token = Jwts.builder().setSubject(jetObject.getSubject()).setIssuedAt(jetObject.getIssuedAt()).setExpiration(jwtObject.getExpiration())
                .claim(ROLES_AUTHORITIES, checkRoles(jwtObject.getRoles())).singnWith(SignatureAlgorithm.HS512, key).compact;
        return prefix + " " + token;
    }

    public static JWTObject create(String token, String prefix, String key)
        throws ExpiredJwtException, UnsupportedJwtException, MalformedJwtException, SignatureException {
        JWTObject object = new JWTObject();
        token = token.replace(prefix, "");
        Clains clains = Jwts.parser().setSigningKey(key).parseClaimsJws(token).getBody();
        object.setSubject(clains.getSubject());
        object.setExpiration(clains.getExpiration());
        object.setIssuedAt(clains.getIssuedAt());
        object.setRoles((List) clains.get(ROLES_AUTHORITIES));
        return object;
    }

    private static List<String> checkRoles(List<String> roels) {
        return roels.stream().map(s -> "ROLE_".concat(s.replace("ROLE_", ""))).collect(Colle)
    }

}
