# cmd.csp.stemmer
[![Release](https://jitpack.io/v/swelcker/cmd.csp.stemmer.svg?style=flat-square)](https://jitpack.io/#yunyu/vertx-console)

Simple implementation of Snowball Stemmer (http://snowballstem.org/) in Java.
Helpfull to reduce tokens to their core syntax esp. when processing them in Machine Learning Models.
Used in the Cognitive Service Platform cmd.csp.


### Prerequisites

There are no prerequisites or dependencies others than java core

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
        <groupId>cmd.csp</groupId>
        <artifactId>cmd.csp.stemmer</artifactId>
        <version>${cmd.csp.stemmer.version}</version>
    </dependency>
</dependencies>
```

Then, import the import cmd.csp.stemmer.*;` in your application :

```java
// Example
import cmd.csp.stemmer.*;

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

