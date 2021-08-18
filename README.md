# sample-service

Simple spring boot app with TAS manifest.

There is no data service backing this service so data returned is static.

## Endpoints
This app runs as a simple web service when the property `entry-point` has a value of `web`.  This is the default value and does not need to be set.  

### Security
Security used is basic auth with a pre-configured user: someuser/somepassword.

### GET /widgets
Returns all widgets.  

### GET /widgets/{id}
Returns a specific widget

## Task
This app contains a task that simply logs out all widgets and terminates.  Run application with the property `entry-point` and a value of `task`
