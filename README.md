# SpringBootTutorials

## Spring Notes
- a bean is an instance of a class managed by the Spring container
- there are multiple scopes available: Singleton, Prototype, Request, etc. Default is singleton.
- a bean has a lifecycle: Instantiate, PopulateProperties, setBeanName, setBeanFactory, setApplicationContext, afterPropertiesSet, etc -> Bean is ready to use -> Container is shut down -> destroy, custom destroy
