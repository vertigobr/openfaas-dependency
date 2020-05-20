# openfaas-dependency

Build dependencies (**model** and **entrypoint**) for OpenFaaS java-maven template.

This project is based on original work from [kameshchauhan](https://github.com/kameshchauhan/openfaas-dependency)

## Dependencies

The dependencies below must be used in java/maven templates for OpenFaas:

```xml
<dependencies>
	<dependency>
        <groupId>com.github.vertigobr.ipaas</groupId>
        <artifactId>model</artifactId>
        <version>1.0.0-SNAPSHOT</version>
    </dependency>
	<dependency>
        <groupId>com.github.vertigobr.ipaas</groupId>
        <artifactId>entrypoint</artifactId>
        <version>1.0.0-SNAPSHOT</version>
    </dependency>
</dependencies>
```
