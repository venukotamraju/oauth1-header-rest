package oauth1.header;

public class OAuthDetails {
	private String consumerKey;
	private String tokenKey;
	private String consumerSecret;
	private String tokenSecret;
	private String method;
	private String url;
	private String realm;
	

	/**
	 * @return the realm
	 */
	public String getRealm() {
		return realm;
	}

	/**
	 * @param realm the realm to set
	 */
	public void setRealm(String realm) {
		this.realm = realm;
	}

	/**
	 * @return the clientKey
	 */
	public String getConsumerKey() {
		return consumerKey;
	}

	/**
	 * @param clientKey the clientKey to set
	 */
	public void setConsumerKey(String consumerKey) {
		this.consumerKey = consumerKey;
	}

	/**
	 * @return the tokenKey
	 */
	public String getTokenKey() {
		return tokenKey;
	}

	/**
	 * @param tokenKey the tokenKey to set
	 */
	public void setTokenKey(String tokenKey) {
		this.tokenKey = tokenKey;
	}

	/**
	 * @return the method
	 */
	public String getMethod() {
		return method;
	}

	/**
	 * @param method the method to set
	 */
	public void setMethod(String method) {
		this.method = method;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}


	/**
	 * @return the clientSecret
	 */
	public String getConsumerSecret() {
		return consumerSecret;
	}

	/**
	 * @param clientSecret the clientSecret to set
	 */
	public void setConsumerSecret(String consumerSecret) {
		this.consumerSecret = consumerSecret;
	}

	/**
	 * @return the tokenSecret
	 */
	public String getTokenSecret() {
		return tokenSecret;
	}

	/**
	 * @param tokenSecret the tokenSecret to set
	 */
	public void setTokenSecret(String tokenSecret) {
		this.tokenSecret = tokenSecret;
	}
}
