# cmd.csp.stemmer

Simple implementation of Snowball Stemmer (http://snowballstem.org/) in Java

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

There are no prerequisites

### Installing/Usage

To use, merge the following into your POM (or the equivalent into your Gradle build script):

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<properties>
    <cmd.csp.stemmer.version>1.0.0</cmd.csp.stemmer.version>
</properties>

<dependencies>
    <dependency>
        <groupId>cmd.csp.stemmer</groupId>
        <artifactId>cmd.csp.stemmer</artifactId>
        <version>${cmd.csp.stemmer.version}</version>
    </dependency>
</dependencies>
```

Then, create a `WebConsoleRegistry` in your application with a specified path, add the pages you wish to display, and mount it to a router:

```java
// Example with several pages loaded
WebConsoleRegistry.create("/admin")
        // Add pages
        .addPage(MetricsConsolePage.create(dropwizardRegistry))
        .addPage(ServicesConsolePage.create(discovery))
        .addPage(LoggingConsolePage.create())
        .addPage(CircuitBreakersConsolePage.create())
        .addPage(ShellConsolePage.create())
        .addPage(HealthConsolePage.create(healthChecks))
        .setCacheBusterEnabled(true) // Adds random query string to scripts
        // Mount to router
        .mount(vertx, router);
```

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management


## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/swelcker/cmd.csp.stemmer/tags). 

## Authors

* **Stefan Welcker** - *Modifications* 

See also the list of [contributors](https://github.com/swelcker/cmd.csp.stemmer/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Forked and modified from the original with Copyright (c) 2001, Dr Martin Porter, Copyright (c) 2002, Richard Boulton. All rights reserved.

