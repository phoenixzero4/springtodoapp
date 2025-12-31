



# Session vs. Request Scope

#### Browser requests are handled by our web application deployed on the server

### Request Scope
---
**active only for a single request**
* when the response is sent back, the request attributes are removed from memory
* they can not be used for future requests
* recommended for most cases
	
### Session Scope
---
**stored across multiple requests (the duration of the session)**
* takes additional memory (all details are stored on the server)

	