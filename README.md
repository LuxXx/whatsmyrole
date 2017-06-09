# whatsmyrole
A simple REST API for 'League Of Legends' that tells you what lane you prefer based on your champion pool

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
