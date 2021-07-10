# Manual Dependency Injection

 ## This is MANUAL DEPENDENCY INJECTION and the preferred way is to use DAGGER2 for Dependency Injection so to overcome this manual creation of containers.


#### Here we have created a container which will serve the repository and the respective viewmodel so if the same viewmodel/viewmodel factory is required or
#### the same repository is required throughout the app, then we dont need to recreate the instance
#### We could also create singleton but it makes heptic for testing..
#### Having the Dependency injection is preferable for scalability of the app
#### as the app will grow with new features.
     
