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

## Tanzu Application Service / Pivotal Cloud Foundry
Note that the default `manifest.yml` is looking for service instances to already exist named `autoscaler` and `scheduler`.  Simply remove these services if you do not have them deployed in your environment, or deploy them with the following.  Note service names or plans could vary in your environment:
#### Services
1. `cf create-service scheduler-for-pcf standard scheduler`
2. `cf create-service app-autoscaler standard autoscaler`
#### To deploy this application to TAS, perform the following: 
1. Build: `./gradlew build`
2. Deploy: `cf push -p ./build/libs/sample-service-0.0.1-SNAPSHOT.jar`
