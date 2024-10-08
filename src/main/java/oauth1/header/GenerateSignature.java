package oauth1.header;

import java.security.GeneralSecurityException;

import com.google.api.client.auth.oauth.OAuthHmacSha256Signer;
import com.google.api.client.auth.oauth.OAuthParameters;
import com.google.api.client.http.GenericUrl;

public class GenerateSignature {

	public String getAuthorizationHeader(OAuthDetails details) {
		OAuthHmacSha256Signer signer = new OAuthHmacSha256Signer(details.getConsumerSecret());
		signer.setTokenSecret(details.getTokenSecret());

		OAuthParameters parameters = new OAuthParameters();
		parameters.consumerKey = details.getConsumerKey();
		parameters.token = details.getTokenKey();
		parameters.realm = details.getRealm();
		parameters.signer = signer;
		parameters.computeNonce();
		parameters.computeTimestamp();
		try {
			parameters.computeSignature(details.getMethod().toUpperCase(), new GenericUrl(details.getUrl()));
			return parameters.getAuthorizationHeader();
		} catch (GeneralSecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
