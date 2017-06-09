# whatsmyrole
A simple REST API for 'League Of Legends' that tells you what lane you prefer based on your champion pool

API URL: http://localhost:8080/role

This is the wadl:
```xml
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<application
	xmlns="http://wadl.dev.java.net/2009/02">
	<doc
		xmlns:jersey="http://jersey.java.net/" jersey:generatedBy="Jersey: 2.25 2016-12-08 12:54:48"/>
		<doc
			xmlns:jersey="http://jersey.java.net/" jersey:hint="This is simplified WADL with user and core resources only. To get full WADL with extended resources use the query parameter detail. Link: http://localhost:8080/application.wadl?detail=true"/>
			<grammars/>
			<resources base="http://localhost:8080/">
				<resource path="myresource">
					<method id="getIt" name="GET">
						<response>
							<representation mediaType="text/plain"/>
						</response>
					</method>
				</resource>
				<resource path="role">
					<method id="whatIsMyRole" name="POST">
						<request>
							<representation mediaType="application/json"/>
							<representation mediaType="application/xml"/>
						</request>
						<response>
							<representation mediaType="application/json"/>
							<representation mediaType="application/xml"/>
						</response>
					</method>
				</resource>
			</resources>
		</application>

```

The Example Request
```
[{"name": "Teemo"}]
```
will return this json object
```javascript
{ "value": "TOP" }
```
Sending multiple champions will work like this:
```
[{"name":"Teemo"},{"name":"Jax"},{"name":"Corki"},{"name":"Yasuo"},{"name":"Nami"},{"name":"Graves"},{"name":"Syndra"},{"name":"Illaoi"}]
```
