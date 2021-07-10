# Manual Dependency Injection

 ## This is MANUAL DEPENDENCY INJECTION and the preferred way is to use DAGGER2 for Dependency Injection so to overcome this manual creation of containers.


#### Here we have created a container which will serve the repository and the respective viewmodel so if the same viewmodel/viewmodel factory is required or the same repository is required throughout the app, then we dont need to recreate the instance
#### Having the Dependency injection is preferable for scalability of the app as the app will grow with new features.
     

# Drawbacks of using Manual Dependency Injection

#### AppContainer gets complicated when you want to include more functionality in the project. When your app becomes larger and you start introducing different feature flows, there are even more problems that arise:

#### When you have different flows, you might want objects to just live in the scope of that flow. For example, when creating LoginUserData (that might consist of the username and password used only in the login flow) you don't want to persist data from an old login flow from a different user. You want a new instance for every new flow. You can achieve that by creating FlowContainer objects inside the AppContainer as demonstrated in the next code example.

#### Optimizing the application graph and flow containers can also be difficult. You need to remember to delete instances that you don't need, depending on the flow you're in.
