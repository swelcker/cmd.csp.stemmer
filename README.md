![csplogo](https://user-images.githubusercontent.com/12301571/67168219-4d618900-f3a2-11e9-9460-b79eff997c35.PNG)
# cmd.csp.stemmer
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Maintenance](https://img.shields.io/badge/Maintained%3F-yes-green.svg)](https://GitHub.com/swelcker/cmd.csp.stemmer/graphs/commit-activity)
[![GitHub release](https://img.shields.io/github/release/swelcker/cmd.csp.stemmer.svg)](https://GitHub.com/swelcker/cmd.csp.stemmer/releases/)
[![GitHub tag](https://img.shields.io/github/tag/swelcker/cmd.csp.stemmer.svg)](https://GitHub.com/swelcker/cmd.csp.stemmer/tags/)
[![GitHub commits](https://img.shields.io/github/commits-since/swelcker/cmd.csp.stemmer/v1.0.0.svg)](https://GitHub.com/swelcker/cmd.csp.stemmer/commit/)
[![GitHub contributors](https://img.shields.io/github/contributors/swelcker/cmd.csp.stemmer.svg)](https://GitHub.com/swelcker/cmd.csp.stemmer/graphs/contributors/)
[![GitHub version](https://badge.fury.io/gh/swelcker%2Fcmd.csp.stemmer.svg)](https://github.com/swelcker/cmd.csp.stemmer)

Simple implementation of Snowball Stemmer (http://snowballstem.org/) in Java with Stemmers for 20+ languages.
Helpfull to reduce tokens to their core syntax esp. when processing them in Machine Learning Models (ML).
Used in the Cognitive Service Platform cmd.csp.


### Prerequisites

There are no prerequisites or dependencies others than java core

### Installing/Usage

To use, merge the following into your Maven POM (or the equivalent into your Gradle build script):

```xml
<repository>
  <id>github</id>
  <name>GitHub swelcker Apache Maven Packages</name>
  <url>https://maven.pkg.github.com/swelcker</url>
</repository>

<dependency>
  <groupId>cmd.csp</groupId>
  <artifactId>cspstemmer</artifactId>
  <version>1.0.0</version>
</dependency>
```

Then, import cmd.csp.stemmer.*;` in your application :

```java
// Example
import cspstemmer.*;

private SnowballStemmer stemmer;
private Locale locale = null;
...
		if(this.locale==null) {
			this.locale = Locale.getDefault();
		}
...
		switch(locale.getISO3Language().toLowerCase()){
			case "ara":stemmer=new ArabicStemmer();break;
			case "dan":stemmer=new DanishStemmer();break;
			case "nld":stemmer=new DutchStemmer();break;
			case "eng":stemmer=new EnglishStemmer();break;
			case "fin":stemmer=new FinnishStemmer();break;
			case "fra":stemmer=new FrenchStemmer();break;
			case "deu":stemmer=new GermanStemmer();break;
			case "hun":stemmer=new HungarianStemmer();break;
			case "ind":stemmer=new IndonesianStemmer();break;
			case "gle":stemmer=new IrishStemmer();break;
			case "ita":stemmer=new ItalianStemmer();break;
			case "nep":stemmer=new NepaliStemmer();break;
			case "nor":stemmer=new NorwegianStemmer();break;
			case "por":stemmer=new PortugueseStemmer();break;
			case "ron":stemmer=new RomanianStemmer();break;
			case "spa":stemmer=new SpanishStemmer();break;
			case "rus":stemmer=new RussianStemmer();break;
			case "swe":stemmer=new SwedishStemmer();break;
			case "tam":stemmer=new TamilStemmer();break;
			case "tur":stemmer=new TurkishStemmer();break;
			default:stemmer=new NaiveStemmer();break;
		}
        
        // Then set the token to be stemmed
        String tkn = "Testvariable";
        String result = "";
            stemmer.setCurrent(tkn);
        // call to stemm
            stemmer.stem();
        // get/use the result
            result = stemmer.getCurrent();

...


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

