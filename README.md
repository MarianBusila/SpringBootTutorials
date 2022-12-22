# SpringBootTutorials

## Spring Notes
- there are multiple scopes available: Singleton, Prototype, Request, etc. Default is singleton.
- a Bean has a lifecycle: Instantiate, PopulateProperties, setBeanName, setBeanFactory, setApplicationContext, afterPropertiesSet, etc -> Bean is ready to use -> Container is shut down -> destroy, custom destroy