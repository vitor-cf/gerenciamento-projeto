package ucsal.edu.gerenciamento_projeto.config;

import java.sql.Date;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtUtil {
		
	private final String jwtSecret = "1234578";
	private final long jwtExpirationMs = 86400000; // 1 dia
	
	public String gerarToken(UserDetails userDetails) {
		return Jwts.builder()
				.setSubject(userDetails.getUsername())
				.setIssuedAt(new Date(jwtExpirationMs))
				.setExpiration(new Date(System.currentTimeMillis() + jwtExpirationMs))
				.signWith(SignatureAlgorithm.HS512, jwtSecret)
				.compact();
	}
	
	public String getUsernameFromToken(String token) {
		return Jwts.parser()
				.setSigningKey(jwtSecret)
				.parseClaimsJws(token)
				.getBody()
				.getSubject();
	}
	
	public boolean validarToken(String token, UserDetails userDetails) {
		final String username = getUsernameFromToken(token);
		return username.equals(userDetails.getUsername()) && !isTokenExpirado(token);
	}
	
	public boolean isTokenExpirado(String token) {
		@SuppressWarnings("deprecation")
		final Date expiration = (Date) Jwts.parser()
				.setSigningKey(jwtSecret)
				.parseClaimsJws(token)
				.getBody()
				.getExpiration();
		return expiration.before(new Date(jwtExpirationMs));
	}
}
