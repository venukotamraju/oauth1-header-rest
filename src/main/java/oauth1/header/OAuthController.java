package oauth1.header;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/services/oauth1")
public class OAuthController {
	
	private final GenerateSignature signatureGenerator = new GenerateSignature();
	
	@PostMapping("/authorization/generate-header")
	public ResponseEntity<Map<String, String>> generateOAuthHeader(@RequestBody OAuthDetails oAuthDetails) {
		String authorizationHeaderString = signatureGenerator.getAuthorizationHeader(oAuthDetails);
		
		if (authorizationHeaderString == null) {
			// Return a JSON response with an error message
			Map<String, String> errorResponseMap = new HashMap<>();
			errorResponseMap.put("error", "Error generating OAuth header");
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponseMap);
		}
		
		// Return a JSON response with the authorization header
		Map<String, String> successResponseMap = new HashMap<>();
		successResponseMap.put("authorizationHeader", authorizationHeaderString);
		return ResponseEntity.ok(successResponseMap);
	}
}
